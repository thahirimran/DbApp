public class DbApp2 {
    public static void main(String[] args) {
        String emp [][] = EmployeeDao.getAll();
        for (int i = 0; i < emp.length; i++) {
            for (int j = 0; j < emp[0].length; j++) {
                System.out.print(emp[i][j]+"\t\t");
            }
            System.out.println("");
        }
    }
}
