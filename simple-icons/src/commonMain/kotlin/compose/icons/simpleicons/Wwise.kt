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

public val SimpleIcons.Wwise: ImageVector
    get() {
        if (_wwise != null) {
            return _wwise!!
        }
        _wwise = Builder(name = "Wwise", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, 0.7644f, -0.6193f, 1.3846f, -1.3846f, 1.3846f)
                curveToRelative(-0.7645f, 0.0f, -1.3847f, -0.6202f, -1.3847f, -1.3846f)
                curveToRelative(0.0f, -0.765f, 0.6202f, -1.3846f, 1.3847f, -1.3846f)
                curveTo(5.3807f, 10.6154f, 6.0f, 11.2351f, 6.0f, 12.0f)
                moveToRelative(7.8462f, -5.5384f)
                curveToRelative(0.0f, 1.0191f, -0.826f, 1.8461f, -1.8463f, 1.8461f)
                curveToRelative(-1.0188f, 0.0f, -1.8461f, -0.827f, -1.8461f, -1.8461f)
                curveToRelative(0.0f, -1.0197f, 0.8273f, -1.8462f, 1.8461f, -1.8462f)
                curveToRelative(1.0203f, 0.0f, 1.8463f, 0.8265f, 1.8463f, 1.8462f)
                moveTo(1.8462f, 12.0f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, true, -0.9231f, 0.923f)
                curveTo(0.4143f, 12.923f, 0.0f, 12.5096f, 0.0f, 12.0f)
                curveToRelative(0.0f, -0.5102f, 0.4142f, -0.923f, 0.923f, -0.923f)
                curveToRelative(0.51f, 0.0f, 0.923f, 0.4128f, 0.923f, 0.923f)
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 0.5095f, -0.4133f, 0.923f, -0.923f, 0.923f)
                curveToRelative(-0.5089f, 0.0f, -0.9231f, -0.4135f, -0.9231f, -0.923f)
                curveToRelative(0.0f, -0.5102f, 0.4142f, -0.923f, 0.923f, -0.923f)
                curveToRelative(0.5098f, 0.0f, 0.923f, 0.4128f, 0.923f, 0.923f)
                moveToRelative(-3.2306f, 0.0f)
                curveToRelative(0.0f, 0.7644f, -0.6195f, 1.3846f, -1.3847f, 1.3846f)
                curveTo(18.6203f, 13.3846f, 18.0f, 12.7644f, 18.0f, 12.0f)
                curveToRelative(0.0f, -0.765f, 0.6203f, -1.3846f, 1.3846f, -1.3846f)
                curveToRelative(0.7652f, 0.0f, 1.3847f, 0.6197f, 1.3847f, 1.3846f)
                moveToRelative(-8.2252f, 2.8356f)
                curveToRelative(0.0034f, 0.535f, 0.2557f, 1.0139f, 0.6581f, 1.3139f)
                curveToRelative(0.4006f, 0.3332f, 0.6584f, 0.8409f, 0.6584f, 1.4048f)
                curveToRelative(0.0f, 1.0139f, -0.8192f, 1.8303f, -1.8295f, 1.8303f)
                horizontalLineTo(12.0f)
                curveToRelative(-1.0116f, 0.0f, -1.8317f, -0.8164f, -1.8317f, -1.8303f)
                curveToRelative(0.0f, -0.564f, 0.2596f, -1.0716f, 0.6606f, -1.4048f)
                curveToRelative(0.3999f, -0.3f, 0.6615f, -0.7788f, 0.6577f, -1.314f)
                verticalLineToRelative(-0.1283f)
                curveToRelative(-0.004f, -0.5395f, -0.2578f, -1.0183f, -0.6577f, -1.3154f)
                curveToRelative(-0.401f, -0.336f, -0.6606f, -0.8423f, -0.6606f, -1.4077f)
                curveToRelative(0.0f, -1.0125f, 0.8201f, -1.8302f, 1.8317f, -1.8302f)
                horizontalLineToRelative(0.0312f)
                curveToRelative(1.0103f, 0.0f, 1.8295f, 0.8177f, 1.8295f, 1.8302f)
                curveToRelative(0.0f, 0.5654f, -0.2578f, 1.0717f, -0.6584f, 1.4077f)
                arcToRelative(1.6166f, 1.6166f, 0.0f, false, false, -0.658f, 1.3154f)
                verticalLineToRelative(0.1284f)
                moveToRelative(3.6922f, -2.7692f)
                curveToRelative(0.0033f, 0.535f, 0.2557f, 1.0139f, 0.658f, 1.3139f)
                curveToRelative(0.4007f, 0.3332f, 0.6585f, 0.8409f, 0.6585f, 1.4048f)
                curveToRelative(0.0f, 1.0139f, -0.8192f, 1.8302f, -1.8295f, 1.8302f)
                horizontalLineToRelative(-0.031f)
                curveToRelative(-1.0118f, 0.0f, -1.8318f, -0.8163f, -1.8318f, -1.8302f)
                curveToRelative(0.0f, -0.564f, 0.2597f, -1.0716f, 0.6606f, -1.4048f)
                curveToRelative(0.3999f, -0.3f, 0.6614f, -0.7788f, 0.6577f, -1.314f)
                verticalLineToRelative(-0.1283f)
                curveToRelative(-0.004f, -0.5395f, -0.2578f, -1.0183f, -0.6577f, -1.3154f)
                curveToRelative(-0.401f, -0.336f, -0.6606f, -0.8423f, -0.6606f, -1.4077f)
                curveToRelative(0.0f, -1.0125f, 0.82f, -1.8302f, 1.8318f, -1.8302f)
                horizontalLineToRelative(0.031f)
                curveToRelative(1.0103f, 0.0f, 1.8295f, 0.8177f, 1.8295f, 1.8302f)
                curveToRelative(0.0f, 0.5654f, -0.2578f, 1.0717f, -0.6584f, 1.4077f)
                arcToRelative(1.6166f, 1.6166f, 0.0f, false, false, -0.658f, 1.3154f)
                verticalLineToRelative(0.1284f)
                moveToRelative(-7.3848f, 0.0f)
                curveToRelative(0.0035f, 0.535f, 0.2559f, 1.0139f, 0.6582f, 1.3139f)
                arcToRelative(1.828f, 1.828f, 0.0f, false, true, 0.6583f, 1.4048f)
                curveToRelative(0.0f, 1.0139f, -0.8193f, 1.8302f, -1.8294f, 1.8302f)
                horizontalLineToRelative(-0.0312f)
                curveToRelative(-1.0116f, 0.0f, -1.8317f, -0.8163f, -1.8317f, -1.8302f)
                curveToRelative(0.0f, -0.564f, 0.2596f, -1.0716f, 0.6606f, -1.4048f)
                curveToRelative(0.3999f, -0.3f, 0.6615f, -0.7788f, 0.6577f, -1.314f)
                verticalLineToRelative(-0.1283f)
                curveToRelative(-0.004f, -0.5395f, -0.2578f, -1.0183f, -0.6577f, -1.3154f)
                curveToRelative(-0.401f, -0.336f, -0.6606f, -0.8423f, -0.6606f, -1.4077f)
                curveToRelative(0.0f, -1.0125f, 0.8201f, -1.8302f, 1.8317f, -1.8302f)
                horizontalLineToRelative(0.0312f)
                curveToRelative(1.0101f, 0.0f, 1.8294f, 0.8177f, 1.8294f, 1.8302f)
                curveToRelative(0.0f, 0.5654f, -0.2578f, 1.0717f, -0.6583f, 1.4077f)
                arcToRelative(1.617f, 1.617f, 0.0f, false, false, -0.6582f, 1.3154f)
                verticalLineToRelative(0.1284f)
            }
        }
        .build()
        return _wwise!!
    }

private var _wwise: ImageVector? = null
