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

public val FilledGroup.DocumentTableCheckmark: ImageVector
    get() {
        if (_documentTableCheckmark != null) {
            return _documentTableCheckmark!!
        }
        _documentTableCheckmark = Builder(name = "DocumentTableCheckmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 17.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.8261f)
                curveTo(12.9398f, 16.4815f, 13.0f, 16.9837f, 13.0f, 17.5f)
                horizontalLineTo(15.25f)
                curveTo(15.3881f, 17.5f, 15.5f, 17.3881f, 15.5f, 17.25f)
                close()
                moveTo(15.5f, 14.5f)
                horizontalLineTo(12.2678f)
                curveTo(12.0528f, 14.0876f, 11.7949f, 13.7011f, 11.5f, 13.3464f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.25f)
                curveTo(15.3881f, 13.0f, 15.5f, 13.1119f, 15.5f, 13.25f)
                verticalLineTo(14.5f)
                close()
                moveTo(6.5f, 11.0f)
                curveTo(7.3876f, 11.0f, 8.2336f, 11.1779f, 9.0044f, 11.5f)
                horizontalLineTo(15.25f)
                curveTo(16.2165f, 11.5f, 17.0f, 12.2835f, 17.0f, 13.25f)
                verticalLineTo(17.25f)
                curveTo(17.0f, 18.2165f, 16.2165f, 19.0f, 15.25f, 19.0f)
                horizontalLineTo(12.8261f)
                curveTo(12.555f, 20.1474f, 11.9799f, 21.1773f, 11.1904f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1046f, 22.0f, 20.0f, 21.1046f, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 10.0f, 12.0f, 9.1046f, 12.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 2.0f, 4.0f, 2.8954f, 4.0f, 4.0f)
                verticalLineTo(11.4982f)
                curveTo(4.7696f, 11.1772f, 5.6141f, 11.0f, 6.5f, 11.0f)
                close()
                moveTo(13.5f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(13.7239f, 8.5f, 13.5f, 8.2761f, 13.5f, 8.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                close()
                moveTo(9.8535f, 15.1464f)
                curveTo(9.6583f, 14.9512f, 9.3417f, 14.9512f, 9.1465f, 15.1464f)
                lineTo(5.5f, 18.7929f)
                lineTo(3.8535f, 17.1464f)
                curveTo(3.6583f, 16.9512f, 3.3417f, 16.9512f, 3.1465f, 17.1464f)
                curveTo(2.9512f, 17.3417f, 2.9512f, 17.6583f, 3.1465f, 17.8536f)
                lineTo(5.1465f, 19.8536f)
                curveTo(5.3417f, 20.0488f, 5.6583f, 20.0488f, 5.8535f, 19.8536f)
                lineTo(9.8535f, 15.8536f)
                curveTo(10.0488f, 15.6583f, 10.0488f, 15.3417f, 9.8535f, 15.1464f)
                close()
            }
        }
        .build()
        return _documentTableCheckmark!!
    }

private var _documentTableCheckmark: ImageVector? = null
