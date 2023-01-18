package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = Builder(name = "Beaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.7382f)
                curveTo(9.0f, 11.1132f, 8.9063f, 11.4822f, 8.7274f, 11.8117f)
                lineTo(5.1427f, 18.415f)
                curveTo(4.5097f, 19.5811f, 5.3539f, 20.9999f, 6.6807f, 20.9999f)
                horizontalLineTo(17.3193f)
                curveTo(18.6461f, 20.9999f, 19.4903f, 19.5811f, 18.8573f, 18.415f)
                lineTo(15.2726f, 11.8117f)
                curveTo(15.0937f, 11.4822f, 15.0f, 11.1132f, 15.0f, 10.7382f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 4.5f, 16.75f, 4.1642f, 16.75f, 3.75f)
                curveTo(16.75f, 3.3358f, 16.4142f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 3.0f, 7.25f, 3.3358f, 7.25f, 3.75f)
                curveTo(7.25f, 4.1642f, 7.5858f, 4.5f, 8.0f, 4.5f)
                close()
                moveTo(10.5f, 10.7382f)
                verticalLineTo(4.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.7382f)
                curveTo(13.5f, 11.3631f, 13.6561f, 11.9781f, 13.9543f, 12.5273f)
                lineTo(14.7537f, 14.0f)
                horizontalLineTo(9.2462f)
                lineTo(10.0457f, 12.5273f)
                curveTo(10.3438f, 11.9781f, 10.5f, 11.3631f, 10.5f, 10.7382f)
                close()
                moveTo(8.4319f, 15.5f)
                horizontalLineTo(15.568f)
                lineTo(17.539f, 19.1307f)
                curveTo(17.6294f, 19.2973f, 17.5088f, 19.4999f, 17.3193f, 19.4999f)
                horizontalLineTo(6.6807f)
                curveTo(6.4911f, 19.4999f, 6.3705f, 19.2973f, 6.461f, 19.1307f)
                lineTo(8.4319f, 15.5f)
                close()
            }
        }
        .build()
        return _beaker!!
    }

private var _beaker: ImageVector? = null
