package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TextQuote: ImageVector
    get() {
        if (_textQuote != null) {
            return _textQuote!!
        }
        _textQuote = Builder(name = "TextQuote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 6.0f)
                curveTo(8.8255f, 6.0f, 9.91f, 7.0315f, 9.9947f, 8.3356f)
                lineTo(9.9997f, 8.5423f)
                curveTo(9.9901f, 12.0967f, 8.7595f, 15.1555f, 6.2953f, 17.7649f)
                curveTo(6.0109f, 18.0661f, 5.5362f, 18.0797f, 5.2351f, 17.7953f)
                curveTo(4.9339f, 17.5109f, 4.9203f, 17.0362f, 5.2047f, 16.7351f)
                curveTo(6.8453f, 14.9977f, 7.865f, 13.0611f, 8.2823f, 10.876f)
                curveTo(8.0355f, 10.9563f, 7.7729f, 11.0f, 7.5f, 11.0f)
                curveTo(6.1193f, 11.0f, 5.0f, 9.8807f, 5.0f, 8.5f)
                curveTo(5.0f, 7.1193f, 6.1193f, 6.0f, 7.5f, 6.0f)
                close()
                moveTo(16.5f, 6.0f)
                curveTo(17.8255f, 6.0f, 18.91f, 7.0315f, 18.9947f, 8.3356f)
                lineTo(18.9997f, 8.5423f)
                curveTo(18.9901f, 12.1029f, 17.7625f, 15.156f, 15.2949f, 17.7653f)
                curveTo(15.0103f, 18.0663f, 14.5356f, 18.0795f, 14.2347f, 17.7949f)
                curveTo(13.9337f, 17.5103f, 13.9205f, 17.0356f, 14.2051f, 16.7347f)
                curveTo(15.8483f, 14.9971f, 16.8669f, 13.0631f, 17.2832f, 10.8762f)
                curveTo(17.0355f, 10.9563f, 16.7729f, 11.0f, 16.5f, 11.0f)
                curveTo(15.1193f, 11.0f, 14.0f, 9.8807f, 14.0f, 8.5f)
                curveTo(14.0f, 7.1193f, 15.1193f, 6.0f, 16.5f, 6.0f)
                close()
            }
        }
        .build()
        return _textQuote!!
    }

private var _textQuote: ImageVector? = null
