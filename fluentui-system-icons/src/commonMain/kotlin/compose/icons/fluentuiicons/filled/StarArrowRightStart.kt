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

public val FilledGroup.StarArrowRightStart: ImageVector
    get() {
        if (_starArrowRightStart != null) {
            return _starArrowRightStart!!
        }
        _starArrowRightStart = Builder(name = "StarArrowRightStart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7898f, 3.1021f)
                curveTo(11.285f, 2.0988f, 12.7158f, 2.0988f, 13.211f, 3.1021f)
                lineTo(15.5689f, 7.8799f)
                lineTo(20.8414f, 8.646f)
                curveTo(21.9487f, 8.8069f, 22.3909f, 10.1677f, 21.5896f, 10.9487f)
                lineTo(17.7744f, 14.6676f)
                lineTo(18.675f, 19.9189f)
                curveTo(18.8642f, 21.0217f, 17.7067f, 21.8627f, 16.7163f, 21.342f)
                lineTo(12.7584f, 19.2612f)
                curveTo(12.9158f, 18.701f, 13.0f, 18.1101f, 13.0f, 17.4995f)
                curveTo(13.0f, 13.9097f, 10.0899f, 10.9995f, 6.5f, 10.9995f)
                curveTo(5.3434f, 10.9995f, 4.2573f, 11.3016f, 3.3165f, 11.8312f)
                lineTo(2.4111f, 10.9487f)
                curveTo(1.6099f, 10.1677f, 2.052f, 8.8069f, 3.1593f, 8.646f)
                lineTo(8.4318f, 7.8799f)
                lineTo(10.7898f, 3.1021f)
                close()
                moveTo(12.0f, 17.4995f)
                curveTo(12.0f, 20.5371f, 9.5376f, 22.9995f, 6.5f, 22.9995f)
                curveTo(3.4624f, 22.9995f, 1.0f, 20.5371f, 1.0f, 17.4995f)
                curveTo(1.0f, 14.4619f, 3.4624f, 11.9995f, 6.5f, 11.9995f)
                curveTo(9.5376f, 11.9995f, 12.0f, 14.4619f, 12.0f, 17.4995f)
                close()
                moveTo(3.5f, 16.9995f)
                curveTo(3.2239f, 16.9995f, 3.0f, 17.2234f, 3.0f, 17.4995f)
                curveTo(3.0f, 17.7757f, 3.2239f, 17.9995f, 3.5f, 17.9995f)
                lineTo(8.2929f, 17.9995f)
                lineTo(6.6465f, 19.646f)
                curveTo(6.4512f, 19.8412f, 6.4512f, 20.1578f, 6.6465f, 20.3531f)
                curveTo(6.8417f, 20.5483f, 7.1583f, 20.5483f, 7.3535f, 20.3531f)
                lineTo(9.8535f, 17.8531f)
                curveTo(10.0488f, 17.6578f, 10.0488f, 17.3412f, 9.8535f, 17.146f)
                lineTo(7.3535f, 14.646f)
                curveTo(7.1583f, 14.4507f, 6.8417f, 14.4507f, 6.6465f, 14.646f)
                curveTo(6.4512f, 14.8412f, 6.4512f, 15.1578f, 6.6465f, 15.3531f)
                lineTo(8.2929f, 16.9995f)
                lineTo(3.5f, 16.9995f)
                close()
            }
        }
        .build()
        return _starArrowRightStart!!
    }

private var _starArrowRightStart: ImageVector? = null
