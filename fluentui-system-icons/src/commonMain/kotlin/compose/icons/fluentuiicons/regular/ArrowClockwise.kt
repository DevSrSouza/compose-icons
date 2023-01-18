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

public val RegularGroup.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) {
            return _arrowClockwise!!
        }
        _arrowClockwise = Builder(name = "ArrowClockwise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(7.8579f, 4.5f, 4.5f, 7.8579f, 4.5f, 12.0f)
                curveTo(4.5f, 16.1421f, 7.8579f, 19.5f, 12.0f, 19.5f)
                curveTo(16.1421f, 19.5f, 19.5f, 16.1421f, 19.5f, 12.0f)
                curveTo(19.5f, 11.6236f, 19.4723f, 11.2538f, 19.4188f, 10.8923f)
                curveTo(19.3515f, 10.4382f, 19.6839f, 10.0f, 20.1429f, 10.0f)
                curveTo(20.5138f, 10.0f, 20.839f, 10.2562f, 20.8953f, 10.6228f)
                curveTo(20.9642f, 11.0718f, 21.0f, 11.5317f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(14.3051f, 3.0f, 16.4077f, 3.8666f, 18.0f, 5.2917f)
                verticalLineTo(4.25f)
                curveTo(18.0f, 3.8358f, 18.3358f, 3.5f, 18.75f, 3.5f)
                curveTo(19.1642f, 3.5f, 19.5f, 3.8358f, 19.5f, 4.25f)
                verticalLineTo(7.25f)
                curveTo(19.5f, 7.6642f, 19.1642f, 8.0f, 18.75f, 8.0f)
                horizontalLineTo(15.75f)
                curveTo(15.3358f, 8.0f, 15.0f, 7.6642f, 15.0f, 7.25f)
                curveTo(15.0f, 6.8358f, 15.3358f, 6.5f, 15.75f, 6.5f)
                horizontalLineTo(17.0991f)
                curveTo(15.7609f, 5.2588f, 13.9691f, 4.5f, 12.0f, 4.5f)
                close()
            }
        }
        .build()
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
