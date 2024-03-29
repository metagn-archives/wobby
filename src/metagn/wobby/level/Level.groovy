package metagn.wobby.level

import groovy.transform.CompileStatic

@CompileStatic
abstract class Level<T extends PlacedThing> {
	Map data = new HashMap()
	int maxX, maxY

	abstract List<T> thingsIn(int x, int y)
}
