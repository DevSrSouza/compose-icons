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

public val SimpleIcons.Wetransfer: ImageVector
    get() {
        if (_wetransfer != null) {
            return _wetransfer!!
        }
        _wetransfer = Builder(name = "Wetransfer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.855f, 11.891f)
                curveToRelative(0.0f, -3.382f, 2.4f, -5.4f, 5.51f, -5.4f)
                curveTo(22.145f, 6.491f, 24.0f, 7.91f, 24.0f, 9.873f)
                curveToRelative(0.0f, 1.855f, -1.582f, 3.055f, -3.328f, 3.055f)
                curveToRelative(-0.982f, 0.0f, -1.69f, -0.164f, -2.182f, -0.546f)
                curveToRelative(-0.163f, -0.164f, -0.272f, -0.109f, -0.272f, 0.055f)
                curveToRelative(0.0f, 0.709f, 0.272f, 1.254f, 0.709f, 1.745f)
                curveToRelative(0.382f, 0.382f, 1.09f, 0.655f, 1.745f, 0.655f)
                curveToRelative(0.71f, 0.0f, 1.31f, -0.164f, 1.855f, -0.437f)
                curveToRelative(0.545f, -0.272f, 0.982f, -0.163f, 1.254f, 0.273f)
                curveToRelative(0.328f, 0.49f, -0.109f, 1.145f, -0.49f, 1.582f)
                curveToRelative(-0.71f, 0.763f, -2.073f, 1.309f, -3.819f, 1.309f)
                curveToRelative(-3.545f, -0.11f, -5.618f, -2.51f, -5.618f, -5.673f)
                close()
                moveTo(6.601f, 14.128f)
                curveToRelative(0.327f, 0.0f, 0.545f, 0.163f, 0.763f, 0.545f)
                lineToRelative(0.982f, 1.582f)
                curveToRelative(0.382f, 0.6f, 0.709f, 1.036f, 1.418f, 1.036f)
                curveToRelative(0.71f, 0.0f, 1.091f, -0.273f, 1.418f, -1.09f)
                arcToRelative(21.11f, 21.11f, 0.0f, false, false, 1.31f, -3.873f)
                curveToRelative(0.49f, -1.855f, 0.709f, -2.946f, 0.709f, -3.873f)
                reflectiveCurveToRelative(-0.273f, -1.473f, -1.31f, -1.637f)
                curveToRelative(-1.363f, -0.272f, -3.272f, -0.381f, -5.29f, -0.381f)
                curveToRelative(-2.019f, 0.0f, -3.928f, 0.109f, -5.291f, 0.327f)
                curveTo(0.273f, 6.982f, 0.0f, 7.528f, 0.0f, 8.454f)
                curveToRelative(0.0f, 0.928f, 0.219f, 2.019f, 0.655f, 3.874f)
                arcToRelative(28.714f, 28.714f, 0.0f, false, false, 1.31f, 3.872f)
                curveToRelative(0.381f, 0.818f, 0.708f, 1.091f, 1.417f, 1.091f)
                curveToRelative(0.71f, 0.0f, 1.037f, -0.436f, 1.419f, -1.036f)
                lineToRelative(0.981f, -1.582f)
                curveToRelative(0.273f, -0.327f, 0.491f, -0.545f, 0.819f, -0.545f)
                close()
            }
        }
        .build()
        return _wetransfer!!
    }

private var _wetransfer: ImageVector? = null
