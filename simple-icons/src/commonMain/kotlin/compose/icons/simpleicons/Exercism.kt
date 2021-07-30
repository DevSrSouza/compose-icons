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

public val SimpleIcons.Exercism: ImageVector
    get() {
        if (_exercism != null) {
            return _exercism!!
        }
        _exercism = Builder(name = "Exercism", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.35f, 1.66f)
                curveToRelative(-0.959f, 0.0f, -1.686f, 0.298f, -2.181f, 0.893f)
                curveToRelative(-0.496f, 0.595f, -0.744f, 1.464f, -0.744f, 2.605f)
                verticalLineToRelative(3.474f)
                curveToRelative(0.0f, 0.805f, -0.086f, 1.424f, -0.259f, 1.858f)
                curveToRelative(-0.173f, 0.434f, -0.493f, 0.84f, -0.96f, 1.218f)
                curveToRelative(-0.138f, 0.113f, -0.206f, 0.206f, -0.206f, 0.278f)
                curveToRelative(0.0f, 0.072f, 0.068f, 0.165f, 0.205f, 0.277f)
                curveToRelative(0.476f, 0.386f, 0.798f, 0.794f, 0.967f, 1.225f)
                curveToRelative(0.17f, 0.43f, 0.253f, 1.047f, 0.253f, 1.851f)
                verticalLineToRelative(3.462f)
                curveToRelative(0.0f, 1.15f, 0.25f, 2.023f, 0.75f, 2.618f)
                curveToRelative(0.5f, 0.595f, 1.224f, 0.892f, 2.174f, 0.892f)
                horizontalLineToRelative(0.882f)
                curveToRelative(0.379f, 0.0f, 0.618f, -0.018f, 0.72f, -0.054f)
                curveToRelative(0.1f, -0.036f, 0.15f, -0.127f, 0.15f, -0.271f)
                curveToRelative(0.0f, -0.201f, -0.133f, -0.334f, -0.399f, -0.398f)
                lineToRelative(-0.483f, -0.109f)
                curveToRelative(-1.063f, -0.241f, -1.595f, -1.29f, -1.595f, -3.148f)
                verticalLineToRelative(-3.293f)
                curveToRelative(0.0f, -1.247f, -0.302f, -2.127f, -0.906f, -2.642f)
                lineToRelative(-0.23f, -0.193f)
                curveToRelative(-0.112f, -0.096f, -0.168f, -0.169f, -0.168f, -0.217f)
                curveToRelative(0.0f, -0.056f, 0.056f, -0.129f, 0.169f, -0.217f)
                lineToRelative(0.23f, -0.193f)
                curveToRelative(0.603f, -0.515f, 0.905f, -1.395f, 0.905f, -2.642f)
                lineTo(3.624f, 5.641f)
                curveToRelative(0.0f, -1.11f, 0.135f, -1.88f, 0.405f, -2.31f)
                curveToRelative(0.27f, -0.43f, 0.832f, -0.762f, 1.685f, -0.995f)
                curveToRelative(0.258f, -0.073f, 0.387f, -0.19f, 0.387f, -0.35f)
                curveToRelative(0.0f, -0.217f, -0.29f, -0.326f, -0.87f, -0.326f)
                close()
                moveTo(18.769f, 1.689f)
                curveToRelative(-0.58f, 0.0f, -0.87f, 0.108f, -0.87f, 0.325f)
                curveToRelative(0.0f, 0.161f, 0.128f, 0.278f, 0.386f, 0.35f)
                curveToRelative(0.854f, 0.233f, 1.416f, 0.565f, 1.686f, 0.995f)
                curveToRelative(0.27f, 0.43f, 0.405f, 1.2f, 0.405f, 2.31f)
                verticalLineToRelative(3.294f)
                curveToRelative(0.0f, 1.246f, 0.302f, 2.126f, 0.906f, 2.641f)
                lineToRelative(0.229f, 0.193f)
                curveToRelative(0.113f, 0.089f, 0.17f, 0.161f, 0.17f, 0.217f)
                curveToRelative(0.0f, 0.049f, -0.057f, 0.121f, -0.17f, 0.217f)
                lineToRelative(-0.23f, 0.193f)
                curveToRelative(-0.603f, 0.515f, -0.905f, 1.396f, -0.905f, 2.642f)
                verticalLineToRelative(3.293f)
                curveToRelative(0.0f, 1.858f, -0.532f, 2.907f, -1.595f, 3.149f)
                lineToRelative(-0.484f, 0.108f)
                curveToRelative(-0.266f, 0.064f, -0.398f, 0.197f, -0.398f, 0.398f)
                curveToRelative(0.0f, 0.145f, 0.05f, 0.235f, 0.15f, 0.272f)
                curveToRelative(0.102f, 0.036f, 0.341f, 0.054f, 0.72f, 0.054f)
                horizontalLineToRelative(0.882f)
                curveToRelative(0.95f, 0.0f, 1.675f, -0.298f, 2.174f, -0.893f)
                curveToRelative(0.5f, -0.595f, 0.75f, -1.467f, 0.75f, -2.617f)
                verticalLineToRelative(-3.462f)
                curveToRelative(0.0f, -0.805f, 0.084f, -1.422f, 0.253f, -1.852f)
                curveToRelative(0.17f, -0.43f, 0.491f, -0.838f, 0.967f, -1.224f)
                curveToRelative(0.137f, -0.113f, 0.205f, -0.205f, 0.205f, -0.278f)
                curveToRelative(0.0f, -0.072f, -0.068f, -0.165f, -0.205f, -0.277f)
                curveToRelative(-0.468f, -0.378f, -0.788f, -0.784f, -0.961f, -1.218f)
                curveToRelative(-0.173f, -0.435f, -0.26f, -1.054f, -0.26f, -1.858f)
                lineTo(22.574f, 5.187f)
                curveToRelative(0.0f, -1.142f, -0.247f, -2.01f, -0.743f, -2.606f)
                curveToRelative(-0.495f, -0.595f, -1.222f, -0.892f, -2.18f, -0.892f)
                close()
                moveTo(7.683f, 9.735f)
                curveToRelative(-1.456f, 0.0f, -2.64f, 1.111f, -2.64f, 2.478f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.0f, -0.838f, 0.727f, -1.52f, 1.62f, -1.52f)
                curveToRelative(0.892f, 0.0f, 1.619f, 0.682f, 1.619f, 1.52f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.0f, -1.367f, -1.183f, -2.478f, -2.64f, -2.478f)
                close()
                moveTo(16.089f, 9.735f)
                curveToRelative(-1.456f, 0.0f, -2.639f, 1.111f, -2.639f, 2.478f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.0f, -0.838f, 0.727f, -1.52f, 1.62f, -1.52f)
                curveToRelative(0.892f, 0.0f, 1.62f, 0.682f, 1.62f, 1.52f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.0f, -1.367f, -1.185f, -2.478f, -2.64f, -2.478f)
                close()
                moveTo(9.71f, 14.36f)
                verticalLineToRelative(0.561f)
                curveToRelative(0.0f, 1.277f, 1.062f, 2.316f, 2.366f, 2.316f)
                curveToRelative(1.305f, 0.0f, 2.367f, -1.039f, 2.367f, -2.316f)
                verticalLineToRelative(-0.56f)
                horizontalLineToRelative(-0.934f)
                verticalLineToRelative(0.56f)
                curveToRelative(0.0f, 0.877f, -0.76f, 1.426f, -1.433f, 1.426f)
                reflectiveCurveToRelative(-1.48f, -0.273f, -1.48f, -1.426f)
                verticalLineToRelative(-0.56f)
                close()
            }
        }
        .build()
        return _exercism!!
    }

private var _exercism: ImageVector? = null
