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

public val RegularGroup.TextPositionTopBottom: ImageVector
    get() {
        if (_textPositionTopBottom != null) {
            return _textPositionTopBottom!!
        }
        _textPositionTopBottom = Builder(name = "TextPositionTopBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.75f)
                curveTo(3.0f, 4.3358f, 3.3358f, 4.0f, 3.75f, 4.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 4.0f, 21.0f, 4.3358f, 21.0f, 4.75f)
                curveTo(21.0f, 5.1642f, 20.6642f, 5.5f, 20.25f, 5.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 5.5f, 3.0f, 5.1642f, 3.0f, 4.75f)
                close()
                moveTo(3.0f, 18.75f)
                curveTo(3.0f, 18.3358f, 3.3358f, 18.0f, 3.75f, 18.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 18.0f, 21.0f, 18.3358f, 21.0f, 18.75f)
                curveTo(21.0f, 19.1642f, 20.6642f, 19.5f, 20.25f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 19.5f, 3.0f, 19.1642f, 3.0f, 18.75f)
                close()
                moveTo(9.5f, 11.0f)
                curveTo(9.5f, 9.6193f, 10.6193f, 8.5f, 12.0f, 8.5f)
                curveTo(13.3807f, 8.5f, 14.5f, 9.6193f, 14.5f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 16.1642f, 14.8358f, 16.5f, 15.25f, 16.5f)
                curveTo(15.6642f, 16.5f, 16.0f, 16.1642f, 16.0f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 8.7909f, 14.2091f, 7.0f, 12.0f, 7.0f)
                curveTo(9.7909f, 7.0f, 8.0f, 8.7909f, 8.0f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(8.0f, 16.1642f, 8.3358f, 16.5f, 8.75f, 16.5f)
                curveTo(9.1642f, 16.5f, 9.5f, 16.1642f, 9.5f, 15.75f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _textPositionTopBottom!!
    }

private var _textPositionTopBottom: ImageVector? = null
