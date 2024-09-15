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

public val LineAwesomeIcons.BicycleSolid: ImageVector
    get() {
        if (_bicycleSolid != null) {
            return _bicycleSolid!!
        }
        _bicycleSolid = Builder(name = "BicycleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                lineTo(19.0f, 7.438f)
                lineTo(19.094f, 7.625f)
                lineTo(20.125f, 10.0f)
                lineTo(11.438f, 10.0f)
                lineTo(11.125f, 10.438f)
                lineTo(8.406f, 14.281f)
                curveTo(7.801f, 14.094f, 7.164f, 14.0f, 6.5f, 14.0f)
                curveTo(2.918f, 14.0f, 0.0f, 16.914f, 0.0f, 20.5f)
                curveTo(0.0f, 24.086f, 2.914f, 27.0f, 6.5f, 27.0f)
                curveTo(9.914f, 27.0f, 12.707f, 24.348f, 12.969f, 21.0f)
                lineTo(16.406f, 21.0f)
                lineTo(16.719f, 20.563f)
                lineTo(21.594f, 13.375f)
                lineTo(22.25f, 14.875f)
                curveTo(20.309f, 16.004f, 19.0f, 18.109f, 19.0f, 20.5f)
                curveTo(19.0f, 24.07f, 21.93f, 27.0f, 25.5f, 27.0f)
                curveTo(29.07f, 27.0f, 32.0f, 24.07f, 32.0f, 20.5f)
                curveTo(32.0f, 16.93f, 29.07f, 14.0f, 25.5f, 14.0f)
                curveTo(25.02f, 14.0f, 24.547f, 14.055f, 24.094f, 14.156f)
                lineTo(21.406f, 8.0f)
                lineTo(24.5f, 8.0f)
                curveTo(24.785f, 8.0f, 25.0f, 8.215f, 25.0f, 8.5f)
                curveTo(25.0f, 8.785f, 24.785f, 9.0f, 24.5f, 9.0f)
                lineTo(24.5f, 11.0f)
                curveTo(25.867f, 11.0f, 27.0f, 9.867f, 27.0f, 8.5f)
                curveTo(27.0f, 7.133f, 25.867f, 6.0f, 24.5f, 6.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(8.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(13.469f, 12.0f)
                lineTo(20.125f, 12.0f)
                lineTo(16.094f, 17.938f)
                close()
                moveTo(11.719f, 13.0f)
                lineTo(14.344f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 21.0f)
                lineTo(10.938f, 21.0f)
                curveTo(10.684f, 23.242f, 8.809f, 25.0f, 6.5f, 25.0f)
                curveTo(4.02f, 25.0f, 2.0f, 22.98f, 2.0f, 20.5f)
                curveTo(2.0f, 18.02f, 4.02f, 16.0f, 6.5f, 16.0f)
                curveTo(8.059f, 16.0f, 9.441f, 16.797f, 10.25f, 18.0f)
                lineTo(12.5f, 18.0f)
                curveTo(12.02f, 16.848f, 11.23f, 15.859f, 10.219f, 15.156f)
                close()
                moveTo(25.5f, 16.0f)
                curveTo(27.98f, 16.0f, 30.0f, 18.02f, 30.0f, 20.5f)
                curveTo(30.0f, 22.98f, 27.98f, 25.0f, 25.5f, 25.0f)
                curveTo(23.02f, 25.0f, 21.0f, 22.98f, 21.0f, 20.5f)
                curveTo(21.0f, 18.926f, 21.832f, 17.555f, 23.063f, 16.75f)
                lineTo(25.094f, 21.406f)
                lineTo(26.906f, 20.594f)
                lineTo(24.938f, 16.063f)
                curveTo(25.125f, 16.039f, 25.309f, 16.0f, 25.5f, 16.0f)
                close()
            }
        }
        .build()
        return _bicycleSolid!!
    }

private var _bicycleSolid: ImageVector? = null
