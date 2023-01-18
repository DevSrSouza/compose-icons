package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CircleEdit: ImageVector
    get() {
        if (_circleEdit != null) {
            return _circleEdit!!
        }
        _circleEdit = Builder(name = "CircleEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7151f, 11.0f)
                curveTo(21.1423f, 11.0002f, 21.5703f, 11.0835f, 21.9723f, 11.2499f)
                curveTo(21.5887f, 6.0774f, 17.2705f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.1844f, 5.9453f, 21.4474f, 10.9973f, 21.9504f)
                curveTo(10.9949f, 21.7734f, 11.0153f, 21.5915f, 11.0613f, 21.4075f)
                lineTo(11.519f, 19.5768f)
                curveTo(11.681f, 18.9288f, 12.016f, 18.3371f, 12.4883f, 17.8648f)
                lineTo(18.3907f, 11.9624f)
                curveTo(19.0317f, 11.3214f, 19.8742f, 11.0004f, 20.713f, 11.0f)
                horizontalLineTo(20.7151f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7152f, 12.0f)
                horizontalLineTo(20.7131f)
                curveTo(20.1285f, 12.0003f, 19.5439f, 12.2234f, 19.0979f, 12.6695f)
                lineTo(13.1955f, 18.5719f)
                curveTo(12.8513f, 18.916f, 12.6072f, 19.3472f, 12.4892f, 19.8194f)
                lineTo(12.0315f, 21.6501f)
                curveTo(11.8325f, 22.4462f, 12.5536f, 23.1674f, 13.3497f, 22.9683f)
                lineTo(15.1804f, 22.5106f)
                curveTo(15.6526f, 22.3926f, 16.0838f, 22.1485f, 16.4279f, 21.8043f)
                lineTo(22.3303f, 15.9019f)
                curveTo(23.223f, 15.0093f, 23.223f, 13.5621f, 22.3303f, 12.6695f)
                curveTo(21.8843f, 12.2234f, 21.2998f, 12.0003f, 20.7152f, 12.0f)
                close()
            }
        }
        .build()
        return _circleEdit!!
    }

private var _circleEdit: ImageVector? = null
