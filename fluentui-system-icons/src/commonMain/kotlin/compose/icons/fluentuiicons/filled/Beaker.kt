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

public val FilledGroup.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = Builder(name = "Beaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.5f)
                verticalLineTo(10.7382f)
                curveTo(9.0f, 11.1132f, 8.9063f, 11.4822f, 8.7274f, 11.8117f)
                lineTo(7.5394f, 14.0f)
                horizontalLineTo(16.4605f)
                lineTo(15.2726f, 11.8117f)
                curveTo(15.0937f, 11.4822f, 15.0f, 11.1132f, 15.0f, 10.7382f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 4.5f, 16.75f, 4.1642f, 16.75f, 3.75f)
                curveTo(16.75f, 3.3358f, 16.4142f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 3.0f, 7.25f, 3.3358f, 7.25f, 3.75f)
                curveTo(7.25f, 4.1642f, 7.5858f, 4.5f, 8.0f, 4.5f)
                horizontalLineTo(9.0f)
                close()
                moveTo(17.2748f, 15.5f)
                horizontalLineTo(6.7252f)
                lineTo(5.1427f, 18.415f)
                curveTo(4.5097f, 19.5811f, 5.3539f, 20.9999f, 6.6807f, 20.9999f)
                horizontalLineTo(17.3193f)
                curveTo(18.6461f, 20.9999f, 19.4903f, 19.5811f, 18.8573f, 18.415f)
                lineTo(17.2748f, 15.5f)
                close()
            }
        }
        .build()
        return _beaker!!
    }

private var _beaker: ImageVector? = null
