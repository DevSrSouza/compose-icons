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

public val FilledGroup.DataBarHorizontal: ImageVector
    get() {
        if (_dataBarHorizontal != null) {
            return _dataBarHorizontal!!
        }
        _dataBarHorizontal = Builder(name = "DataBarHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.251f)
                curveTo(21.0f, 17.0089f, 19.9931f, 16.002f, 18.7509f, 16.002f)
                horizontalLineTo(5.2491f)
                curveTo(4.0069f, 16.002f, 3.0f, 17.0089f, 3.0f, 18.251f)
                curveTo(3.0f, 19.4932f, 4.0069f, 20.5001f, 5.2491f, 20.5001f)
                horizontalLineTo(18.7509f)
                curveTo(19.9931f, 20.5001f, 21.0f, 19.4932f, 21.0f, 18.251f)
                close()
                moveTo(17.0f, 11.751f)
                curveTo(17.0f, 10.5089f, 15.9931f, 9.502f, 14.7509f, 9.502f)
                lineTo(5.2491f, 9.502f)
                curveTo(4.0069f, 9.502f, 3.0f, 10.5089f, 3.0f, 11.751f)
                curveTo(3.0f, 12.9932f, 4.0069f, 14.0001f, 5.2491f, 14.0001f)
                horizontalLineTo(14.7509f)
                curveTo(15.9931f, 14.0001f, 17.0f, 12.9932f, 17.0f, 11.751f)
                close()
                moveTo(13.0f, 5.251f)
                curveTo(13.0f, 4.0089f, 11.9931f, 3.002f, 10.7509f, 3.002f)
                lineTo(5.2491f, 3.002f)
                curveTo(4.0069f, 3.002f, 3.0f, 4.0089f, 3.0f, 5.251f)
                curveTo(3.0f, 6.4932f, 4.0069f, 7.5001f, 5.2491f, 7.5001f)
                lineTo(10.7509f, 7.5001f)
                curveTo(11.9931f, 7.5001f, 13.0f, 6.4932f, 13.0f, 5.251f)
                close()
            }
        }
        .build()
        return _dataBarHorizontal!!
    }

private var _dataBarHorizontal: ImageVector? = null
