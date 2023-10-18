package Proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/Empinado/realProject");

        project.run();
    }
}
