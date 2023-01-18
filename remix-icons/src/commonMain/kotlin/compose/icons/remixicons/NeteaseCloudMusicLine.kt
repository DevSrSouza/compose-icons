package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.NeteaseCloudMusicLine: ImageVector
    get() {
        if (_neteaseCloudMusicLine != null) {
            return _neteaseCloudMusicLine!!
        }
        _neteaseCloudMusicLine = Builder(name = "NeteaseCloudMusicLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.421f, 11.375f)
                curveToRelative(-0.294f, 1.028f, 0.012f, 2.064f, 0.784f, 2.653f)
                curveToRelative(1.061f, 0.81f, 2.565f, 0.3f, 2.874f, -0.995f)
                curveToRelative(0.08f, -0.337f, 0.103f, -0.722f, 0.027f, -1.056f)
                curveToRelative(-0.23f, -1.001f, -0.52f, -1.988f, -0.792f, -2.996f)
                curveToRelative(-1.33f, 0.154f, -2.543f, 1.172f, -2.893f, 2.394f)
                close()
                moveTo(15.969f, 11.088f)
                curveToRelative(0.273f, 1.012f, 0.285f, 2.017f, -0.127f, 3.0f)
                curveToRelative(-1.128f, 2.69f, -4.721f, 3.14f, -6.573f, 0.826f)
                curveToRelative(-1.302f, -1.627f, -1.28f, -3.961f, 0.06f, -5.734f)
                curveToRelative(0.78f, -1.032f, 1.804f, -1.707f, 3.048f, -2.054f)
                lineToRelative(0.379f, -0.104f)
                curveToRelative(-0.084f, -0.415f, -0.188f, -0.816f, -0.243f, -1.224f)
                curveToRelative(-0.176f, -1.317f, 0.512f, -2.503f, 1.744f, -3.04f)
                curveToRelative(1.226f, -0.535f, 2.708f, -0.216f, 3.53f, 0.76f)
                curveToRelative(0.406f, 0.479f, 0.395f, 1.08f, -0.025f, 1.464f)
                curveToRelative(-0.412f, 0.377f, -0.996f, 0.346f, -1.435f, -0.09f)
                curveToRelative(-0.247f, -0.246f, -0.51f, -0.44f, -0.877f, -0.436f)
                curveToRelative(-0.525f, 0.006f, -0.987f, 0.418f, -0.945f, 0.937f)
                curveToRelative(0.037f, 0.468f, 0.173f, 0.93f, 0.3f, 1.386f)
                curveToRelative(0.022f, 0.078f, 0.216f, 0.135f, 0.338f, 0.153f)
                curveToRelative(1.334f, 0.197f, 2.504f, 0.731f, 3.472f, 1.676f)
                curveToRelative(2.558f, 2.493f, 2.861f, 6.531f, 0.672f, 9.44f)
                curveToRelative(-1.529f, 2.032f, -3.61f, 3.168f, -6.127f, 3.409f)
                curveToRelative(-4.621f, 0.44f, -8.664f, -2.53f, -9.7f, -7.058f)
                curveTo(2.515f, 10.255f, 4.84f, 5.831f, 8.795f, 4.25f)
                curveToRelative(0.586f, -0.234f, 1.143f, -0.031f, 1.371f, 0.498f)
                curveToRelative(0.232f, 0.537f, -0.019f, 1.086f, -0.61f, 1.35f)
                curveToRelative(-2.368f, 1.06f, -3.817f, 2.855f, -4.215f, 5.424f)
                curveToRelative(-0.533f, 3.433f, 1.656f, 6.776f, 5.0f, 7.72f)
                curveToRelative(2.723f, 0.77f, 5.658f, -0.166f, 7.308f, -2.33f)
                curveToRelative(1.586f, -2.08f, 1.4f, -5.099f, -0.427f, -6.873f)
                arcToRelative(3.979f, 3.979f, 0.0f, false, false, -1.823f, -1.013f)
                curveToRelative(0.198f, 0.716f, 0.389f, 1.388f, 0.57f, 2.062f)
                close()
            }
        }
        .build()
        return _neteaseCloudMusicLine!!
    }

private var _neteaseCloudMusicLine: ImageVector? = null
