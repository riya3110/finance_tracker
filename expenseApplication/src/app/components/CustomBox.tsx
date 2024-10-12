import {View, Text, StyleSheet } from 'react-native';
import React, {} from 'react';
import { Box } from '@gluestack-ui/themed';
import CustomText from './CustomText';

const CustomBox = ({style = {}, children, ...props}) => {
  return (
    <View>
      <Box style={[styles.headingContainer, style.mainBox, style.styles]}>
        <View style={styles.textColor}>{children}</View>
      </Box>
      <Box style={[styles.shadowContainer, style.shadowBox, style.styles]} />
    </View>
  );
};

export default CustomBox

const style = StyleSheet.create({})

const styles = StyleSheet.create({
  headingContainer: {
    padding: 20,
    borderColor: 'black',
    borderWidth: 1,
    position: 'relative',
    backgroundColor: 'black',
  },
  textColor: {
    color: 'white',
  },
  shadowContainer: {
    position: 'absolute',
    top: 5,
    left: 5,
    right: -5,
    bottom: -5,
    backgroundColor: 'gray',
    zIndex: -1,
  },
  mainBox: {
    borderColor: (style: { mainBox?: { borderColor?: string } }) => style?.mainBox?.borderColor || 'black',
    backgroundColor: (style: { mainBox?: { backgroundColor?: string } }) => style?.mainBox?.backgroundColor || 'black',
  },
  shadowBox: {
    backgroundColor: (style: { shadowBox: { backgroundColor: any; }; }) => style.shadowBox?.backgroundColor || 'gray',
  },
});