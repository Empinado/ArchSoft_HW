package Singleton;

public class ProgramLogger {
// Попытаемся воспроизвести паттерн singleton на примере программы, которая ведет записть логов.
// Создаем экземпляр класса. Создаем стринговую переменную, которая будет записывать наш лог.
    private static  ProgramLogger programLogger;
    private static  String logFile = "This is log file. \n\n";
//Создаем метод, который будет возвращаться нам экземпляр programLogger
//Данный пример подходит для однопоточной среды, чтобы избежать проблем с несколькими обращениями к нашей программе
//Мы добавляем модификатор synchronized, второе обращение будет ждать завершения обработки первого(очередь).
    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }

        return programLogger;
    }
//Создаем приватный пустой конструктор
    private  ProgramLogger(){
    }

//Создаем метод logFile, для передачи текста лога
    public  void addLogInfo(String loginfo){
      logFile += loginfo + "\n";
    }
//Создаем метод showLogFile для вывода лога в терминал
    public void showLogFile(){
        System.out.println(logFile);
    }
}
