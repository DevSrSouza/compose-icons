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

public val RegularGroup.TextPositionLine: ImageVector
    get() {
        if (_textPositionLine != null) {
            return _textPositionLine!!
        }
        _textPositionLine = Builder(name = "TextPositionLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 4.0f)
                curveTo(3.3358f, 4.0f, 3.0f, 4.3358f, 3.0f, 4.75f)
                curveTo(3.0f, 5.1642f, 3.3358f, 5.5f, 3.75f, 5.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 5.5f, 21.0f, 5.1642f, 21.0f, 4.75f)
                curveTo(21.0f, 4.3358f, 20.6642f, 4.0f, 20.25f, 4.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(7.0f, 8.5f)
                curveTo(5.6193f, 8.5f, 4.5f, 9.6193f, 4.5f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(4.5f, 16.1642f, 4.1642f, 16.5f, 3.75f, 16.5f)
                curveTo(3.3358f, 16.5f, 3.0f, 16.1642f, 3.0f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 8.7909f, 4.7909f, 7.0f, 7.0f, 7.0f)
                curveTo(9.2091f, 7.0f, 11.0f, 8.7909f, 11.0f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(11.0f, 16.1642f, 10.6642f, 16.5f, 10.25f, 16.5f)
                curveTo(9.8358f, 16.5f, 9.5f, 16.1642f, 9.5f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(9.5f, 9.6193f, 8.3807f, 8.5f, 7.0f, 8.5f)
                close()
                moveTo(13.75f, 14.5f)
                curveTo(13.3358f, 14.5f, 13.0f, 14.8358f, 13.0f, 15.25f)
                curveTo(13.0f, 15.6642f, 13.3358f, 16.0f, 13.75f, 16.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 16.0f, 21.0f, 15.6642f, 21.0f, 15.25f)
                curveTo(21.0f, 14.8358f, 20.6642f, 14.5f, 20.25f, 14.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(3.75f, 18.0f)
                curveTo(3.3358f, 18.0f, 3.0f, 18.3358f, 3.0f, 18.75f)
                curveTo(3.0f, 19.1642f, 3.3358f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 19.5f, 21.0f, 19.1642f, 21.0f, 18.75f)
                curveTo(21.0f, 18.3358f, 20.6642f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _textPositionLine!!
    }

private var _textPositionLine: ImageVector? = null
