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

public val RegularGroup.XboxConsole: ImageVector
    get() {
        if (_xboxConsole != null) {
            return _xboxConsole!!
        }
        _xboxConsole = Builder(name = "XboxConsole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.75f)
                curveTo(9.5f, 6.1642f, 9.1642f, 6.5f, 8.75f, 6.5f)
                curveTo(8.3358f, 6.5f, 8.0f, 6.1642f, 8.0f, 5.75f)
                curveTo(8.0f, 5.3358f, 8.3358f, 5.0f, 8.75f, 5.0f)
                curveTo(9.1642f, 5.0f, 9.5f, 5.3358f, 9.5f, 5.75f)
                close()
                moveTo(5.75f, 2.0f)
                curveTo(5.3358f, 2.0f, 5.0f, 2.3358f, 5.0f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(5.0f, 21.6642f, 5.3358f, 22.0f, 5.75f, 22.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 22.0f, 19.0f, 21.6642f, 19.0f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(19.0f, 2.3358f, 18.6642f, 2.0f, 18.25f, 2.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(9.5f, 20.5f)
                verticalLineTo(11.75f)
                curveTo(9.5f, 11.3358f, 9.1642f, 11.0f, 8.75f, 11.0f)
                curveTo(8.3358f, 11.0f, 8.0f, 11.3358f, 8.0f, 11.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _xboxConsole!!
    }

private var _xboxConsole: ImageVector? = null
