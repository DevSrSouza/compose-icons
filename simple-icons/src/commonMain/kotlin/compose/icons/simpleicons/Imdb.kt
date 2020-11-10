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

public val SimpleIcons.Imdb: VectorAsset
    get() {
        if (_imdb != null) {
            return _imdb!!
        }
        _imdb = VectorAssetBuilder(name = "Imdb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.31f, 9.588f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.077f, -0.048f, -0.227f, -0.07f, -0.42f, -0.07f)
                verticalLineToRelative(4.815f)
                curveToRelative(0.27f, 0.0f, 0.44f, -0.06f, 0.5f, -0.165f)
                curveToRelative(0.062f, -0.104f, 0.095f, -0.405f, 0.095f, -0.885f)
                verticalLineToRelative(-2.866f)
                curveToRelative(0.0f, -0.33f, -0.004f, -0.54f, -0.033f, -0.63f)
                curveToRelative(-0.022f, -0.096f, -0.067f, -0.163f, -0.14f, -0.204f)
                close()
                moveTo(22.416f, 0.0f)
                lineTo(1.62f, 0.0f)
                curveTo(0.742f, 0.06f, 0.06f, 0.744f, 0.0f, 1.596f)
                lineTo(0.0f, 22.38f)
                curveToRelative(0.06f, 0.874f, 0.712f, 1.542f, 1.555f, 1.617f)
                curveToRelative(0.015f, 0.003f, 0.03f, 0.003f, 0.045f, 0.003f)
                horizontalLineToRelative(20.845f)
                curveToRelative(0.88f, -0.088f, 1.55f, -0.826f, 1.555f, -1.71f)
                lineTo(24.0f, 1.71f)
                curveTo(24.0f, 0.82f, 23.305f, 0.07f, 22.416f, 0.0f)
                close()
                moveTo(4.792f, 15.626f)
                lineTo(2.887f, 15.626f)
                lineTo(2.887f, 8.26f)
                horizontalLineToRelative(1.905f)
                verticalLineToRelative(7.366f)
                close()
                moveTo(11.332f, 15.624f)
                lineTo(9.67f, 15.624f)
                verticalLineToRelative(-4.97f)
                lineTo(9.0f, 15.623f)
                lineTo(7.812f, 15.623f)
                lineToRelative(-0.698f, -4.86f)
                lineToRelative(-0.007f, 4.86f)
                lineTo(5.44f, 15.623f)
                lineTo(5.44f, 8.26f)
                horizontalLineToRelative(2.468f)
                curveToRelative(0.083f, 0.523f, 0.16f, 1.048f, 0.23f, 1.574f)
                lineToRelative(0.27f, 1.87f)
                lineToRelative(0.442f, -3.444f)
                horizontalLineToRelative(2.483f)
                verticalLineToRelative(7.364f)
                close()
                moveTo(16.309f, 13.444f)
                curveToRelative(0.0f, 0.655f, -0.044f, 1.094f, -0.104f, 1.32f)
                curveToRelative(-0.062f, 0.22f, -0.17f, 0.4f, -0.326f, 0.52f)
                curveToRelative(-0.15f, 0.13f, -0.34f, 0.218f, -0.57f, 0.266f)
                curveToRelative(-0.223f, 0.045f, -0.57f, 0.075f, -1.02f, 0.075f)
                lineToRelative(-0.004f, -0.002f)
                lineTo(11.98f, 15.623f)
                lineTo(11.98f, 8.26f)
                horizontalLineToRelative(1.426f)
                curveToRelative(0.914f, 0.0f, 1.45f, 0.047f, 1.77f, 0.128f)
                curveToRelative(0.325f, 0.09f, 0.575f, 0.225f, 0.745f, 0.42f)
                curveToRelative(0.165f, 0.18f, 0.273f, 0.404f, 0.313f, 0.645f)
                curveToRelative(0.05f, 0.235f, 0.076f, 0.705f, 0.076f, 1.402f)
                verticalLineToRelative(2.588f)
                close()
                moveTo(21.253f, 13.919f)
                curveToRelative(0.0f, 0.45f, -0.045f, 0.764f, -0.09f, 0.99f)
                curveToRelative(-0.06f, 0.224f, -0.195f, 0.404f, -0.405f, 0.568f)
                curveToRelative(-0.226f, 0.166f, -0.48f, 0.24f, -0.78f, 0.24f)
                curveToRelative(-0.22f, 0.0f, -0.5f, -0.06f, -0.68f, -0.136f)
                curveToRelative(-0.19f, -0.094f, -0.358f, -0.237f, -0.515f, -0.427f)
                lineToRelative(-0.116f, 0.47f)
                horizontalLineToRelative(-1.717f)
                lineTo(16.95f, 8.26f)
                lineToRelative(-0.02f, -0.003f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.15f, -0.175f, 0.315f, -0.31f, 0.51f, -0.4f)
                curveToRelative(0.196f, -0.083f, 0.466f, -0.127f, 0.69f, -0.127f)
                curveToRelative(0.226f, -0.003f, 0.45f, 0.036f, 0.66f, 0.115f)
                curveToRelative(0.17f, 0.07f, 0.32f, 0.185f, 0.436f, 0.33f)
                curveToRelative(0.09f, 0.125f, 0.15f, 0.27f, 0.18f, 0.42f)
                curveToRelative(0.03f, 0.138f, 0.044f, 0.43f, 0.044f, 0.87f)
                verticalLineToRelative(2.054f)
                close()
                moveTo(19.08f, 11.205f)
                curveToRelative(-0.12f, 0.0f, -0.194f, 0.04f, -0.225f, 0.12f)
                curveToRelative(-0.03f, 0.08f, -0.06f, 0.29f, -0.06f, 0.624f)
                verticalLineToRelative(1.946f)
                curveToRelative(0.0f, 0.324f, 0.03f, 0.533f, 0.06f, 0.623f)
                curveToRelative(0.04f, 0.086f, 0.13f, 0.14f, 0.226f, 0.134f)
                curveToRelative(0.12f, 0.0f, 0.272f, -0.047f, 0.3f, -0.14f)
                curveToRelative(0.03f, -0.097f, 0.046f, -0.32f, 0.046f, -0.674f)
                lineToRelative(0.03f, -0.002f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0.0f, -0.303f, -0.015f, -0.508f, -0.06f, -0.603f)
                curveToRelative(-0.044f, -0.1f, -0.195f, -0.14f, -0.315f, -0.14f)
                close()
            }
        }
        .build()
        return _imdb!!
    }

private var _imdb: VectorAsset? = null
