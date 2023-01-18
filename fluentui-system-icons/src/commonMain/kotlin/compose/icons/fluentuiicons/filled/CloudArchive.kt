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

public val FilledGroup.CloudArchive: ImageVector
    get() {
        if (_cloudArchive != null) {
            return _cloudArchive!!
        }
        _cloudArchive = Builder(name = "CloudArchive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0866f, 9.75f)
                curveTo(6.561f, 7.0428f, 8.9246f, 5.0f, 11.75f, 5.0f)
                curveTo(14.5754f, 5.0f, 16.939f, 7.0428f, 17.4134f, 9.75f)
                lineTo(17.5f, 9.75f)
                curveTo(19.0816f, 9.75f, 20.4487f, 10.6679f, 21.0979f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(11.8954f, 12.0f, 11.0f, 12.8954f, 11.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 15.7403f, 11.4022f, 16.3866f, 12.0f, 16.7324f)
                verticalLineTo(17.75f)
                horizontalLineTo(6.0f)
                curveTo(3.7909f, 17.75f, 2.0f, 15.9591f, 2.0f, 13.75f)
                curveTo(2.0f, 11.5409f, 3.7909f, 9.75f, 6.0f, 9.75f)
                lineTo(6.0866f, 9.75f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(12.0f, 13.4477f, 12.4477f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 13.0f, 23.0f, 13.4477f, 23.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 15.5523f, 22.5523f, 16.0f, 22.0f, 16.0f)
                horizontalLineTo(13.0f)
                curveTo(12.4477f, 16.0f, 12.0f, 15.5523f, 12.0f, 15.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(22.0001f, 17.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(21.0f)
                curveTo(13.0001f, 22.1046f, 13.8955f, 23.0f, 15.0001f, 23.0f)
                horizontalLineTo(20.0001f)
                curveTo(21.1046f, 23.0f, 22.0001f, 22.1046f, 22.0001f, 21.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(16.0001f, 18.0f)
                horizontalLineTo(19.0001f)
                curveTo(19.2762f, 18.0f, 19.5001f, 18.2239f, 19.5001f, 18.5f)
                curveTo(19.5001f, 18.7761f, 19.2762f, 19.0f, 19.0001f, 19.0f)
                horizontalLineTo(16.0001f)
                curveTo(15.7239f, 19.0f, 15.5001f, 18.7761f, 15.5001f, 18.5f)
                curveTo(15.5001f, 18.2239f, 15.7239f, 18.0f, 16.0001f, 18.0f)
                close()
            }
        }
        .build()
        return _cloudArchive!!
    }

private var _cloudArchive: ImageVector? = null
