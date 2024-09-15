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
                lineTo(3.0f, 16.406f)
                lineTo(3.281f, 16.719f)
                lineTo(9.0f, 22.438f)
                lineTo(9.0f, 28.0f)
                lineTo(15.0f, 28.0f)
                lineTo(15.0f, 22.031f)
                lineTo(15.0f, 22.0f)
                curveTo(15.004f, 21.945f, 15.146f, 18.844f, 12.563f, 17.188f)
                curveTo(12.554f, 17.184f, 12.571f, 17.16f, 12.563f, 17.156f)
                curveTo(12.554f, 17.152f, 12.539f, 17.16f, 12.531f, 17.156f)
                curveTo(11.347f, 16.383f, 10.125f, 15.751f, 9.281f, 15.094f)
                curveTo(8.43f, 14.435f, 8.0f, 13.887f, 8.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                curveTo(6.0f, 14.617f, 6.945f, 15.844f, 8.031f, 16.688f)
                curveTo(9.117f, 17.531f, 10.38f, 18.153f, 11.438f, 18.844f)
                lineTo(11.469f, 18.844f)
                curveTo(13.071f, 19.848f, 13.0f, 21.969f, 13.0f, 21.969f)
                lineTo(13.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 21.594f)
                lineTo(10.719f, 21.281f)
                lineTo(5.0f, 15.563f)
                lineTo(5.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                close()
                moveTo(27.0f, 5.0f)
                lineTo(27.0f, 15.563f)
                lineTo(21.281f, 21.281f)
                lineTo(21.0f, 21.594f)
                lineTo(21.0f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 21.938f)
                curveTo(19.0f, 21.938f, 18.93f, 19.848f, 20.531f, 18.844f)
                lineTo(20.563f, 18.844f)
                curveTo(21.618f, 18.153f, 22.883f, 17.531f, 23.969f, 16.688f)
                curveTo(25.055f, 15.844f, 26.0f, 14.617f, 26.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                curveTo(24.0f, 13.887f, 23.57f, 14.434f, 22.719f, 15.094f)
                curveTo(21.875f, 15.75f, 20.653f, 16.382f, 19.469f, 17.156f)
                curveTo(19.461f, 17.16f, 19.445f, 17.152f, 19.438f, 17.156f)
                lineTo(19.438f, 17.188f)
                curveTo(16.875f, 18.827f, 16.996f, 21.895f, 17.0f, 22.0f)
                lineTo(17.0f, 22.063f)
                lineTo(17.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 22.438f)
                lineTo(28.719f, 16.719f)
                lineTo(29.0f, 16.406f)
                lineTo(29.0f, 5.0f)
                lineTo(27.0f, 5.0f)
                close()
            }
        }
        .build()
        return _handsSolid!!
    }

private var _handsSolid: ImageVector? = null
