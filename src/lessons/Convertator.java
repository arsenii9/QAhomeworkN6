package lessons;

public class Convertator {
    public class Converter {
        private String converterName;

        public Converter(String converterName) {
            this.converterName = converterName;
        }

        public String getConverterName() {
            return converterName;
        }

        public int convertToInt(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean");
                return 0; // Пример, необходимо реализовать конвертацию boolean
            } else {
                return Integer.parseInt(String.valueOf(value));
            }
        }

        public double convertToDouble(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean");
                return 0.0; // Пример, необходимо реализовать конвертацию boolean
            } else {
                return Double.parseDouble(String.valueOf(value));
            }
        }

        public String convertToString(Object value) {
            return String.valueOf(value);
        }

        public void main(String[] args) {
            Converter myConverter = new Converter("MyConverter");
            System.out.println("Converter name: " + myConverter.getConverterName());

            int intValue = myConverter.convertToInt(42);
            System.out.println("Converted to int: " + intValue);

            double doubleValue = myConverter.convertToDouble(3.14);
            System.out.println("Converted to double: " + doubleValue);

            String stringValue = myConverter.convertToString(true);
            System.out.println("Converted to string: " + stringValue);
        }
    }

}
