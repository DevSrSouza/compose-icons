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

public val FilledGroup.AlbumAdd: ImageVector
    get() {
        if (_albumAdd != null) {
            return _albumAdd!!
        }
        _albumAdd = Builder(name = "AlbumAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 4.8954f, 2.8954f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.1739f)
                curveTo(3.8526f, 11.445f, 2.8227f, 12.0201f, 2.0f, 12.8096f)
                verticalLineTo(6.0f)
                close()
                moveTo(16.0f, 8.5f)
                horizontalLineTo(12.0f)
                curveTo(11.7239f, 8.5f, 11.5f, 8.7239f, 11.5f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(11.5f, 10.2761f, 11.7239f, 10.5f, 12.0f, 10.5f)
                horizontalLineTo(16.0f)
                curveTo(16.2761f, 10.5f, 16.5f, 10.2761f, 16.5f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(16.5f, 8.7239f, 16.2761f, 8.5f, 16.0f, 8.5f)
                close()
                moveTo(12.5018f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 20.0f, 22.0f, 19.1046f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.8954f, 21.1046f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(11.0f)
                curveTo(10.0899f, 11.0f, 13.0f, 13.9101f, 13.0f, 17.5f)
                curveTo(13.0f, 18.3859f, 12.8228f, 19.2304f, 12.5018f, 20.0f)
                close()
                moveTo(10.0f, 9.0f)
                curveTo(10.0f, 7.8954f, 10.8954f, 7.0f, 12.0f, 7.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 7.0f, 18.0f, 7.8954f, 18.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 11.1046f, 17.1046f, 12.0f, 16.0f, 12.0f)
                horizontalLineTo(12.0f)
                curveTo(10.8954f, 12.0f, 10.0f, 11.1046f, 10.0f, 10.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(7.0011f, 20.5035f)
                lineTo(7.0006f, 18.0f)
                horizontalLineTo(9.4966f)
                curveTo(9.7725f, 18.0f, 9.9961f, 17.7762f, 9.9961f, 17.5f)
                curveTo(9.9961f, 17.2239f, 9.7725f, 17.0f, 9.4966f, 17.0f)
                horizontalLineTo(7.0005f)
                lineTo(7.0f, 14.4993f)
                curveTo(7.0f, 14.2231f, 6.7761f, 13.9993f, 6.5f, 13.9993f)
                curveTo(6.2239f, 13.9993f, 6.0f, 14.2231f, 6.0f, 14.4993f)
                lineTo(6.0005f, 17.0f)
                horizontalLineTo(3.4956f)
                curveTo(3.2197f, 17.0f, 2.9961f, 17.2239f, 2.9961f, 17.5f)
                curveTo(2.9961f, 17.7762f, 3.2197f, 18.0f, 3.4956f, 18.0f)
                horizontalLineTo(6.0006f)
                lineTo(6.0011f, 20.5035f)
                curveTo(6.0011f, 20.7797f, 6.225f, 21.0035f, 6.5011f, 21.0035f)
                curveTo(6.7772f, 21.0035f, 7.0011f, 20.7797f, 7.0011f, 20.5035f)
                close()
            }
        }
        .build()
        return _albumAdd!!
    }

private var _albumAdd: ImageVector? = null
