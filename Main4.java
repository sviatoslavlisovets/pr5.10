public class Main4 {
    public static void main(String[] args) {
        int count = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                String time = String.format("%02d:%02d", hour, minute);
                if (isSymmetric(time)) {
                    count++;
                }
            }
        }

        System.out.println("Кількість співпадінь симетричних комбінацій: " + count);
    }

    public static boolean isSymmetric(String time) {
        return time.charAt(0) == time.charAt(4) && time.charAt(1) == time.charAt(3);
    }
}