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

public val FilledGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.3496f)
                curveTo(12.0002f, 2.3496f, 11.9998f, 2.3496f, 12.0f, 2.3496f)
                curveTo(11.5182f, 2.3493f, 11.0356f, 2.6002f, 10.7878f, 3.1021f)
                lineTo(8.4299f, 7.8799f)
                lineTo(3.1574f, 8.646f)
                curveTo(2.0501f, 8.8069f, 1.6079f, 10.1677f, 2.4092f, 10.9487f)
                lineTo(6.2244f, 14.6676f)
                lineTo(5.3237f, 19.9189f)
                curveTo(5.174f, 20.7918f, 5.868f, 21.5007f, 6.655f, 21.5001f)
                curveTo(6.8629f, 21.5002f, 7.0774f, 21.4509f, 7.2845f, 21.342f)
                lineTo(11.9994f, 18.8632f)
                lineTo(12.0f, 2.3496f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
