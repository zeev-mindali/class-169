package com.johnbryce.catbackend.util;


import com.johnbryce.catbackend.beans.Credentials;
import com.johnbryce.catbackend.beans.UserRole;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.sql.Date;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Component
@NoArgsConstructor
public class JWT {
    //type of encryption
    private String signatureAlgorithm = SignatureAlgorithm.HS256.getJcaName();
    //secret key , sssshhhhhhhhh
    private String secretKey = "this+is+my+key+and+i+cry+if+i+want+to+you+little+POS";
    private Key decodedSecretKey = new SecretKeySpec(
            Base64.getDecoder().decode(secretKey), this.signatureAlgorithm
    );
    //generate key
    public String generateToken (Credentials credentails,String role){
        Map<String,Object> claims = new HashMap<>();
        claims.put("userEmail", credentails.getUserEmail());
        //claims.put("userPass", credentails.getUserPass());
        claims.put("id",credentails.getId());
//        claims.put("userType",credentails.getRole());
        claims.put("role",role);
        return "Bearer "+createToken(claims,credentails.getUserName());
    }

    //create the jwt token
    private String createToken(Map<String, Object> claims, String userName) {
        Instant now = Instant.now();
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(now.plus(30, ChronoUnit.MINUTES)))
                .signWith(decodedSecretKey)
                .compact();
    }

    private Claims extractAllClaims(String token){
        JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(decodedSecretKey).build();
        return jwtParser.parseClaimsJws(token).getBody();
    }

    private String extractSignature(String token){
        JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(decodedSecretKey).build();
        return jwtParser.parseClaimsJws(token).getSignature();
    }

    public String extractSubject(String token){
        JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(decodedSecretKey).build();
        return extractAllClaims(token.replace("Bearer ","")).getSubject();
    }

    public String checkUser(String token){
        Claims claims = extractAllClaims(token.replace("Bearer ",""));
        Credentials credentials = new Credentials();
        credentials.setUserName(claims.getSubject());
        credentials.setUserEmail((String)claims.get("userEmail"));
        credentials.setId((int)claims.get("id"));
        return generateToken(credentials,(String)claims.get("role"));
    }
//    public static void main(String[] args) {
//        System.out.println("Token tester\n=======================");
//        Credentials userInfo= new Credentials(1,"Zeev mindali","12345678","mindalizeev@gmail.com");
//        JWT jwt = new JWT();
//        String myToken = jwt.generateToken(userInfo);
//        System.out.println(myToken);
//    }
}
