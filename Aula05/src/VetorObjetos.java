public class VetorObjetos {
    public static void main(String[] args) {
        Aluno[] turma = new Aluno[3];
        turma[0] = new Aluno("Maria", 20);
        turma[1] = new Aluno("João", 22);
        turma[2] = new Aluno("Pedro", 21);
        for (Aluno aluno : turma) {
            System.out.println(aluno);
        }
    }
}