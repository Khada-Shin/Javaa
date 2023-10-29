package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private Animal[] aquaticAnimals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Animal[10];
        this.name = name;
        this.city = city;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals >= 10) {
            System.out.println("Le zoo aquatique est complet.");
            return;
        }

        if (searchAnimal(aquatic) != -1) {
            System.out.println("Cet animal aquatique est déjà dans le zoo.");
            return;
        }

        aquaticAnimals[nbrAquaticAnimals] = aquatic;
        nbrAnimals++;
        nbrAquaticAnimals++;
        System.out.println("Animal aquatique ajouté avec succès au zoo.");
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1.0f; // Initialisez la profondeur maximale à une valeur négative pour la comparer
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            Animal aquaticAnimal = aquaticAnimals[i];
            if (aquaticAnimal instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimal; // Conversion de type pour accéder à la profondeur de nage
                float swimmingDepth = penguin.getSwimmingDepth();
                if (swimmingDepth > maxDepth) {
                    maxDepth = swimmingDepth; // Met à jour la profondeur maximale si nécessaire
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins dans le zoo : " + dolphinCount);
        System.out.println("Nombre de pingouins dans le zoo : " + penguinCount);
    }
    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals + "}";
    }
}
