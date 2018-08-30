

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/plugin3"(view: "/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        log.info("Loaded plugin3 UrlMappings")

    }
}
