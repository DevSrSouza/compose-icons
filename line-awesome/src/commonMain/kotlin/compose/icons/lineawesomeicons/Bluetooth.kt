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

public val LineAwesomeIcons.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(12.8867f, 2.0f, 10.0313f, 2.7422f, 8.0313f, 4.9688f)
                curveTo(6.0313f, 7.1953f, 5.0f, 10.7148f, 5.0f, 16.0f)
                curveTo(5.0f, 21.2852f, 6.0313f, 24.8047f, 8.0313f, 27.0313f)
                curveTo(10.0313f, 29.2578f, 12.8867f, 30.0f, 16.0f, 30.0f)
                curveTo(19.1133f, 30.0f, 21.9727f, 29.2578f, 23.9688f, 27.0313f)
                curveTo(25.9648f, 24.8047f, 27.0f, 21.2852f, 27.0f, 16.0f)
                curveTo(27.0f, 10.7148f, 25.9648f, 7.1953f, 23.9688f, 4.9688f)
                curveTo(21.9727f, 2.7422f, 19.1133f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(18.8086f, 4.0f, 20.9453f, 4.6172f, 22.4688f, 6.3125f)
                curveTo(23.9922f, 8.0078f, 25.0f, 10.9805f, 25.0f, 16.0f)
                curveTo(25.0f, 21.0195f, 23.9922f, 23.9922f, 22.4688f, 25.6875f)
                curveTo(20.9453f, 27.3828f, 18.8086f, 28.0f, 16.0f, 28.0f)
                curveTo(13.1914f, 28.0f, 11.0547f, 27.3828f, 9.5313f, 25.6875f)
                curveTo(8.0078f, 23.9922f, 7.0f, 21.0195f, 7.0f, 16.0f)
                curveTo(7.0f, 10.9805f, 8.0078f, 8.0078f, 9.5313f, 6.3125f)
                curveTo(11.0547f, 4.6172f, 13.1914f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 13.5625f)
                lineTo(12.7188f, 11.2813f)
                lineTo(11.2813f, 12.7188f)
                lineTo(14.5625f, 16.0f)
                lineTo(11.2813f, 19.2813f)
                lineTo(12.7188f, 20.7188f)
                lineTo(15.0f, 18.4375f)
                lineTo(15.0f, 25.0f)
                lineTo(16.5938f, 23.8125f)
                lineTo(20.5938f, 20.8125f)
                lineTo(21.5313f, 20.0938f)
                lineTo(17.4375f, 16.0f)
                lineTo(21.5313f, 11.9063f)
                lineTo(20.5938f, 11.1875f)
                lineTo(16.5938f, 8.1875f)
                close()
                moveTo(17.0f, 11.0f)
                lineTo(18.4688f, 12.0938f)
                lineTo(17.0f, 13.5625f)
                close()
                moveTo(17.0f, 18.4375f)
                lineTo(18.4688f, 19.9063f)
                lineTo(17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
