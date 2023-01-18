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

public val RegularGroup.TextAlignDistributed: ImageVector
    get() {
        if (_textAlignDistributed != null) {
            return _textAlignDistributed!!
        }
        _textAlignDistributed = Builder(name = "TextAlignDistributed", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2803f, 7.2197f)
                lineTo(4.5607f, 6.5f)
                lineTo(21.25f, 6.5f)
                curveTo(21.6642f, 6.5f, 22.0f, 6.1642f, 22.0f, 5.75f)
                curveTo(22.0f, 5.3358f, 21.6642f, 5.0f, 21.25f, 5.0f)
                lineTo(4.5607f, 5.0f)
                lineTo(5.2803f, 4.2803f)
                curveTo(5.5732f, 3.9874f, 5.5732f, 3.5126f, 5.2803f, 3.2197f)
                curveTo(4.9874f, 2.9268f, 4.5126f, 2.9268f, 4.2197f, 3.2197f)
                lineTo(2.2197f, 5.2197f)
                curveTo(1.9268f, 5.5126f, 1.9268f, 5.9874f, 2.2197f, 6.2803f)
                lineTo(4.2197f, 8.2803f)
                curveTo(4.5126f, 8.5732f, 4.9874f, 8.5732f, 5.2803f, 8.2803f)
                curveTo(5.5732f, 7.9874f, 5.5732f, 7.5126f, 5.2803f, 7.2197f)
                close()
                moveTo(2.75f, 11.5f)
                curveTo(2.3358f, 11.5f, 2.0f, 11.8358f, 2.0f, 12.25f)
                curveTo(2.0f, 12.6642f, 2.3358f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 13.0f, 22.0f, 12.6642f, 22.0f, 12.25f)
                curveTo(22.0f, 11.8358f, 21.6642f, 11.5f, 21.25f, 11.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 19.5f)
                horizontalLineTo(19.4393f)
                lineTo(18.7197f, 20.2197f)
                curveTo(18.4268f, 20.5126f, 18.4268f, 20.9874f, 18.7197f, 21.2803f)
                curveTo(19.0126f, 21.5732f, 19.4874f, 21.5732f, 19.7803f, 21.2803f)
                lineTo(21.7803f, 19.2803f)
                curveTo(22.0732f, 18.9874f, 22.0732f, 18.5126f, 21.7803f, 18.2197f)
                lineTo(19.7803f, 16.2197f)
                curveTo(19.4874f, 15.9268f, 19.0126f, 15.9268f, 18.7197f, 16.2197f)
                curveTo(18.4268f, 16.5126f, 18.4268f, 16.9874f, 18.7197f, 17.2803f)
                lineTo(19.4393f, 18.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 18.0f, 2.0f, 18.3358f, 2.0f, 18.75f)
                curveTo(2.0f, 19.1642f, 2.3358f, 19.5f, 2.75f, 19.5f)
                close()
            }
        }
        .build()
        return _textAlignDistributed!!
    }

private var _textAlignDistributed: ImageVector? = null
