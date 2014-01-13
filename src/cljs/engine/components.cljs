(ns chocolatier.engine.components)


(defprotocol Entity
  "Base level entities can be ticked"
  (tick [this]
    "Update the world to handle the passing of a tick for this entity."))

(defprotocol Renderable
  "Render to the the screen"
  (render [this stage]
    "Render this to the stage"))

(defprotocol Attackable
  "Render to the the screen"
  (attack [this]
    "Attack this entity"))
