package littlejbootstrap

class BootStrap {

    DemoService demoService

    def init = { servletContext ->

        int number = demoService.magicNumber

        println "The Magic Number: ${number}"
    }

    def destroy = {
    }
}
