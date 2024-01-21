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

public val SimpleIcons.Xiaomi: ImageVector
    get() {
        if (_xiaomi != null) {
            return _xiaomi!!
        }
        _xiaomi = Builder(name = "Xiaomi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.016f, 0.0f, 4.756f, 0.255f, 2.493f, 2.516f)
                curveTo(0.23f, 4.776f, 0.0f, 8.033f, 0.0f, 12.012f)
                curveToRelative(0.0f, 3.98f, 0.23f, 7.235f, 2.494f, 9.497f)
                curveTo(4.757f, 23.77f, 8.017f, 24.0f, 12.0f, 24.0f)
                curveToRelative(3.983f, 0.0f, 7.243f, -0.23f, 9.506f, -2.491f)
                curveTo(23.77f, 19.247f, 24.0f, 15.99f, 24.0f, 12.012f)
                curveToRelative(0.0f, -3.984f, -0.233f, -7.243f, -2.502f, -9.504f)
                curveTo(19.234f, 0.252f, 15.978f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(4.906f, 7.405f)
                horizontalLineToRelative(5.624f)
                curveToRelative(1.47f, 0.0f, 3.007f, 0.068f, 3.764f, 0.827f)
                curveToRelative(0.746f, 0.746f, 0.827f, 2.233f, 0.83f, 3.676f)
                verticalLineToRelative(4.54f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.152f, 0.147f)
                horizontalLineToRelative(-1.947f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.152f, -0.148f)
                lineTo(12.873f, 11.83f)
                curveToRelative(-0.002f, -0.806f, -0.048f, -1.634f, -0.464f, -2.051f)
                curveToRelative(-0.358f, -0.36f, -1.026f, -0.441f, -1.72f, -0.458f)
                lineTo(7.158f, 9.321f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, false, -0.151f, 0.147f)
                verticalLineToRelative(6.98f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.152f, 0.148f)
                lineTo(4.906f, 16.596f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.15f, -0.148f)
                lineTo(4.756f, 7.554f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.15f, -0.149f)
                close()
                moveTo(17.037f, 7.405f)
                horizontalLineToRelative(1.949f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.15f, 0.15f)
                verticalLineToRelative(8.892f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.15f, 0.148f)
                horizontalLineToRelative(-1.949f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.151f, -0.148f)
                lineTo(16.886f, 7.554f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.151f, -0.149f)
                close()
                moveTo(8.92f, 10.948f)
                horizontalLineToRelative(2.046f)
                curveToRelative(0.083f, 0.0f, 0.15f, 0.066f, 0.15f, 0.147f)
                verticalLineToRelative(5.352f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.15f, 0.148f)
                lineTo(8.92f, 16.595f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.152f, -0.148f)
                verticalLineToRelative(-5.352f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.152f, -0.147f)
                close()
            }
        }
        .build()
        return _xiaomi!!
    }

private var _xiaomi: ImageVector? = null
