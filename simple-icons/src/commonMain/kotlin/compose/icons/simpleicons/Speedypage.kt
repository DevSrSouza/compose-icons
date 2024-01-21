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

public val SimpleIcons.Speedypage: ImageVector
    get() {
        if (_speedypage != null) {
            return _speedypage!!
        }
        _speedypage = Builder(name = "Speedypage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.356f, 11.774f)
                arcToRelative(8.66f, 8.66f, 0.0f, false, true, -7.797f, 8.623f)
                curveTo(12.559f, 20.503f, 0.0f, 22.18f, 0.0f, 22.18f)
                lineToRelative(1.383f, -4.978f)
                lineToRelative(10.192f, -1.544f)
                verticalLineToRelative(-0.025f)
                arcToRelative(3.617f, 3.617f, 0.0f, false, false, 3.405f, -3.807f)
                arcToRelative(3.44f, 3.44f, 0.0f, false, false, -0.212f, -1.01f)
                horizontalLineToRelative(5.534f)
                curveToRelative(0.054f, 0.318f, 0.054f, 0.638f, 0.054f, 0.958f)
                close()
                moveTo(3.67f, 12.226f)
                curveToRelative(0.0f, -4.444f, 3.381f, -8.171f, 7.797f, -8.623f)
                curveTo(11.467f, 3.471f, 24.0f, 1.82f, 24.0f, 1.82f)
                lineToRelative(-1.41f, 4.978f)
                lineToRelative(-10.19f, 1.57f)
                verticalLineToRelative(0.025f)
                arcToRelative(3.556f, 3.556f, 0.0f, false, false, -3.353f, 3.781f)
                curveToRelative(0.026f, 0.346f, 0.08f, 0.664f, 0.214f, 0.984f)
                lineTo(3.724f, 13.158f)
                curveToRelative(-0.026f, -0.32f, -0.054f, -0.612f, -0.054f, -0.932f)
                close()
            }
        }
        .build()
        return _speedypage!!
    }

private var _speedypage: ImageVector? = null
