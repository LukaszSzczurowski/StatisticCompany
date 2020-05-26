public class Statistic {

    private static final String IT = "it";
    private static final String MANAGEMENT = "Management";
    private static final String SUPPORT = "Support";

    double averageSalary(Employes[] employes) {
        double sum = 0;
        for (Employes employe : employes) {
            sum += employe.getSalary();
        }
        return sum / employes.length;
    }

    double minSalary(Employes[] employes) {
        double min = Integer.MAX_VALUE;
        for (Employes employe : employes) {
            if (employe.getSalary() < min)
                min = employe.getSalary();
        }
        return min;
    }

    double maxSalary(Employes[] employes) {
        double max = 0;
        for (Employes employe : employes) {
            if (employe.getSalary() > max)
                max = employe.getSalary();
        }
        return max;
    }

    int numberAllEmployes(Employes[] employes) {
        return employes.length;
    }

    int numberEmployesIT(Employes[] employes) {
        int count = 0;
        for (Employes employe : employes) {
            if (employe.getDepartment().equals(IT))
//            System.out.println(employe.getDepartment().equals(IT));
            count++;
        }
        return count;
    }

    int numberEmployesManagement(Employes[] employes) {
        int count = 0;
        for (Employes employe : employes) {
            if (employe.getDepartment().equalsIgnoreCase(MANAGEMENT))
            count++;
        }
        return count;
    }

    int numberEmployesSupport(Employes[] employes) {
        int count = 0;
        for (Employes employe : employes) {
            if (employe.getDepartment().equalsIgnoreCase(SUPPORT))
            count++;
        }
        return count;
    }

}
