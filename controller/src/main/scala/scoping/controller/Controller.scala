package scoping.controller

import scoping.service.Service
/*
import scoping.service.repository.Repository
*/

final class Controller(val controller: Controller, val service: Service/*, val repository: Repository*/)
//                     ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉  ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉    ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉
//                                 ✔                        ✔                       ✘
