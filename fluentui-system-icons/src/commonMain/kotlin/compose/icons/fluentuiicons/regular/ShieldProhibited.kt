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

public val RegularGroup.ShieldProhibited: ImageVector
    get() {
        if (_shieldProhibited != null) {
            return _shieldProhibited!!
        }
        _shieldProhibited = Builder(name = "ShieldProhibited", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 5.0f)
                curveTo(3.3358f, 5.0f, 3.0f, 5.3358f, 3.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.0012f, 5.9576f, 19.6757f, 11.7251f, 21.9478f)
                curveTo(11.9018f, 22.0174f, 12.0982f, 22.0174f, 12.2749f, 21.9478f)
                curveTo(12.4188f, 21.8911f, 12.561f, 21.8335f, 12.7014f, 21.7751f)
                curveTo(12.0422f, 21.2996f, 11.4758f, 20.7036f, 11.0343f, 20.0194f)
                curveTo(6.6401f, 17.9615f, 4.5f, 14.9746f, 4.5f, 11.0f)
                verticalLineTo(6.4779f)
                curveTo(7.0774f, 6.3259f, 9.5808f, 5.3883f, 12.0f, 3.6778f)
                curveTo(14.4192f, 5.3883f, 16.9227f, 6.3259f, 19.5f, 6.4779f)
                verticalLineTo(10.7322f)
                curveTo(20.0407f, 11.014f, 20.5368f, 11.3696f, 20.975f, 11.7857f)
                curveTo(20.9917f, 11.5275f, 21.0f, 11.2656f, 21.0f, 11.0f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 5.3358f, 20.6642f, 5.0f, 20.25f, 5.0f)
                curveTo(17.5866f, 5.0f, 14.992f, 4.0565f, 12.45f, 2.15f)
                curveTo(12.1833f, 1.95f, 11.8167f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.0565f, 6.4134f, 5.0f, 3.75f, 5.0f)
                close()
                moveTo(16.5f, 22.0f)
                curveTo(19.5376f, 22.0f, 22.0f, 19.5376f, 22.0f, 16.5f)
                curveTo(22.0f, 13.4624f, 19.5376f, 11.0f, 16.5f, 11.0f)
                curveTo(13.4624f, 11.0f, 11.0f, 13.4624f, 11.0f, 16.5f)
                curveTo(11.0f, 19.5376f, 13.4624f, 22.0f, 16.5f, 22.0f)
                close()
                moveTo(13.1911f, 18.7482f)
                curveTo(12.755f, 18.1075f, 12.5f, 17.3335f, 12.5f, 16.5f)
                curveTo(12.5f, 14.2909f, 14.2909f, 12.5f, 16.5f, 12.5f)
                curveTo(17.3335f, 12.5f, 18.1075f, 12.755f, 18.7482f, 13.1911f)
                lineTo(13.1911f, 18.7482f)
                close()
                moveTo(14.2518f, 19.8089f)
                lineTo(19.8089f, 14.2518f)
                curveTo(20.245f, 14.8925f, 20.5f, 15.6665f, 20.5f, 16.5f)
                curveTo(20.5f, 18.7091f, 18.7091f, 20.5f, 16.5f, 20.5f)
                curveTo(15.6665f, 20.5f, 14.8925f, 20.245f, 14.2518f, 19.8089f)
                close()
            }
        }
        .build()
        return _shieldProhibited!!
    }

private var _shieldProhibited: ImageVector? = null
