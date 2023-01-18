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

public val RegularGroup.BookClock: ImageVector
    get() {
        if (_bookClock != null) {
            return _bookClock!!
        }
        _bookClock = Builder(name = "BookClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.125f)
                verticalLineTo(10.75f)
                horizontalLineTo(13.75f)
                curveTo(14.0952f, 10.75f, 14.375f, 11.0298f, 14.375f, 11.375f)
                curveTo(14.375f, 11.7202f, 14.0952f, 12.0f, 13.75f, 12.0f)
                horizontalLineTo(12.5f)
                curveTo(12.4789f, 12.0f, 12.4581f, 11.999f, 12.4375f, 11.9969f)
                curveTo(12.4169f, 11.999f, 12.3961f, 12.0f, 12.375f, 12.0f)
                curveTo(12.0298f, 12.0f, 11.75f, 11.7202f, 11.75f, 11.375f)
                verticalLineTo(9.125f)
                curveTo(11.75f, 8.7798f, 12.0298f, 8.5f, 12.375f, 8.5f)
                curveTo(12.7202f, 8.5f, 13.0f, 8.7798f, 13.0f, 9.125f)
                close()
                moveTo(12.375f, 6.0049f)
                curveTo(9.7516f, 6.0049f, 7.625f, 8.1315f, 7.625f, 10.7549f)
                curveTo(7.625f, 13.3782f, 9.7516f, 15.5049f, 12.375f, 15.5049f)
                curveTo(14.9984f, 15.5049f, 17.125f, 13.3782f, 17.125f, 10.7549f)
                curveTo(17.125f, 8.1315f, 14.9984f, 6.0049f, 12.375f, 6.0049f)
                close()
                moveTo(8.875f, 10.7549f)
                curveTo(8.875f, 8.8219f, 10.442f, 7.2549f, 12.375f, 7.2549f)
                curveTo(14.308f, 7.2549f, 15.875f, 8.8219f, 15.875f, 10.7549f)
                curveTo(15.875f, 12.6879f, 14.308f, 14.2549f, 12.375f, 14.2549f)
                curveTo(10.442f, 14.2549f, 8.875f, 12.6879f, 8.875f, 10.7549f)
                close()
                moveTo(6.5f, 2.0f)
                curveTo(5.1193f, 2.0f, 4.0f, 3.1193f, 4.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4.0f, 20.8807f, 5.1193f, 22.0f, 6.5f, 22.0f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 22.0f, 20.5f, 21.6642f, 20.5f, 21.25f)
                curveTo(20.5f, 20.8358f, 20.1642f, 20.5f, 19.75f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 20.5f, 5.5f, 20.0523f, 5.5f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 19.5f, 20.5f, 19.1642f, 20.5f, 18.75f)
                verticalLineTo(4.5f)
                curveTo(20.5f, 3.1193f, 19.3807f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(4.5f)
                curveTo(5.5f, 3.9477f, 5.9477f, 3.5f, 6.5f, 3.5f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 3.5f, 19.0f, 3.9477f, 19.0f, 4.5f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _bookClock!!
    }

private var _bookClock: ImageVector? = null
