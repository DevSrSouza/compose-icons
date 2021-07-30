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

public val SimpleIcons.Qiwi: ImageVector
    get() {
        if (_qiwi != null) {
            return _qiwi!!
        }
        _qiwi = Builder(name = "Qiwi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.064f, 0.0f)
                curveTo(5.17f, 0.0f, 0.391f, 4.778f, 0.391f, 10.673f)
                curveToRelative(0.0f, 5.895f, 4.779f, 10.673f, 10.674f, 10.673f)
                curveToRelative(1.567f, 0.0f, 3.118f, -0.293f, 5.398f, -0.31f)
                curveToRelative(2.033f, 0.0f, 4.267f, 0.714f, 6.718f, 2.886f)
                curveToRelative(0.248f, 0.217f, 0.574f, -0.062f, 0.357f, -0.326f)
                curveToRelative(-2.405f, -3.056f, -4.64f, -3.63f, -6.873f, -4.126f)
                curveToRelative(-2.73f, -0.606f, -4.126f, -2.126f, -5.104f, -3.817f)
                curveToRelative(-0.186f, -0.341f, -0.28f, -0.279f, -0.295f, 0.156f)
                curveToRelative(-0.018f, 0.639f, 0.03f, 1.278f, 0.14f, 1.908f)
                horizontalLineToRelative(-0.326f)
                arcToRelative(7.066f, 7.066f, 0.0f, false, true, -7.06f, -7.06f)
                arcTo(7.065f, 7.065f, 0.0f, false, true, 11.08f, 3.6f)
                arcToRelative(7.064f, 7.064f, 0.0f, false, true, 7.013f, 7.88f)
                curveToRelative(-0.528f, -0.093f, -1.537f, -0.108f, -2.25f, -0.046f)
                curveToRelative(-0.264f, 0.031f, -0.233f, 0.155f, -0.031f, 0.187f)
                curveToRelative(2.327f, 0.434f, 3.925f, 1.877f, 4.297f, 4.499f)
                curveToRelative(0.015f, 0.062f, 0.093f, 0.077f, 0.124f, 0.03f)
                arcToRelative(10.739f, 10.739f, 0.0f, false, false, 1.505f, -5.476f)
                curveTo(21.738f, 4.778f, 16.96f, 0.0f, 11.064f, 0.0f)
                close()
                moveTo(18.708f, 15.077f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, false, -0.306f, 0.157f)
                curveToRelative(-0.124f, 0.218f, -0.03f, 0.636f, 0.202f, 1.009f)
                curveToRelative(0.232f, 0.372f, 0.45f, 0.558f, 0.606f, 0.558f)
                curveToRelative(0.155f, 0.0f, 0.294f, -0.186f, 0.232f, -0.667f)
                curveToRelative(-0.03f, -0.264f, -0.186f, -0.868f, -0.59f, -1.024f)
                curveToRelative(-0.047f, -0.021f, -0.101f, -0.023f, -0.144f, -0.033f)
                close()
                moveTo(16.494f, 16.864f)
                curveToRelative(-0.217f, 0.0f, -0.388f, 0.076f, -0.497f, 0.216f)
                curveToRelative(-0.279f, 0.341f, -0.155f, 0.962f, 0.28f, 1.335f)
                curveToRelative(0.186f, 0.17f, 0.466f, 0.263f, 0.73f, 0.263f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, false, 0.635f, -0.278f)
                curveToRelative(0.249f, -0.342f, 0.11f, -0.808f, -0.372f, -1.211f)
                curveToRelative(-0.248f, -0.217f, -0.527f, -0.325f, -0.776f, -0.325f)
                close()
            }
        }
        .build()
        return _qiwi!!
    }

private var _qiwi: ImageVector? = null
