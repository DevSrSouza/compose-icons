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

public val SimpleIcons.Notist: ImageVector
    get() {
        if (_notist != null) {
            return _notist!!
        }
        _notist = Builder(name = "Notist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.933f, 3.801f)
                curveToRelative(-1.099f, 0.11f, -2.288f, 0.4f, -3.038f, 0.74f)
                curveToRelative(-1.069f, 0.499f, -1.259f, 0.869f, -0.909f, 1.868f)
                curveToRelative(0.36f, 1.04f, 0.19f, 2.308f, -1.0f, 7.505f)
                curveToRelative(-0.878f, 3.876f, -1.027f, 4.686f, -0.977f, 5.406f)
                curveToRelative(0.04f, 0.47f, 0.09f, 0.63f, 0.29f, 0.79f)
                curveToRelative(0.22f, 0.179f, 0.33f, 0.189f, 1.688f, 0.129f)
                curveToRelative(3.408f, -0.17f, 4.057f, -0.22f, 4.267f, -0.34f)
                curveToRelative(0.24f, -0.13f, 0.25f, -0.2f, 0.44f, -1.758f)
                curveToRelative(0.32f, -2.868f, 1.788f, -7.155f, 3.027f, -8.894f)
                curveToRelative(1.06f, -1.479f, 2.359f, -2.128f, 3.098f, -1.549f)
                curveToRelative(0.78f, 0.62f, 0.76f, 1.559f, -0.13f, 4.147f)
                curveToRelative(-0.68f, 1.999f, -0.79f, 2.428f, -0.909f, 3.617f)
                curveToRelative(-0.15f, 1.46f, 0.13f, 2.489f, 0.96f, 3.408f)
                curveToRelative(0.849f, 0.94f, 2.118f, 1.409f, 3.846f, 1.409f)
                curveToRelative(1.64f, 0.0f, 2.968f, -0.41f, 4.377f, -1.339f)
                curveToRelative(1.29f, -0.86f, 2.828f, -2.608f, 3.008f, -3.428f)
                curveToRelative(0.1f, -0.41f, -0.07f, -0.859f, -0.35f, -0.969f)
                curveToRelative(-0.41f, -0.15f, -0.65f, -0.04f, -1.389f, 0.63f)
                curveToRelative(-0.859f, 0.78f, -1.249f, 0.949f, -2.008f, 0.889f)
                curveToRelative(-1.01f, -0.08f, -1.45f, -0.66f, -1.45f, -1.919f)
                curveToRelative(0.0f, -0.899f, 0.09f, -1.349f, 0.65f, -3.317f)
                curveToRelative(0.79f, -2.728f, 0.93f, -3.967f, 0.58f, -5.027f)
                curveToRelative(-0.57f, -1.768f, -2.978f, -2.538f, -5.646f, -1.798f)
                curveToRelative(-1.449f, 0.41f, -3.238f, 1.449f, -4.597f, 2.688f)
                curveToRelative(-0.38f, 0.34f, -0.68f, 0.59f, -0.68f, 0.56f)
                curveToRelative(0.0f, -0.02f, 0.07f, -0.35f, 0.16f, -0.72f)
                curveToRelative(0.34f, -1.499f, 0.2f, -2.248f, -0.479f, -2.598f)
                curveToRelative(-0.39f, -0.2f, -1.599f, -0.26f, -2.828f, -0.13f)
                close()
            }
        }
        .build()
        return _notist!!
    }

private var _notist: ImageVector? = null
