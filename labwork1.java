// PRACTICAL 1 
// EXERCISE 1
class MemberCard {
    String name;
    String studentId;
    String email;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name; 
    }
    public String getStudentId() { 
        return studentId;
    }
    public void setStudentId(String studentId){ 
        this.studentId = studentId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
} 
class Main {
     static void main(String[] dulieu) {
        MemberCard clubMember = new MemberCard();
        clubMember.setName("Nguyen Bang Nguyen");
        clubMember.setStudentId("2510799");
        clubMember.setEmail("nguyennb.2510799@usth.edu.vn");
        System.out.println("Name: " + clubMember.getName());
        System.out.println("Student ID: " + clubMember.getStudentId());
        System.out.println("Email: " + clubMember.getEmail());
    }
}