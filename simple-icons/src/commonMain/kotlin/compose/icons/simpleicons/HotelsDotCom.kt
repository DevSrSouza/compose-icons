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
                moveTo(20.667f, 1.333f)
                curveToRelative(-1.472f, 0.0f, -2.666f, 1.194f, -2.666f, 2.666f)
                verticalLineToRelative(4.334f)
                lineTo(11.334f, 8.0f)
                lineTo(11.334f, 3.333f)
                curveTo(11.334f, 1.493f, 9.842f, 0.0f, 8.0f, 0.0f)
                curveTo(6.158f, 0.0f, 4.667f, 1.493f, 4.667f, 3.333f)
                verticalLineToRelative(17.335f)
                curveTo(4.667f, 22.509f, 6.158f, 24.0f, 8.0f, 24.0f)
                reflectiveCurveToRelative(3.334f, -1.491f, 3.334f, -3.333f)
                verticalLineToRelative(-5.334f)
                horizontalLineToRelative(6.667f)
                verticalLineToRelative(5.334f)
                curveToRelative(0.0f, 1.473f, 1.194f, 2.666f, 2.666f, 2.666f)
                curveToRelative(1.473f, 0.0f, 2.666f, -1.194f, 2.666f, -2.666f)
                lineTo(23.333f, 3.999f)
                curveToRelative(0.0f, -1.472f, -1.194f, -2.666f, -2.666f, -2.666f)
                moveTo(4.0f, 3.333f)
                curveToRelative(0.0f, -0.538f, 0.108f, -1.051f, 0.302f, -1.521f)
                curveToRelative(-0.975f, 0.581f, -1.635f, 1.635f, -1.635f, 2.854f)
                verticalLineToRelative(15.335f)
                curveToRelative(0.0f, 1.432f, 0.908f, 2.643f, 2.178f, 3.114f)
                curveTo(4.318f, 22.438f, 4.0f, 21.59f, 4.0f, 20.668f)
                close()
                moveTo(2.302f, 3.146f)
                curveTo(1.327f, 3.727f, 0.667f, 4.782f, 0.667f, 5.999f)
                verticalLineToRelative(12.667f)
                curveToRelative(0.0f, 1.218f, 0.66f, 2.272f, 1.635f, 2.854f)
                arcToRelative(3.966f, 3.966f, 0.0f, false, true, -0.302f, -1.521f)
                lineTo(2.0f, 4.666f)
                curveToRelative(0.0f, -0.538f, 0.108f, -1.051f, 0.302f, -1.521f)
                moveToRelative(15.032f, 0.854f)
                curveToRelative(0.0f, -0.698f, 0.217f, -1.344f, 0.584f, -1.88f)
                curveToRelative(-1.105f, 0.326f, -1.918f, 1.336f, -1.918f, 2.547f)
                verticalLineToRelative(2.9f)
                lineToRelative(1.333f, 0.067f)
                close()
                moveTo(17.334f, 16.0f)
                horizontalLineToRelative(-1.333f)
                verticalLineToRelative(4.001f)
                curveToRelative(0.0f, 1.211f, 0.812f, 2.221f, 1.917f, 2.547f)
                curveToRelative(-0.367f, -0.536f, -0.584f, -1.183f, -0.584f, -1.88f)
                close()
                moveTo(14.0f, 19.333f)
                curveToRelative(0.0f, 1.211f, 0.812f, 2.221f, 1.919f, 2.547f)
                curveToRelative(-0.369f, -0.536f, -0.586f, -1.183f, -0.586f, -1.88f)
                verticalLineToRelative(-4.001f)
                horizontalLineToRelative(-1.333f)
                close()
                moveTo(15.334f, 4.666f)
                curveToRelative(0.0f, -0.698f, 0.217f, -1.344f, 0.584f, -1.88f)
                curveToRelative(-1.105f, 0.326f, -1.917f, 1.336f, -1.917f, 2.547f)
                verticalLineToRelative(2.133f)
                lineToRelative(1.333f, 0.067f)
                close()
            }
        }
        .build()
        return _hotelsDotCom!!
    }

private var _hotelsDotCom: ImageVector? = null
