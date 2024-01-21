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

public val SimpleIcons.Astro: ImageVector
    get() {
        if (_astro != null) {
            return _astro!!
        }
        _astro = Builder(name = "Astro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.358f, 20.162f)
                curveToRelative(-1.186f, -1.07f, -1.532f, -3.316f, -1.038f, -4.944f)
                curveToRelative(0.856f, 1.026f, 2.043f, 1.352f, 3.272f, 1.535f)
                curveToRelative(1.897f, 0.283f, 3.76f, 0.177f, 5.522f, -0.678f)
                curveToRelative(0.202f, -0.098f, 0.388f, -0.229f, 0.608f, -0.36f)
                curveToRelative(0.166f, 0.473f, 0.209f, 0.95f, 0.151f, 1.437f)
                curveToRelative(-0.14f, 1.185f, -0.738f, 2.1f, -1.688f, 2.794f)
                curveToRelative(-0.38f, 0.277f, -0.782f, 0.525f, -1.175f, 0.787f)
                curveToRelative(-1.205f, 0.804f, -1.531f, 1.747f, -1.078f, 3.119f)
                lineToRelative(0.044f, 0.148f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, true, -1.407f, -1.188f)
                arcToRelative(3.31f, 3.31f, 0.0f, false, true, -0.544f, -1.815f)
                curveToRelative(-0.004f, -0.32f, -0.004f, -0.642f, -0.048f, -0.958f)
                curveToRelative(-0.106f, -0.769f, -0.472f, -1.113f, -1.161f, -1.133f)
                curveToRelative(-0.707f, -0.02f, -1.267f, 0.411f, -1.415f, 1.09f)
                curveToRelative(-0.012f, 0.053f, -0.028f, 0.104f, -0.045f, 0.165f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(2.397f, 15.717f)
                reflectiveCurveToRelative(3.24f, -1.575f, 6.49f, -1.575f)
                lineToRelative(2.451f, -7.565f)
                curveToRelative(0.092f, -0.366f, 0.36f, -0.614f, 0.662f, -0.614f)
                curveToRelative(0.302f, 0.0f, 0.57f, 0.248f, 0.662f, 0.614f)
                lineToRelative(2.45f, 7.565f)
                curveToRelative(3.85f, 0.0f, 6.491f, 1.575f, 6.491f, 1.575f)
                lineTo(16.088f, 0.727f)
                curveTo(15.93f, 0.285f, 15.663f, 0.0f, 15.303f, 0.0f)
                lineTo(8.697f, 0.0f)
                curveToRelative(-0.36f, 0.0f, -0.615f, 0.285f, -0.784f, 0.727f)
                lineToRelative(-5.516f, 14.99f)
                close()
            }
        }
        .build()
        return _astro!!
    }

private var _astro: ImageVector? = null
