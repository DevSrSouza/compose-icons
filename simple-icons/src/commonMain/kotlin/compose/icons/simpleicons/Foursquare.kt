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

public val SimpleIcons.Foursquare: ImageVector
    get() {
        if (_foursquare != null) {
            return _foursquare!!
        }
        _foursquare = Builder(name = "Foursquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.376f, 0.0f)
                horizontalLineToRelative(7.338f)
                verticalLineToRelative(1.204f)
                horizontalLineToRelative(-6.12f)
                verticalLineToRelative(3.372f)
                horizontalLineToRelative(5.44f)
                lineTo(9.034f, 5.78f)
                horizontalLineToRelative(-5.44f)
                verticalLineToRelative(4.874f)
                lineTo(2.376f, 10.654f)
                lineTo(2.376f, 0.0f)
                close()
                moveTo(2.168f, 20.16f)
                lineToRelative(1.19f, -0.268f)
                curveToRelative(0.213f, 1.473f, 1.232f, 2.352f, 2.89f, 2.352f)
                curveToRelative(1.487f, 0.0f, 2.664f, -0.694f, 2.664f, -1.828f)
                curveToRelative(0.0f, -0.807f, -0.595f, -1.487f, -2.919f, -2.18f)
                curveToRelative(-2.635f, -0.752f, -3.513f, -1.715f, -3.513f, -3.13f)
                curveToRelative(0.0f, -1.829f, 1.473f, -2.805f, 3.613f, -2.805f)
                curveToRelative(2.393f, 0.0f, 3.456f, 1.218f, 3.825f, 2.89f)
                lineToRelative(-1.19f, 0.269f)
                curveToRelative(-0.299f, -1.374f, -1.233f, -1.955f, -2.679f, -1.955f)
                curveToRelative(-1.36f, 0.0f, -2.323f, 0.51f, -2.323f, 1.487f)
                curveToRelative(0.0f, 0.793f, 0.624f, 1.403f, 2.777f, 2.083f)
                curveToRelative(2.565f, 0.793f, 3.67f, 1.658f, 3.67f, 3.301f)
                curveToRelative(0.0f, 2.04f, -1.715f, 3.103f, -3.896f, 3.103f)
                curveToRelative(-2.281f, -0.003f, -3.84f, -1.193f, -4.11f, -3.318f)
                close()
                moveTo(11.391f, 17.922f)
                curveToRelative(0.0f, -3.159f, 2.068f, -5.624f, 5.242f, -5.624f)
                curveToRelative(3.159f, 0.0f, 5.2f, 2.479f, 5.2f, 5.624f)
                curveToRelative(0.0f, 1.573f, -0.525f, 2.933f, -1.404f, 3.925f)
                arcToRelative(36.155f, 36.155f, 0.0f, false, true, 1.247f, 1.303f)
                lineToRelative(-0.879f, 0.85f)
                arcToRelative(57.16f, 57.16f, 0.0f, false, false, -1.303f, -1.346f)
                curveToRelative(-0.807f, 0.524f, -1.771f, 0.822f, -2.861f, 0.822f)
                curveToRelative(-3.061f, 0.0f, -5.242f, -2.352f, -5.242f, -5.554f)
                close()
                moveTo(18.572f, 21.747f)
                arcToRelative(31.241f, 31.241f, 0.0f, false, false, -1.247f, -1.148f)
                lineToRelative(0.85f, -0.863f)
                arcToRelative(36.537f, 36.537f, 0.0f, false, true, 1.331f, 1.218f)
                curveToRelative(0.638f, -0.764f, 1.02f, -1.813f, 1.02f, -3.046f)
                curveToRelative(0.0f, -2.493f, -1.516f, -4.39f, -3.896f, -4.39f)
                reflectiveCurveToRelative(-3.91f, 1.897f, -3.91f, 4.39f)
                curveToRelative(0.0f, 2.565f, 1.658f, 4.363f, 3.91f, 4.363f)
                curveToRelative(0.725f, 0.0f, 1.375f, -0.184f, 1.942f, -0.524f)
                close()
            }
        }
        .build()
        return _foursquare!!
    }

private var _foursquare: ImageVector? = null
