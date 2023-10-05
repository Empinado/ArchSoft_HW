package Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
//В данной записи мы видим в выводе один и тот же хешкод, потверждение обращения к единственному экземпляру
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());

        ProgramLogger.getProgramLogger().addLogInfo("1...");
        ProgramLogger.getProgramLogger().addLogInfo("2...");
        ProgramLogger.getProgramLogger().addLogInfo("3...");
//Можем наблюдать, что все три записи были внесены в лог
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
