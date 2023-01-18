package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PulseSquare: ImageVector
    get() {
        if (_pulseSquare != null) {
            return _pulseSquare!!
        }
        _pulseSquare = Builder(name = "PulseSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7488f, 3.0f)
                curveTo(19.9915f, 3.0f, 20.9988f, 4.0074f, 20.9988f, 5.25f)
                verticalLineTo(18.7523f)
                curveTo(20.9988f, 19.9949f, 19.9915f, 21.0023f, 18.7488f, 21.0023f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 21.0023f, 3.0f, 19.9949f, 3.0f, 18.7523f)
                verticalLineTo(5.25f)
                curveTo(3.0f, 4.0074f, 4.0074f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.7488f)
                close()
                moveTo(9.8118f, 7.9493f)
                lineTo(8.2551f, 11.5004f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 11.5004f, 6.0f, 11.8362f, 6.0f, 12.2504f)
                curveTo(6.0f, 12.6647f, 6.3358f, 13.0004f, 6.75f, 13.0004f)
                horizontalLineTo(8.7452f)
                curveTo(9.043f, 13.0004f, 9.3125f, 12.8243f, 9.4321f, 12.5516f)
                lineTo(10.4674f, 10.1899f)
                lineTo(12.8037f, 16.0244f)
                curveTo(13.0442f, 16.6249f, 13.881f, 16.6598f, 14.1706f, 16.0814f)
                lineTo(15.7133f, 13.0004f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 13.0004f, 18.0f, 12.6647f, 18.0f, 12.2504f)
                curveTo(18.0f, 11.8362f, 17.6642f, 11.5004f, 17.25f, 11.5004f)
                horizontalLineTo(15.2501f)
                curveTo(14.9661f, 11.5004f, 14.7066f, 11.6608f, 14.5794f, 11.9146f)
                lineTo(13.5762f, 13.9183f)
                lineTo(11.1949f, 7.9716f)
                curveTo(10.9477f, 7.3542f, 10.0788f, 7.3402f, 9.8118f, 7.9493f)
                close()
            }
        }
        .build()
        return _pulseSquare!!
    }

private var _pulseSquare: ImageVector? = null
