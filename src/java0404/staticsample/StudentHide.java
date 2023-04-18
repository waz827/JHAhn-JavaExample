package java0404.staticsample;

import java.util.PrimitiveIterator;

public class StudentHide {
    private int studentId;
    private String studentName;
    private String studentDepart;
    private String studentAddress;
    private int studentTN;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepart() {
        return studentDepart;
    }

    public void setStudentDepart(String studentDepart) {
        this.studentDepart = studentDepart;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getStudentTN() {
        return studentTN;
    }
    public void setStudentTN(int studentTN) {
        this.studentTN = studentTN;
    }

    @Override
    public String toString() {
        return "StudentHide{"+'\n'+
                "studentId=" + studentId +'\n'+
                "studentName='" + studentName + '\n' +
                "studentDepart='" + studentDepart + '\n' +
                "studentAddress='" + studentAddress + '\n' +
                "studentTN=" + studentTN +
                '}';
    }

}
