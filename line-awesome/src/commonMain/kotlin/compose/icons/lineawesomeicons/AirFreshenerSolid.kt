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

public val LineAwesomeIcons.AirFreshenerSolid: ImageVector
    get() {
        if (_airFreshenerSolid != null) {
            return _airFreshenerSolid!!
        }
        _airFreshenerSolid = Builder(name = "AirFreshenerSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.346f, 2.0f, 13.0f, 3.346f, 13.0f, 5.0f)
                curveTo(13.0f, 5.8539f, 13.3628f, 6.6211f, 13.9375f, 7.168f)
                lineTo(9.0566f, 14.0f)
                lineTo(11.1328f, 14.0f)
                lineTo(7.1328f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 20.0f)
                lineTo(24.8672f, 20.0f)
                lineTo(20.8672f, 14.0f)
                lineTo(22.9434f, 14.0f)
                lineTo(18.0645f, 7.168f)
                curveTo(18.6385f, 6.6211f, 19.0f, 5.8534f, 19.0f, 5.0f)
                curveTo(19.0f, 3.346f, 17.654f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.552f, 4.0f, 17.0f, 4.449f, 17.0f, 5.0f)
                curveTo(17.0f, 5.4037f, 16.7559f, 5.7485f, 16.4102f, 5.9063f)
                lineTo(16.334f, 5.9336f)
                curveTo(16.2284f, 5.9716f, 16.1185f, 6.0f, 16.0f, 6.0f)
                curveTo(15.8815f, 6.0f, 15.7716f, 5.9716f, 15.666f, 5.9336f)
                lineTo(15.5898f, 5.9063f)
                curveTo(15.2441f, 5.7485f, 15.0f, 5.4037f, 15.0f, 5.0f)
                curveTo(15.0f, 4.449f, 15.448f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.8066f, 7.9922f)
                curveTo(15.8449f, 7.9949f, 15.8834f, 7.9911f, 15.9219f, 7.9922f)
                curveTo(15.9485f, 7.9929f, 15.9732f, 8.0f, 16.0f, 8.0f)
                curveTo(16.0268f, 8.0f, 16.0515f, 7.9929f, 16.0781f, 7.9922f)
                curveTo(16.1173f, 7.9911f, 16.1564f, 7.9949f, 16.1953f, 7.9922f)
                lineTo(19.0566f, 12.0f)
                lineTo(17.1328f, 12.0f)
                lineTo(21.1328f, 18.0f)
                lineTo(10.8672f, 18.0f)
                lineTo(14.8672f, 12.0f)
                lineTo(12.9434f, 12.0f)
                lineTo(15.8066f, 7.9922f)
                close()
                moveTo(11.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _airFreshenerSolid!!
    }

private var _airFreshenerSolid: ImageVector? = null
