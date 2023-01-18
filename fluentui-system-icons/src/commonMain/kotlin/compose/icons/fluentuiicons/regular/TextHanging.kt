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

public val RegularGroup.TextHanging: ImageVector
    get() {
        if (_textHanging != null) {
            return _textHanging!!
        }
        _textHanging = Builder(name = "TextHanging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 5.0f)
                curveTo(2.3358f, 5.0f, 2.0f, 5.3358f, 2.0f, 5.75f)
                curveTo(2.0f, 6.1642f, 2.3358f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 6.5f, 22.0f, 6.1642f, 22.0f, 5.75f)
                curveTo(22.0f, 5.3358f, 21.6642f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(9.75f, 18.0f)
                curveTo(9.3358f, 18.0f, 9.0f, 18.3358f, 9.0f, 18.75f)
                curveTo(9.0f, 19.1642f, 9.3358f, 19.5f, 9.75f, 19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 19.5f, 22.0f, 19.1642f, 22.0f, 18.75f)
                curveTo(22.0f, 18.3358f, 21.6642f, 18.0f, 21.25f, 18.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(9.0f, 12.25f)
                curveTo(9.0f, 11.8358f, 9.3358f, 11.5f, 9.75f, 11.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 11.5f, 22.0f, 11.8358f, 22.0f, 12.25f)
                curveTo(22.0f, 12.6642f, 21.6642f, 13.0f, 21.25f, 13.0f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 13.0f, 9.0f, 12.6642f, 9.0f, 12.25f)
                close()
                moveTo(3.7803f, 12.9697f)
                curveTo(3.4874f, 12.6768f, 3.0126f, 12.6768f, 2.7197f, 12.9697f)
                curveTo(2.4268f, 13.2626f, 2.4268f, 13.7374f, 2.7197f, 14.0303f)
                lineTo(4.1893f, 15.5f)
                lineTo(2.7197f, 16.9697f)
                curveTo(2.4268f, 17.2626f, 2.4268f, 17.7374f, 2.7197f, 18.0303f)
                curveTo(3.0126f, 18.3232f, 3.4874f, 18.3232f, 3.7803f, 18.0303f)
                lineTo(5.7803f, 16.0303f)
                curveTo(6.0732f, 15.7374f, 6.0732f, 15.2626f, 5.7803f, 14.9697f)
                lineTo(3.7803f, 12.9697f)
                close()
            }
        }
        .build()
        return _textHanging!!
    }

private var _textHanging: ImageVector? = null
