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

public val LineAwesomeIcons.HikingSolid: ImageVector
    get() {
        if (_hikingSolid != null) {
            return _hikingSolid!!
        }
        _hikingSolid = Builder(name = "HikingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.0f)
                curveTo(14.5781f, 4.0f, 13.0f, 5.5781f, 13.0f, 7.5f)
                curveTo(13.0f, 9.4219f, 14.5781f, 11.0f, 16.5f, 11.0f)
                curveTo(18.4219f, 11.0f, 20.0f, 9.4219f, 20.0f, 7.5f)
                curveTo(20.0f, 5.5781f, 18.4219f, 4.0f, 16.5f, 4.0f)
                close()
                moveTo(16.5f, 6.0f)
                curveTo(17.3398f, 6.0f, 18.0f, 6.6602f, 18.0f, 7.5f)
                curveTo(18.0f, 8.3398f, 17.3398f, 9.0f, 16.5f, 9.0f)
                curveTo(15.6602f, 9.0f, 15.0f, 8.3398f, 15.0f, 7.5f)
                curveTo(15.0f, 6.6602f, 15.6602f, 6.0f, 16.5f, 6.0f)
                close()
                moveTo(11.0938f, 10.5f)
                curveTo(10.8359f, 10.4883f, 10.5703f, 10.4883f, 10.3125f, 10.5313f)
                curveTo(9.793f, 10.6172f, 9.2813f, 10.8477f, 8.8438f, 11.2188f)
                curveTo(7.9688f, 11.9609f, 7.4609f, 13.1406f, 7.0938f, 14.875f)
                curveTo(6.9766f, 15.4336f, 7.0117f, 16.0117f, 7.2813f, 16.4688f)
                curveTo(7.5508f, 16.9258f, 7.9727f, 17.2031f, 8.3438f, 17.375f)
                curveTo(9.0898f, 17.7188f, 9.8203f, 17.7852f, 10.2188f, 17.875f)
                lineTo(10.6875f, 15.9375f)
                curveTo(10.0859f, 15.8008f, 9.4688f, 15.6914f, 9.1875f, 15.5625f)
                curveTo(9.0469f, 15.4961f, 9.0273f, 15.457f, 9.0313f, 15.4688f)
                curveTo(9.0234f, 15.4453f, 9.0117f, 15.3828f, 9.0313f, 15.2813f)
                curveTo(9.3516f, 13.7656f, 9.8164f, 13.0352f, 10.1563f, 12.75f)
                curveTo(10.4961f, 12.4648f, 10.7773f, 12.418f, 11.4063f, 12.5625f)
                lineTo(11.8438f, 10.5938f)
                curveTo(11.5977f, 10.5391f, 11.3516f, 10.5117f, 11.0938f, 10.5f)
                close()
                moveTo(12.8438f, 10.8125f)
                lineTo(11.375f, 17.5f)
                curveTo(11.2109f, 18.25f, 11.5195f, 19.0625f, 12.125f, 19.5313f)
                lineTo(15.6563f, 22.2813f)
                lineTo(16.5313f, 28.0f)
                lineTo(18.5625f, 28.0f)
                lineTo(17.625f, 21.9688f)
                curveTo(17.5469f, 21.4609f, 17.2813f, 21.0039f, 16.875f, 20.6875f)
                lineTo(13.3438f, 17.9375f)
                lineTo(14.375f, 13.2813f)
                lineTo(15.4063f, 13.5625f)
                lineTo(17.1875f, 15.2813f)
                curveTo(17.7656f, 15.8398f, 18.6367f, 15.9727f, 19.375f, 15.6563f)
                lineTo(21.0f, 14.9688f)
                lineTo(21.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 12.8125f)
                lineTo(18.5938f, 13.8438f)
                lineTo(16.8125f, 12.125f)
                curveTo(16.5664f, 11.8867f, 16.2656f, 11.7109f, 15.9375f, 11.625f)
                close()
                moveTo(11.5313f, 20.625f)
                lineTo(10.6875f, 23.1563f)
                lineTo(8.1875f, 28.0f)
                lineTo(10.4375f, 28.0f)
                lineTo(12.4688f, 24.0938f)
                curveTo(12.5195f, 23.9961f, 12.5625f, 23.8828f, 12.5938f, 23.7813f)
                lineTo(13.2188f, 21.9375f)
                close()
            }
        }
        .build()
        return _hikingSolid!!
    }

private var _hikingSolid: ImageVector? = null
