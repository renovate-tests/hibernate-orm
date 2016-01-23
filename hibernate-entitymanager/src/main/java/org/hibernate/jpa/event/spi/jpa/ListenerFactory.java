/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.jpa.event.spi.jpa;

/**
 * Factory for building instances of callback listener classes.
 *
 * @author Steve Ebersole
 */
public interface ListenerFactory {
	<T> Listener<T> buildListener(Class<T>  listenerClass);
	void release();
}
