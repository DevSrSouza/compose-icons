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

public val RegularGroup.TextAlignRight: ImageVector
    get() {
        if (_textAlignRight != null) {
            return _textAlignRight!!
        }
        _textAlignRight = Builder(name = "TextAlignRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.75f)
                curveTo(5.0f, 5.3358f, 5.3358f, 5.0f, 5.75f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 5.0f, 22.0f, 5.3358f, 22.0f, 5.75f)
                curveTo(22.0f, 6.1642f, 21.6642f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 6.5f, 5.0f, 6.1642f, 5.0f, 5.75f)
                close()
                moveTo(10.0f, 18.75f)
                curveTo(10.0f, 18.3358f, 10.3358f, 18.0f, 10.75f, 18.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 18.0f, 22.0f, 18.3358f, 22.0f, 18.75f)
                curveTo(22.0f, 19.1642f, 21.6642f, 19.5f, 21.25f, 19.5f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 19.5f, 10.0f, 19.1642f, 10.0f, 18.75f)
                close()
                moveTo(2.75f, 11.5f)
                curveTo(2.3358f, 11.5f, 2.0f, 11.8358f, 2.0f, 12.25f)
                curveTo(2.0f, 12.6642f, 2.3358f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 13.0f, 22.0f, 12.6642f, 22.0f, 12.25f)
                curveTo(22.0f, 11.8358f, 21.6642f, 11.5f, 21.25f, 11.5f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _textAlignRight!!
    }

private var _textAlignRight: ImageVector? = null
