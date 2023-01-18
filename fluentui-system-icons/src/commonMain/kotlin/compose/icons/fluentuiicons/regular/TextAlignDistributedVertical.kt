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

public val RegularGroup.TextAlignDistributedVertical: ImageVector
    get() {
        if (_textAlignDistributedVertical != null) {
            return _textAlignDistributedVertical!!
        }
        _textAlignDistributedVertical = Builder(name = "TextAlignDistributedVertical", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7803f, 5.2803f)
                lineTo(17.5f, 4.5607f)
                lineTo(17.5f, 21.25f)
                curveTo(17.5f, 21.6642f, 17.8358f, 22.0f, 18.25f, 22.0f)
                curveTo(18.6642f, 22.0f, 19.0f, 21.6642f, 19.0f, 21.25f)
                verticalLineTo(4.5607f)
                lineTo(19.7197f, 5.2803f)
                curveTo(20.0126f, 5.5732f, 20.4874f, 5.5732f, 20.7803f, 5.2803f)
                curveTo(21.0732f, 4.9874f, 21.0732f, 4.5126f, 20.7803f, 4.2197f)
                lineTo(18.7803f, 2.2197f)
                curveTo(18.4874f, 1.9268f, 18.0126f, 1.9268f, 17.7197f, 2.2197f)
                lineTo(15.7197f, 4.2197f)
                curveTo(15.4268f, 4.5126f, 15.4268f, 4.9874f, 15.7197f, 5.2803f)
                curveTo(16.0126f, 5.5732f, 16.4874f, 5.5732f, 16.7803f, 5.2803f)
                close()
                moveTo(6.0f, 19.4393f)
                lineTo(6.7197f, 18.7197f)
                curveTo(7.0126f, 18.4268f, 7.4874f, 18.4268f, 7.7803f, 18.7197f)
                curveTo(8.0732f, 19.0126f, 8.0732f, 19.4874f, 7.7803f, 19.7803f)
                lineTo(5.7803f, 21.7803f)
                curveTo(5.4874f, 22.0732f, 5.0126f, 22.0732f, 4.7197f, 21.7803f)
                lineTo(2.7197f, 19.7803f)
                curveTo(2.4268f, 19.4874f, 2.4268f, 19.0126f, 2.7197f, 18.7197f)
                curveTo(3.0126f, 18.4268f, 3.4874f, 18.4268f, 3.7803f, 18.7197f)
                lineTo(4.5f, 19.4393f)
                lineTo(4.5f, 2.75f)
                curveTo(4.5f, 2.3358f, 4.8358f, 2.0f, 5.25f, 2.0f)
                curveTo(5.6642f, 2.0f, 6.0f, 2.3358f, 6.0f, 2.75f)
                lineTo(6.0f, 19.4393f)
                close()
                moveTo(12.5f, 2.75f)
                curveTo(12.5f, 2.3358f, 12.1642f, 2.0f, 11.75f, 2.0f)
                curveTo(11.3358f, 2.0f, 11.0f, 2.3358f, 11.0f, 2.75f)
                lineTo(11.0f, 21.25f)
                curveTo(11.0f, 21.6642f, 11.3358f, 22.0f, 11.75f, 22.0f)
                curveTo(12.1642f, 22.0f, 12.5f, 21.6642f, 12.5f, 21.25f)
                lineTo(12.5f, 2.75f)
                close()
            }
        }
        .build()
        return _textAlignDistributedVertical!!
    }

private var _textAlignDistributedVertical: ImageVector? = null
