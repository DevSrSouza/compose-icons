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

public val SimpleIcons.Billboard: ImageVector
    get() {
        if (_billboard != null) {
            return _billboard!!
        }
        _billboard = Builder(name = "Billboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6969f, 11.0246f)
                horizontalLineToRelative(1.1241f)
                verticalLineToRelative(3.4186f)
                lineTo(3.6969f, 14.4433f)
                close()
                moveTo(5.0535f, 9.688f)
                horizontalLineToRelative(1.1238f)
                verticalLineToRelative(4.7553f)
                lineTo(5.0535f, 14.4433f)
                close()
                moveTo(6.4099f, 9.688f)
                lineTo(7.5337f, 9.688f)
                verticalLineToRelative(4.7553f)
                lineTo(6.4099f, 14.4433f)
                close()
                moveTo(19.6303f, 11.3772f)
                verticalLineToRelative(-0.3526f)
                horizontalLineToRelative(-1.124f)
                verticalLineToRelative(3.4186f)
                horizontalLineToRelative(1.124f)
                verticalLineToRelative(-1.6293f)
                curveToRelative(0.0f, -0.4192f, 0.219f, -0.6453f, 0.6184f, -0.6453f)
                horizontalLineToRelative(0.133f)
                verticalLineToRelative(-1.1773f)
                curveToRelative(-0.3392f, 0.0133f, -0.5853f, 0.1198f, -0.7514f, 0.3858f)
                close()
                moveTo(4.2588f, 9.5029f)
                curveToRelative(-0.3597f, 0.0f, -0.6517f, 0.2919f, -0.6517f, 0.6518f)
                curveToRelative(0.0f, 0.3599f, 0.292f, 0.6519f, 0.6517f, 0.6519f)
                curveToRelative(0.3601f, 0.0f, 0.6518f, -0.292f, 0.6518f, -0.6519f)
                curveToRelative(0.0f, -0.36f, -0.2918f, -0.6518f, -0.6518f, -0.6518f)
                close()
                moveTo(17.1494f, 11.2849f)
                curveToRelative(-0.158f, -0.1723f, -0.5256f, -0.3146f, -0.8047f, -0.3146f)
                curveToRelative(-0.8489f, 0.0f, -1.4578f, 0.5596f, -1.6069f, 1.3915f)
                curveToRelative(-0.1625f, -0.7981f, -0.8581f, -1.4122f, -1.7063f, -1.4122f)
                curveToRelative(-0.8564f, 0.0f, -1.5575f, 0.6212f, -1.7108f, 1.4343f)
                curveToRelative(-0.1488f, -0.8451f, -0.8135f, -1.4052f, -1.6379f, -1.4052f)
                curveToRelative(-0.3059f, 0.0f, -0.5587f, 0.0666f, -0.7783f, 0.2194f)
                verticalLineToRelative(-1.5097f)
                lineTo(7.7806f, 9.6885f)
                verticalLineToRelative(4.7553f)
                horizontalLineToRelative(1.1041f)
                verticalLineToRelative(-0.3127f)
                curveToRelative(0.266f, 0.2462f, 0.5519f, 0.3592f, 0.9046f, 0.3592f)
                curveToRelative(0.7592f, 0.0f, 1.3984f, -0.5943f, 1.5352f, -1.4136f)
                curveToRelative(0.1611f, 0.8017f, 0.8526f, 1.4111f, 1.7071f, 1.4111f)
                curveToRelative(0.8471f, 0.0f, 1.5265f, -0.5965f, 1.6994f, -1.3776f)
                curveToRelative(0.143f, 0.8532f, 0.819f, 1.3869f, 1.627f, 1.3869f)
                curveToRelative(0.2791f, 0.0f, 0.5853f, -0.0934f, 0.7915f, -0.2462f)
                verticalLineToRelative(0.1928f)
                horizontalLineToRelative(1.1238f)
                verticalLineToRelative(-1.4962f)
                arcToRelative(8.9282f, 8.9282f, 0.0f, false, false, -0.0016f, -0.1796f)
                arcToRelative(8.7632f, 8.7632f, 0.0f, false, false, 0.0016f, -0.1796f)
                verticalLineToRelative(-1.5581f)
                lineTo(17.1494f, 11.0305f)
                close()
                moveTo(9.5631f, 13.4023f)
                curveToRelative(-0.36f, 0.0f, -0.6517f, -0.2919f, -0.6517f, -0.6519f)
                curveToRelative(0.0f, -0.3598f, 0.2918f, -0.6517f, 0.6517f, -0.6517f)
                curveToRelative(0.3598f, 0.0f, 0.6517f, 0.2918f, 0.6517f, 0.6517f)
                curveToRelative(1.0E-4f, 0.36f, -0.2918f, 0.6519f, -0.6517f, 0.6519f)
                close()
                moveTo(13.0315f, 13.3501f)
                curveToRelative(-0.3597f, 0.0f, -0.6518f, -0.2921f, -0.6518f, -0.6519f)
                curveToRelative(0.0f, -0.3598f, 0.2921f, -0.6517f, 0.6518f, -0.6517f)
                curveToRelative(0.3598f, 0.0f, 0.6517f, 0.2919f, 0.6517f, 0.6517f)
                curveToRelative(1.0E-4f, 0.3598f, -0.2917f, 0.6519f, -0.6517f, 0.6519f)
                close()
                moveTo(16.4088f, 13.3707f)
                curveToRelative(-0.36f, 0.0f, -0.6514f, -0.2921f, -0.6514f, -0.6519f)
                curveToRelative(0.0f, -0.3598f, 0.2914f, -0.6517f, 0.6514f, -0.6517f)
                curveToRelative(0.3603f, 0.0f, 0.6517f, 0.2919f, 0.6517f, 0.6517f)
                curveToRelative(1.0E-4f, 0.3598f, -0.2914f, 0.6519f, -0.6517f, 0.6519f)
                close()
                moveTo(22.8757f, 9.6874f)
                verticalLineToRelative(1.5098f)
                curveToRelative(-0.2192f, -0.1529f, -0.4719f, -0.2194f, -0.7782f, -0.2194f)
                curveToRelative(-0.9377f, 0.0f, -1.6692f, 0.7248f, -1.6692f, 1.7691f)
                curveToRelative(0.0f, 0.9842f, 0.7049f, 1.7424f, 1.5631f, 1.7424f)
                curveToRelative(0.3522f, 0.0f, 0.6382f, -0.1132f, 0.9044f, -0.3591f)
                verticalLineToRelative(0.3126f)
                lineTo(24.0f, 14.4428f)
                lineTo(24.0f, 9.6874f)
                close()
                moveTo(22.2138f, 13.3938f)
                curveToRelative(-0.3595f, 0.0f, -0.6514f, -0.2921f, -0.6514f, -0.6517f)
                curveToRelative(0.0f, -0.36f, 0.2919f, -0.652f, 0.6514f, -0.652f)
                curveToRelative(0.36f, 0.0f, 0.6519f, 0.292f, 0.6519f, 0.652f)
                curveToRelative(0.0f, 0.3596f, -0.2919f, 0.6517f, -0.6519f, 0.6517f)
                close()
                moveTo(1.9021f, 10.9788f)
                curveToRelative(-0.306f, 0.0f, -0.5586f, 0.0666f, -0.7783f, 0.2194f)
                lineTo(1.1238f, 9.6885f)
                lineTo(0.0f, 9.6885f)
                verticalLineToRelative(4.7553f)
                horizontalLineToRelative(1.104f)
                verticalLineToRelative(-0.3127f)
                curveToRelative(0.266f, 0.2462f, 0.552f, 0.3592f, 0.9047f, 0.3592f)
                curveToRelative(0.8578f, 0.0f, 1.5628f, -0.7584f, 1.5628f, -1.7426f)
                curveToRelative(0.0f, -1.0439f, -0.7316f, -1.7689f, -1.6693f, -1.7689f)
                close()
                moveTo(1.7825f, 13.4023f)
                curveToRelative(-0.3598f, 0.0f, -0.6517f, -0.2919f, -0.6517f, -0.6519f)
                curveToRelative(0.0f, -0.3598f, 0.2919f, -0.6517f, 0.6517f, -0.6517f)
                curveToRelative(0.36f, 0.0f, 0.6517f, 0.2918f, 0.6517f, 0.6517f)
                curveToRelative(0.0f, 0.36f, -0.2918f, 0.6519f, -0.6517f, 0.6519f)
                close()
            }
        }
        .build()
        return _billboard!!
    }

private var _billboard: ImageVector? = null
