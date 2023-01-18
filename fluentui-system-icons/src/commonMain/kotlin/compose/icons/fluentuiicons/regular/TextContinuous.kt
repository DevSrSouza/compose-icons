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

public val RegularGroup.TextContinuous: ImageVector
    get() {
        if (_textContinuous != null) {
            return _textContinuous!!
        }
        _textContinuous = Builder(name = "TextContinuous", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 5.0f)
                curveTo(3.3358f, 5.0f, 3.0f, 5.3358f, 3.0f, 5.75f)
                curveTo(3.0f, 6.1642f, 3.3358f, 6.5f, 3.75f, 6.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 6.5f, 21.0f, 6.1642f, 21.0f, 5.75f)
                curveTo(21.0f, 5.3358f, 20.6642f, 5.0f, 20.25f, 5.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(8.75f, 9.0f)
                curveTo(8.3358f, 9.0f, 8.0f, 9.3358f, 8.0f, 9.75f)
                curveTo(8.0f, 10.1642f, 8.3358f, 10.5f, 8.75f, 10.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 10.5f, 21.0f, 10.1642f, 21.0f, 9.75f)
                curveTo(21.0f, 9.3358f, 20.6642f, 9.0f, 20.25f, 9.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.0f, 13.75f)
                curveTo(8.0f, 13.3358f, 8.3358f, 13.0f, 8.75f, 13.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 13.0f, 21.0f, 13.3358f, 21.0f, 13.75f)
                curveTo(21.0f, 14.1642f, 20.6642f, 14.5f, 20.25f, 14.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 14.5f, 8.0f, 14.1642f, 8.0f, 13.75f)
                close()
                moveTo(3.75f, 17.0f)
                curveTo(3.3358f, 17.0f, 3.0f, 17.3358f, 3.0f, 17.75f)
                curveTo(3.0f, 18.1642f, 3.3358f, 18.5f, 3.75f, 18.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 18.5f, 21.0f, 18.1642f, 21.0f, 17.75f)
                curveTo(21.0f, 17.3358f, 20.6642f, 17.0f, 20.25f, 17.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3.2197f, 11.0303f)
                curveTo(2.9268f, 10.7374f, 2.9268f, 10.2626f, 3.2197f, 9.9697f)
                curveTo(3.5126f, 9.6768f, 3.9874f, 9.6768f, 4.2803f, 9.9697f)
                lineTo(5.7803f, 11.4697f)
                curveTo(6.0732f, 11.7626f, 6.0732f, 12.2374f, 5.7803f, 12.5303f)
                lineTo(4.2803f, 14.0303f)
                curveTo(3.9874f, 14.3232f, 3.5126f, 14.3232f, 3.2197f, 14.0303f)
                curveTo(2.9268f, 13.7374f, 2.9268f, 13.2626f, 3.2197f, 12.9697f)
                lineTo(4.1893f, 12.0f)
                lineTo(3.2197f, 11.0303f)
                close()
            }
        }
        .build()
        return _textContinuous!!
    }

private var _textContinuous: ImageVector? = null
