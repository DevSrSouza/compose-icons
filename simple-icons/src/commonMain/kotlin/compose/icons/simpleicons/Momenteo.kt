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

public val SimpleIcons.Momenteo: ImageVector
    get() {
        if (_momenteo != null) {
            return _momenteo!!
        }
        _momenteo = Builder(name = "Momenteo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.925f, 6.615f)
                curveToRelative(-0.6f, 0.01f, -1.154f, 0.323f, -1.472f, 0.831f)
                curveToRelative(-0.348f, 0.41f, -3.163f, 3.98f, -4.142f, 5.22f)
                lineToRelative(0.765f, 0.968f)
                curveToRelative(1.036f, -1.306f, 4.096f, -5.169f, 4.243f, -5.348f)
                arcToRelative(0.765f, 0.765f, 0.0f, false, true, 1.265f, 0.0f)
                curveToRelative(0.344f, 0.42f, 1.624f, 2.047f, 2.703f, 3.408f)
                curveToRelative(0.482f, 0.591f, 0.926f, 1.213f, 1.328f, 1.862f)
                curveToRelative(0.626f, 1.043f, -0.395f, 2.02f, -0.792f, 2.457f)
                lineToRelative(-3.254f, -4.098f)
                arcToRelative(0.811f, 0.811f, 0.0f, false, false, -1.25f, -0.016f)
                lineTo(14.2f, 15.836f)
                lineTo(7.548f, 7.447f)
                arcToRelative(1.774f, 1.774f, 0.0f, false, false, -3.02f, 0.024f)
                curveToRelative(-0.059f, 0.067f, -1.706f, 2.156f, -2.989f, 3.776f)
                curveToRelative(-0.528f, 0.701f, -0.956f, 1.33f, -1.178f, 1.7f)
                curveToRelative(-1.048f, 1.75f, 0.441f, 3.462f, 1.239f, 4.165f)
                curveToRelative(0.174f, 0.16f, 0.399f, 0.257f, 0.636f, 0.272f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, false, 0.677f, -0.368f)
                lineToRelative(3.145f, -3.97f)
                reflectiveCurveToRelative(2.882f, 3.644f, 3.227f, 4.07f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 1.033f, -0.005f)
                curveToRelative(0.198f, -0.253f, 0.76f, -0.962f, 1.373f, -1.733f)
                lineToRelative(-0.765f, -0.964f)
                curveToRelative(-0.548f, 0.69f, -1.021f, 1.286f, -1.127f, 1.426f)
                lineToRelative(-3.118f, -3.938f)
                arcToRelative(0.811f, 0.811f, 0.0f, false, false, -1.25f, 0.016f)
                lineToRelative(-3.254f, 4.099f)
                curveToRelative(-0.397f, -0.438f, -1.416f, -1.415f, -0.792f, -2.458f)
                arcToRelative(17.57f, 17.57f, 0.0f, false, true, 1.329f, -1.861f)
                curveToRelative(1.078f, -1.362f, 2.358f, -2.989f, 2.703f, -3.408f)
                arcToRelative(0.765f, 0.765f, 0.0f, false, true, 1.264f, 0.0f)
                lineToRelative(7.0f, 8.823f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 1.034f, 0.005f)
                curveToRelative(0.345f, -0.426f, 3.227f, -4.07f, 3.227f, -4.07f)
                lineToRelative(3.146f, 3.968f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, false, 0.675f, 0.367f)
                curveToRelative(0.238f, -0.015f, 0.463f, -0.11f, 0.638f, -0.272f)
                curveToRelative(0.797f, -0.702f, 2.286f, -2.414f, 1.238f, -4.165f)
                curveToRelative(-0.222f, -0.37f, -0.65f, -1.0f, -1.179f, -1.7f)
                curveToRelative(-1.282f, -1.621f, -2.929f, -3.71f, -2.989f, -3.777f)
                arcToRelative(1.774f, 1.774f, 0.0f, false, false, -1.546f, -0.854f)
                close()
            }
        }
        .build()
        return _momenteo!!
    }

private var _momenteo: ImageVector? = null
