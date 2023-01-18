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

public val RegularGroup.WindowShield: ImageVector
    get() {
        if (_windowShield != null) {
            return _windowShield!!
        }
        _windowShield = Builder(name = "WindowShield", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9356f, 3.0051f)
                lineTo(17.7512f, 3.0f)
                horizontalLineTo(6.25f)
                lineTo(6.0656f, 3.0051f)
                curveTo(4.3565f, 3.1007f, 3.0f, 4.517f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                lineTo(3.0051f, 17.9344f)
                curveTo(3.1007f, 19.6435f, 4.517f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(14.535f)
                curveTo(14.4338f, 20.8859f, 14.3371f, 20.7678f, 14.2449f, 20.6457f)
                curveTo(13.9758f, 20.2891f, 13.752f, 19.9064f, 13.5719f, 19.5f)
                horizontalLineTo(6.25f)
                lineTo(6.1065f, 19.4942f)
                curveTo(5.2071f, 19.4212f, 4.5f, 18.6682f, 4.5f, 17.75f)
                lineTo(4.5012f, 8.0f)
                horizontalLineTo(19.5f)
                lineTo(19.5005f, 11.8864f)
                curveTo(19.9904f, 12.2806f, 20.4877f, 12.5125f, 21.0012f, 12.6108f)
                verticalLineTo(6.25f)
                lineTo(20.9961f, 6.0656f)
                curveTo(20.9039f, 4.4175f, 19.5837f, 3.0973f, 17.9356f, 3.0051f)
                close()
                moveTo(6.251f, 4.5f)
                horizontalLineTo(17.751f)
                curveTo(18.7175f, 4.5f, 19.501f, 5.2835f, 19.501f, 6.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(4.501f)
                verticalLineTo(6.25f)
                curveTo(4.501f, 5.2835f, 5.2845f, 4.5f, 6.251f, 4.5f)
                close()
                moveTo(21.0012f, 13.6245f)
                curveTo(20.4776f, 13.5496f, 19.9779f, 13.3745f, 19.5006f, 13.0977f)
                curveTo(19.078f, 12.8527f, 18.6729f, 12.5279f, 18.2843f, 12.1223f)
                curveTo(18.1282f, 11.9594f, 17.8748f, 11.9592f, 17.7184f, 12.122f)
                curveTo(16.7239f, 13.1575f, 15.624f, 13.6667f, 14.4006f, 13.6667f)
                curveTo(14.1797f, 13.6667f, 14.0006f, 13.8532f, 14.0006f, 14.0833f)
                verticalLineTo(16.5844f)
                lineTo(14.005f, 16.8497f)
                curveTo(14.0387f, 17.8629f, 14.2679f, 18.7478f, 14.6886f, 19.5f)
                curveTo(15.0126f, 20.0794f, 15.4504f, 20.5801f, 16.0001f, 21.0f)
                curveTo(16.5237f, 21.4f, 17.1489f, 21.7268f, 17.8741f, 21.9786f)
                curveTo(17.9562f, 22.0071f, 18.045f, 22.0071f, 18.1271f, 21.9786f)
                curveTo(20.6876f, 21.0896f, 22.0006f, 19.2663f, 22.0006f, 16.5844f)
                verticalLineTo(14.0833f)
                lineTo(21.9925f, 13.9994f)
                curveTo(21.9552f, 13.8095f, 21.7939f, 13.6667f, 21.6006f, 13.6667f)
                curveTo(21.3974f, 13.6667f, 21.1976f, 13.6527f, 21.0012f, 13.6245f)
                close()
            }
        }
        .build()
        return _windowShield!!
    }

private var _windowShield: ImageVector? = null
