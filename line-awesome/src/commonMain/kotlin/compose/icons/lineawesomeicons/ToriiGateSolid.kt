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
                moveTo(2.9375f, 4.9688f)
                lineTo(2.9375f, 6.7813f)
                lineTo(3.25f, 7.0938f)
                lineTo(7.25f, 10.75f)
                lineTo(7.5625f, 11.0f)
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
                lineTo(24.6875f, 10.75f)
                lineTo(28.6875f, 7.0938f)
                lineTo(29.0f, 6.7813f)
                lineTo(29.0f, 4.9688f)
                lineTo(27.7813f, 5.25f)
                curveTo(27.7461f, 5.2578f, 23.5273f, 6.0f, 16.0f, 6.0f)
                curveTo(8.4727f, 6.0f, 4.1914f, 5.2578f, 4.1563f, 5.25f)
                close()
                moveTo(6.7813f, 7.5625f)
                curveTo(8.8945f, 7.7734f, 11.9141f, 8.0f, 16.0f, 8.0f)
                curveTo(20.0547f, 8.0f, 23.0586f, 7.7695f, 25.1563f, 7.5625f)
                lineTo(23.5938f, 9.0f)
                lineTo(8.3438f, 9.0f)
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
