package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.HotelsDotCom: ImageVector
    get() {
        if (_hotelsDotCom != null) {
            return _hotelsDotCom!!
        }
        _hotelsDotCom = Builder(name = "HotelsDotCom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6672f, 1.3329f)
                curveToRelative(-1.4725f, 0.0f, -2.6661f, 1.1936f, -2.6661f, 2.6662f)
                verticalLineToRelative(4.334f)
                lineTo(11.334f, 8.0f)
                lineTo(11.334f, 3.3326f)
                curveTo(11.3342f, 1.4927f, 9.8415f, 0.0f, 8.0f, 0.0f)
                curveTo(6.1584f, 0.0f, 4.6672f, 1.4928f, 4.6672f, 3.3327f)
                verticalLineToRelative(17.3346f)
                curveTo(4.6672f, 22.5088f, 6.1584f, 24.0f, 8.0f, 24.0f)
                reflectiveCurveToRelative(3.3343f, -1.4912f, 3.3343f, -3.3327f)
                verticalLineToRelative(-5.3338f)
                horizontalLineToRelative(6.6669f)
                verticalLineToRelative(5.3338f)
                curveToRelative(0.0f, 1.4726f, 1.1936f, 2.6661f, 2.6661f, 2.6661f)
                curveToRelative(1.4726f, 0.0f, 2.6662f, -1.1935f, 2.6662f, -2.666f)
                lineTo(23.3335f, 3.9991f)
                curveToRelative(0.0f, -1.4725f, -1.1936f, -2.6661f, -2.6662f, -2.6661f)
                moveTo(4.0f, 3.333f)
                curveToRelative(0.0f, -0.5379f, 0.1085f, -1.051f, 0.3023f, -1.5206f)
                curveToRelative(-0.975f, 0.5812f, -1.6354f, 1.6353f, -1.6354f, 2.8537f)
                verticalLineToRelative(15.335f)
                curveToRelative(0.0f, 1.4323f, 0.9084f, 2.6429f, 2.1779f, 3.114f)
                curveTo(4.3178f, 22.4379f, 4.0f, 21.59f, 4.0f, 20.6677f)
                close()
                moveTo(2.302f, 3.1456f)
                curveTo(1.327f, 3.7269f, 0.6666f, 4.7825f, 0.6666f, 5.9993f)
                verticalLineToRelative(12.6673f)
                curveToRelative(0.0f, 1.2184f, 0.6604f, 2.2724f, 1.6354f, 2.8537f)
                arcToRelative(3.9658f, 3.9658f, 0.0f, false, true, -0.3023f, -1.5206f)
                lineTo(1.9997f, 4.6662f)
                curveToRelative(0.0f, -0.5379f, 0.1085f, -1.051f, 0.3023f, -1.5206f)
                moveToRelative(15.0318f, 0.854f)
                curveToRelative(0.0f, -0.6976f, 0.217f, -1.344f, 0.5844f, -1.8803f)
                curveToRelative(-1.1052f, 0.3256f, -1.9175f, 1.3362f, -1.9175f, 2.5468f)
                verticalLineToRelative(2.9002f)
                lineToRelative(1.3331f, 0.0668f)
                close()
                moveTo(17.3338f, 16.0f)
                horizontalLineToRelative(-1.333f)
                verticalLineToRelative(4.0008f)
                curveToRelative(0.0f, 1.2106f, 0.8122f, 2.2212f, 1.9174f, 2.5467f)
                curveToRelative(-0.3674f, -0.5363f, -0.5844f, -1.1827f, -0.5844f, -1.8802f)
                close()
                moveTo(14.0004f, 19.3335f)
                curveToRelative(0.0f, 1.2106f, 0.8122f, 2.2212f, 1.919f, 2.5467f)
                curveToRelative(-0.369f, -0.5363f, -0.586f, -1.1827f, -0.586f, -1.8802f)
                verticalLineToRelative(-4.0008f)
                horizontalLineToRelative(-1.333f)
                close()
                moveTo(15.3337f, 4.6664f)
                curveToRelative(0.0f, -0.6976f, 0.217f, -1.344f, 0.5844f, -1.8803f)
                curveToRelative(-1.1052f, 0.3256f, -1.9174f, 1.3362f, -1.9174f, 2.5468f)
                verticalLineToRelative(2.133f)
                lineToRelative(1.333f, 0.0667f)
                close()
            }
        }
        .build()
        return _hotelsDotCom!!
    }

private var _hotelsDotCom: ImageVector? = null
