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

public val SimpleIcons.Gitbook: ImageVector
    get() {
        if (_gitbook != null) {
            return _gitbook!!
        }
        _gitbook = Builder(name = "Gitbook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.802f, 17.77f)
                arcToRelative(0.703f, 0.703f, 0.0f, true, true, -0.002f, 1.406f)
                arcToRelative(0.703f, 0.703f, 0.0f, false, true, 0.002f, -1.406f)
                moveToRelative(11.024f, -4.347f)
                arcToRelative(0.703f, 0.703f, 0.0f, true, true, 0.001f, -1.406f)
                arcToRelative(0.703f, 0.703f, 0.0f, false, true, -0.001f, 1.406f)
                moveToRelative(0.0f, -2.876f)
                arcToRelative(2.176f, 2.176f, 0.0f, false, false, -2.174f, 2.174f)
                curveToRelative(0.0f, 0.233f, 0.039f, 0.465f, 0.115f, 0.691f)
                lineToRelative(-7.181f, 3.823f)
                arcToRelative(2.165f, 2.165f, 0.0f, false, false, -1.784f, -0.937f)
                curveToRelative(-0.829f, 0.0f, -1.584f, 0.475f, -1.95f, 1.216f)
                lineToRelative(-6.451f, -3.402f)
                curveToRelative(-0.682f, -0.358f, -1.192f, -1.48f, -1.138f, -2.502f)
                curveToRelative(0.028f, -0.533f, 0.212f, -0.947f, 0.493f, -1.107f)
                curveToRelative(0.178f, -0.1f, 0.392f, -0.092f, 0.62f, 0.027f)
                lineToRelative(0.042f, 0.023f)
                curveToRelative(1.71f, 0.9f, 7.304f, 3.847f, 7.54f, 3.956f)
                curveToRelative(0.363f, 0.169f, 0.565f, 0.237f, 1.185f, -0.057f)
                lineToRelative(11.564f, -6.014f)
                curveToRelative(0.17f, -0.064f, 0.368f, -0.227f, 0.368f, -0.474f)
                curveToRelative(0.0f, -0.342f, -0.354f, -0.477f, -0.355f, -0.477f)
                curveToRelative(-0.658f, -0.315f, -1.669f, -0.788f, -2.655f, -1.25f)
                curveToRelative(-2.108f, -0.987f, -4.497f, -2.105f, -5.546f, -2.655f)
                curveToRelative(-0.906f, -0.474f, -1.635f, -0.074f, -1.765f, 0.006f)
                lineToRelative(-0.252f, 0.125f)
                curveTo(7.78f, 6.048f, 1.46f, 9.178f, 1.1f, 9.397f)
                curveTo(0.457f, 9.789f, 0.058f, 10.57f, 0.006f, 11.539f)
                curveToRelative(-0.08f, 1.537f, 0.703f, 3.14f, 1.824f, 3.727f)
                lineToRelative(6.822f, 3.518f)
                arcToRelative(2.175f, 2.175f, 0.0f, false, false, 2.15f, 1.862f)
                arcToRelative(2.177f, 2.177f, 0.0f, false, false, 2.173f, -2.14f)
                lineToRelative(7.514f, -4.073f)
                curveToRelative(0.38f, 0.298f, 0.853f, 0.461f, 1.337f, 0.461f)
                arcTo(2.176f, 2.176f, 0.0f, false, false, 24.0f, 12.72f)
                arcToRelative(2.176f, 2.176f, 0.0f, false, false, -2.174f, -2.174f)
            }
        }
        .build()
        return _gitbook!!
    }

private var _gitbook: ImageVector? = null
