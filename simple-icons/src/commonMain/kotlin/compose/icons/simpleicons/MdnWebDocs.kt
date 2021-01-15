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

public val SimpleIcons.MdnWebDocs: ImageVector
    get() {
        if (_mdnWebDocs != null) {
            return _mdnWebDocs!!
        }
        _mdnWebDocs = Builder(name = "MdnWebDocs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(10.564f, 4.969f)
                curveToRelative(0.667f, -0.047f, 1.001f, 0.066f, 1.59f, 0.242f)
                lineToRelative(0.436f, 0.13f)
                lineToRelative(0.152f, 0.046f)
                lineToRelative(0.557f, 0.17f)
                curveToRelative(0.365f, 0.099f, 0.748f, 0.105f, 1.115f, 0.017f)
                arcToRelative(2.033f, 2.033f, 0.0f, false, true, 1.48f, 0.174f)
                curveToRelative(0.409f, 0.233f, 0.684f, 0.648f, 0.737f, 1.115f)
                curveToRelative(0.048f, 0.413f, 0.288f, 0.78f, 0.648f, 0.989f)
                curveToRelative(0.537f, 0.293f, 1.096f, 0.538f, 1.672f, 0.736f)
                curveToRelative(0.407f, 0.156f, 0.815f, 0.331f, 1.219f, 0.488f)
                curveToRelative(0.2f, 0.077f, 0.377f, 0.203f, 0.514f, 0.37f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, 0.197f, 0.49f)
                curveToRelative(0.025f, 0.359f, 0.068f, 0.722f, 0.086f, 1.084f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(0.028f, 0.5f, -0.08f, 0.997f, -0.317f, 1.439f)
                curveToRelative(-0.087f, 0.165f, -0.183f, 0.321f, -0.263f, 0.486f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.635f, 0.367f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, -0.277f, 0.09f)
                curveToRelative(-0.246f, 0.161f, -0.497f, 0.32f, -0.75f, 0.471f)
                curveToRelative(-0.35f, 0.193f, -0.77f, 0.216f, -1.141f, 0.06f)
                arcToRelative(5.36f, 5.36f, 0.0f, false, false, -1.908f, -0.351f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, -1.7f, 0.775f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, -0.38f, 0.77f)
                curveToRelative(-0.223f, 0.55f, -0.414f, 3.838f, -0.414f, 4.676f)
                curveToRelative(0.0f, 0.0f, -3.161f, -0.615f, -6.13f, -3.653f)
                lineToRelative(0.774f, -2.03f)
                lineTo(5.4f, 14.12f)
                lineToRelative(1.754f, -1.856f)
                lineTo(4.14f, 12.264f)
                lineToRelative(1.752f, -1.858f)
                lineTo(3.029f, 10.406f)
                lineToRelative(3.188f, -3.383f)
                arcToRelative(7.349f, 7.349f, 0.0f, false, true, 3.549f, -1.95f)
                curveToRelative(0.318f, -0.055f, 0.576f, -0.089f, 0.798f, -0.104f)
                close()
            }
        }
        .build()
        return _mdnWebDocs!!
    }

private var _mdnWebDocs: ImageVector? = null
