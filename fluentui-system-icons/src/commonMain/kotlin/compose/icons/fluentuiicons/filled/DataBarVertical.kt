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

public val FilledGroup.DataBarVertical: ImageVector
    get() {
        if (_dataBarVertical != null) {
            return _dataBarVertical!!
        }
        _dataBarVertical = Builder(name = "DataBarVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7491f, 3.0f)
                curveTo(6.9912f, 3.0f, 7.9982f, 4.0069f, 7.9982f, 5.2491f)
                verticalLineTo(18.7509f)
                curveTo(7.9982f, 19.9931f, 6.9912f, 21.0f, 5.7491f, 21.0f)
                curveTo(4.5069f, 21.0f, 3.5f, 19.9931f, 3.5f, 18.7509f)
                verticalLineTo(5.2491f)
                curveTo(3.5f, 4.0069f, 4.5069f, 3.0f, 5.7491f, 3.0f)
                close()
                moveTo(12.2491f, 7.0f)
                curveTo(13.4912f, 7.0f, 14.4982f, 8.007f, 14.4982f, 9.2491f)
                verticalLineTo(18.7509f)
                curveTo(14.4982f, 19.9931f, 13.4912f, 21.0f, 12.2491f, 21.0f)
                curveTo(11.0069f, 21.0f, 10.0f, 19.9931f, 10.0f, 18.7509f)
                verticalLineTo(9.2491f)
                curveTo(10.0f, 8.007f, 11.0069f, 7.0f, 12.2491f, 7.0f)
                close()
                moveTo(18.7491f, 11.0f)
                curveTo(19.9912f, 11.0f, 20.9982f, 12.0069f, 20.9982f, 13.2491f)
                verticalLineTo(18.7509f)
                curveTo(20.9982f, 19.9931f, 19.9912f, 21.0f, 18.7491f, 21.0f)
                curveTo(17.5069f, 21.0f, 16.5f, 19.9931f, 16.5f, 18.7509f)
                verticalLineTo(13.2491f)
                curveTo(16.5f, 12.0069f, 17.5069f, 11.0f, 18.7491f, 11.0f)
                close()
            }
        }
        .build()
        return _dataBarVertical!!
    }

private var _dataBarVertical: ImageVector? = null
