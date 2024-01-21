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

public val SimpleIcons.Bitcomet: ImageVector
    get() {
        if (_bitcomet != null) {
            return _bitcomet!!
        }
        _bitcomet = Builder(name = "Bitcomet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.996f, 0.0f)
                curveTo(5.37f, 0.002f, 0.002f, 5.375f, 0.004f, 12.0f)
                verticalLineToRelative(0.009f)
                curveToRelative(0.003f, 6.625f, 5.375f, 11.993f, 12.0f, 11.991f)
                curveToRelative(6.625f, -0.002f, 11.994f, -5.375f, 11.992f, -12.0f)
                verticalLineToRelative(-0.009f)
                curveTo(23.993f, 5.366f, 18.62f, -0.002f, 11.996f, 0.0f)
                close()
                moveTo(3.008f, 14.396f)
                curveToRelative(0.235f, -2.436f, 0.696f, -4.614f, 1.422f, -6.467f)
                arcToRelative(15.261f, 15.261f, 0.0f, false, true, 2.238f, -2.406f)
                arcToRelative(16.578f, 16.578f, 0.0f, false, false, -1.68f, 4.674f)
                curveToRelative(-0.731f, 1.4f, -1.4f, 2.88f, -1.98f, 4.199f)
                close()
                moveTo(9.068f, 17.258f)
                curveToRelative(-0.833f, -2.164f, -0.764f, -4.942f, -0.452f, -7.522f)
                arcToRelative(17.028f, 17.028f, 0.0f, false, true, 1.661f, -2.777f)
                curveToRelative(0.13f, 0.721f, 0.246f, 1.49f, 0.356f, 2.28f)
                curveToRelative(-0.841f, 2.033f, -1.457f, 4.722f, -1.564f, 8.019f)
                close()
                moveTo(15.708f, 17.258f)
                curveToRelative(-0.117f, -3.624f, -0.853f, -6.498f, -1.824f, -8.587f)
                curveToRelative(0.087f, -0.589f, 0.176f, -1.165f, 0.274f, -1.712f)
                curveToRelative(0.883f, 1.19f, 1.561f, 2.484f, 2.114f, 3.82f)
                curveToRelative(0.204f, 2.268f, 0.159f, 4.604f, -0.564f, 6.479f)
                close()
                moveTo(19.172f, 9.07f)
                arcToRelative(16.704f, 16.704f, 0.0f, false, false, -1.404f, -3.547f)
                curveToRelative(1.088f, 0.933f, 2.054f, 2.054f, 2.928f, 3.383f)
                curveToRelative(0.527f, 1.629f, 0.878f, 3.47f, 1.073f, 5.49f)
                curveToRelative(-0.739f, -1.68f, -1.621f, -3.623f, -2.597f, -5.326f)
                close()
                moveTo(20.002f, 7.125f)
                arcToRelative(16.735f, 16.735f, 0.0f, false, false, -0.84f, -0.953f)
                lineToRelative(-0.06f, -0.057f)
                arcToRelative(15.323f, 15.323f, 0.0f, false, false, -0.87f, -0.839f)
                curveToRelative(-0.1f, -0.087f, -0.209f, -0.167f, -0.311f, -0.253f)
                curveToRelative(-0.238f, -0.2f, -0.474f, -0.4f, -0.73f, -0.587f)
                arcToRelative(14.579f, 14.579f, 0.0f, false, false, -1.176f, -0.779f)
                curveToRelative(0.218f, 0.307f, 0.423f, 0.612f, 0.616f, 0.917f)
                lineToRelative(0.048f, 0.081f)
                curveToRelative(0.175f, 0.279f, 0.342f, 0.556f, 0.497f, 0.834f)
                lineToRelative(0.017f, 0.033f)
                curveToRelative(0.333f, 0.598f, 0.621f, 1.194f, 0.869f, 1.792f)
                curveToRelative(1.494f, 3.606f, 1.508f, 7.26f, 0.81f, 11.522f)
                curveToRelative(-0.562f, -3.39f, -1.284f, -6.707f, -2.781f, -9.661f)
                arcToRelative(20.003f, 20.003f, 0.0f, false, false, -1.028f, -1.783f)
                curveToRelative(-0.088f, -0.134f, -0.184f, -0.266f, -0.277f, -0.398f)
                arcToRelative(15.964f, 15.964f, 0.0f, false, false, -0.913f, -1.194f)
                curveToRelative(-0.08f, 0.387f, -0.154f, 0.8f, -0.227f, 1.214f)
                curveToRelative(-0.05f, 0.288f, -0.1f, 0.578f, -0.146f, 0.875f)
                curveToRelative(-0.587f, 3.696f, -0.938f, 8.202f, -1.282f, 12.078f)
                curveToRelative(-0.329f, -3.698f, -0.664f, -7.967f, -1.203f, -11.562f)
                arcToRelative(65.458f, 65.458f, 0.0f, false, false, -0.205f, -1.283f)
                curveToRelative(-0.079f, -0.453f, -0.16f, -0.9f, -0.247f, -1.322f)
                curveToRelative(-0.347f, 0.405f, -0.66f, 0.825f, -0.958f, 1.252f)
                curveToRelative(-0.283f, 0.411f, -0.546f, 0.832f, -0.792f, 1.26f)
                curveToRelative(-1.823f, 3.163f, -2.632f, 6.799f, -3.25f, 10.524f)
                curveToRelative(-0.622f, -3.798f, -0.672f, -7.112f, 0.38f, -10.34f)
                curveToRelative(0.256f, -0.788f, 0.579f, -1.572f, 0.975f, -2.355f)
                lineToRelative(0.091f, -0.173f)
                curveToRelative(0.162f, -0.31f, 0.335f, -0.622f, 0.52f, -0.933f)
                lineToRelative(0.16f, -0.268f)
                curveToRelative(0.228f, -0.369f, 0.468f, -0.738f, 0.731f, -1.11f)
                arcToRelative(14.497f, 14.497f, 0.0f, false, false, -1.433f, 0.982f)
                curveToRelative(-0.21f, 0.16f, -0.412f, 0.327f, -0.61f, 0.496f)
                curveToRelative(-0.134f, 0.115f, -0.272f, 0.229f, -0.4f, 0.347f)
                curveToRelative(-0.253f, 0.232f, -0.495f, 0.47f, -0.728f, 0.715f)
                lineToRelative(-0.007f, 0.007f)
                curveTo(3.63f, 7.897f, 2.472f, 9.86f, 1.575f, 11.811f)
                curveTo(1.903f, 4.493f, 6.516f, 0.324f, 12.218f, 0.324f)
                curveToRelative(5.703f, 0.0f, 10.315f, 4.169f, 10.643f, 11.488f)
                curveToRelative(-0.739f, -1.608f, -1.658f, -3.22f, -2.858f, -4.687f)
                close()
            }
        }
        .build()
        return _bitcomet!!
    }

private var _bitcomet: ImageVector? = null
