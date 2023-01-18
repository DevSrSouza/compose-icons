package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.TextFont: ImageVector
    get() {
        if (_textFont != null) {
            return _textFont!!
        }
        _textFont = Builder(name = "TextFont", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9998f, 2.0f)
                curveTo(7.3137f, 2.0f, 7.5943f, 2.1955f, 7.7032f, 2.4899f)
                lineTo(10.655f, 10.4745f)
                curveTo(10.6592f, 10.4853f, 10.6633f, 10.4962f, 10.667f, 10.5072f)
                lineTo(10.8895f, 11.109f)
                lineTo(10.0615f, 13.195f)
                lineTo(9.4352f, 11.5008f)
                horizontalLineTo(4.5635f)
                lineTo(3.4507f, 14.5101f)
                curveTo(3.3071f, 14.8986f, 2.8757f, 15.0971f, 2.4872f, 14.9534f)
                curveTo(2.0986f, 14.8098f, 1.9002f, 14.3784f, 2.0438f, 13.9899f)
                lineTo(3.3317f, 10.5071f)
                curveTo(3.3355f, 10.4961f, 3.3395f, 10.4852f, 3.3438f, 10.4744f)
                lineTo(6.2963f, 2.4899f)
                curveTo(6.4051f, 2.1955f, 6.6858f, 2.0f, 6.9998f, 2.0f)
                close()
                moveTo(5.1182f, 10.0008f)
                horizontalLineTo(8.8806f)
                lineTo(6.9996f, 4.9127f)
                lineTo(5.1182f, 10.0008f)
                close()
                moveTo(13.8056f, 6.4733f)
                curveTo(13.919f, 6.1875f, 14.1955f, 5.9999f, 14.503f, 6.0f)
                curveTo(14.8105f, 6.0001f, 15.0868f, 6.188f, 15.2f, 6.4739f)
                lineTo(20.7549f, 20.5042f)
                lineTo(21.2489f, 20.5042f)
                curveTo(21.6631f, 20.5042f, 21.9989f, 20.84f, 21.9989f, 21.2542f)
                curveTo(21.9989f, 21.6684f, 21.6631f, 22.0042f, 21.2488f, 22.0042f)
                lineTo(20.2587f, 22.0042f)
                curveTo(20.2551f, 22.0042f, 20.2514f, 22.0043f, 20.2478f, 22.0043f)
                curveTo(20.2425f, 22.0043f, 20.2372f, 22.0043f, 20.232f, 22.0042f)
                lineTo(18.7497f, 22.0041f)
                curveTo(18.3355f, 22.0041f, 17.9997f, 21.6683f, 17.9997f, 21.2541f)
                curveTo(17.9997f, 20.8399f, 18.3355f, 20.5041f, 18.7497f, 20.5041f)
                lineTo(19.1416f, 20.5041f)
                lineTo(17.9522f, 17.5f)
                horizontalLineTo(11.0423f)
                lineTo(9.8498f, 20.5042f)
                lineTo(10.2489f, 20.5042f)
                curveTo(10.6631f, 20.5042f, 10.9989f, 20.84f, 10.9989f, 21.2542f)
                curveTo(10.9989f, 21.6684f, 10.6631f, 22.0042f, 10.2488f, 22.0042f)
                lineTo(8.7589f, 22.0042f)
                curveTo(8.7556f, 22.0042f, 8.7524f, 22.0043f, 8.7491f, 22.0043f)
                curveTo(8.743f, 22.0043f, 8.737f, 22.0043f, 8.7309f, 22.0042f)
                lineTo(7.7497f, 22.0041f)
                curveTo(7.3355f, 22.0041f, 6.9997f, 21.6683f, 6.9997f, 21.2541f)
                curveTo(6.9997f, 20.8399f, 7.3355f, 20.5041f, 7.7497f, 20.5041f)
                lineTo(8.2359f, 20.5041f)
                lineTo(13.8056f, 6.4733f)
                close()
                moveTo(17.3583f, 16.0f)
                lineTo(14.5018f, 8.7851f)
                lineTo(11.6377f, 16.0f)
                horizontalLineTo(17.3583f)
                close()
            }
        }
        .build()
        return _textFont!!
    }

private var _textFont: ImageVector? = null
