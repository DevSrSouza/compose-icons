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

public val RegularGroup.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = Builder(name = "FlipVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.6561f, 2.1194f)
                curveTo(19.8705f, 2.2575f, 20.0001f, 2.495f, 20.0001f, 2.75f)
                verticalLineTo(10.25f)
                curveTo(20.0001f, 10.6642f, 19.6643f, 11.0f, 19.2501f, 11.0f)
                horizontalLineTo(2.7501f)
                curveTo(2.397f, 11.0f, 2.0918f, 10.7538f, 2.0171f, 10.4088f)
                curveTo(1.9423f, 10.0637f, 2.1183f, 9.7133f, 2.4397f, 9.5672f)
                lineTo(18.9397f, 2.0672f)
                curveTo(19.1719f, 1.9617f, 19.4417f, 1.9814f, 19.6561f, 2.1194f)
                close()
                moveTo(6.2125f, 9.5f)
                horizontalLineTo(18.5001f)
                verticalLineTo(3.9148f)
                lineTo(6.2125f, 9.5f)
                close()
                moveTo(20.0f, 21.5f)
                curveTo(20.0f, 21.6712f, 19.9125f, 21.8304f, 19.768f, 21.9222f)
                curveTo(19.6234f, 22.0139f, 19.442f, 22.0253f, 19.2872f, 21.9524f)
                lineTo(2.2871f, 13.9524f)
                curveTo(2.0753f, 13.8527f, 1.961f, 13.6194f, 2.0121f, 13.3909f)
                curveTo(2.0632f, 13.1624f, 2.2659f, 13.0f, 2.5001f, 13.0f)
                horizontalLineTo(19.5f)
                curveTo(19.7762f, 13.0f, 20.0f, 13.2239f, 20.0f, 13.5f)
                verticalLineTo(21.5f)
                close()
            }
        }
        .build()
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
