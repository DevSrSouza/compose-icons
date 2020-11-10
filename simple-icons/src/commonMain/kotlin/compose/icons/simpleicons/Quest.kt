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

public val SimpleIcons.Quest: VectorAsset
    get() {
        if (_quest != null) {
            return _quest!!
        }
        _quest = VectorAssetBuilder(name = "Quest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.12f, 8.76f)
                arcToRelative(3.241f, 3.241f, 0.0f, false, false, -3.117f, 3.355f)
                arcToRelative(3.241f, 3.241f, 0.0f, false, false, 3.354f, 3.115f)
                arcToRelative(3.201f, 3.201f, 0.0f, false, false, 1.791f, -0.628f)
                lineToRelative(-0.496f, -0.362f)
                arcToRelative(0.174f, 0.174f, 0.0f, false, false, -0.187f, -0.011f)
                curveToRelative(-0.381f, 0.215f, -0.821f, 0.335f, -1.293f, 0.324f)
                arcTo(2.522f, 2.522f, 0.0f, false, true, 0.727f, 12.16f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 5.011f, -0.297f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.43f, 1.59f)
                arcToRelative(0.179f, 0.179f, 0.0f, false, false, 0.042f, 0.246f)
                lineToRelative(0.418f, 0.307f)
                curveToRelative(-0.003f, 0.003f, -0.09f, 0.123f, -0.28f, 0.299f)
                curveToRelative(-0.192f, 0.178f, -0.34f, 0.295f, -0.34f, 0.295f)
                lineToRelative(0.541f, 0.416f)
                curveToRelative(0.068f, 0.052f, 0.161f, 0.052f, 0.227f, -0.002f)
                arcToRelative(4.498f, 4.498f, 0.0f, false, false, 0.389f, -0.371f)
                arcToRelative(0.183f, 0.183f, 0.0f, false, false, -0.028f, -0.272f)
                lineToRelative(-0.506f, -0.369f)
                curveToRelative(0.48f, -0.604f, 0.73f, -1.348f, 0.702f, -2.125f)
                arcTo(3.241f, 3.241f, 0.0f, false, false, 3.119f, 8.76f)
                close()
                moveTo(21.232f, 9.447f)
                verticalLineToRelative(1.293f)
                horizontalLineToRelative(-0.271f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, -0.203f, 0.201f)
                verticalLineToRelative(0.414f)
                horizontalLineToRelative(0.474f)
                verticalLineToRelative(2.28f)
                curveToRelative(0.0f, 1.087f, 0.553f, 1.6f, 1.485f, 1.6f)
                curveToRelative(0.53f, 0.0f, 0.959f, -0.184f, 1.283f, -0.43f)
                lineToRelative(-0.22f, -0.358f)
                arcToRelative(0.186f, 0.186f, 0.0f, false, false, -0.25f, -0.062f)
                arcToRelative(1.544f, 1.544f, 0.0f, false, true, -0.759f, 0.209f)
                curveToRelative(-0.502f, 0.0f, -0.859f, -0.297f, -0.859f, -0.973f)
                verticalLineToRelative(-2.266f)
                horizontalLineToRelative(1.156f)
                arcToRelative(0.173f, 0.173f, 0.0f, false, false, 0.174f, -0.173f)
                verticalLineToRelative(-0.442f)
                horizontalLineToRelative(-1.33f)
                lineTo(21.912f, 9.63f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, -0.182f, -0.182f)
                horizontalLineToRelative(-0.498f)
                close()
                moveTo(7.438f, 10.74f)
                curveToRelative(-0.1f, 0.0f, -0.18f, 0.08f, -0.18f, 0.18f)
                verticalLineToRelative(2.432f)
                curveToRelative(0.0f, 1.283f, 0.917f, 1.89f, 1.963f, 1.89f)
                curveToRelative(1.04f, 0.0f, 1.965f, -0.607f, 1.965f, -1.89f)
                verticalLineToRelative(-2.436f)
                arcToRelative(0.175f, 0.175f, 0.0f, false, false, -0.176f, -0.176f)
                horizontalLineToRelative(-0.51f)
                verticalLineToRelative(2.547f)
                curveToRelative(0.0f, 0.895f, -0.54f, 1.315f, -1.28f, 1.315f)
                reflectiveCurveToRelative(-1.283f, -0.42f, -1.283f, -1.315f)
                lineTo(7.937f, 10.74f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(14.043f, 10.74f)
                curveToRelative(-1.233f, 0.0f, -2.147f, 0.922f, -2.147f, 2.246f)
                curveToRelative(0.0f, 1.338f, 0.91f, 2.248f, 2.188f, 2.248f)
                curveToRelative(0.635f, 0.0f, 1.238f, -0.16f, 1.777f, -0.675f)
                lineToRelative(-0.257f, -0.329f)
                arcToRelative(0.167f, 0.167f, 0.0f, false, false, -0.235f, -0.03f)
                curveToRelative(-0.347f, 0.273f, -0.769f, 0.435f, -1.244f, 0.435f)
                curveToRelative(-0.781f, 0.0f, -1.433f, -0.479f, -1.53f, -1.41f)
                horizontalLineToRelative(3.288f)
                arcToRelative(0.192f, 0.192f, 0.0f, false, false, 0.191f, -0.188f)
                lineToRelative(0.002f, -0.068f)
                curveToRelative(-0.01f, -1.316f, -0.86f, -2.229f, -2.033f, -2.229f)
                close()
                moveTo(18.457f, 10.74f)
                curveToRelative(-1.037f, 0.0f, -1.727f, 0.493f, -1.727f, 1.31f)
                curveToRelative(0.0f, 0.645f, 0.457f, 1.077f, 1.43f, 1.196f)
                lineToRelative(0.516f, 0.06f)
                curveToRelative(0.612f, 0.074f, 0.904f, 0.283f, 0.904f, 0.63f)
                curveToRelative(0.0f, 0.456f, -0.462f, 0.699f, -1.193f, 0.699f)
                curveToRelative(-0.617f, 0.0f, -1.024f, -0.152f, -1.334f, -0.354f)
                arcToRelative(0.196f, 0.196f, 0.0f, false, false, -0.274f, 0.063f)
                lineToRelative(-0.205f, 0.332f)
                curveToRelative(0.548f, 0.415f, 1.248f, 0.553f, 1.805f, 0.553f)
                curveToRelative(1.165f, 0.0f, 1.904f, -0.516f, 1.904f, -1.338f)
                curveToRelative(0.0f, -0.708f, -0.535f, -1.087f, -1.453f, -1.205f)
                lineToRelative(-0.512f, -0.065f)
                curveToRelative(-0.566f, -0.068f, -0.88f, -0.247f, -0.88f, -0.607f)
                curveToRelative(0.0f, -0.42f, 0.406f, -0.68f, 1.023f, -0.68f)
                curveToRelative(0.492f, 0.0f, 0.961f, 0.152f, 1.264f, 0.314f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.242f, -0.07f)
                lineToRelative(0.123f, -0.219f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, -0.07f, -0.244f)
                curveToRelative(-0.408f, -0.227f, -0.962f, -0.375f, -1.563f, -0.375f)
                close()
                moveTo(14.029f, 11.342f)
                curveToRelative(0.736f, 0.0f, 1.265f, 0.521f, 1.352f, 1.33f)
                horizontalLineToRelative(-2.776f)
                curveToRelative(0.11f, -0.781f, 0.625f, -1.33f, 1.424f, -1.33f)
                close()
            }
        }
        .build()
        return _quest!!
    }

private var _quest: VectorAsset? = null
