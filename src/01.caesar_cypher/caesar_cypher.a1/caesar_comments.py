#!/usr/bin/env python

# ========================= CODING FILE INFORMATION ========================= #
# File         : caesar.py
# Date         : 2017-Feb-12
# Last modified: 2017-Feb-12
#
# Author       : Mo
#
# Description  : The coding for encryption and decryption using Caesar.
#
# Dependency   : -
#
# Usage        : python caesar.py
# =========================================================================== #

# ========================= CODING STYLE CONVENTION ========================= #
# CONSTANT: UPCASE NOUNS CONNECTED WITH UNDERSCORE
# VARIABLE: LOWCASE NOUNS CONNECTED WITH UNDERSCORE
# FUNCTION: LOWCASE VERBS CONNECTED WITH UNDERSCORE
# =========================================================================== #




letters_low = 'abcdefghijklmnopqrstuvwxyz'
letters_up  = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
letters_num = '0123456789'


def caesarEncryptLetter(letters, l, step):
	if l in letters:
		li=letters.find(l)
		encl=li+step
		if encl>=len(letters):
			encl=encl-len(letters)
		elif encl < 0:
			encl=encl+len(letters)
		return letters[encl]
	else:
		return l

def caesarEncrypt(msg, step):
	msgce=''
	for letter in msg:
		if letter in letters_low:
			ce = caesarEncryptLetter(letters_low, letter, step)
		elif letter in letters_up:
			ce = caesarEncryptLetter(letters_up, letter, step)
		elif letter in letters_num:
			ce = caesarEncryptLetter(letters_num, letter, step)
		else:
			ce = letter
		msgce=msgce+ce
	return msgce


key = int(raw_input('CAESAR KEY>'))
msg = raw_input('CAESAR>')
print caesarEncrypt(msg, key)
