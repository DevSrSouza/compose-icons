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

public val LineAwesomeIcons.FacebookMessenger: ImageVector
    get() {
        if (_facebookMessenger != null) {
            return _facebookMessenger!!
        }
        _facebookMessenger = Builder(name = "FacebookMessenger", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.4102f, 4.0f, 4.0f, 9.1367f, 4.0f, 15.5f)
                curveTo(4.0f, 18.8906f, 5.5703f, 21.9023f, 8.0f, 24.0f)
                lineTo(8.0f, 28.625f)
                lineTo(12.4375f, 26.4063f)
                curveTo(13.5664f, 26.7461f, 14.7461f, 27.0f, 16.0f, 27.0f)
                curveTo(22.5898f, 27.0f, 28.0f, 21.8633f, 28.0f, 15.5f)
                curveTo(28.0f, 9.1367f, 22.5898f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5586f, 6.0f, 26.0f, 10.2656f, 26.0f, 15.5f)
                curveTo(26.0f, 20.7344f, 21.5586f, 25.0f, 16.0f, 25.0f)
                curveTo(14.8047f, 25.0f, 13.6641f, 24.7734f, 12.5938f, 24.4063f)
                lineTo(12.1875f, 24.2813f)
                lineTo(10.0f, 25.375f)
                lineTo(10.0f, 23.125f)
                lineTo(9.625f, 22.8125f)
                curveTo(7.4063f, 21.0625f, 6.0f, 18.4414f, 6.0f, 15.5f)
                curveTo(6.0f, 10.2656f, 10.4414f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(14.875f, 12.3438f)
                lineTo(8.8438f, 18.7188f)
                lineTo(14.25f, 15.7188f)
                lineTo(17.125f, 18.8125f)
                lineTo(23.0938f, 12.3438f)
                lineTo(17.8125f, 15.3125f)
                close()
            }
        }
        .build()
        return _facebookMessenger!!
    }

private var _facebookMessenger: ImageVector? = null
