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

public val RegularGroup.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) {
            return _arrowUpLeft!!
        }
        _arrowUpLeft = Builder(name = "ArrowUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2461f, 3.0f)
                curveTo(13.6603f, 3.0f, 13.9961f, 3.3358f, 13.9961f, 3.75f)
                curveTo(13.9961f, 4.1642f, 13.6603f, 4.5f, 13.2461f, 4.5f)
                horizontalLineTo(5.577f)
                lineTo(20.7768f, 19.6998f)
                curveTo(21.0753f, 19.9983f, 21.0753f, 20.4824f, 20.7768f, 20.781f)
                curveTo(20.4782f, 21.0796f, 19.9941f, 21.0796f, 19.6955f, 20.781f)
                lineTo(4.4961f, 5.5816f)
                verticalLineTo(13.25f)
                curveTo(4.4961f, 13.6642f, 4.1603f, 14.0f, 3.7461f, 14.0f)
                curveTo(3.3319f, 14.0f, 2.9961f, 13.6642f, 2.9961f, 13.25f)
                verticalLineTo(3.75f)
                curveTo(2.9961f, 3.3358f, 3.3319f, 3.0f, 3.7461f, 3.0f)
                horizontalLineTo(13.2461f)
                close()
            }
        }
        .build()
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
