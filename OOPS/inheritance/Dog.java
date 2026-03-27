class Dog extends Animal {
    String sound;

    Dog () {
        this.sound = "bow bow!";
    }

    Dog (String newSound) {
        this.sound = newSound;
    }

    Dog (String name, String type, String sound) {
        super(name, type);
        this.sound = sound;
    }
}









Access Modifiers table:

Modifier | Class | Package | Subclass(same package) | Subclass(different package) | World
public   |   Y   |   Y     |          Y             |             Y               |   Y
protected|   Y   |   Y     |          Y             |             Y               |   
default  |   Y   |   Y     |          Y             |                             |   
private  |   Y   |         |                        |                             |   

(y - can be accessed)