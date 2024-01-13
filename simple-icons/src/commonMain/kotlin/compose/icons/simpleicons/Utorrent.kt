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

public val SimpleIcons.Utorrent: ImageVector
    get() {
        if (_utorrent != null) {
            return _utorrent!!
        }
        _utorrent = Builder(name = "Utorrent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.684f, 23.94f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, 9.599f, -7.79f)
                curveToRelative(-0.118f, 0.044f, -0.26f, 0.096f, -0.432f, 0.147f)
                curveToRelative(-2.0f, 0.59f, -3.404f, -0.466f, -3.687f, -0.649f)
                curveToRelative(-0.283f, -0.18f, -0.587f, -0.48f, -0.643f, -0.464f)
                curveToRelative(-0.183f, 1.132f, -1.218f, 2.706f, -3.58f, 3.42f)
                curveToRelative(-1.295f, 0.391f, -2.687f, 0.4f, -3.681f, -0.157f)
                lineToRelative(0.328f, 0.822f)
                curveToRelative(0.13f, 0.328f, 0.351f, 0.866f, 0.488f, 1.192f)
                curveToRelative(0.0f, 0.0f, 0.858f, 2.044f, 1.608f, 3.48f)
                moveTo(2.723f, 7.153f)
                lineToRelative(3.54f, -0.66f)
                curveToRelative(0.323f, -0.059f, 0.68f, 0.124f, 0.794f, 0.407f)
                lineToRelative(2.432f, 6.07f)
                curveToRelative(0.332f, 0.633f, 0.399f, 0.773f, 0.615f, 1.043f)
                curveToRelative(0.0f, 0.0f, 1.68f, 2.398f, 4.24f, 1.812f)
                curveToRelative(1.726f, -0.394f, 2.532f, -1.69f, 2.587f, -2.612f)
                curveToRelative(0.057f, -0.296f, -0.032f, -0.669f, -0.185f, -1.016f)
                lineTo(13.832f, 5.61f)
                curveToRelative(-0.117f, -0.266f, 0.022f, -0.527f, 0.306f, -0.581f)
                lineToRelative(2.953f, -0.55f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.706f, 0.376f)
                lineToRelative(3.227f, 6.91f)
                curveToRelative(0.13f, 0.276f, 0.394f, 0.712f, 0.588f, 0.966f)
                curveToRelative(0.0f, 0.0f, 0.671f, 0.964f, 1.747f, 0.78f)
                curveToRelative(0.266f, 0.0f, 0.569f, -0.143f, 0.569f, -0.143f)
                curveToRelative(0.047f, -0.43f, 0.072f, -0.866f, 0.072f, -1.31f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.002f, -12.0f)
                curveTo(5.372f, 0.06f, 0.0f, 5.433f, 0.0f, 12.06f)
                curveToRelative(0.0f, 5.319f, 3.46f, 9.827f, 8.252f, 11.402f)
                arcToRelative(24.768f, 24.768f, 0.0f, false, true, -0.919f, -2.121f)
                lineTo(2.298f, 7.808f)
                curveToRelative(-0.111f, -0.297f, 0.083f, -0.59f, 0.425f, -0.654f)
            }
        }
        .build()
        return _utorrent!!
    }

private var _utorrent: ImageVector? = null
