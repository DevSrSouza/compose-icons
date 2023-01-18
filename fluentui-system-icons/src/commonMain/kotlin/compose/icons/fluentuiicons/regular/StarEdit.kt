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

public val RegularGroup.StarEdit: ImageVector
    get() {
        if (_starEdit != null) {
            return _starEdit!!
        }
        _starEdit = Builder(name = "StarEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.209f, 3.1021f)
                curveTo(12.7138f, 2.0988f, 11.283f, 2.0988f, 10.7878f, 3.1021f)
                lineTo(8.4299f, 7.8799f)
                lineTo(3.1574f, 8.646f)
                curveTo(2.0501f, 8.8069f, 1.6079f, 10.1677f, 2.4092f, 10.9487f)
                lineTo(6.2244f, 14.6676f)
                lineTo(5.3237f, 19.9189f)
                curveTo(5.1346f, 21.0217f, 6.2921f, 21.8627f, 7.2825f, 21.342f)
                lineTo(10.227f, 19.794f)
                lineTo(10.531f, 18.5766f)
                curveTo(10.6001f, 18.3f, 10.7007f, 18.0336f, 10.83f, 17.7823f)
                lineTo(6.8535f, 19.8729f)
                lineTo(7.7161f, 14.8435f)
                curveTo(7.7913f, 14.4055f, 7.6461f, 13.9587f, 7.3279f, 13.6486f)
                lineTo(3.6738f, 10.0867f)
                lineTo(8.7236f, 9.3529f)
                curveTo(9.1633f, 9.289f, 9.5434f, 9.0129f, 9.7401f, 8.6144f)
                lineTo(11.9984f, 4.0385f)
                lineTo(14.2568f, 8.6144f)
                curveTo(14.4534f, 9.0129f, 14.8335f, 9.289f, 15.2732f, 9.3529f)
                lineTo(19.7229f, 9.9995f)
                curveTo(20.4502f, 10.0008f, 21.1772f, 10.2424f, 21.7747f, 10.7243f)
                curveTo(22.3037f, 9.9318f, 21.8468f, 8.7924f, 20.8395f, 8.646f)
                lineTo(15.567f, 7.8799f)
                lineTo(13.209f, 3.1021f)
                close()
                moveTo(18.1f, 11.669f)
                lineTo(12.2039f, 17.5714f)
                curveTo(11.8602f, 17.9155f, 11.6163f, 18.3467f, 11.4984f, 18.8189f)
                lineTo(11.0412f, 20.6496f)
                curveTo(10.8424f, 21.4457f, 11.5628f, 22.1669f, 12.358f, 21.9678f)
                lineTo(14.1868f, 21.5102f)
                curveTo(14.6584f, 21.3921f, 15.0891f, 21.148f, 15.4329f, 20.8038f)
                lineTo(21.3289f, 14.9014f)
                curveTo(22.2206f, 14.0088f, 22.2206f, 12.5616f, 21.3289f, 11.669f)
                curveTo(20.4373f, 10.7764f, 18.9916f, 10.7764f, 18.1f, 11.669f)
                close()
            }
        }
        .build()
        return _starEdit!!
    }

private var _starEdit: ImageVector? = null
