package JDBC_17_01_2024.cls;

public class SQLcommands {
    //create table
    public static final String CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS `class169`.`students` (" +
            "  `id` INT NOT NULL AUTO_INCREMENT," +
            "  `name` VARCHAR(45) NULL," +
            "  `tel` VARCHAR(45) NULL," +
            "  `avgGrade` INT NULL," +
            "  `city` VARCHAR(45) NULL," +
            "  PRIMARY KEY (`id`));";

    public static final String addStudent = "INSERT INTO `class169`.`students` " +
            "(`name`, `tel`, `avgGrade`, `city`, `married`) " +
            "VALUES (?, ?, ?, ?, ?);";

    public static final String getAllStudents = "SELECT * FROM `class169`.`students`";
    public static final String getStudentsAbove95 = "SELECT * FROM `class169`.`students` WHERE avgGrade>95";
    public static final String getStudentAbove = "SELECT * FROM `class169`.`students` WHERE avgGrade>?";

    public static final String getStudentBetwen = "SELECT * FROM `class169`.`students` WHERE avgGrade>? AND avgGrade<?";
    //CRUD
    public static final String createCompaniesTable = "" +
            "CREATE TABLE `companies` (" +
            "  `id` INT NOT NULL AUTO_INCREMENT," +
            "  `name` VARCHAR(45) NULL," +
            "  `email` VARCHAR(45) NULL," +
            "  `password` VARCHAR(10) NULL," +
            "  PRIMARY KEY (`id`)," +
            "  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE," +
            "  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);";


    public static final String isCompanyExsists = "" +
            "SELECT count(*) as isExists " +
            "FROM `class169`.`companies` " +
            "WHERE company_email=? AND company_password=?";

    public static final String isCompanyExsists2 = "" +
            "SELECT * " +
            "FROM `class169`.`companies` " +
            "WHERE company_email=? AND company_password=?";
}
