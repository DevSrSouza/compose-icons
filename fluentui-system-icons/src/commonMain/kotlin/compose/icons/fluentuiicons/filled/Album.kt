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

public val FilledGroup.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 4.8954f, 2.8954f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 20.0f, 2.0f, 19.1046f, 2.0f, 18.0f)
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
                moveTo(6.5f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 20.0f, 22.0f, 19.1046f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.8954f, 21.1046f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(6.5f)
                lineTo(6.5f, 20.0f)
                close()
                moveTo(12.0f, 7.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 7.0f, 18.0f, 7.8954f, 18.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 11.1046f, 17.1046f, 12.0f, 16.0f, 12.0f)
                horizontalLineTo(12.0f)
                curveTo(10.8954f, 12.0f, 10.0f, 11.1046f, 10.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(10.0f, 7.8954f, 10.8954f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _album!!
    }

private var _album: ImageVector? = null
