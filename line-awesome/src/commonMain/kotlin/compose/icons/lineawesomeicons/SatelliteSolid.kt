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

public val LineAwesomeIcons.SatelliteSolid: ImageVector
    get() {
        if (_satelliteSolid != null) {
            return _satelliteSolid!!
        }
        _satelliteSolid = Builder(name = "SatelliteSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.875f, 3.594f)
                lineTo(8.156f, 4.281f)
                lineTo(4.313f, 8.156f)
                lineTo(3.594f, 8.875f)
                lineTo(4.313f, 9.563f)
                lineTo(10.063f, 15.344f)
                lineTo(9.406f, 16.0f)
                lineTo(16.0f, 22.594f)
                lineTo(16.656f, 21.938f)
                lineTo(22.406f, 27.719f)
                lineTo(23.125f, 28.406f)
                lineTo(23.844f, 27.719f)
                lineTo(27.719f, 23.813f)
                lineTo(28.438f, 23.125f)
                lineTo(21.656f, 16.344f)
                curveTo(22.273f, 14.684f, 21.922f, 12.734f, 20.594f, 11.406f)
                curveTo(19.688f, 10.5f, 18.477f, 10.063f, 17.281f, 10.063f)
                curveTo(16.727f, 10.063f, 16.18f, 10.184f, 15.656f, 10.375f)
                lineTo(9.594f, 4.281f)
                close()
                moveTo(8.875f, 6.406f)
                lineTo(13.938f, 11.469f)
                lineTo(11.469f, 13.938f)
                lineTo(6.406f, 8.875f)
                close()
                moveTo(17.281f, 12.031f)
                curveTo(17.961f, 12.031f, 18.664f, 12.289f, 19.188f, 12.813f)
                curveTo(20.234f, 13.859f, 20.234f, 15.547f, 19.188f, 16.594f)
                lineTo(16.281f, 19.469f)
                lineTo(16.0f, 19.75f)
                lineTo(12.25f, 16.0f)
                lineTo(15.281f, 12.969f)
                lineTo(15.406f, 12.813f)
                curveTo(15.477f, 12.742f, 15.551f, 12.688f, 15.625f, 12.625f)
                lineTo(15.813f, 12.469f)
                curveTo(16.254f, 12.176f, 16.773f, 12.031f, 17.281f, 12.031f)
                close()
                moveTo(8.438f, 17.0f)
                lineTo(7.0f, 18.406f)
                lineTo(13.594f, 25.0f)
                lineTo(15.0f, 23.563f)
                close()
                moveTo(20.531f, 18.063f)
                lineTo(25.594f, 23.125f)
                lineTo(23.125f, 25.594f)
                lineTo(18.063f, 20.531f)
                close()
            }
        }
        .build()
        return _satelliteSolid!!
    }

private var _satelliteSolid: ImageVector? = null
