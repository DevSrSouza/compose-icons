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

public val FilledGroup.DocumentError: ImageVector
    get() {
        if (_documentError != null) {
            return _documentError!!
        }
        _documentError = Builder(name = "DocumentError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(11.1904f)
                curveTo(12.3112f, 20.8321f, 13.0f, 19.2465f, 13.0f, 17.5f)
                curveTo(13.0f, 13.9101f, 10.0899f, 11.0f, 6.5f, 11.0f)
                curveTo(5.6141f, 11.0f, 4.7696f, 11.1772f, 4.0f, 11.4982f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.8954f, 4.8954f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                close()
                moveTo(6.5f, 14.0f)
                curveTo(6.2239f, 14.0f, 6.0f, 14.2239f, 6.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(6.0f, 18.7761f, 6.2239f, 19.0f, 6.5f, 19.0f)
                curveTo(6.7761f, 19.0f, 7.0f, 18.7761f, 7.0f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(7.0f, 14.2239f, 6.7761f, 14.0f, 6.5f, 14.0f)
                close()
                moveTo(6.5f, 21.125f)
                curveTo(6.8452f, 21.125f, 7.125f, 20.8452f, 7.125f, 20.5f)
                curveTo(7.125f, 20.1548f, 6.8452f, 19.875f, 6.5f, 19.875f)
                curveTo(6.1548f, 19.875f, 5.875f, 20.1548f, 5.875f, 20.5f)
                curveTo(5.875f, 20.8452f, 6.1548f, 21.125f, 6.5f, 21.125f)
                close()
            }
        }
        .build()
        return _documentError!!
    }

private var _documentError: ImageVector? = null
