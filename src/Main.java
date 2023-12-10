public class Main {
    public static void main(String[] args) {
     /*   DepartementHashSet departementHashSet = new DepartementHashSet();

        Departement d1 = new Departement(1,50,"informatique");
        Departement d2 = new Departement(1,50,"informatique");
        Departement d3 = new Departement(3,10,"finance");
        Departement d4 = new Departement(6,20,"marketing");


        departementHashSet.ajouterDepartement(d1);
        departementHashSet.ajouterDepartement(d2);
        departementHashSet.ajouterDepartement(d3);
        departementHashSet.ajouterDepartement(d4);


        departementHashSet.displayDepartement();
        System.out.println(departementHashSet.rechercherDepartement(d1));
        System.out.println(departementHashSet.rechercherDepartement("finance"));

        System.out.println(departementHashSet.trierDepartementById());
        departementHashSet.supprimerDepartement(d3);
        departementHashSet.displayDepartement();*/


        AffectationHashMap depHashset = new AffectationHashMap();
        Departement dep1 = new Departement(41,"1",0);
        Departement dep2 = new Departement(62,"2",0);

        Employe em1 = new Employe(2,"em","1","exmp",5);
        Employe em2 = new Employe(42,"emye","2","exmp",5);
        Employe em3 = new Employe(62,"nt","3","exmp",5);
        Employe em4 = new Employe(58,"exm","4","exmp",5);

        depHashset.ajouterEmployeDepartement(em1,dep1);
        depHashset.ajouterEmployeDepartement(em2,dep2);
        depHashset.ajouterEmployeDepartement(em3,dep2);
        depHashset.ajouterEmployeDepartement(em4,dep1);

        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.afficherDepartements();
        System.out.println("-------------------------");
        depHashset.afficherEmployes();
        System.out.println("-------------------------");
        System.out.println(depHashset.rechercherEmploye(em1));
        System.out.println(depHashset.rechercherDepartement(dep1));
        System.out.println("-------------------------");
        System.out.println(depHashset.trierMap());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(em1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherEmploye(em1));
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(em2,dep1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(em2,dep2);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(em4);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherDepartement(dep1));



    }

}
