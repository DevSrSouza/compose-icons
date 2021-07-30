package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.HandsSolid: ImageVector
    get() {
        if (_handsSolid != null) {
            return _handsSolid!!
        }
        _handsSolid = Builder(name = "HandsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                lineTo(3.0f, 16.4063f)
                lineTo(3.2813f, 16.7188f)
                lineTo(9.0f, 22.4375f)
                lineTo(9.0f, 28.0f)
                lineTo(15.0f, 28.0f)
                lineTo(15.0f, 22.0313f)
                lineTo(15.0f, 22.0f)
                curveTo(15.004f, 21.945f, 15.1455f, 18.8445f, 12.5625f, 17.1875f)
                curveTo(12.5545f, 17.1835f, 12.5705f, 17.1602f, 12.5625f, 17.1563f)
                curveTo(12.5545f, 17.1523f, 12.5393f, 17.1602f, 12.5313f, 17.1563f)
                curveTo(11.3472f, 16.3832f, 10.1252f, 15.7507f, 9.2813f, 15.0938f)
                curveTo(8.4303f, 14.4347f, 8.0f, 13.887f, 8.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                curveTo(6.0f, 14.617f, 6.9453f, 15.8435f, 8.0313f, 16.6875f)
                curveTo(9.1173f, 17.5315f, 10.3795f, 18.1528f, 11.4375f, 18.8438f)
                lineTo(11.4688f, 18.8438f)
                curveTo(13.0708f, 19.8477f, 13.0f, 21.9688f, 13.0f, 21.9688f)
                lineTo(13.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 21.5938f)
                lineTo(10.7188f, 21.2813f)
                lineTo(5.0f, 15.5625f)
                lineTo(5.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                close()
                moveTo(27.0f, 5.0f)
                lineTo(27.0f, 15.5625f)
                lineTo(21.2813f, 21.2813f)
                lineTo(21.0f, 21.5938f)
                lineTo(21.0f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 21.9375f)
                curveTo(19.0f, 21.9375f, 18.9303f, 19.8477f, 20.5313f, 18.8438f)
                lineTo(20.5625f, 18.8438f)
                curveTo(21.6175f, 18.1528f, 22.8827f, 17.5305f, 23.9688f, 16.6875f)
                curveTo(25.0548f, 15.8445f, 26.0f, 14.617f, 26.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                curveTo(24.0f, 13.887f, 23.5697f, 14.4338f, 22.7188f, 15.0938f)
                curveTo(21.8748f, 15.7498f, 20.6528f, 16.3822f, 19.4688f, 17.1563f)
                curveTo(19.4608f, 17.1602f, 19.4455f, 17.1523f, 19.4375f, 17.1563f)
                lineTo(19.4375f, 17.1875f)
                curveTo(16.8745f, 18.8275f, 16.996f, 21.895f, 17.0f, 22.0f)
                lineTo(17.0f, 22.0625f)
                lineTo(17.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 22.4375f)
                lineTo(28.7188f, 16.7188f)
                lineTo(29.0f, 16.4063f)
                lineTo(29.0f, 5.0f)
                lineTo(27.0f, 5.0f)
                close()
            }
        }
        .build()
        return _handsSolid!!
    }

private var _handsSolid: ImageVector? = null
