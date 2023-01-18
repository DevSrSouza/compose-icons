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

public val RegularGroup.DataBarVertical: ImageVector
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
                moveTo(5.7491f, 4.5f)
                curveTo(5.3354f, 4.5f, 5.0f, 4.8354f, 5.0f, 5.2491f)
                verticalLineTo(18.7509f)
                curveTo(5.0f, 19.1646f, 5.3354f, 19.5f, 5.7491f, 19.5f)
                curveTo(6.1628f, 19.5f, 6.4982f, 19.1646f, 6.4982f, 18.7509f)
                verticalLineTo(5.2491f)
                curveTo(6.4982f, 4.8354f, 6.1628f, 4.5f, 5.7491f, 4.5f)
                close()
                moveTo(12.2491f, 8.5f)
                curveTo(11.8354f, 8.5f, 11.5f, 8.8354f, 11.5f, 9.2491f)
                verticalLineTo(18.7509f)
                curveTo(11.5f, 19.1646f, 11.8354f, 19.5f, 12.2491f, 19.5f)
                curveTo(12.6628f, 19.5f, 12.9982f, 19.1646f, 12.9982f, 18.7509f)
                verticalLineTo(9.2491f)
                curveTo(12.9982f, 8.8354f, 12.6628f, 8.5f, 12.2491f, 8.5f)
                close()
                moveTo(18.7491f, 12.5f)
                curveTo(18.3354f, 12.5f, 18.0f, 12.8354f, 18.0f, 13.2491f)
                verticalLineTo(18.7509f)
                curveTo(18.0f, 19.1646f, 18.3354f, 19.5f, 18.7491f, 19.5f)
                curveTo(19.1628f, 19.5f, 19.4982f, 19.1646f, 19.4982f, 18.7509f)
                verticalLineTo(13.2491f)
                curveTo(19.4982f, 12.8354f, 19.1628f, 12.5f, 18.7491f, 12.5f)
                close()
            }
        }
        .build()
        return _dataBarVertical!!
    }

private var _dataBarVertical: ImageVector? = null
