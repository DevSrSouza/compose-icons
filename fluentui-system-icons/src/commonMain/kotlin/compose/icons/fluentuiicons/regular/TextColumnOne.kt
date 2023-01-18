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

public val RegularGroup.TextColumnOne: ImageVector
    get() {
        if (_textColumnOne != null) {
            return _textColumnOne!!
        }
        _textColumnOne = Builder(name = "TextColumnOne", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.75f)
                curveTo(5.0f, 5.3358f, 5.3358f, 5.0f, 5.75f, 5.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 5.0f, 19.0f, 5.3358f, 19.0f, 5.75f)
                curveTo(19.0f, 6.1642f, 18.6642f, 6.5f, 18.25f, 6.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 6.5f, 5.0f, 6.1642f, 5.0f, 5.75f)
                close()
                moveTo(5.0f, 9.75f)
                curveTo(5.0f, 9.3358f, 5.3358f, 9.0f, 5.75f, 9.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 9.0f, 19.0f, 9.3358f, 19.0f, 9.75f)
                curveTo(19.0f, 10.1642f, 18.6642f, 10.5f, 18.25f, 10.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 10.5f, 5.0f, 10.1642f, 5.0f, 9.75f)
                close()
                moveTo(5.0f, 13.75f)
                curveTo(5.0f, 13.3358f, 5.3358f, 13.0f, 5.75f, 13.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 13.0f, 19.0f, 13.3358f, 19.0f, 13.75f)
                curveTo(19.0f, 14.1642f, 18.6642f, 14.5f, 18.25f, 14.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 14.5f, 5.0f, 14.1642f, 5.0f, 13.75f)
                close()
                moveTo(5.0f, 17.75f)
                curveTo(5.0f, 17.3358f, 5.3358f, 17.0f, 5.75f, 17.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 17.0f, 19.0f, 17.3358f, 19.0f, 17.75f)
                curveTo(19.0f, 18.1642f, 18.6642f, 18.5f, 18.25f, 18.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 18.5f, 5.0f, 18.1642f, 5.0f, 17.75f)
                close()
            }
        }
        .build()
        return _textColumnOne!!
    }

private var _textColumnOne: ImageVector? = null
