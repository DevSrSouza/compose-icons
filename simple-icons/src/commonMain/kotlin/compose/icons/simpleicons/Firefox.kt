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

public val SimpleIcons.Firefox: ImageVector
    get() {
        if (_firefox != null) {
            return _firefox!!
        }
        _firefox = Builder(name = "Firefox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.452f, 3.445f)
                arcToRelative(11.002f, 11.002f, 0.0f, false, false, -2.482f, -1.908f)
                curveTo(16.944f, 0.997f, 15.098f, 0.093f, 12.477f, 0.032f)
                curveToRelative(-0.734f, -0.017f, -1.457f, 0.03f, -2.174f, 0.144f)
                curveToRelative(-0.72f, 0.114f, -1.398f, 0.292f, -2.118f, 0.56f)
                curveToRelative(-1.017f, 0.377f, -1.996f, 0.975f, -2.574f, 1.554f)
                curveToRelative(0.583f, -0.349f, 1.476f, -0.733f, 2.55f, -0.992f)
                arcToRelative(10.083f, 10.083f, 0.0f, false, true, 3.729f, -0.167f)
                curveToRelative(2.341f, 0.34f, 4.178f, 1.381f, 5.48f, 2.625f)
                arcToRelative(8.066f, 8.066f, 0.0f, false, true, 1.298f, 1.587f)
                curveToRelative(1.468f, 2.382f, 1.33f, 5.376f, 0.184f, 7.142f)
                curveToRelative(-0.85f, 1.312f, -2.67f, 2.544f, -4.37f, 2.53f)
                curveToRelative(-0.583f, -0.023f, -1.438f, -0.152f, -2.25f, -0.566f)
                curveToRelative(-2.629f, -1.343f, -3.021f, -4.688f, -1.118f, -6.306f)
                curveToRelative(-0.632f, -0.136f, -1.82f, 0.13f, -2.646f, 1.363f)
                curveToRelative(-0.742f, 1.107f, -0.7f, 2.816f, -0.242f, 4.028f)
                arcToRelative(6.473f, 6.473f, 0.0f, false, true, -0.59f, -1.895f)
                arcToRelative(7.695f, 7.695f, 0.0f, false, true, 0.416f, -3.845f)
                arcTo(8.212f, 8.212f, 0.0f, false, true, 9.45f, 5.399f)
                curveToRelative(0.896f, -1.069f, 1.908f, -1.72f, 2.75f, -2.005f)
                curveToRelative(-0.54f, -0.471f, -1.411f, -0.738f, -2.421f, -0.767f)
                curveTo(8.31f, 2.583f, 6.327f, 3.061f, 4.7f, 4.41f)
                arcToRelative(8.148f, 8.148f, 0.0f, false, false, -1.976f, 2.414f)
                curveToRelative(-0.455f, 0.836f, -0.691f, 1.659f, -0.697f, 1.678f)
                curveToRelative(0.122f, -1.445f, 0.704f, -2.994f, 1.248f, -4.055f)
                curveToRelative(-0.79f, 0.413f, -1.827f, 1.668f, -2.41f, 3.042f)
                curveTo(0.095f, 9.37f, -0.2f, 11.608f, 0.14f, 13.989f)
                curveToRelative(0.966f, 5.668f, 5.9f, 9.982f, 11.843f, 9.982f)
                curveTo(18.62f, 23.971f, 24.0f, 18.591f, 24.0f, 11.956f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.548f, -8.511f)
                close()
            }
        }
        .build()
        return _firefox!!
    }

private var _firefox: ImageVector? = null
