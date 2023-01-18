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

public val FilledGroup.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = Builder(name = "Save", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.7688f, 4.2312f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 13.7574f, 7.0074f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(15.75f)
                curveTo(16.9926f, 12.75f, 18.0f, 13.7574f, 18.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 21.0f, 21.0f, 19.7688f, 21.0f, 18.25f)
                verticalLineTo(8.2855f)
                curveTo(21.0f, 7.4236f, 20.6576f, 6.5969f, 20.0481f, 5.9874f)
                lineTo(18.0126f, 3.9519f)
                curveTo(17.4114f, 3.3508f, 16.5991f, 3.0095f, 15.75f, 3.0002f)
                verticalLineTo(7.5f)
                curveTo(15.75f, 8.7426f, 14.7426f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(9.0f)
                curveTo(7.7574f, 9.75f, 6.75f, 8.7426f, 6.75f, 7.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(14.25f, 3.0f)
                verticalLineTo(7.5f)
                curveTo(14.25f, 7.9142f, 13.9142f, 8.25f, 13.5f, 8.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 8.25f, 8.25f, 7.9142f, 8.25f, 7.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.25f)
                close()
                moveTo(16.5f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(16.5f, 14.5858f, 16.1642f, 14.25f, 15.75f, 14.25f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 14.25f, 7.5f, 14.5858f, 7.5f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.5f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
