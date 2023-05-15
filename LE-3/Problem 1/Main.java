abstract class bharatvanshi {
    abstract void fighter();
    abstract void obedience();
    abstract void kind();
}

class pandavs extends bharatvanshi {
    void fighter(){
        System.out.println("Pandavs fighters are Arjun and Bheem.");
    }
    void obedience(){
        System.out.println("Obedience Pandavs are Arjun and Bheem.");
    }
    void kind(){
        System.out.println("Kind Pandavs are Arjun and Bheem a bit.");
    }
}

class kauravs extends bharatvanshi {
    void fighter(){
        System.out.println("Fighter Duryodhan and Vikarn and 98 other.");
    }
    void obedience(){
        System.out.println("Vikarn.");
    }
    void kind(){
        System.out.println("Vikarn.");
    }
}

public class Main
{
	public static void main(String[] args) {
		bharatvanshi p=new pandavs();
		p.fighter();
		p.obedience();
		p.kind();
		bharatvanshi k=new kauravs();
		k.fighter();
		k.obedience();
		k.kind();
	}
}
