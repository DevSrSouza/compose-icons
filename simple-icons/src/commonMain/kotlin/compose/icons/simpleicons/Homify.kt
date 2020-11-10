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

public val SimpleIcons.Homify: VectorAsset
    get() {
        if (_homify != null) {
            return _homify!!
        }
        _homify = VectorAssetBuilder(name = "Homify", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 10.562f)
                verticalLineToRelative(0.053f)
                lineToRelative(-0.004f, 0.05f)
                curveToRelative(-0.09f, 2.328f, -0.058f, 11.357f, -0.057f, 11.822f)
                curveToRelative(0.002f, 1.078f, -0.84f, 1.943f, -1.62f, 1.283f)
                lineToRelative(-7.076f, -5.53f)
                curveToRelative(-2.224f, 2.302f, -4.358f, 4.495f, -4.808f, 4.925f)
                curveToRelative(-0.992f, 0.946f, -1.81f, -1.327f, -1.06f, -1.808f)
                curveToRelative(0.068f, -0.042f, 2.254f, -1.95f, 4.674f, -4.05f)
                lineToRelative(-5.24f, -4.095f)
                curveToRelative(-0.454f, -0.355f, -0.628f, -0.945f, -0.368f, -1.26f)
                curveToRelative(0.09f, -0.085f, 0.21f, -0.13f, 0.332f, -0.127f)
                curveToRelative(0.056f, 0.002f, 0.112f, 0.014f, 0.165f, 0.038f)
                curveToRelative(1.62f, 0.72f, 4.015f, 2.492f, 6.4f, 4.327f)
                curveToRelative(2.486f, -2.15f, 4.873f, -4.19f, 5.186f, -4.363f)
                curveToRelative(0.388f, -0.214f, 0.49f, 0.353f, 0.36f, 0.516f)
                curveToRelative(-0.132f, 0.166f, -2.2f, 2.326f, -4.467f, 4.68f)
                curveToRelative(2.233f, 1.73f, 4.352f, 3.386f, 5.69f, 4.135f)
                lineToRelative(0.22f, -10.62f)
                curveToRelative(-0.174f, -0.207f, -5.406f, -7.163f, -5.973f, -7.748f)
                curveToRelative(-0.905f, 0.782f, -5.645f, 6.114f, -5.884f, 6.344f)
                curveToRelative(1.082f, 0.108f, 5.676f, 0.382f, 8.57f, 0.683f)
                curveToRelative(0.73f, 0.07f, 1.216f, 0.606f, -0.35f, 0.592f)
                lineTo(3.93f, 10.392f)
                curveToRelative(-0.176f, -0.006f, -0.333f, -0.11f, -0.398f, -0.267f)
                curveToRelative(-0.066f, -0.157f, -0.028f, -0.336f, 0.096f, -0.456f)
                curveToRelative(0.06f, -0.058f, 8.153f, -8.923f, 8.832f, -9.487f)
                curveToRelative(0.154f, -0.127f, 0.317f, -0.188f, 0.487f, -0.183f)
                curveToRelative(0.23f, 0.008f, 0.416f, 0.144f, 0.492f, 0.227f)
                curveToRelative(0.084f, 0.077f, 4.35f, 5.94f, 6.432f, 8.8f)
                curveToRelative(0.498f, 0.678f, 0.624f, 1.137f, 0.628f, 1.502f)
                verticalLineToRelative(0.032f)
                close()
            }
        }
        .build()
        return _homify!!
    }

private var _homify: VectorAsset? = null
