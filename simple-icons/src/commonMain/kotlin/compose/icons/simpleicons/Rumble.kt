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

public val SimpleIcons.Rumble: ImageVector
    get() {
        if (_rumble != null) {
            return _rumble!!
        }
        _rumble = Builder(name = "Rumble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4528f, 13.5458f)
                curveToRelative(0.8064f, -0.6542f, 0.9297f, -1.8381f, 0.2756f, -2.6445f)
                arcToRelative(1.8802f, 1.8802f, 0.0f, false, false, -0.2756f, -0.2756f)
                arcToRelative(21.2127f, 21.2127f, 0.0f, false, false, -4.3121f, -2.776f)
                curveToRelative(-1.066f, -0.51f, -2.256f, 0.2f, -2.4261f, 1.414f)
                arcToRelative(23.5226f, 23.5226f, 0.0f, false, false, -0.14f, 5.5021f)
                curveToRelative(0.116f, 1.23f, 1.292f, 1.964f, 2.372f, 1.492f)
                arcToRelative(19.6285f, 19.6285f, 0.0f, false, false, 4.5062f, -2.704f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(21.385f, 8.1456f)
                curveToRelative(2.0335f, 2.228f, 2.0396f, 5.637f, 0.014f, 7.8723f)
                arcTo(26.1487f, 26.1487f, 0.0f, false, true, 8.2946f, 23.846f)
                curveToRelative(-2.6848f, 0.6713f, -5.4168f, -0.914f, -6.1662f, -3.5781f)
                curveToRelative(-1.524f, -5.2002f, -1.3f, -11.0803f, 0.17f, -16.3045f)
                curveToRelative(0.772f, -2.744f, 3.3521f, -4.4661f, 6.0102f, -3.832f)
                curveToRelative(4.9242f, 1.174f, 9.5443f, 4.196f, 13.0764f, 8.0121f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _rumble!!
    }

private var _rumble: ImageVector? = null
