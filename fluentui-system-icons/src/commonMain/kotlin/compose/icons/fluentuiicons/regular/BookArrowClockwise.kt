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

public val RegularGroup.BookArrowClockwise: ImageVector
    get() {
        if (_bookArrowClockwise != null) {
            return _bookArrowClockwise!!
        }
        _bookArrowClockwise = Builder(name = "BookArrowClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 5.0f)
                curveTo(21.6642f, 5.0f, 22.0f, 4.6642f, 22.0f, 4.25f)
                verticalLineTo(1.5f)
                curveTo(22.0f, 1.0858f, 21.6642f, 0.75f, 21.25f, 0.75f)
                curveTo(21.0121f, 0.75f, 20.8001f, 0.8608f, 20.6627f, 1.0335f)
                curveTo(20.5608f, 1.1616f, 20.5f, 1.3237f, 20.5f, 1.5f)
                verticalLineTo(2.1261f)
                curveTo(19.5149f, 1.4176f, 18.3054f, 1.0f, 17.0f, 1.0f)
                curveTo(13.6863f, 1.0f, 11.0f, 3.6863f, 11.0f, 7.0f)
                curveTo(11.0f, 10.3137f, 13.6863f, 13.0f, 17.0f, 13.0f)
                curveTo(20.3137f, 13.0f, 23.0f, 10.3137f, 23.0f, 7.0f)
                curveTo(23.0f, 6.5858f, 22.6642f, 6.25f, 22.25f, 6.25f)
                curveTo(21.8358f, 6.25f, 21.5f, 6.5858f, 21.5f, 7.0f)
                curveTo(21.5f, 9.4853f, 19.4853f, 11.5f, 17.0f, 11.5f)
                curveTo(14.5147f, 11.5f, 12.5f, 9.4853f, 12.5f, 7.0f)
                curveTo(12.5f, 4.5147f, 14.5147f, 2.5f, 17.0f, 2.5f)
                curveTo(18.0649f, 2.5f, 19.0416f, 2.869f, 19.8121f, 3.4867f)
                curveTo(19.8178f, 3.4912f, 19.8235f, 3.4957f, 19.8293f, 3.5f)
                horizontalLineTo(18.5f)
                curveTo(18.0858f, 3.5f, 17.75f, 3.8358f, 17.75f, 4.25f)
                curveTo(17.75f, 4.6642f, 18.0858f, 5.0f, 18.5f, 5.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(6.5f, 2.0f)
                horizontalLineTo(12.101f)
                curveTo(11.6485f, 2.4435f, 11.2558f, 2.9479f, 10.9365f, 3.5f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 3.5f, 5.5f, 3.9477f, 5.5f, 4.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.7101f)
                curveTo(19.5289f, 13.5527f, 20.0316f, 13.3345f, 20.5f, 13.0635f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                close()
            }
        }
        .build()
        return _bookArrowClockwise!!
    }

private var _bookArrowClockwise: ImageVector? = null
