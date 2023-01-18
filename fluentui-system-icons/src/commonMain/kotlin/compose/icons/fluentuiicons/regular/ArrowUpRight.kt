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

public val RegularGroup.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) {
            return _arrowUpRight!!
        }
        _arrowUpRight = Builder(name = "ArrowUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7507f, 3.0f)
                curveTo(10.3365f, 3.0f, 10.0007f, 3.3358f, 10.0007f, 3.75f)
                curveTo(10.0007f, 4.1642f, 10.3365f, 4.5f, 10.7507f, 4.5f)
                horizontalLineTo(18.4198f)
                lineTo(3.22f, 19.6998f)
                curveTo(2.9214f, 19.9983f, 2.9214f, 20.4824f, 3.22f, 20.781f)
                curveTo(3.5186f, 21.0796f, 4.0027f, 21.0796f, 4.3013f, 20.781f)
                lineTo(19.5007f, 5.5816f)
                verticalLineTo(13.25f)
                curveTo(19.5007f, 13.6642f, 19.8365f, 14.0f, 20.2507f, 14.0f)
                curveTo(20.6649f, 14.0f, 21.0007f, 13.6642f, 21.0007f, 13.25f)
                verticalLineTo(3.75f)
                curveTo(21.0007f, 3.3358f, 20.6649f, 3.0f, 20.2507f, 3.0f)
                horizontalLineTo(10.7507f)
                close()
            }
        }
        .build()
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
