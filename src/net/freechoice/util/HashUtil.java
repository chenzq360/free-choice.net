package net.freechoice.util;

public class HashUtil {
	public static int hashIntegers(int...ii) {
		int hash = 1;
		for (int i : ii) {
			hash = 31*hash + i;
		}
		return hash;
	}
	
	public static int hash64To32(long l) {
		
		return (int)(l ^ (l >>> 32));
	}
	
    public static int hashBytes(int seed, char[] data, int offset, int len) {
        int h1 = seed;

        int off = offset;
        int count = len;

        // body
        while (count >= 2) {
            int k1 = (data[off++] & 0xFFFF) | (data[off++] << 16);

            count -= 2;

            k1 *= 0xcc9e2d51;
            k1 = Integer.rotateLeft(k1, 15);
            k1 *= 0x1b873593;

            h1 ^= k1;
            h1 = Integer.rotateLeft(h1, 13);
            h1 = h1 * 5 + 0xe6546b64;
        }
        // last one
        if (count > 0) {
            int k1 = data[off];

            k1 *= 0xcc9e2d51;
            k1 = Integer.rotateLeft(k1, 15);
            k1 *= 0x1b873593;
            h1 ^= k1;
        }

        // finish it

        h1 ^= len * (Character.SIZE / Byte.SIZE);

        h1 ^= h1 >>> 16;
        h1 *= 0x85ebca6b;
        h1 ^= h1 >>> 13;
        h1 *= 0xc2b2ae35;
        h1 ^= h1 >>> 16;

        return h1;
    }
}
