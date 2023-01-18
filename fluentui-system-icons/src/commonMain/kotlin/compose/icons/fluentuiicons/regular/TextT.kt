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

public val RegularGroup.TextT: ImageVector
    get() {
        if (_textT != null) {
            return _textT!!
        }
        _textT = Builder(name = "TextT", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.75f)
                curveTo(5.0f, 4.3358f, 5.3358f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 4.0f, 19.0f, 4.3358f, 19.0f, 4.75f)
                verticalLineTo(6.75f)
                curveTo(19.0f, 7.1642f, 18.6642f, 7.5f, 18.25f, 7.5f)
                curveTo(17.8358f, 7.5f, 17.5f, 7.1642f, 17.5f, 6.75f)
                verticalLineTo(5.5f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 18.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 18.5f, 15.0f, 18.8358f, 15.0f, 19.25f)
                curveTo(15.0f, 19.6642f, 14.6642f, 20.0f, 14.25f, 20.0f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 20.0f, 9.0f, 19.6642f, 9.0f, 19.25f)
                curveTo(9.0f, 18.8358f, 9.3358f, 18.5f, 9.75f, 18.5f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 5.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(6.75f)
                curveTo(6.5f, 7.1642f, 6.1642f, 7.5f, 5.75f, 7.5f)
                curveTo(5.3358f, 7.5f, 5.0f, 7.1642f, 5.0f, 6.75f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _textT!!
    }

private var _textT: ImageVector? = null
