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

public val SimpleIcons.Digitalocean: ImageVector
    get() {
        if (_digitalocean != null) {
            return _digitalocean!!
        }
        _digitalocean = Builder(name = "Digitalocean", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.04f, 0.0f)
                curveTo(5.408f, -0.02f, 0.005f, 5.37f, 0.005f, 11.992f)
                horizontalLineToRelative(4.638f)
                curveToRelative(0.0f, -4.923f, 4.882f, -8.731f, 10.064f, -6.855f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, true, 4.147f, 4.148f)
                curveToRelative(1.889f, 5.177f, -1.924f, 10.055f, -6.84f, 10.064f)
                verticalLineToRelative(-4.61f)
                lineTo(7.391f, 14.739f)
                verticalLineToRelative(4.623f)
                horizontalLineToRelative(4.61f)
                lineTo(12.001f, 24.0f)
                curveToRelative(7.86f, 0.0f, 13.967f, -7.588f, 11.397f, -15.83f)
                curveToRelative(-1.115f, -3.59f, -3.985f, -6.446f, -7.575f, -7.575f)
                arcTo(12.8f, 12.8f, 0.0f, false, false, 12.039f, 0.0f)
                close()
                moveTo(7.39f, 19.362f)
                lineTo(3.828f, 19.362f)
                verticalLineToRelative(3.564f)
                lineTo(7.39f, 22.926f)
                close()
                moveTo(3.827f, 19.362f)
                verticalLineToRelative(-2.978f)
                lineTo(0.85f, 16.384f)
                verticalLineToRelative(2.978f)
                close()
            }
        }
        .build()
        return _digitalocean!!
    }

private var _digitalocean: ImageVector? = null
