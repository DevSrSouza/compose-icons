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

public val RegularGroup.TextFirstLine: ImageVector
    get() {
        if (_textFirstLine != null) {
            return _textFirstLine!!
        }
        _textFirstLine = Builder(name = "TextFirstLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7803f, 3.2197f)
                curveTo(3.4874f, 2.9268f, 3.0126f, 2.9268f, 2.7197f, 3.2197f)
                curveTo(2.4268f, 3.5126f, 2.4268f, 3.9874f, 2.7197f, 4.2803f)
                lineTo(4.1893f, 5.75f)
                lineTo(2.7197f, 7.2197f)
                curveTo(2.4268f, 7.5126f, 2.4268f, 7.9874f, 2.7197f, 8.2803f)
                curveTo(3.0126f, 8.5732f, 3.4874f, 8.5732f, 3.7803f, 8.2803f)
                lineTo(5.7803f, 6.2803f)
                curveTo(6.0732f, 5.9874f, 6.0732f, 5.5126f, 5.7803f, 5.2197f)
                lineTo(3.7803f, 3.2197f)
                close()
                moveTo(9.75f, 5.0f)
                curveTo(9.3358f, 5.0f, 9.0f, 5.3358f, 9.0f, 5.75f)
                curveTo(9.0f, 6.1642f, 9.3358f, 6.5f, 9.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 6.5f, 22.0f, 6.1642f, 22.0f, 5.75f)
                curveTo(22.0f, 5.3358f, 21.6642f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(2.75f, 18.0f)
                curveTo(2.3358f, 18.0f, 2.0f, 18.3358f, 2.0f, 18.75f)
                curveTo(2.0f, 19.1642f, 2.3358f, 19.5f, 2.75f, 19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 19.5f, 22.0f, 19.1642f, 22.0f, 18.75f)
                curveTo(22.0f, 18.3358f, 21.6642f, 18.0f, 21.25f, 18.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 12.25f)
                curveTo(2.0f, 11.8358f, 2.3358f, 11.5f, 2.75f, 11.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 11.5f, 22.0f, 11.8358f, 22.0f, 12.25f)
                curveTo(22.0f, 12.6642f, 21.6642f, 13.0f, 21.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 13.0f, 2.0f, 12.6642f, 2.0f, 12.25f)
                close()
            }
        }
        .build()
        return _textFirstLine!!
    }

private var _textFirstLine: ImageVector? = null
