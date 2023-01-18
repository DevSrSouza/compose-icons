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

public val RegularGroup.ShieldAdd: ImageVector
    get() {
        if (_shieldAdd != null) {
            return _shieldAdd!!
        }
        _shieldAdd = Builder(name = "ShieldAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 5.3358f, 3.3358f, 5.0f, 3.75f, 5.0f)
                curveTo(6.4134f, 5.0f, 9.008f, 4.0565f, 11.55f, 2.15f)
                curveTo(11.8167f, 1.95f, 12.1833f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.0565f, 17.5866f, 5.0f, 20.25f, 5.0f)
                curveTo(20.6642f, 5.0f, 21.0f, 5.3358f, 21.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 11.3381f, 20.9865f, 11.6701f, 20.9595f, 11.9961f)
                curveTo(20.5062f, 11.7106f, 20.0152f, 11.4795f, 19.4955f, 11.3121f)
                curveTo(19.4985f, 11.2087f, 19.5f, 11.1047f, 19.5f, 11.0f)
                verticalLineTo(6.4779f)
                curveTo(16.9227f, 6.3259f, 14.4192f, 5.3883f, 12.0f, 3.6778f)
                curveTo(9.5808f, 5.3883f, 7.0774f, 6.3259f, 4.5f, 6.4779f)
                verticalLineTo(11.0f)
                curveTo(4.5f, 15.1488f, 6.8318f, 18.2214f, 11.625f, 20.2846f)
                curveTo(11.8882f, 20.839f, 12.2276f, 21.3503f, 12.6297f, 21.8048f)
                curveTo(12.5126f, 21.8531f, 12.3944f, 21.9007f, 12.2749f, 21.9478f)
                curveTo(12.0982f, 22.0174f, 11.9018f, 22.0174f, 11.7251f, 21.9478f)
                curveTo(5.9576f, 19.6757f, 3.0f, 16.0012f, 3.0f, 11.0f)
                verticalLineTo(5.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(18.0006f, 18.0f)
                lineTo(18.0011f, 20.5035f)
                curveTo(18.0011f, 20.7797f, 17.7773f, 21.0035f, 17.5011f, 21.0035f)
                curveTo(17.225f, 21.0035f, 17.0011f, 20.7797f, 17.0011f, 20.5035f)
                lineTo(17.0006f, 18.0f)
                horizontalLineTo(14.4956f)
                curveTo(14.2197f, 18.0f, 13.9961f, 17.7762f, 13.9961f, 17.5f)
                curveTo(13.9961f, 17.2239f, 14.2197f, 17.0f, 14.4956f, 17.0f)
                horizontalLineTo(17.0005f)
                lineTo(17.0f, 14.4993f)
                curveTo(17.0f, 14.2231f, 17.2239f, 13.9993f, 17.5f, 13.9993f)
                curveTo(17.7761f, 13.9993f, 18.0f, 14.2231f, 18.0f, 14.4993f)
                lineTo(18.0005f, 17.0f)
                horizontalLineTo(20.4966f)
                curveTo(20.7725f, 17.0f, 20.9961f, 17.2239f, 20.9961f, 17.5f)
                curveTo(20.9961f, 17.7762f, 20.7725f, 18.0f, 20.4966f, 18.0f)
                horizontalLineTo(18.0006f)
                close()
            }
        }
        .build()
        return _shieldAdd!!
    }

private var _shieldAdd: ImageVector? = null
