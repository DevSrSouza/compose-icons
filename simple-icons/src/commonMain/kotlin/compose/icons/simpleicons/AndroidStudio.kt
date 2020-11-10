package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.AndroidStudio: VectorAsset
    get() {
        if (_androidStudio != null) {
            return _androidStudio!!
        }
        _androidStudio = VectorAssetBuilder(name = "AndroidStudio", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.0697f, 0.0f, 1.254f, 4.8158f, 1.254f, 10.746f)
                curveToRelative(0.0f, 3.29f, 1.4819f, 6.237f, 3.8144f, 8.209f)
                lineToRelative(4.5097f, -7.7987f)
                lineToRelative(-0.3926f, -0.3907f)
                curveToRelative(-0.115f, -0.1151f, -0.173f, -0.2124f, -0.1757f, -0.3027f)
                arcToRelative(0.2386f, 0.2386f, 0.0f, false, true, 0.0f, -0.0293f)
                lineTo(9.0f, 10.4336f)
                lineTo(9.0f, 7.875f)
                curveToRelative(0.0f, -0.6155f, 0.5095f, -1.123f, 1.125f, -1.123f)
                horizontalLineToRelative(0.6348f)
                lineTo(10.7598f, 4.7383f)
                lineTo(13.25f, 4.7383f)
                lineTo(13.25f, 6.752f)
                horizontalLineToRelative(0.625f)
                curveToRelative(0.6253f, 0.0f, 1.125f, 0.5075f, 1.1348f, 1.1328f)
                verticalLineToRelative(2.539f)
                lineTo(15.0f, 10.4238f)
                verticalLineToRelative(0.0098f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.0032f, 0.0868f, -0.0511f, 0.1996f, -0.1738f, 0.3223f)
                lineToRelative(-0.0097f, 0.0097f)
                lineToRelative(-0.3907f, 0.3907f)
                lineToRelative(1.9336f, 3.3417f)
                curveToRelative(0.8695f, -1.016f, 1.3965f, -2.3255f, 1.3965f, -3.752f)
                horizontalLineToRelative(2.004f)
                curveToRelative(0.0f, 2.1788f, -0.9096f, 4.1538f, -2.3556f, 5.5606f)
                lineToRelative(1.5293f, 2.6504f)
                curveToRelative(2.333f, -1.9721f, 3.8145f, -4.9207f, 3.8145f, -8.211f)
                curveTo(22.7559f, 4.806f, 17.94f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(18.9316f, 18.957f)
                arcToRelative(10.7911f, 10.7911f, 0.0f, false, true, -1.6523f, 1.1504f)
                lineToRelative(1.5195f, 2.627f)
                arcToRelative(0.5687f, 0.5687f, 0.0f, false, false, 0.1973f, 0.205f)
                lineTo(20.5f, 23.9649f)
                curveToRelative(0.0586f, 0.0391f, 0.127f, 0.0391f, 0.1855f, 0.0098f)
                curveToRelative(0.0587f, -0.039f, 0.088f, -0.0976f, 0.088f, -0.166f)
                lineToRelative(-0.1563f, -1.8066f)
                curveToRelative(-0.0098f, -0.0977f, -0.039f, -0.1856f, -0.0879f, -0.2735f)
                lineToRelative(-1.5977f, -2.7715f)
                close()
                moveTo(17.2793f, 20.1074f)
                lineToRelative(-1.498f, -2.5898f)
                arcToRelative(7.6932f, 7.6932f, 0.0f, false, true, -3.7715f, 0.9863f)
                arcToRelative(7.6932f, 7.6932f, 0.0f, false, true, -3.7715f, -0.9863f)
                lineToRelative(-1.5f, 2.5976f)
                curveToRelative(1.556f, 0.8767f, 3.3504f, 1.379f, 5.2617f, 1.379f)
                curveToRelative(1.9182f, 0.0f, 3.7195f, -0.5042f, 5.2793f, -1.3868f)
                close()
                moveTo(6.7383f, 20.1152f)
                arcToRelative(10.788f, 10.788f, 0.0f, false, true, -1.67f, -1.1601f)
                lineToRelative(-1.5976f, 2.7636f)
                curveToRelative(-0.0488f, 0.088f, -0.0781f, 0.1758f, -0.0879f, 0.2735f)
                lineToRelative(-0.1367f, 1.8164f)
                curveToRelative(-0.0098f, 0.0684f, 0.0293f, 0.127f, 0.0879f, 0.166f)
                curveToRelative(0.0586f, 0.039f, 0.127f, 0.0293f, 0.1855f, -0.0098f)
                lineToRelative(1.504f, -1.0156f)
                curveToRelative(0.0781f, -0.0586f, 0.1464f, -0.1269f, 0.1952f, -0.205f)
                lineToRelative(1.5196f, -2.629f)
                close()
                moveTo(12.0f, 7.7285f)
                verticalLineToRelative(0.0195f)
                curveToRelative(-0.8288f, 0.0f, -1.4915f, 0.6622f, -1.4941f, 1.5f)
                curveToRelative(0.0026f, 0.8283f, 0.675f, 1.498f, 1.4941f, 1.498f)
                horizontalLineToRelative(0.0098f)
                curveToRelative(0.819f, -0.0097f, 1.4914f, -0.6699f, 1.4941f, -1.498f)
                curveToRelative(-0.0026f, -0.8281f, -0.675f, -1.4902f, -1.4941f, -1.5f)
                lineTo(12.0f, 7.7285f)
                close()
                moveTo(11.0527f, 12.6328f)
                lineToRelative(-1.8183f, 3.1465f)
                arcTo(5.7067f, 5.7067f, 0.0f, false, false, 12.0f, 16.4922f)
                curveToRelative(1.0063f, 0.0f, 1.9547f, -0.2537f, 2.7559f, -0.7031f)
                lineToRelative(-1.8145f, -3.1504f)
                lineToRelative(-0.375f, 0.375f)
                curveToRelative(-0.1465f, 0.1563f, -0.3515f, 0.2343f, -0.5566f, 0.2343f)
                horizontalLineToRelative(-0.0196f)
                curveToRelative(-0.1954f, 0.0f, -0.4003f, -0.078f, -0.5566f, -0.2343f)
                lineToRelative(-0.3809f, -0.3809f)
                close()
            }
        }
        .build()
        return _androidStudio!!
    }

private var _androidStudio: VectorAsset? = null
