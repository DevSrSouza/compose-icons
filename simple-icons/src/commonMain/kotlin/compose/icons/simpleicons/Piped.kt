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

public val SimpleIcons.Piped: ImageVector
    get() {
        if (_piped != null) {
            return _piped!!
        }
        _piped = Builder(name = "Piped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.947f, 22.915f)
                curveToRelative(0.0f, 0.6f, -1.207f, 1.085f, -2.7f, 1.085f)
                curveToRelative(-1.492f, 0.0f, -2.698f, -0.485f, -2.698f, -1.085f)
                reflectiveCurveToRelative(1.206f, -1.086f, 2.699f, -1.086f)
                curveToRelative(1.492f, 0.0f, 2.699f, 0.485f, 2.699f, 1.086f)
                close()
                moveTo(9.929f, 22.009f)
                lineTo(9.929f, 0.789f)
                reflectiveCurveTo(9.593f, 0.58f, 9.06f, 0.33f)
                arcTo(7.333f, 7.333f, 0.0f, false, false, 8.1f, 0.07f)
                arcTo(8.257f, 8.257f, 0.0f, false, false, 6.986f, 0.0f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, -1.043f, 0.144f)
                arcToRelative(6.31f, 6.31f, 0.0f, false, false, -0.786f, 0.272f)
                arcTo(5.819f, 5.819f, 0.0f, false, false, 4.56f, 0.79f)
                verticalLineToRelative(21.223f)
                curveToRelative(0.609f, -0.462f, 1.668f, -0.684f, 2.687f, -0.684f)
                curveToRelative(1.015f, 0.0f, 2.072f, 0.22f, 2.68f, 0.68f)
                close()
                moveTo(11.835f, 4.814f)
                curveToRelative(0.66f, 0.0f, 1.192f, -1.0f, 1.192f, -2.237f)
                reflectiveCurveTo(12.494f, 0.34f, 11.835f, 0.34f)
                curveToRelative(-0.66f, 0.0f, -1.192f, 1.0f, -1.192f, 2.237f)
                reflectiveCurveToRelative(0.533f, 2.237f, 1.192f, 2.237f)
                close()
                moveTo(11.88f, 9.302f)
                curveToRelative(-0.66f, 0.0f, -1.192f, 1.102f, -1.192f, 2.464f)
                curveToRelative(0.0f, 1.363f, 0.533f, 2.465f, 1.192f, 2.465f)
                curveToRelative(0.66f, 0.0f, 1.192f, -1.102f, 1.192f, -2.465f)
                curveToRelative(0.0f, -1.362f, -0.532f, -2.464f, -1.192f, -2.464f)
                close()
                moveTo(19.436f, 7.142f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, false, -0.142f, -1.026f)
                arcToRelative(12.28f, 12.28f, 0.0f, false, false, -0.27f, -0.994f)
                arcToRelative(12.027f, 12.027f, 0.0f, false, false, -0.388f, -0.939f)
                curveToRelative(-0.151f, -0.293f, -0.315f, -0.58f, -0.492f, -0.859f)
                arcToRelative(10.837f, 10.837f, 0.0f, false, false, -0.578f, -0.76f)
                arcToRelative(10.181f, 10.181f, 0.0f, false, false, -0.647f, -0.65f)
                arcToRelative(9.626f, 9.626f, 0.0f, false, false, -1.412f, -0.941f)
                arcToRelative(9.61f, 9.61f, 0.0f, false, false, -1.412f, -0.492f)
                arcToRelative(10.987f, 10.987f, 0.0f, false, false, -0.65f, -0.102f)
                arcToRelative(6.299f, 6.299f, 0.0f, false, false, -0.626f, -0.053f)
                curveToRelative(0.433f, 0.486f, 0.708f, 1.294f, 0.708f, 2.25f)
                curveToRelative(0.0f, 1.0f, -0.3f, 1.836f, -0.767f, 2.313f)
                curveToRelative(0.224f, 0.041f, 0.575f, 0.163f, 0.708f, 0.212f)
                curveToRelative(0.215f, 0.096f, 0.432f, 0.211f, 0.641f, 0.344f)
                curveToRelative(0.356f, 0.258f, 0.543f, 0.471f, 0.73f, 0.77f)
                curveToRelative(0.263f, 0.474f, 0.31f, 0.856f, 0.247f, 1.287f)
                curveToRelative(-0.135f, 0.651f, -0.495f, 1.035f, -0.937f, 1.33f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.623f, 0.297f)
                curveToRelative(-0.087f, 0.026f, -0.438f, 0.13f, -0.694f, 0.158f)
                curveToRelative(0.453f, 0.521f, 0.74f, 1.418f, 0.74f, 2.48f)
                curveToRelative(0.0f, 1.042f, -0.278f, 1.923f, -0.716f, 2.448f)
                curveToRelative(0.114f, -0.002f, 0.22f, -0.003f, 0.35f, -0.007f)
                curveToRelative(0.414f, -0.037f, 0.9f, -0.107f, 1.395f, -0.207f)
                curveToRelative(0.314f, -0.085f, 0.862f, -0.25f, 1.531f, -0.55f)
                arcToRelative(8.856f, 8.856f, 0.0f, false, false, 1.422f, -0.996f)
                curveToRelative(0.213f, -0.214f, 0.415f, -0.438f, 0.605f, -0.673f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, false, 0.504f, -0.782f)
                curveToRelative(0.145f, -0.285f, 0.275f, -0.577f, 0.39f, -0.876f)
                curveToRelative(0.102f, -0.308f, 0.19f, -0.626f, 0.262f, -0.951f)
                curveToRelative(0.058f, -0.33f, 0.1f, -0.664f, 0.129f, -1.003f)
                curveToRelative(0.02f, -0.343f, -0.001f, -0.686f, -0.008f, -1.028f)
                close()
            }
        }
        .build()
        return _piped!!
    }

private var _piped: ImageVector? = null
