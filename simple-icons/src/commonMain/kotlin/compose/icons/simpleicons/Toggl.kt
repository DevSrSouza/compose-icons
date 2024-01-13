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

public val SimpleIcons.Toggl: ImageVector
    get() {
        if (_toggl != null) {
            return _toggl!!
        }
        _toggl = Builder(name = "Toggl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.356f, 7.446f)
                verticalLineToRelative(0.64f)
                curveToRelative(0.0f, 0.711f, -0.541f, 1.286f, -1.209f, 1.286f)
                curveToRelative(-0.05f, 0.0f, -0.098f, -0.003f, -0.147f, -0.009f)
                verticalLineToRelative(1.58f)
                horizontalLineToRelative(0.82f)
                verticalLineToRelative(1.588f)
                curveToRelative(0.0f, 0.625f, 0.112f, 1.107f, 0.338f, 1.434f)
                curveToRelative(0.347f, 0.501f, 0.734f, 0.83f, 1.676f, 0.83f)
                curveToRelative(0.546f, 0.0f, 1.004f, -0.126f, 1.304f, -0.293f)
                verticalLineToRelative(-1.868f)
                arcToRelative(1.266f, 1.266f, 0.0f, false, true, -0.444f, 0.074f)
                curveToRelative(-0.363f, 0.0f, -0.512f, -0.112f, -0.647f, -0.282f)
                curveToRelative(-0.087f, -0.112f, -0.13f, -0.276f, -0.13f, -0.489f)
                verticalLineToRelative(-0.994f)
                horizontalLineToRelative(1.22f)
                lineTo(4.137f, 9.161f)
                horizontalLineToRelative(-1.22f)
                lineTo(2.917f, 7.446f)
                close()
                moveTo(21.218f, 7.446f)
                verticalLineToRelative(5.04f)
                curveToRelative(0.0f, 0.627f, 0.093f, 1.149f, 0.319f, 1.478f)
                curveToRelative(0.347f, 0.5f, 0.816f, 0.827f, 1.75f, 0.83f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, 0.713f, -0.173f)
                verticalLineToRelative(-1.92f)
                curveToRelative(-0.441f, 0.055f, -0.594f, -0.256f, -0.594f, -0.565f)
                verticalLineToRelative(-4.69f)
                close()
                moveTo(14.666f, 7.965f)
                lineTo(13.944f, 8.969f)
                arcToRelative(2.885f, 2.885f, 0.0f, false, false, -0.883f, -0.133f)
                curveToRelative(-0.628f, 0.0f, -1.258f, 0.185f, -1.718f, 0.617f)
                curveToRelative(-0.449f, 0.419f, -0.658f, 1.005f, -0.658f, 1.605f)
                curveToRelative(0.0f, 0.6f, 0.21f, 1.186f, 0.658f, 1.605f)
                curveToRelative(0.039f, 0.038f, 0.08f, 0.071f, 0.12f, 0.104f)
                lineToRelative(-0.084f, 0.045f)
                curveToRelative(-0.21f, 0.12f, -0.402f, 0.273f, -0.568f, 0.451f)
                curveToRelative(-0.284f, 0.303f, -0.568f, 0.756f, -0.568f, 1.36f)
                curveToRelative(0.0f, 0.0f, -0.039f, 1.286f, 1.438f, 1.286f)
                horizontalLineToRelative(1.071f)
                curveToRelative(0.247f, 0.0f, 0.498f, 0.157f, 0.498f, 0.403f)
                curveToRelative(0.0f, 0.086f, -0.025f, 0.17f, -0.072f, 0.242f)
                horizontalLineToRelative(2.048f)
                curveToRelative(0.309f, -0.351f, 0.475f, -0.806f, 0.466f, -1.274f)
                curveToRelative(-0.014f, -0.403f, -0.133f, -0.831f, -0.435f, -1.113f)
                curveToRelative(-0.34f, -0.316f, -0.831f, -0.46f, -1.288f, -0.46f)
                horizontalLineToRelative(-2.038f)
                curveToRelative(-0.2f, 0.0f, -0.379f, -0.151f, -0.379f, -0.338f)
                arcToRelative(0.338f, 0.338f, 0.0f, false, true, 0.252f, -0.326f)
                reflectiveCurveToRelative(0.034f, -0.008f, 0.072f, -0.02f)
                curveToRelative(0.371f, 0.171f, 0.776f, 0.258f, 1.185f, 0.254f)
                curveToRelative(0.627f, 0.0f, 1.256f, -0.185f, 1.717f, -0.617f)
                curveToRelative(0.449f, -0.419f, 0.658f, -1.005f, 0.658f, -1.605f)
                curveToRelative(0.0f, -0.6f, -0.21f, -1.186f, -0.658f, -1.605f)
                arcToRelative(2.095f, 2.095f, 0.0f, false, false, -0.433f, -0.31f)
                curveToRelative(0.432f, 0.1f, 0.879f, -0.023f, 1.186f, -0.553f)
                close()
                moveTo(19.848f, 7.965f)
                lineTo(19.126f, 8.969f)
                arcToRelative(2.883f, 2.883f, 0.0f, false, false, -0.882f, -0.133f)
                curveToRelative(-0.628f, 0.0f, -1.257f, 0.185f, -1.717f, 0.617f)
                curveToRelative(-0.449f, 0.419f, -0.658f, 1.005f, -0.658f, 1.605f)
                curveToRelative(0.0f, 0.6f, 0.21f, 1.186f, 0.658f, 1.605f)
                curveToRelative(0.131f, 0.122f, 0.278f, 0.228f, 0.436f, 0.313f)
                arcToRelative(2.621f, 2.621f, 0.0f, false, false, -0.32f, 0.287f)
                curveToRelative(-0.284f, 0.303f, -0.568f, 0.756f, -0.568f, 1.36f)
                curveToRelative(0.0f, 0.0f, -0.039f, 1.286f, 1.438f, 1.286f)
                horizontalLineToRelative(1.07f)
                curveToRelative(0.247f, 0.0f, 0.498f, 0.157f, 0.498f, 0.403f)
                curveToRelative(0.0f, 0.086f, -0.024f, 0.17f, -0.071f, 0.242f)
                horizontalLineToRelative(2.048f)
                curveToRelative(0.309f, -0.351f, 0.475f, -0.806f, 0.466f, -1.274f)
                curveToRelative(-0.015f, -0.403f, -0.135f, -0.831f, -0.439f, -1.113f)
                curveToRelative(-0.34f, -0.316f, -0.831f, -0.46f, -1.288f, -0.46f)
                lineToRelative(-2.362f, -0.017f)
                curveToRelative(-0.15f, 0.0f, -0.263f, -0.094f, -0.263f, -0.232f)
                curveToRelative(0.0f, -0.115f, 0.057f, -0.283f, 0.2f, -0.311f)
                curveToRelative(0.282f, 0.088f, 0.576f, 0.132f, 0.872f, 0.13f)
                curveToRelative(0.628f, 0.0f, 1.257f, -0.185f, 1.718f, -0.616f)
                curveToRelative(0.448f, -0.42f, 0.658f, -1.006f, 0.658f, -1.606f)
                curveToRelative(0.0f, -0.6f, -0.21f, -1.185f, -0.658f, -1.604f)
                arcToRelative(2.085f, 2.085f, 0.0f, false, false, -0.435f, -0.31f)
                curveToRelative(0.433f, 0.1f, 0.879f, -0.024f, 1.186f, -0.554f)
                close()
                moveTo(7.398f, 8.851f)
                curveToRelative(-0.771f, 0.0f, -1.542f, 0.247f, -2.107f, 0.823f)
                curveToRelative(-0.552f, 0.561f, -0.808f, 1.346f, -0.808f, 2.149f)
                curveToRelative(0.0f, 0.803f, 0.257f, 1.587f, 0.807f, 2.149f)
                curveToRelative(0.566f, 0.576f, 1.337f, 0.823f, 2.107f, 0.823f)
                curveToRelative(0.77f, 0.0f, 1.541f, -0.247f, 2.106f, -0.823f)
                curveToRelative(0.55f, -0.562f, 0.807f, -1.346f, 0.807f, -2.149f)
                curveToRelative(0.0f, -0.803f, -0.257f, -1.588f, -0.807f, -2.15f)
                curveToRelative(-0.565f, -0.575f, -1.335f, -0.822f, -2.106f, -0.822f)
                close()
                moveTo(13.138f, 10.473f)
                arcToRelative(0.566f, 0.566f, 0.0f, true, true, -0.582f, 0.565f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, 0.143f, -0.378f)
                horizontalLineToRelative(0.001f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, true, 0.438f, -0.187f)
                close()
                moveTo(18.332f, 10.474f)
                arcToRelative(0.564f, 0.564f, 0.0f, true, true, -0.581f, 0.564f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, 0.144f, -0.378f)
                arcToRelative(0.564f, 0.564f, 0.0f, false, true, 0.437f, -0.186f)
                close()
                moveTo(7.46f, 11.067f)
                arcToRelative(0.73f, 0.73f, 0.0f, true, true, -0.75f, 0.732f)
                arcToRelative(0.678f, 0.678f, 0.0f, false, true, 0.186f, -0.49f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.564f, -0.242f)
                close()
            }
        }
        .build()
        return _toggl!!
    }

private var _toggl: ImageVector? = null
