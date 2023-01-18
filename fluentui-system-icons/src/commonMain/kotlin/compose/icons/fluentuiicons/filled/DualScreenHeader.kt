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

public val FilledGroup.DualScreenHeader: ImageVector
    get() {
        if (_dualScreenHeader != null) {
            return _dualScreenHeader!!
        }
        _dualScreenHeader = Builder(name = "DualScreenHeader", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.995f, 7.997f)
                lineTo(21.9956f, 18.2495f)
                curveTo(21.9956f, 19.216f, 21.2121f, 19.9995f, 20.2456f, 19.9995f)
                horizontalLineTo(12.998f)
                curveTo(12.9112f, 19.9995f, 12.8259f, 19.9932f, 12.7425f, 19.981f)
                lineTo(12.742f, 7.997f)
                horizontalLineTo(21.995f)
                close()
                moveTo(11.243f, 7.997f)
                lineTo(11.2433f, 19.98f)
                curveTo(11.1631f, 19.9913f, 11.0812f, 19.9971f, 10.998f, 19.9971f)
                horizontalLineTo(3.7504f)
                curveTo(2.7839f, 19.9971f, 2.0004f, 19.2136f, 2.0004f, 18.2471f)
                lineTo(2.0f, 7.997f)
                horizontalLineTo(11.243f)
                close()
                moveTo(10.998f, 4.0019f)
                curveTo(11.0813f, 4.0019f, 11.1633f, 4.0078f, 11.2436f, 4.0191f)
                lineTo(11.243f, 6.997f)
                horizontalLineTo(2.0f)
                lineTo(2.0004f, 5.7519f)
                curveTo(2.0004f, 4.7854f, 2.7839f, 4.0019f, 3.7504f, 4.0019f)
                horizontalLineTo(10.998f)
                close()
                moveTo(20.2456f, 4.0044f)
                curveTo(21.2121f, 4.0044f, 21.9956f, 4.7879f, 21.9956f, 5.7544f)
                lineTo(21.995f, 6.997f)
                horizontalLineTo(12.742f)
                lineTo(12.7424f, 4.0229f)
                curveTo(12.8259f, 4.0107f, 12.9112f, 4.0044f, 12.998f, 4.0044f)
                horizontalLineTo(20.2456f)
                close()
            }
        }
        .build()
        return _dualScreenHeader!!
    }

private var _dualScreenHeader: ImageVector? = null
