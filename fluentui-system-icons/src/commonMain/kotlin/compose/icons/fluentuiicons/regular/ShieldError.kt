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

public val RegularGroup.ShieldError: ImageVector
    get() {
        if (_shieldError != null) {
            return _shieldError!!
        }
        _shieldError = Builder(name = "ShieldError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 5.0f)
                curveTo(17.5866f, 5.0f, 14.992f, 4.0565f, 12.45f, 2.15f)
                curveTo(12.1833f, 1.95f, 11.8167f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.0565f, 6.4134f, 5.0f, 3.75f, 5.0f)
                curveTo(3.3358f, 5.0f, 3.0f, 5.3358f, 3.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.0012f, 5.9576f, 19.6757f, 11.7251f, 21.9478f)
                curveTo(11.9018f, 22.0174f, 12.0982f, 22.0174f, 12.2749f, 21.9478f)
                curveTo(18.0424f, 19.6757f, 21.0f, 16.0012f, 21.0f, 11.0f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 5.3358f, 20.6642f, 5.0f, 20.25f, 5.0f)
                close()
                moveTo(4.5f, 6.4779f)
                curveTo(7.0774f, 6.3259f, 9.5808f, 5.3883f, 12.0f, 3.6778f)
                curveTo(14.4192f, 5.3883f, 16.9227f, 6.3259f, 19.5f, 6.4779f)
                verticalLineTo(11.0f)
                curveTo(19.5f, 15.2556f, 17.0466f, 18.3789f, 12.0f, 20.4419f)
                curveTo(6.9534f, 18.3789f, 4.5f, 15.2556f, 4.5f, 11.0f)
                verticalLineTo(6.4779f)
                close()
                moveTo(12.7432f, 7.6518f)
                curveTo(12.6935f, 7.2857f, 12.3797f, 7.0036f, 12.0f, 7.0036f)
                curveTo(11.5858f, 7.0036f, 11.25f, 7.3394f, 11.25f, 7.7536f)
                verticalLineTo(14.2523f)
                lineTo(11.2568f, 14.3541f)
                curveTo(11.3065f, 14.7201f, 11.6203f, 15.0023f, 12.0f, 15.0023f)
                curveTo(12.4142f, 15.0023f, 12.75f, 14.6665f, 12.75f, 14.2523f)
                verticalLineTo(7.7536f)
                lineTo(12.7432f, 7.6518f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(12.5523f, 18.0f, 13.0f, 17.5523f, 13.0f, 17.0f)
                curveTo(13.0f, 16.4477f, 12.5523f, 16.0f, 12.0f, 16.0f)
                curveTo(11.4477f, 16.0f, 11.0f, 16.4477f, 11.0f, 17.0f)
                curveTo(11.0f, 17.5523f, 11.4477f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _shieldError!!
    }

private var _shieldError: ImageVector? = null
