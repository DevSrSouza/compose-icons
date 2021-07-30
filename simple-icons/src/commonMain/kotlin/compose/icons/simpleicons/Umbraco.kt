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

public val SimpleIcons.Umbraco: ImageVector
    get() {
        if (_umbraco != null) {
            return _umbraco!!
        }
        _umbraco = Builder(name = "Umbraco", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.982f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 0.0f, 11.982f)
                close()
                moveTo(11.756f, 16.092f)
                arcToRelative(11.856f, 11.856f, 0.0f, false, true, -2.773f, -0.25f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, true, -1.514f, -1.218f)
                quadToRelative(-0.41f, -0.943f, -0.396f, -2.895f)
                arcToRelative(18.419f, 18.419f, 0.0f, false, true, 0.127f, -2.04f)
                quadToRelative(0.118f, -0.988f, 0.236f, -1.629f)
                lineToRelative(0.082f, -0.425f)
                arcToRelative(0.201f, 0.201f, 0.0f, false, false, 0.0f, -0.038f)
                arcToRelative(0.244f, 0.244f, 0.0f, false, false, -0.201f, -0.236f)
                lineToRelative(-1.544f, -0.246f)
                lineTo(5.74f, 7.115f)
                arcToRelative(0.243f, 0.243f, 0.0f, false, false, -0.235f, 0.189f)
                arcToRelative(6.517f, 6.517f, 0.0f, false, false, -0.089f, 0.409f)
                curveToRelative(-0.088f, 0.455f, -0.17f, 0.9f, -0.26f, 1.548f)
                arcToRelative(19.99f, 19.99f, 0.0f, false, false, -0.176f, 2.12f)
                arcToRelative(11.165f, 11.165f, 0.0f, false, false, 0.0f, 1.486f)
                quadToRelative(0.05f, 1.977f, 0.675f, 3.155f)
                quadToRelative(0.626f, 1.179f, 2.106f, 1.695f)
                quadToRelative(1.482f, 0.517f, 4.135f, 0.506f)
                horizontalLineToRelative(0.22f)
                quadToRelative(2.655f, 0.01f, 4.134f, -0.506f)
                quadToRelative(1.478f, -0.518f, 2.1f, -1.695f)
                quadToRelative(0.623f, -1.178f, 0.678f, -3.147f)
                arcToRelative(11.165f, 11.165f, 0.0f, false, false, 0.0f, -1.485f)
                arcToRelative(19.99f, 19.99f, 0.0f, false, false, -0.176f, -2.121f)
                arcToRelative(30.014f, 30.014f, 0.0f, false, false, -0.26f, -1.548f)
                arcToRelative(6.724f, 6.724f, 0.0f, false, false, -0.088f, -0.41f)
                arcToRelative(0.243f, 0.243f, 0.0f, false, false, -0.236f, -0.188f)
                horizontalLineToRelative(-0.04f)
                lineToRelative(-1.548f, 0.242f)
                arcToRelative(0.236f, 0.236f, 0.0f, false, false, -0.203f, 0.236f)
                arcToRelative(0.201f, 0.201f, 0.0f, false, false, 0.0f, 0.037f)
                lineToRelative(0.081f, 0.426f)
                quadToRelative(0.118f, 0.643f, 0.236f, 1.63f)
                arcToRelative(18.709f, 18.709f, 0.0f, false, true, 0.126f, 2.039f)
                quadToRelative(0.019f, 1.95f, -0.396f, 2.892f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, true, -1.502f, 1.22f)
                arcToRelative(11.82f, 11.82f, 0.0f, false, true, -2.769f, 0.247f)
                close()
            }
        }
        .build()
        return _umbraco!!
    }

private var _umbraco: ImageVector? = null
