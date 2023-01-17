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

public val SimpleIcons.Personio: ImageVector
    get() {
        if (_personio != null) {
            return _personio!!
        }
        _personio = Builder(name = "Personio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.603f, 24.0f)
                lineTo(2.47f, 24.0f)
                verticalLineToRelative(-1.563f)
                horizontalLineToRelative(19.133f)
                close()
                moveTo(15.436f, 19.956f)
                curveToRelative(0.557f, 0.145f, 1.137f, -0.244f, 1.303f, -0.867f)
                curveToRelative(0.166f, -0.624f, -0.157f, -1.25f, -0.713f, -1.39f)
                curveToRelative(-0.556f, -0.142f, -1.137f, 0.24f, -1.304f, 0.865f)
                curveToRelative(-0.167f, 0.624f, 0.156f, 1.25f, 0.714f, 1.39f)
                close()
                moveTo(22.37f, 0.676f)
                curveToRelative(-1.737f, -1.347f, -5.387f, -0.43f, -8.145f, 0.576f)
                arcTo(41.707f, 41.705f, 0.0f, false, false, 5.64f, 5.625f)
                curveTo(3.624f, 6.985f, 1.135f, 8.987f, 0.748f, 10.814f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, 0.28f, 1.263f)
                curveToRelative(0.505f, 0.59f, 1.354f, 0.576f, 1.516f, 0.568f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, 0.51f, -1.368f)
                arcToRelative(0.783f, 0.783f, 0.0f, false, false, -0.58f, -0.193f)
                arcToRelative(0.877f, 0.877f, 0.0f, false, true, -0.181f, -0.016f)
                curveToRelative(0.58f, -2.136f, 6.69f, -6.232f, 12.47f, -8.342f)
                curveToRelative(3.858f, -1.408f, 5.964f, -1.342f, 6.649f, -0.81f)
                curveToRelative(0.284f, 0.22f, 0.433f, 0.487f, 0.23f, 1.062f)
                curveToRelative(-0.545f, 1.535f, -3.2f, 3.96f, -7.108f, 6.48f)
                curveToRelative(-0.725f, 0.467f, -1.434f, 0.898f, -2.11f, 1.29f)
                curveToRelative(0.544f, -1.92f, 1.1f, -3.88f, 1.582f, -5.561f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, false, -1.504f, -0.43f)
                arcToRelative(2070.72f, 2070.634f, 0.0f, false, false, -2.002f, 7.05f)
                curveToRelative(-1.564f, 0.811f, -2.754f, 1.3f, -3.22f, 1.366f)
                arcToRelative(0.783f, 0.783f, 0.0f, false, false, -1.025f, 1.095f)
                curveToRelative(0.134f, 0.226f, 0.4f, 0.476f, 0.929f, 0.476f)
                curveToRelative(0.088f, 0.0f, 0.177f, -0.007f, 0.264f, -0.02f)
                curveToRelative(0.54f, -0.073f, 1.417f, -0.395f, 2.485f, -0.884f)
                curveToRelative(-0.758f, 2.702f, -1.373f, 4.975f, -1.407f, 5.282f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, 0.69f, 0.858f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, false, 0.087f, 0.0f)
                arcToRelative(0.783f, 0.783f, 0.0f, false, false, 0.775f, -0.685f)
                curveToRelative(0.062f, -0.38f, 0.822f, -3.133f, 1.746f, -6.42f)
                arcToRelative(58.241f, 58.239f, 0.0f, false, false, 4.01f, -2.401f)
                curveToRelative(5.435f, -3.587f, 7.007f, -5.917f, 7.362f, -7.241f)
                curveToRelative(0.277f, -1.02f, -0.017f, -1.93f, -0.825f, -2.557f)
                close()
            }
        }
        .build()
        return _personio!!
    }

private var _personio: ImageVector? = null
