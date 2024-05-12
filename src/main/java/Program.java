import java.time.LocalDate;

public class Program {
    public static  void main(String[] args) {

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Giám đốc";
        System.out.println("Tên phòng ban = " + department1.name);

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Sale";
        System.out.println("Tên phòng ban = " + department2.name);

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Kinh doanh";
        System.out.println("Tên phòng ban = " + department3.name);


        Position position1 = new Position();
        position1.id = 1;
        position1.name = PositionName.Dev;
        System.out.println("Tên chức vụ = " + position1.name);

        Position position2 = new Position();
        position2.id = 2;
        position2.name = PositionName.Test;
        System.out.println("Tên chức vụ = " + position2.name);

        Position position3 = new Position();
        position3.id = 3;
        position3.name = PositionName.Scrum_Master;
        System.out.println("Tên chức vụ = " + position3.name);


        Account account1 = new Account();
        account1.id = 1;
        account1.email = "khoa.nv1@gmail.com";
        account1.username = "khóa.nv1";
        account1.fullName = "Nguyễn Gia Khóa";
        account1.department = department1;
        account1.position = position1;
        account1.createdDate = LocalDate.now();
        System.out.println("Tên nhân viên = " + account1.fullName);

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "Huy.nv2@gmail.com";
        account2.username = "Huy.nv2";
        account2.fullName = "Nguyễn Văn Huy";
        account2.department = department1;
        account2.position = position1;
        account2.createdDate = LocalDate.now();
        System.out.println("Tên nhân viên = " + account2.fullName);

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "khang.nv3@gmail.com";
        account3.username = "khang.nv3";
        account3.fullName = "Lê Văn Khang";
        account3.department = department1;
        account3.position = position1;
        account3.createdDate = LocalDate.now();
        System.out.println("Tên nhân viên = " + account3.fullName);


        Group group1 = new Group();
        group1.id = 1;
        group1.GroupName = "Java Core";
        group1.creator = account1;
        group1.createdDate = LocalDate.of(2023, 3, 16);
        System.out.println("Tên nhóm = " + group1.GroupName);

        Group group2 = new Group();
        group2.id = 2;
        group2.GroupName = "Database";
        group2.creator = account2;
        group2.createdDate = LocalDate.of(2023, 7, 1);
        System.out.println("Tên nhóm " + group2.GroupName);

        Group group3 = new Group();
        group3.id = 3;
        group3.GroupName = "Marketing";
        group3.creator = account3;
        group3.createdDate = LocalDate.of(2023, 7, 28);
        System.out.println("Tên nhóm = " + group3.GroupName);


        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.group = group2;
        groupAccount1.account = account1;
        groupAccount1.joinedDate = LocalDate.of(2023, 3, 16);
        System.out.println("Nhân viên = " + groupAccount1.account.username + " đã tham gia = " + groupAccount1.group.GroupName);
        System.out.println("Ngày tham gia nhóm = " + groupAccount1.joinedDate);

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.group = group3;
        groupAccount2.account = account2;
        groupAccount2.joinedDate = LocalDate.of(2023, 7, 1);
        System.out.println("Nhân viên = " + groupAccount2.account.username + " đã tham gia = " + groupAccount2.group.GroupName);
        System.out.println("Ngày tham gia nhóm = " + groupAccount2.joinedDate);

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.group = group1;
        groupAccount3.account = account3;
        groupAccount3.joinedDate = LocalDate.of(2023, 7, 28);
        System.out.println("Nhân viên = " + groupAccount3.account.username + " đã tham gia = " + groupAccount3.group.GroupName);
        System.out.println("Ngày tham gia nhóm = " + groupAccount3.joinedDate);


        TypeQuestoin type1 = new TypeQuestoin();
        type1.id = 1;
        type1.name = TypeName.Essay;
        System.out.println("loại câu hỏi = " + type1.name);

        TypeQuestoin type2 = new TypeQuestoin();
        type2.id = 2;
        type2.name = TypeName.Multiple_Choice;
        System.out.println("loại câu hỏi = " + type2.name);

        TypeQuestoin type3 = new TypeQuestoin();
        type3.id = 3;
        type3.name = TypeName.PM;
        System.out.println("loại câu hỏi = " +  type3.name);


        CategoryQuestion category1 = new CategoryQuestion();
        category1.id = 1;
        category1.name = "Java";
        System.out.println("Danh mục câu hỏi = " + category1.name);

        CategoryQuestion category2 = new CategoryQuestion();
        category2.id = 2;
        category2.name = "Data";
        System.out.println("Danh mục câu hỏi = " + category2.name);

        CategoryQuestion category3 = new CategoryQuestion();
        category3.id = 3;
        category3.name = "Sale";
        System.out.println("Danh mục câu hỏi = " + category3.name);


        Question question1 = new Question();
        question1.id = 1;
        question1.content = "kể tên các kiểu dữ liệu";
        question1.category = category3;
        question1.type = type1;
        question1.creator = account1;
        question1.createDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi = " + question1.content);

        Question question2 = new Question();
        question2.id = 2;
        question2.content = "có mấy loại ngôn ngữ lập trình?";
        question2.category = category2;
        question2.type = type2;
        question2.creator = account2;
        question2.createDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi = " + question2.content);

        Question question3 = new Question();
        question3.id = 1;
        question3.content = "Kiểu dữ liệu nguyên thủy có mấy loại?";
        question3.category = category1;
        question3.type = type3;
        question3.creator = account3;
        question3.createDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi = " + question3.content);


        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "k biết";
        answer1.question = question1;
        answer1.isCorrect = false;
        System.out.println("Nội dung câu trả lời = " + answer1.content);

        Answer answer2 = new Answer();
        answer2.id = 2;
        answer2.content = "có 3 loại ngôn ngữ chính";
        answer2.question = question2;
        answer2.isCorrect = true;
        System.out.println("Nội dung câu trả lời = " + answer2.content);

        Answer answer = new Answer();
        answer.id = 3;
        answer.content = "Có 8 loại: boolean, char, byte, short, int, long, float, double";
        answer.question = question3;
        answer.isCorrect = true;
        System.out.println("Nội dung câu trả lời = " + answer.content);


        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "VTI01";
        exam1.title = "Đề thi kết thúc học phần Java Core";
        exam1.category = category3;
        exam1.duration = 180;
        exam1.creator = account1;
        exam1.createDate = LocalDate.now();
        System.out.println("Tên đề thi = " + exam1.title);

        Exam exam2 = new Exam();
        exam2.id = 1;
        exam2.code = "VTI02";
        exam2.title = "Đề thi kết thúc học phần Database";
        exam2.category = category2;
        exam2.duration = 180;
        exam2.creator = account2;
        exam2.createDate = LocalDate.now();
        System.out.println("Tên đề thi = " + exam2.title);

        Exam exam3 = new Exam();
        exam3.id = 1;
        exam3.code = "VTI03";
        exam3.title = "Đề thi kết thúc học phần marketing";
        exam3.category = category1;
        exam3.duration = 180;
        exam3.creator = account1;
        exam3.createDate = LocalDate.now();
        System.out.println("Tên đề thi = " + exam3.title);


        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.exam = exam3;
        examQuestion1.question = question3;
        System.out.println("Mã đề thi= " + examQuestion1.exam.code + " có câu hỏi = " + examQuestion1.question.content);

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.exam = exam1;
        examQuestion2.question = question2;
        System.out.println("Mã đề thi = " + examQuestion2.exam.code + " có câu hỏi = " + examQuestion2.question.content);

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.exam = exam2;
        examQuestion3.question = question1;
        System.out.println("Mã đề thi = " + examQuestion3.exam.code + " có câu hỏi = " + examQuestion3.question.content);
    }
}
