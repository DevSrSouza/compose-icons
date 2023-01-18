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

public val RegularGroup.PulseSquare: ImageVector
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
                moveTo(18.7488f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 4.5f, 4.5f, 4.8358f, 4.5f, 5.25f)
                verticalLineTo(18.7523f)
                curveTo(4.5f, 19.1665f, 4.8358f, 19.5023f, 5.25f, 19.5023f)
                horizontalLineTo(18.7488f)
                curveTo(19.163f, 19.5023f, 19.4988f, 19.1665f, 19.4988f, 18.7523f)
                verticalLineTo(5.25f)
                curveTo(19.4988f, 4.8358f, 19.163f, 4.5f, 18.7488f, 4.5f)
                close()
                moveTo(8.2551f, 11.5004f)
                lineTo(9.8118f, 7.9493f)
                curveTo(10.0631f, 7.376f, 10.8475f, 7.3547f, 11.1451f, 7.8689f)
                lineTo(11.1949f, 7.9716f)
                lineTo(13.5762f, 13.9183f)
                lineTo(14.5794f, 11.9146f)
                curveTo(14.6907f, 11.6925f, 14.9033f, 11.542f, 15.145f, 11.5078f)
                lineTo(15.2501f, 11.5004f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 11.5004f, 18.0f, 11.8362f, 18.0f, 12.2504f)
                curveTo(18.0f, 12.6301f, 17.7178f, 12.9439f, 17.3518f, 12.9936f)
                lineTo(17.25f, 13.0004f)
                horizontalLineTo(15.7133f)
                lineTo(14.1706f, 16.0814f)
                curveTo(13.8981f, 16.6257f, 13.1407f, 16.6269f, 12.8521f, 16.1245f)
                lineTo(12.8037f, 16.0244f)
                lineTo(10.4674f, 10.1899f)
                lineTo(9.4321f, 12.5516f)
                curveTo(9.3275f, 12.7902f, 9.108f, 12.9549f, 8.8553f, 12.9923f)
                lineTo(8.7452f, 13.0004f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 13.0004f, 6.0f, 12.6647f, 6.0f, 12.2504f)
                curveTo(6.0f, 11.8707f, 6.2821f, 11.5569f, 6.6482f, 11.5073f)
                lineTo(6.75f, 11.5004f)
                horizontalLineTo(8.2551f)
                lineTo(9.8118f, 7.9493f)
                lineTo(8.2551f, 11.5004f)
                close()
            }
        }
        .build()
        return _pulseSquare!!
    }

private var _pulseSquare: ImageVector? = null
