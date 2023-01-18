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

public val RegularGroup.LockShield: ImageVector
    get() {
        if (_lockShield != null) {
            return _lockShield!!
        }
        _lockShield = Builder(name = "LockShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(12.2091f, 2.0f, 14.0f, 3.7909f, 14.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.75f)
                curveTo(16.9926f, 8.0f, 18.0f, 9.0074f, 18.0f, 10.25f)
                lineTo(18.0004f, 11.0f)
                curveTo(17.6815f, 11.0f, 17.3626f, 11.1096f, 17.1038f, 11.3286f)
                lineTo(16.9966f, 11.4293f)
                curveTo(16.8328f, 11.5998f, 16.6678f, 11.7519f, 16.5009f, 11.886f)
                lineTo(16.5f, 10.25f)
                curveTo(16.5f, 9.8358f, 16.1642f, 9.5f, 15.75f, 9.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 9.5f, 3.5f, 9.8358f, 3.5f, 10.25f)
                verticalLineTo(19.75f)
                curveTo(3.5f, 20.1642f, 3.8358f, 20.5f, 4.25f, 20.5f)
                lineTo(14.1384f, 20.5008f)
                curveTo(14.546f, 21.0774f, 15.0606f, 21.579f, 15.6783f, 22.0005f)
                lineTo(4.25f, 22.0f)
                curveTo(3.0074f, 22.0f, 2.0f, 20.9926f, 2.0f, 19.75f)
                verticalLineTo(10.25f)
                curveTo(2.0f, 9.0074f, 3.0074f, 8.0f, 4.25f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                curveTo(6.0f, 3.7909f, 7.7909f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(18.2837f, 12.1223f)
                curveTo(19.2758f, 13.1576f, 20.3751f, 13.6667f, 21.6f, 13.6667f)
                curveTo(21.7933f, 13.6667f, 21.9546f, 13.8095f, 21.9919f, 13.9994f)
                lineTo(22.0f, 14.0833f)
                verticalLineTo(16.5844f)
                curveTo(22.0f, 19.2663f, 20.687f, 21.0896f, 18.1265f, 21.9786f)
                curveTo(18.0444f, 22.0071f, 17.9556f, 22.0071f, 17.8735f, 21.9786f)
                curveTo(15.3984f, 21.1192f, 14.0889f, 19.3868f, 14.0044f, 16.8497f)
                lineTo(14.0f, 16.5844f)
                verticalLineTo(14.0833f)
                curveTo(14.0f, 13.8532f, 14.1791f, 13.6667f, 14.4f, 13.6667f)
                curveTo(15.6234f, 13.6667f, 16.7233f, 13.1575f, 17.7178f, 12.122f)
                curveTo(17.8741f, 11.9592f, 18.1276f, 11.9594f, 18.2837f, 12.1223f)
                close()
                moveTo(10.0001f, 13.5f)
                curveTo(10.8286f, 13.5f, 11.5001f, 14.1716f, 11.5001f, 15.0f)
                curveTo(11.5001f, 15.8284f, 10.8286f, 16.5f, 10.0001f, 16.5f)
                curveTo(9.1717f, 16.5f, 8.5001f, 15.8284f, 8.5001f, 15.0f)
                curveTo(8.5001f, 14.1716f, 9.1717f, 13.5f, 10.0001f, 13.5f)
                close()
                moveTo(10.0f, 3.5f)
                curveTo(8.6193f, 3.5f, 7.5f, 4.6193f, 7.5f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.0f)
                curveTo(12.5f, 4.6193f, 11.3807f, 3.5f, 10.0f, 3.5f)
                close()
            }
        }
        .build()
        return _lockShield!!
    }

private var _lockShield: ImageVector? = null
