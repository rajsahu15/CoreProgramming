public class test1ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        for(int i=0;i<=5;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        arrayList.add(1,100);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
