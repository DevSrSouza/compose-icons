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

public val FilledGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2163f, 9.72f)
                curveTo(16.656f, 9.3537f, 16.6992f, 8.6939f, 16.311f, 8.2735f)
                lineTo(11.7403f, 3.3218f)
                curveTo(11.1228f, 2.6529f, 10.0054f, 3.0898f, 10.0054f, 4.0001f)
                verticalLineTo(9.0977f)
                lineTo(9.3656f, 8.564f)
                curveTo(8.9415f, 8.2103f, 8.3109f, 8.2674f, 7.9572f, 8.6915f)
                curveTo(7.6034f, 9.1156f, 7.6605f, 9.7462f, 8.0846f, 10.1f)
                lineTo(10.0054f, 11.702f)
                verticalLineTo(12.2916f)
                lineTo(8.085f, 13.8917f)
                curveTo(7.6607f, 14.2452f, 7.6033f, 14.8758f, 7.9568f, 15.3001f)
                curveTo(8.3104f, 15.7244f, 8.9409f, 15.7818f, 9.3652f, 15.4282f)
                lineTo(10.0054f, 14.8948f)
                verticalLineTo(20.0001f)
                curveTo(10.0054f, 20.9105f, 11.123f, 21.3473f, 11.7404f, 20.6782f)
                lineTo(16.3112f, 15.7242f)
                curveTo(16.699f, 15.3039f, 16.656f, 14.6445f, 16.2167f, 14.2782f)
                lineTo(13.4826f, 11.9978f)
                lineTo(16.2163f, 9.72f)
                close()
                moveTo(12.0054f, 13.3701f)
                lineTo(14.1284f, 15.1407f)
                lineTo(12.0054f, 17.4416f)
                verticalLineTo(13.3701f)
                close()
                moveTo(12.0054f, 10.6252f)
                verticalLineTo(6.5577f)
                lineTo(14.1278f, 8.8569f)
                lineTo(12.0054f, 10.6252f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
