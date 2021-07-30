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

public val LineAwesomeIcons.VenusDoubleSolid: ImageVector
    get() {
        if (_venusDoubleSolid != null) {
            return _venusDoubleSolid!!
        }
        _venusDoubleSolid = Builder(name = "VenusDoubleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(6.5898f, 3.0f, 3.0f, 6.5898f, 3.0f, 11.0f)
                curveTo(3.0f, 15.0703f, 6.0586f, 18.4414f, 10.0f, 18.9375f)
                lineTo(10.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 25.0f)
                lineTo(10.0f, 25.0f)
                lineTo(10.0f, 29.0f)
                lineTo(12.0f, 29.0f)
                lineTo(12.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 29.0f)
                lineTo(22.0f, 29.0f)
                lineTo(22.0f, 25.0f)
                lineTo(26.0f, 25.0f)
                lineTo(26.0f, 23.0f)
                lineTo(22.0f, 23.0f)
                lineTo(22.0f, 18.9375f)
                curveTo(25.9414f, 18.4414f, 29.0f, 15.0703f, 29.0f, 11.0f)
                curveTo(29.0f, 6.5898f, 25.4102f, 3.0f, 21.0f, 3.0f)
                curveTo(19.4805f, 3.0f, 18.0547f, 3.4492f, 16.8438f, 4.1875f)
                curveTo(17.3633f, 4.6328f, 17.8438f, 5.1367f, 18.25f, 5.6875f)
                curveTo(19.0781f, 5.2578f, 20.0039f, 5.0f, 21.0f, 5.0f)
                curveTo(24.3086f, 5.0f, 27.0f, 7.6914f, 27.0f, 11.0f)
                curveTo(27.0f, 14.3086f, 24.3086f, 17.0f, 21.0f, 17.0f)
                curveTo(17.6914f, 17.0f, 15.0f, 14.3086f, 15.0f, 11.0f)
                curveTo(15.0f, 10.2031f, 15.1563f, 9.4453f, 15.4375f, 8.75f)
                curveTo(15.1016f, 8.0859f, 14.6172f, 7.5156f, 14.0313f, 7.0625f)
                curveTo(13.3711f, 8.2266f, 13.0f, 9.5664f, 13.0f, 11.0f)
                curveTo(13.0f, 15.0703f, 16.0586f, 18.4414f, 20.0f, 18.9375f)
                lineTo(20.0f, 23.0f)
                lineTo(12.0f, 23.0f)
                lineTo(12.0f, 18.9063f)
                curveTo(13.1445f, 18.7617f, 14.2148f, 18.3867f, 15.1563f, 17.8125f)
                curveTo(14.6367f, 17.3672f, 14.1563f, 16.8633f, 13.75f, 16.3125f)
                curveTo(12.9219f, 16.7422f, 11.9961f, 17.0f, 11.0f, 17.0f)
                curveTo(7.6914f, 17.0f, 5.0f, 14.3086f, 5.0f, 11.0f)
                curveTo(5.0f, 7.6914f, 7.6914f, 5.0f, 11.0f, 5.0f)
                curveTo(14.3086f, 5.0f, 17.0f, 7.6914f, 17.0f, 11.0f)
                curveTo(17.0f, 11.7969f, 16.8438f, 12.5547f, 16.5625f, 13.25f)
                curveTo(16.8984f, 13.9141f, 17.3828f, 14.4844f, 17.9688f, 14.9375f)
                curveTo(18.6289f, 13.7734f, 19.0f, 12.4336f, 19.0f, 11.0f)
                curveTo(19.0f, 6.5898f, 15.4102f, 3.0f, 11.0f, 3.0f)
                close()
            }
        }
        .build()
        return _venusDoubleSolid!!
    }

private var _venusDoubleSolid: ImageVector? = null
