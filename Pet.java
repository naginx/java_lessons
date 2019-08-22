class Pet {
    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    public String getName() { return name; };

    public String getMasterName() { return masterName; };
    
    public void introduce() {
        System.out.println("僕の名前は" + name + "です");
        System.out.println("ご主人さまは" + masterName + "です");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    public void introduce() {
        System.out.println("私はロボット。名前は" + getName() + "。");
        System.out.println("ご主人さまは" + getMasterName() + "。");
    }

    public void work(int sw) {
        switch (sw) {
            case 0: System.out.println("掃除します。"); break;
            case 1: System.out.println("洗濯します。"); break;
            case 2: System.out.println("炊事します。"); break;
        }
    }
}

class PetTester1 {
    public static void main(String[] args) {
        Pet kurt = new Pet("Kurt", "アイ");
        kurt.introduce();
        System.out.println();

        RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
        r2d2.introduce();
        System.out.println();

        Pet p = r2d2;
        p.introduce();
    }
}