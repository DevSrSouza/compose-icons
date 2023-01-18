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

public val RegularGroup.TextWrap: ImageVector
    get() {
        if (_textWrap != null) {
            return _textWrap!!
        }
        _textWrap = Builder(name = "TextWrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(2.75f, 11.5f)
                curveTo(2.3358f, 11.5f, 2.0f, 11.8358f, 2.0f, 12.25f)
                curveTo(2.0f, 12.6642f, 2.3358f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(19.0f)
                curveTo(20.3807f, 13.0f, 21.5f, 14.1193f, 21.5f, 15.5f)
                curveTo(21.5f, 16.8807f, 20.3807f, 18.0f, 19.0f, 18.0f)
                horizontalLineTo(14.5607f)
                lineTo(15.2803f, 17.2803f)
                curveTo(15.5732f, 16.9874f, 15.5732f, 16.5126f, 15.2803f, 16.2197f)
                curveTo(14.9874f, 15.9268f, 14.5126f, 15.9268f, 14.2197f, 16.2197f)
                lineTo(12.2197f, 18.2197f)
                curveTo(11.9268f, 18.5126f, 11.9268f, 18.9874f, 12.2197f, 19.2803f)
                lineTo(14.2197f, 21.2803f)
                curveTo(14.5126f, 21.5732f, 14.9874f, 21.5732f, 15.2803f, 21.2803f)
                curveTo(15.5732f, 20.9874f, 15.5732f, 20.5126f, 15.2803f, 20.2197f)
                lineTo(14.5607f, 19.5f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 19.5f, 23.0f, 17.7091f, 23.0f, 15.5f)
                curveTo(23.0f, 13.2909f, 21.2091f, 11.5f, 19.0f, 11.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 18.75f)
                curveTo(2.0f, 18.3358f, 2.3358f, 18.0f, 2.75f, 18.0f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 18.0f, 10.0f, 18.3358f, 10.0f, 18.75f)
                curveTo(10.0f, 19.1642f, 9.6642f, 19.5f, 9.25f, 19.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 19.5f, 2.0f, 19.1642f, 2.0f, 18.75f)
                close()
            }
        }
        .build()
        return _textWrap!!
    }

private var _textWrap: ImageVector? = null
