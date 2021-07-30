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

public val SimpleIcons.Ana: ImageVector
    get() {
        if (_ana != null) {
            return _ana!!
        }
        _ana = Builder(name = "Ana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.11f, 8.975f)
                lineToRelative(-3.454f, 6.05f)
                horizontalLineToRelative(3.432f)
                lineToRelative(3.455f, -6.05f)
                close()
                moveTo(23.043f, 8.975f)
                lineToRelative(-3.455f, 6.05f)
                horizontalLineToRelative(0.959f)
                lineTo(24.0f, 8.975f)
                close()
                moveTo(13.033f, 9.756f)
                lineTo(14.8f, 9.756f)
                lineToRelative(0.403f, 5.27f)
                horizontalLineToRelative(-1.31f)
                lineToRelative(-0.025f, -0.58f)
                arcToRelative(0.206f, 0.206f, 0.0f, false, false, -0.202f, -0.227f)
                horizontalLineToRelative(-1.867f)
                lineToRelative(0.429f, -0.757f)
                horizontalLineToRelative(1.21f)
                curveToRelative(0.151f, 0.0f, 0.328f, 0.026f, 0.328f, -0.202f)
                lineToRelative(-0.202f, -2.37f)
                curveToRelative(0.0f, -0.15f, -0.126f, -0.226f, -0.227f, -0.075f)
                lineTo(11.193f, 15.0f)
                horizontalLineToRelative(-0.882f)
                close()
                moveTo(3.05f, 9.756f)
                horizontalLineToRelative(1.74f)
                lineToRelative(0.353f, 5.27f)
                horizontalLineToRelative(-1.31f)
                lineToRelative(-0.026f, -0.58f)
                arcToRelative(0.226f, 0.226f, 0.0f, false, false, -0.227f, -0.227f)
                lineTo(1.563f, 14.219f)
                lineToRelative(0.429f, -0.757f)
                horizontalLineToRelative(1.386f)
                curveToRelative(0.151f, 0.0f, 0.328f, 0.026f, 0.328f, -0.202f)
                lineToRelative(-0.151f, -2.37f)
                curveToRelative(0.0f, -0.15f, -0.126f, -0.226f, -0.227f, -0.075f)
                lineTo(0.882f, 15.0f)
                lineTo(0.0f, 15.0f)
                close()
                moveTo(6.328f, 9.756f)
                horizontalLineToRelative(1.79f)
                lineToRelative(1.16f, 4.084f)
                curveToRelative(0.05f, 0.126f, 0.15f, 0.101f, 0.176f, 0.0f)
                lineToRelative(0.756f, -4.084f)
                horizontalLineToRelative(0.782f)
                lineToRelative(-0.933f, 5.27f)
                lineTo(8.244f, 15.026f)
                lineToRelative(-1.135f, -4.034f)
                curveToRelative(-0.025f, -0.101f, -0.151f, -0.127f, -0.176f, 0.0f)
                lineToRelative(-0.706f, 4.033f)
                horizontalLineToRelative(-0.832f)
                close()
            }
        }
        .build()
        return _ana!!
    }

private var _ana: ImageVector? = null
