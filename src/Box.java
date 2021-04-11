import java.util.ArrayList;

public class Box {

    /*
      Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
      поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

      Для хранения фруктов внутри коробки можете использовать ArrayList
     */

    private ArrayList<Fruit> fruits;

    public Box() {
        this.fruits = new ArrayList<Fruit>();
    }

    public void addFruit(Fruit fr) {
        // Метод добавления фрукта в коробку
        if (fruits.isEmpty()) {
            fruits.add(fr);
            return;
        }
        String frName = fr.getClass().getName();
        if (firsFruit().equals(frName) ) {fruits.add(fr);}
            else System.out.println(frName + " не добавлен");
    }

    public String firsFruit(){
        if (fruits.isEmpty()) {
            return "";
        }
        return fruits.get(0).getClass().getName();
    }

    public float getWeight() {
        /*
        Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов
        и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах)
         */
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        float weight = 1.0f;
        if (firsFruit().equals("Orange")) { weight = 1.5f; }
        return weight * fruits.size();
    }

    public boolean compare(Box another) {
        /*
        Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку
        с той, которую подадут в compare в качестве параметра,
        true - если их веса равны,
        false в противном случае
        (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
         */
        return Math.abs(this.getWeight() - another.getWeight()) < 0.00001;
    }

    public void putToBox(Box receiver){
        /*
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
        (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
        соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
        которые были в этой коробке;
         */
        if (!receiver.fruits.isEmpty()) {
            if (!this.firsFruit().equals(receiver.firsFruit())) {
                System.out.println("Высыпать нельзя! В коробках разные фрукты");
                return; }
        }
        receiver.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
