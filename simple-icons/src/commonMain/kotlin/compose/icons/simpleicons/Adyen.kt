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

public val SimpleIcons.Adyen: ImageVector
    get() {
        if (_adyen != null) {
            return _adyen!!
        }
        _adyen = Builder(name = "Adyen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.647f, 9.8825f)
                verticalLineToRelative(2.9338f)
                curveToRelative(0.0f, 0.134f, 0.1087f, 0.2427f, 0.2427f, 0.2427f)
                horizontalLineToRelative(0.4632f)
                lineTo(12.3529f, 9.8825f)
                horizontalLineToRelative(1.7647f)
                verticalLineToRelative(5.1503f)
                curveToRelative(0.0f, 0.4692f, -0.3803f, 0.8495f, -0.8495f, 0.8495f)
                lineTo(9.943f, 15.8822f)
                verticalLineToRelative(-1.2351f)
                horizontalLineToRelative(2.4099f)
                verticalLineToRelative(-0.5294f)
                horizontalLineToRelative(-1.6211f)
                curveToRelative(-0.4692f, 0.0f, -0.8495f, -0.3803f, -0.8495f, -0.8495f)
                lineTo(9.8824f, 9.8825f)
                horizontalLineToRelative(1.7647f)
                close()
                moveTo(3.3858f, 9.8825f)
                curveToRelative(0.4692f, 0.0f, 0.8495f, 0.3803f, 0.8495f, 0.8495f)
                verticalLineToRelative(3.3858f)
                lineTo(0.8495f, 14.1178f)
                curveToRelative(-0.4692f, 0.0f, -0.8495f, -0.3803f, -0.8495f, -0.8495f)
                verticalLineToRelative(-0.9481f)
                curveToRelative(0.0f, -0.4692f, 0.3803f, -0.8495f, 0.8495f, -0.8495f)
                horizontalLineToRelative(0.9152f)
                verticalLineToRelative(1.3455f)
                curveToRelative(0.0f, 0.1341f, 0.1087f, 0.2427f, 0.2427f, 0.2427f)
                horizontalLineToRelative(0.4632f)
                lineTo(2.4706f, 11.184f)
                curveToRelative(0.0f, -0.134f, -0.1087f, -0.2427f, -0.2427f, -0.2427f)
                lineToRelative(-2.1672f, -0.0f)
                lineTo(0.0607f, 9.8825f)
                close()
                moveTo(9.1765f, 8.1178f)
                verticalLineToRelative(6.0f)
                lineTo(5.7907f, 14.1178f)
                curveToRelative(-0.4692f, 0.0f, -0.8495f, -0.3803f, -0.8495f, -0.8495f)
                verticalLineToRelative(-2.5363f)
                curveToRelative(0.0f, -0.4692f, 0.3803f, -0.8495f, 0.8495f, -0.8495f)
                horizontalLineToRelative(0.9151f)
                verticalLineToRelative(2.9338f)
                curveToRelative(0.0f, 0.134f, 0.1087f, 0.2427f, 0.2427f, 0.2427f)
                horizontalLineToRelative(0.4632f)
                lineToRelative(0.0f, -4.9412f)
                horizontalLineToRelative(1.7647f)
                close()
                moveTo(18.2093f, 9.8825f)
                arcToRelative(0.8495f, 0.8495f, 0.0f, false, true, 0.8495f, 0.8495f)
                verticalLineToRelative(0.9481f)
                curveToRelative(0.0f, 0.4692f, -0.3803f, 0.8495f, -0.8495f, 0.8495f)
                horizontalLineToRelative(-0.9152f)
                verticalLineToRelative(-1.3455f)
                curveToRelative(0.0f, -0.134f, -0.1087f, -0.2427f, -0.2427f, -0.2427f)
                horizontalLineToRelative(-0.4632f)
                verticalLineToRelative(1.8749f)
                curveToRelative(0.0f, 0.1341f, 0.1087f, 0.2427f, 0.2427f, 0.2427f)
                horizontalLineToRelative(2.1672f)
                verticalLineToRelative(1.0588f)
                horizontalLineToRelative(-3.3251f)
                curveToRelative(-0.4692f, 0.0f, -0.8495f, -0.3803f, -0.8495f, -0.8495f)
                verticalLineToRelative(-3.3858f)
                close()
                moveTo(23.1505f, 9.8825f)
                curveToRelative(0.4692f, 0.0f, 0.8495f, 0.3803f, 0.8495f, 0.8495f)
                verticalLineToRelative(3.3858f)
                horizontalLineToRelative(-1.7647f)
                lineTo(22.2353f, 11.184f)
                curveToRelative(-4.0E-4f, -0.1339f, -0.1088f, -0.2423f, -0.2427f, -0.2427f)
                horizontalLineToRelative(-0.4632f)
                verticalLineToRelative(3.1765f)
                lineTo(19.7647f, 14.1178f)
                lineTo(19.7647f, 9.8825f)
                close()
            }
        }
        .build()
        return _adyen!!
    }

private var _adyen: ImageVector? = null
