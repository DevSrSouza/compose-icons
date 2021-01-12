package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Sololearn: VectorAsset
    get() {
        if (_sololearn != null) {
            return _sololearn!!
        }
        _sololearn = VectorAssetBuilder(name = "Sololearn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.01f, 0.083f)
                curveToRelative(-1.354f, -0.024f, -2.678f, 0.303f, -3.822f, 1.12f)
                curveToRelative(-3.493f, 2.178f, -4.327f, 6.98f, -2.163f, 10.94f)
                curveToRelative(0.442f, -4.8f, 3.936f, -8.762f, 8.56f, -9.603f)
                curveToRelative(2.165f, -0.248f, 3.74f, 0.0f, 3.74f, 0.0f)
                curveTo(17.601f, 1.15f, 15.264f, 0.125f, 13.01f, 0.083f)
                close()
                moveTo(7.764f, 1.006f)
                curveTo(4.418f, 2.095f, 0.924f, 5.163f, 1.367f, 8.628f)
                curveToRelative(0.0f, 3.96f, 3.935f, 7.03f, 7.821f, 8.317f)
                curveToRelative(-3.05f, -3.515f, -5.214f, -7.87f, -3.295f, -12.672f)
                curveToRelative(0.887f, -2.03f, 1.87f, -3.267f, 1.87f, -3.267f)
                close()
                moveTo(17.79f, 3.262f)
                curveToRelative(-2.789f, -0.035f, -6.718f, 1.358f, -8.158f, 4.031f)
                curveToRelative(4.38f, -1.733f, 9.99f, -1.336f, 12.646f, 3.367f)
                curveToRelative(1.133f, 1.93f, 1.575f, 3.464f, 1.575f, 3.464f)
                curveToRelative(0.542f, -3.762f, -0.345f, -8.563f, -3.788f, -10.346f)
                curveToRelative(-0.542f, -0.334f, -1.345f, -0.504f, -2.275f, -0.516f)
                close()
                moveTo(15.293f, 6.897f)
                curveToRelative(3.493f, 3.514f, 5.657f, 9.208f, 2.656f, 13.613f)
                curveToRelative(-1.328f, 1.931f, -2.51f, 3.069f, -2.51f, 3.069f)
                horizontalLineToRelative(0.002f)
                curveToRelative(3.788f, -0.94f, 7.673f, -4.454f, 7.673f, -8.365f)
                curveToRelative(0.0f, -2.623f, -2.704f, -7.327f, -7.82f, -8.317f)
                close()
                moveTo(0.531f, 9.57f)
                curveToRelative(-1.328f, 3.465f, -0.05f, 7.82f, 2.558f, 9.603f)
                curveToRelative(3.493f, 2.624f, 8.267f, 1.336f, 11.76f, -1.733f)
                curveToRelative(-4.773f, 0.892f, -9.989f, 0.0f, -12.644f, -4.306f)
                curveTo(1.024f, 11.104f, 0.53f, 9.57f, 0.53f, 9.57f)
                close()
                moveTo(18.243f, 12.738f)
                curveToRelative(-1.723f, 4.8f, -5.609f, 8.168f, -10.627f, 8.416f)
                curveToRelative(-2.312f, -0.149f, -3.936f, -0.644f, -3.936f, -0.644f)
                curveToRelative(2.41f, 2.97f, 6.789f, 4.208f, 10.282f, 2.872f)
                curveToRelative(2.362f, -0.94f, 4.133f, -3.516f, 4.526f, -6.437f)
                curveToRelative(0.246f, -1.485f, -0.048f, -2.723f, -0.245f, -4.207f)
                close()
            }
        }
        .build()
        return _sololearn!!
    }

private var _sololearn: VectorAsset? = null
