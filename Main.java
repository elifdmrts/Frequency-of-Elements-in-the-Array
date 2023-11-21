import java.util.HashMap;
        public class Main {
            static void findDuplicateEvenNumbers(int[] arr) {
                // Bir sayının kaç kere tekrar ettiğini tutan bir HashMap
                HashMap<Integer, Integer> countMap = new HashMap<>();

                // Diziyi tarayarak sayıları kontrol et ve tekrar sayısını güncelle
                for (int num : arr) {
                    if (num % 1 == 0) {
                        int count = countMap.getOrDefault(num, 0);
                        countMap.put(num, count + 1);

                    }
                }
                for (int num : countMap.keySet()) {
                    int count = countMap.get(num);
                    if (count > 0) {
                        System.out.println(num + " sayısı " + count + " kere tekrar edildi");
                    }
                }
            }


            public static void main(String[] args) {
                int[] sayiDizisi = {10, 20, 20, 10, 10, 20, 5, 20};

                System.out.println("Tekrar Sayıları:");
                findDuplicateEvenNumbers(sayiDizisi);
            }
        }
