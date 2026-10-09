public class MemberCardTestDrive {
    public static void main(String[] args) {
        MemberCard card = new MemberCard();
        card.setName("Nguyen Bang Nguyen");
        card.setStudentId("2510799");
        card.setEmail("nguyennb2510799@usth.edu.vn");

        System.out.println("Name:       " + card.getName());
        System.out.println("Student ID: " + card.getStudentId());
        System.out.println("Email:      " + card.getEmail());
    }
}
