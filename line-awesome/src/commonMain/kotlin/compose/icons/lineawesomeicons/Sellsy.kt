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

public val LineAwesomeIcons.Sellsy: ImageVector
    get() {
        if (_sellsy != null) {
            return _sellsy!!
        }
        _sellsy = Builder(name = "Sellsy", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                curveTo(14.3359f, 4.0f, 11.2734f, 6.25f, 9.875f, 9.4063f)
                curveTo(9.293f, 9.1641f, 8.6719f, 9.0f, 8.0f, 9.0f)
                curveTo(5.25f, 9.0f, 3.0f, 11.25f, 3.0f, 14.0f)
                curveTo(3.0f, 14.1445f, 3.0195f, 14.2695f, 3.0313f, 14.4063f)
                curveTo(1.2578f, 15.6758f, 0.0f, 17.6602f, 0.0f, 20.0f)
                curveTo(0.0f, 23.8555f, 3.1445f, 27.0f, 7.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                curveTo(28.8555f, 27.0f, 32.0f, 23.8555f, 32.0f, 20.0f)
                curveTo(32.0f, 16.8477f, 29.8477f, 14.2734f, 26.9688f, 13.4063f)
                curveTo(26.9766f, 13.2695f, 27.0f, 13.1406f, 27.0f, 13.0f)
                curveTo(27.0f, 8.043f, 22.957f, 4.0f, 18.0f, 4.0f)
                close()
                moveTo(18.0f, 6.0f)
                curveTo(21.8789f, 6.0f, 25.0f, 9.1211f, 25.0f, 13.0f)
                curveTo(25.0f, 13.3047f, 24.9805f, 13.6133f, 24.9375f, 13.9375f)
                lineTo(24.7813f, 14.9063f)
                lineTo(25.7813f, 15.0625f)
                curveTo(28.1797f, 15.4336f, 30.0f, 17.4883f, 30.0f, 20.0f)
                curveTo(30.0f, 22.7734f, 27.7734f, 25.0f, 25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                curveTo(4.2266f, 25.0f, 2.0f, 22.7734f, 2.0f, 20.0f)
                curveTo(2.0f, 18.1172f, 3.0313f, 16.4805f, 4.5625f, 15.625f)
                lineTo(5.1875f, 15.2813f)
                lineTo(5.0625f, 14.5625f)
                curveTo(5.0234f, 14.3672f, 5.0f, 14.1875f, 5.0f, 14.0f)
                curveTo(5.0f, 12.332f, 6.332f, 11.0f, 8.0f, 11.0f)
                curveTo(8.6523f, 11.0f, 9.25f, 11.2031f, 9.75f, 11.5625f)
                lineTo(10.875f, 12.4063f)
                lineTo(11.2813f, 11.0313f)
                curveTo(12.1289f, 8.125f, 14.8086f, 6.0f, 18.0f, 6.0f)
                close()
                moveTo(20.0f, 13.0f)
                lineTo(20.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 13.0f)
                close()
                moveTo(16.0f, 15.0f)
                lineTo(16.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                lineTo(18.0f, 15.0f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(14.0f, 22.0f)
                lineTo(14.0f, 16.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineTo(8.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sellsy!!
    }

private var _sellsy: ImageVector? = null
