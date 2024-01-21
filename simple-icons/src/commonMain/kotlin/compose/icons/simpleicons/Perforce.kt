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

public val SimpleIcons.Perforce: ImageVector
    get() {
        if (_perforce != null) {
            return _perforce!!
        }
        _perforce = Builder(name = "Perforce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.741f, 8.755f)
                curveToRelative(0.164f, -0.425f, 0.352f, -0.834f, 0.573f, -1.219f)
                curveToRelative(-0.213f, -0.196f, -0.745f, -0.613f, -0.712f, -0.646f)
                curveToRelative(2.774f, -3.322f, 6.391f, -4.32f, 9.59f, -3.74f)
                curveToRelative(0.655f, 0.09f, 1.31f, 0.246f, 1.956f, 0.483f)
                curveToRelative(4.583f, 1.702f, 6.898f, 6.75f, 5.18f, 11.284f)
                arcToRelative(9.33f, 9.33f, 0.0f, false, true, -0.614f, 1.285f)
                curveToRelative(0.254f, 0.22f, 0.81f, 0.63f, 0.778f, 0.663f)
                curveToRelative(-3.077f, 3.641f, -7.177f, 4.484f, -10.589f, 3.47f)
                arcToRelative(11.18f, 11.18f, 0.0f, false, true, -0.982f, -0.295f)
                curveToRelative(-4.574f, -1.702f, -6.898f, -6.751f, -5.18f, -11.285f)
                close()
                moveTo(19.371f, 0.982f)
                curveToRelative(-0.581f, 0.556f, -1.277f, 1.227f, -1.62f, 1.53f)
                arcToRelative(11.886f, 11.886f, 0.0f, false, false, -1.727f, -0.802f)
                curveTo(10.819f, -0.221f, 5.337f, 1.964f, 2.317f, 6.03f)
                curveTo(0.738f, 8.364f, -0.195f, 11.236f, 0.034f, 14.19f)
                curveToRelative(0.0f, 0.0f, 0.009f, 5.556f, 5.14f, 8.83f)
                curveToRelative(0.417f, -0.574f, 0.948f, -1.31f, 1.3f, -1.785f)
                arcToRelative(12.36f, 12.36f, 0.0f, false, false, 1.817f, 0.86f)
                curveToRelative(5.892f, 2.184f, 12.422f, -0.606f, 14.557f, -6.228f)
                curveToRelative(0.0f, 0.0f, 1.563f, -3.428f, 1.048f, -7.176f)
                curveToRelative(0.0f, 0.0f, -0.401f, -5.057f, -4.525f, -7.708f)
                close()
            }
        }
        .build()
        return _perforce!!
    }

private var _perforce: ImageVector? = null
