package String;

public class ExcelSheetColumn {
    public static void main(String[] args) {
        System.out.println(getSheetColumn("ZY"));
    }

    private static int getSheetColumn(String columnTitle) {
        if (columnTitle == null || columnTitle.isEmpty())
            return 0;
        if (columnTitle.length() == 1)
            return (int) columnTitle.charAt(0) - 64;
        int sheet = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sheet += ((int) columnTitle.charAt(i) - 64) * Math.pow(26, columnTitle.length() - i - 1);
        }
        return sheet;
    }
}
