package inheritence;
// Single Level Inheritence

class HeadOffice {

    void showHO() {
        System.out.println("Head Office Class(Grand Class)");
    }
}

class BranchOffice extends HeadOffice {

    void showBO() {
        System.out.println("Branch Office Class(Parent Class)");
    }
}


class CampusOffice extends BranchOffice {

    void showCO() {
        System.out.println("Campus Office Class(Child Class)");
    }
}

class Main {
    public static void main(String[] args) {
        CampusOffice campusOffice = new CampusOffice();
        campusOffice.showHO();
        campusOffice.showBO();
        campusOffice.showCO();
    }
}

