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

public val LineAwesomeIcons.ToriiGateSolid: ImageVector
    get() {
        if (_toriiGateSolid != null) {
            return _toriiGateSolid!!
        }
        _toriiGateSolid = Builder(name = "ToriiGateSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.938f, 4.969f)
                lineTo(2.938f, 6.781f)
                lineTo(3.25f, 7.094f)
                lineTo(7.25f, 10.75f)
                lineTo(7.563f, 11.0f)
                lineTo(9.0f, 11.0f)
                lineTo(9.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                lineTo(7.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                lineTo(9.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(11.0f, 16.0f)
                lineTo(21.0f, 16.0f)
                lineTo(21.0f, 27.0f)
                lineTo(23.0f, 27.0f)
                lineTo(23.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 11.0f)
                lineTo(24.375f, 11.0f)
                lineTo(24.688f, 10.75f)
                lineTo(28.688f, 7.094f)
                lineTo(29.0f, 6.781f)
                lineTo(29.0f, 4.969f)
                lineTo(27.781f, 5.25f)
                curveTo(27.746f, 5.258f, 23.527f, 6.0f, 16.0f, 6.0f)
                curveTo(8.473f, 6.0f, 4.191f, 5.258f, 4.156f, 5.25f)
                close()
                moveTo(6.781f, 7.563f)
                curveTo(8.895f, 7.773f, 11.914f, 8.0f, 16.0f, 8.0f)
                curveTo(20.055f, 8.0f, 23.059f, 7.77f, 25.156f, 7.563f)
                lineTo(23.594f, 9.0f)
                lineTo(8.344f, 9.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 14.0f)
                lineTo(11.0f, 14.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _toriiGateSolid!!
    }

private var _toriiGateSolid: ImageVector? = null
