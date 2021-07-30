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

public val SimpleIcons.Lichess: ImageVector
    get() {
        if (_lichess != null) {
            return _lichess!!
        }
        _lichess = Builder(name = "Lichess", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.457f, 6.161f)
                arcToRelative(0.237f, 0.237f, 0.0f, false, false, -0.296f, 0.165f)
                curveToRelative(-0.8f, 2.785f, 2.819f, 5.579f, 5.214f, 7.428f)
                curveToRelative(0.653f, 0.504f, 1.216f, 0.939f, 1.591f, 1.292f)
                curveToRelative(1.745f, 1.642f, 2.564f, 2.851f, 2.733f, 3.178f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, 0.275f, 0.122f)
                curveToRelative(0.047f, -0.013f, 4.726f, -1.3f, 3.934f, -4.574f)
                arcToRelative(0.257f, 0.257f, 0.0f, false, false, -0.023f, -0.06f)
                lineTo(18.204f, 3.407f)
                lineTo(18.93f, 0.295f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, -0.262f, -0.293f)
                curveToRelative(-1.7f, 0.201f, -3.115f, 0.435f, -4.5f, 1.425f)
                curveToRelative(-4.844f, -0.323f, -8.718f, 0.9f, -11.213f, 3.539f)
                curveTo(0.334f, 7.737f, -0.246f, 11.515f, 0.085f, 14.128f)
                curveToRelative(0.763f, 5.655f, 5.191f, 8.631f, 9.081f, 9.532f)
                curveToRelative(0.993f, 0.229f, 1.974f, 0.34f, 2.923f, 0.34f)
                curveToRelative(3.344f, 0.0f, 6.297f, -1.381f, 7.946f, -3.85f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, -0.372f, -0.3f)
                curveToRelative(-3.411f, 3.527f, -9.002f, 4.134f, -13.296f, 1.444f)
                curveToRelative(-4.485f, -2.81f, -6.202f, -8.41f, -3.91f, -12.749f)
                curveTo(4.741f, 4.221f, 8.801f, 2.362f, 13.888f, 3.31f)
                curveToRelative(0.056f, 0.01f, 0.115f, 0.0f, 0.165f, -0.029f)
                lineToRelative(0.335f, -0.197f)
                curveToRelative(0.926f, -0.546f, 1.961f, -1.157f, 2.873f, -1.279f)
                lineToRelative(-0.694f, 1.993f)
                arcToRelative(0.243f, 0.243f, 0.0f, false, false, 0.02f, 0.202f)
                lineToRelative(6.082f, 10.192f)
                curveToRelative(-0.193f, 2.028f, -1.706f, 2.506f, -2.226f, 2.611f)
                curveToRelative(-0.287f, -0.645f, -0.814f, -1.364f, -2.306f, -2.803f)
                curveToRelative(-0.422f, -0.407f, -1.21f, -0.941f, -2.124f, -1.56f)
                curveToRelative(-2.364f, -1.601f, -5.937f, -4.02f, -5.391f, -5.984f)
                arcToRelative(0.239f, 0.239f, 0.0f, false, false, -0.165f, -0.295f)
                close()
            }
        }
        .build()
        return _lichess!!
    }

private var _lichess: ImageVector? = null
