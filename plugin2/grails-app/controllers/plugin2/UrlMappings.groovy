package plugin2

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/plugin2"(view: "/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        log.info("Loaded plugin2 UrlMappings")

    }
}
