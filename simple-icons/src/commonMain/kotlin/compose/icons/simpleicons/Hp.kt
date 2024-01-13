package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hp: ImageVector
    get() {
        if (_hp != null) {
            return _hp!!
        }
        _hp = Builder(name = "Hp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0069f, 24.0f)
                horizontalLineToRelative(-0.3572f)
                lineToRelative(2.459f, -6.7453f)
                horizontalLineToRelative(3.3796f)
                curveToRelative(0.5907f, 0.0f, 1.2364f, -0.4533f, 1.4424f, -1.0166f)
                lineToRelative(2.6652f, -7.3085f)
                curveToRelative(0.4396f, -1.1952f, -0.2473f, -2.1706f, -1.525f, -2.1706f)
                horizontalLineToRelative(-4.6983f)
                lineToRelative(-3.929f, 10.798f)
                lineToRelative(-2.2255f, 6.127f)
                curveTo(3.929f, 22.434f, 0.0f, 17.6806f, 0.0f, 12.007f)
                curveTo(0.0f, 6.498f, 3.7092f, 1.8546f, 8.7647f, 0.4396f)
                lineTo(6.4705f, 6.759f)
                lineTo(2.6514f, 17.2547f)
                horizontalLineToRelative(2.5415f)
                lineTo(8.4488f, 8.339f)
                horizontalLineToRelative(1.9095f)
                lineToRelative(-3.2558f, 8.9158f)
                horizontalLineTo(9.644f)
                lineToRelative(3.0223f, -8.3251f)
                curveToRelative(0.4396f, -1.1952f, -0.2473f, -2.1706f, -1.525f, -2.1706f)
                horizontalLineToRelative(-2.143f)
                lineToRelative(2.459f, -6.7453f)
                curveTo(11.636f, 0.0f, 11.8145f, 0.0f, 11.9931f, 0.0f)
                curveTo(18.6285f, 0.0f, 24.0f, 5.3715f, 24.0f, 12.007f)
                curveToRelative(0.0137f, 6.6216f, -5.3578f, 11.993f, -11.9931f, 11.993f)
                close()
                moveTo(19.2742f, 8.325f)
                horizontalLineToRelative(-1.9096f)
                lineToRelative(-2.6789f, 7.336f)
                horizontalLineToRelative(1.9096f)
                lineToRelative(2.6789f, -7.336f)
                close()
            }
        }
        .build()
        return _hp!!
    }

private var _hp: ImageVector? = null
