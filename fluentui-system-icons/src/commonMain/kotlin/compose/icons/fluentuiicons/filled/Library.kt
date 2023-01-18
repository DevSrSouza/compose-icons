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

public val FilledGroup.Library: ImageVector
    get() {
        if (_library != null) {
            return _library!!
        }
        _library = Builder(name = "Library", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 3.0f)
                curveTo(6.328f, 3.0f, 7.0f, 3.672f, 7.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(7.0f, 20.328f, 6.328f, 21.0f, 5.5f, 21.0f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 21.0f, 2.0f, 20.328f, 2.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(2.0f, 3.672f, 2.672f, 3.0f, 3.5f, 3.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(11.5f, 3.0f)
                curveTo(12.328f, 3.0f, 13.0f, 3.672f, 13.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(13.0f, 20.328f, 12.328f, 21.0f, 11.5f, 21.0f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 21.0f, 8.0f, 20.328f, 8.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 3.672f, 8.672f, 3.0f, 9.5f, 3.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(18.781f, 6.1238f)
                lineTo(21.995f, 18.6428f)
                curveTo(22.201f, 19.4448f, 21.718f, 20.2628f, 20.915f, 20.4688f)
                lineTo(19.039f, 20.9498f)
                curveTo(18.236f, 21.1558f, 17.419f, 20.6728f, 17.213f, 19.8698f)
                lineTo(13.999f, 7.3528f)
                curveTo(13.793f, 6.5498f, 14.276f, 5.7328f, 15.079f, 5.5268f)
                lineTo(16.955f, 5.0438f)
                curveTo(17.758f, 4.8388f, 18.575f, 5.3228f, 18.781f, 6.1238f)
                close()
            }
        }
        .build()
        return _library!!
    }

private var _library: ImageVector? = null
