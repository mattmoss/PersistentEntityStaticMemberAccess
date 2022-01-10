package demo

class BootStrap {

    ThingService thingService

    def init = { servletContext ->

        thingService.report()
        ['alpha', 'beta', 'incGamma', 'epsilon', 'incDelta', 'incRho', 'xi', 'pi', 'incMu'].each {
            def ignored = new Thing(name: it)
            thingService.report()
        }
    }

}
