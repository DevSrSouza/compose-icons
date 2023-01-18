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

public val FilledGroup.StarEdit: ImageVector
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
                lineTo(10.2247f, 19.7952f)
                lineTo(10.529f, 18.5766f)
                curveTo(10.6908f, 17.9288f, 11.0255f, 17.337f, 11.4973f, 16.8647f)
                lineTo(17.3933f, 10.9622f)
                curveTo(18.5912f, 9.7631f, 20.4846f, 9.6842f, 21.774f, 10.7253f)
                curveTo(22.3041f, 9.9327f, 21.8473f, 8.7924f, 20.8395f, 8.646f)
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
