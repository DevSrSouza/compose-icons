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

public val RegularGroup.TextPositionFront: ImageVector
    get() {
        if (_textPositionFront != null) {
            return _textPositionFront!!
        }
        _textPositionFront = Builder(name = "TextPositionFront", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 8.5f)
                curveTo(10.9748f, 8.5f, 10.0938f, 9.1171f, 9.708f, 10.0f)
                horizontalLineTo(8.126f)
                curveTo(8.5701f, 8.2748f, 10.1362f, 7.0f, 12.0f, 7.0f)
                curveTo(13.8638f, 7.0f, 15.4299f, 8.2748f, 15.874f, 10.0f)
                horizontalLineTo(14.292f)
                curveTo(13.9062f, 9.1171f, 13.0252f, 8.5f, 12.0f, 8.5f)
                close()
                moveTo(8.0f, 13.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.75f)
                curveTo(9.5f, 16.1642f, 9.1642f, 16.5f, 8.75f, 16.5f)
                curveTo(8.3358f, 16.5f, 8.0f, 16.1642f, 8.0f, 15.75f)
                verticalLineTo(13.5f)
                close()
                moveTo(16.0f, 13.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 16.1642f, 14.8358f, 16.5f, 15.25f, 16.5f)
                curveTo(15.6642f, 16.5f, 16.0f, 16.1642f, 16.0f, 15.75f)
                verticalLineTo(13.5f)
                close()
                moveTo(20.25f, 11.0f)
                curveTo(20.6642f, 11.0f, 21.0f, 11.3358f, 21.0f, 11.75f)
                curveTo(21.0f, 12.1642f, 20.6642f, 12.5f, 20.25f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 12.5f, 3.0f, 12.1642f, 3.0f, 11.75f)
                curveTo(3.0f, 11.3358f, 3.3358f, 11.0f, 3.75f, 11.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(3.0f, 18.75f)
                curveTo(3.0f, 18.3358f, 3.3358f, 18.0f, 3.75f, 18.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 18.0f, 21.0f, 18.3358f, 21.0f, 18.75f)
                curveTo(21.0f, 19.1642f, 20.6642f, 19.5f, 20.25f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 19.5f, 3.0f, 19.1642f, 3.0f, 18.75f)
                close()
            }
        }
        .build()
        return _textPositionFront!!
    }

private var _textPositionFront: ImageVector? = null
