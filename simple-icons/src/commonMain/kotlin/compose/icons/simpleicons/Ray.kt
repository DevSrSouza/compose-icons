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

public val SimpleIcons.Ray: ImageVector
    get() {
        if (_ray != null) {
            return _ray!!
        }
        _ray = Builder(name = "Ray", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.153f, 12.826f)
                curveToRelative(-0.63f, -0.183f, -1.03f, 0.15f, -1.378f, 0.846f)
                curveToRelative(-0.58f, 1.13f, -1.643f, 1.644f, -2.888f, 1.594f)
                curveToRelative(-1.245f, -0.05f, -2.257f, -0.63f, -2.788f, -1.776f)
                curveToRelative(-0.233f, -0.498f, -0.498f, -0.664f, -1.046f, -0.68f)
                curveToRelative(-0.93f, -0.017f, -1.643f, 0.016f, -2.174f, 1.062f)
                curveToRelative(-0.631f, 1.261f, -2.258f, 1.693f, -3.619f, 1.261f)
                arcToRelative(3.234f, 3.234f, 0.0f, false, true, -2.257f, -3.22f)
                arcToRelative(3.198f, 3.198f, 0.0f, false, true, 2.29f, -3.02f)
                arcToRelative(3.276f, 3.276f, 0.0f, false, true, 3.702f, 1.327f)
                curveToRelative(0.216f, 0.315f, 0.216f, 0.863f, 0.597f, 0.93f)
                curveToRelative(0.648f, 0.1f, 1.328f, 0.033f, 1.992f, 0.033f)
                curveToRelative(0.299f, 0.0f, 0.316f, -0.266f, 0.399f, -0.465f)
                curveToRelative(0.58f, -1.295f, 1.61f, -1.959f, 2.987f, -1.975f)
                curveToRelative(1.361f, -0.017f, 2.39f, 0.647f, 2.955f, 1.892f)
                curveToRelative(0.215f, 0.465f, 0.48f, 0.598f, 0.946f, 0.548f)
                curveToRelative(0.166f, -0.017f, 0.332f, 0.016f, 0.498f, 0.0f)
                curveToRelative(0.464f, -0.083f, 1.062f, 0.282f, 1.344f, -0.448f)
                curveToRelative(0.282f, -0.73f, -0.382f, -0.913f, -0.68f, -1.245f)
                curveToRelative(-0.847f, -0.946f, -1.81f, -1.793f, -2.673f, -2.706f)
                curveToRelative(-0.415f, -0.465f, -0.763f, -0.614f, -1.41f, -0.415f)
                curveToRelative(-1.876f, 0.614f, -3.619f, -0.431f, -4.15f, -2.357f)
                curveToRelative(-0.448f, -1.676f, 0.714f, -3.535f, 2.44f, -3.917f)
                arcToRelative(3.293f, 3.293f, 0.0f, false, true, 3.95f, 2.457f)
                curveToRelative(0.017f, 0.05f, 0.017f, 0.083f, 0.033f, 0.133f)
                curveToRelative(0.117f, 0.564f, 0.117f, 1.145f, -0.132f, 1.626f)
                curveToRelative(-0.283f, 0.531f, -0.133f, 0.83f, 0.249f, 1.195f)
                arcToRelative(152.61f, 152.61f, 0.0f, false, true, 3.286f, 3.27f)
                curveToRelative(0.299f, 0.299f, 0.498f, 0.349f, 0.913f, 0.2f)
                curveToRelative(1.51f, -0.565f, 2.97f, -0.1f, 3.884f, 1.161f)
                arcToRelative(3.266f, 3.266f, 0.0f, false, true, -0.067f, 3.801f)
                curveToRelative(-0.896f, 1.195f, -2.357f, 1.643f, -3.834f, 1.079f)
                curveToRelative(-0.381f, -0.15f, -0.58f, -0.1f, -0.846f, 0.182f)
                arcToRelative(163.619f, 163.619f, 0.0f, false, true, -3.403f, 3.386f)
                curveToRelative(-0.299f, 0.3f, -0.415f, 0.532f, -0.232f, 0.98f)
                arcToRelative(3.198f, 3.198f, 0.0f, false, true, -1.278f, 3.917f)
                arcTo(3.298f, 3.298f, 0.0f, false, true, 9.646f, 23.0f)
                curveToRelative(-1.062f, -1.062f, -1.228f, -2.688f, -0.415f, -4.033f)
                arcToRelative(3.196f, 3.196f, 0.0f, false, true, 3.835f, -1.294f)
                curveToRelative(0.498f, 0.182f, 0.78f, 0.083f, 1.145f, -0.283f)
                curveToRelative(1.012f, -1.045f, 2.058f, -2.058f, 3.087f, -3.103f)
                curveToRelative(0.266f, -0.266f, 0.68f, -0.449f, 0.432f, -1.03f)
                curveToRelative(-0.233f, -0.547f, -0.631f, -0.414f, -1.03f, -0.431f)
                close()
                moveTo(11.97f, 4.942f)
                curveToRelative(0.913f, 0.016f, 1.643f, -0.714f, 1.66f, -1.627f)
                verticalLineToRelative(-0.05f)
                arcToRelative(1.646f, 1.646f, 0.0f, false, false, -1.76f, -1.56f)
                arcToRelative(1.63f, 1.63f, 0.0f, false, false, -1.543f, 1.527f)
                arcToRelative(1.638f, 1.638f, 0.0f, false, false, 1.577f, 1.71f)
                close()
                moveTo(12.003f, 10.352f)
                arcToRelative(1.658f, 1.658f, 0.0f, false, false, -1.676f, 1.61f)
                verticalLineToRelative(0.084f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, 1.643f, 1.66f)
                curveToRelative(0.847f, 0.016f, 1.643f, -0.78f, 1.677f, -1.627f)
                arcToRelative(1.648f, 1.648f, 0.0f, false, false, -1.577f, -1.71f)
                curveToRelative(-0.017f, -0.016f, -0.05f, -0.016f, -0.067f, -0.016f)
                close()
                moveTo(19.091f, 12.046f)
                curveToRelative(0.016f, 0.896f, 0.747f, 1.61f, 1.626f, 1.643f)
                arcToRelative(1.723f, 1.723f, 0.0f, false, false, 1.66f, -1.726f)
                arcToRelative(1.666f, 1.666f, 0.0f, false, false, -1.66f, -1.61f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, -1.643f, 1.577f)
                curveToRelative(0.017f, 0.05f, 0.017f, 0.083f, 0.017f, 0.116f)
                close()
                moveTo(3.24f, 10.353f)
                arcToRelative(1.692f, 1.692f, 0.0f, false, false, -1.66f, 1.626f)
                curveToRelative(-0.017f, 0.847f, 0.863f, 1.727f, 1.693f, 1.71f)
                arcToRelative(1.687f, 1.687f, 0.0f, false, false, 1.626f, -1.743f)
                arcToRelative(1.615f, 1.615f, 0.0f, false, false, -1.643f, -1.593f)
                close()
                moveTo(11.92f, 22.353f)
                curveToRelative(0.98f, 0.033f, 1.71f, -0.647f, 1.727f, -1.593f)
                arcToRelative(1.646f, 1.646f, 0.0f, false, false, -1.51f, -1.793f)
                arcToRelative(1.646f, 1.646f, 0.0f, false, false, -1.793f, 1.51f)
                verticalLineToRelative(0.233f)
                arcToRelative(1.609f, 1.609f, 0.0f, false, false, 1.543f, 1.66f)
                curveToRelative(0.0f, -0.017f, 0.017f, -0.017f, 0.033f, -0.017f)
                close()
            }
        }
        .build()
        return _ray!!
    }

private var _ray: ImageVector? = null
