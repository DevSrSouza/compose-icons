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

public val FilledGroup.Server: ImageVector
    get() {
        if (_server != null) {
            return _server!!
        }
        _server = Builder(name = "Server", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(7.3432f, 2.0f, 6.0f, 3.3431f, 6.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(6.0f, 20.6569f, 7.3432f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(16.6569f, 22.0f, 18.0f, 20.6569f, 18.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(18.0f, 3.3431f, 16.6569f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(8.5f, 6.75f)
                curveTo(8.5f, 6.3358f, 8.8358f, 6.0f, 9.25f, 6.0f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 6.0f, 15.5f, 6.3358f, 15.5f, 6.75f)
                curveTo(15.5f, 7.1642f, 15.1642f, 7.5f, 14.75f, 7.5f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 7.5f, 8.5f, 7.1642f, 8.5f, 6.75f)
                close()
                moveTo(8.5f, 17.75f)
                curveTo(8.5f, 17.3358f, 8.8358f, 17.0f, 9.25f, 17.0f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 17.0f, 15.5f, 17.3358f, 15.5f, 17.75f)
                curveTo(15.5f, 18.1642f, 15.1642f, 18.5f, 14.75f, 18.5f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 18.5f, 8.5f, 18.1642f, 8.5f, 17.75f)
                close()
                moveTo(8.5f, 14.75f)
                curveTo(8.5f, 14.3358f, 8.8358f, 14.0f, 9.25f, 14.0f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 14.0f, 15.5f, 14.3358f, 15.5f, 14.75f)
                curveTo(15.5f, 15.1642f, 15.1642f, 15.5f, 14.75f, 15.5f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 15.5f, 8.5f, 15.1642f, 8.5f, 14.75f)
                close()
            }
        }
        .build()
        return _server!!
    }

private var _server: ImageVector? = null
