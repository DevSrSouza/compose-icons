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

public val SimpleIcons.Leanpub: ImageVector
    get() {
        if (_leanpub != null) {
            return _leanpub!!
        }
        _leanpub = Builder(name = "Leanpub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.19f, 5.284f)
                curveToRelative(-0.806f, -0.454f, -2.93f, -1.478f, -5.652f, -1.478f)
                curveToRelative(-2.445f, 0.0f, -3.837f, 0.751f, -4.538f, 1.234f)
                curveToRelative(-0.701f, -0.483f, -2.093f, -1.235f, -4.538f, -1.235f)
                curveToRelative(-2.723f, 0.0f, -4.846f, 1.025f, -5.651f, 1.479f)
                lineTo(0.0f, 20.194f)
                horizontalLineToRelative(0.054f)
                arcToRelative(6.933f, 6.933f, 0.0f, false, false, 2.957f, -0.673f)
                curveToRelative(1.032f, -0.487f, 2.66f, -1.06f, 4.602f, -1.06f)
                curveToRelative(2.364f, 0.0f, 3.71f, 1.056f, 4.387f, 1.733f)
                curveToRelative(0.678f, -0.677f, 2.023f, -1.732f, 4.387f, -1.732f)
                curveToRelative(1.943f, 0.0f, 3.57f, 0.572f, 4.602f, 1.06f)
                arcToRelative(6.933f, 6.933f, 0.0f, false, false, 2.957f, 0.672f)
                lineTo(24.0f, 20.194f)
                close()
                moveTo(20.934f, 17.78f)
                arcToRelative(12.167f, 12.167f, 0.0f, false, false, -2.875f, -0.801f)
                curveToRelative(-0.558f, -0.081f, -1.12f, -0.122f, -1.674f, -0.122f)
                curveToRelative(-1.571f, 0.0f, -2.991f, 0.392f, -4.22f, 1.165f)
                lineToRelative(-0.166f, 0.103f)
                lineToRelative(-0.165f, -0.103f)
                curveToRelative(-1.23f, -0.773f, -2.65f, -1.165f, -4.222f, -1.165f)
                curveToRelative(-0.552f, 0.0f, -1.115f, 0.04f, -1.673f, 0.122f)
                curveToRelative(-0.949f, 0.137f, -1.916f, 0.407f, -2.875f, 0.801f)
                lineToRelative(-1.218f, 0.501f)
                lineTo(3.3f, 6.321f)
                lineToRelative(0.108f, -0.048f)
                curveToRelative(1.225f, -0.542f, 2.797f, -0.865f, 4.205f, -0.865f)
                curveToRelative(1.745f, 0.0f, 3.22f, 0.556f, 4.387f, 1.652f)
                curveToRelative(1.168f, -1.096f, 2.642f, -1.652f, 4.386f, -1.652f)
                curveToRelative(1.409f, 0.0f, 2.98f, 0.323f, 4.206f, 0.865f)
                lineToRelative(0.108f, 0.048f)
                lineToRelative(1.453f, 11.961f)
                close()
                moveTo(16.849f, 16.452f)
                arcToRelative(11.99f, 11.99f, 0.0f, false, false, -0.464f, -0.009f)
                curveToRelative(-1.627f, 0.0f, -3.103f, 0.402f, -4.386f, 1.194f)
                curveToRelative(-1.283f, -0.792f, -2.759f, -1.194f, -4.387f, -1.194f)
                curveToRelative(-0.572f, 0.0f, -1.155f, 0.043f, -1.732f, 0.126f)
                curveToRelative(-0.983f, 0.143f, -1.983f, 0.421f, -2.973f, 0.829f)
                lineToRelative(-0.565f, 0.232f)
                lineToRelative(1.34f, -11.025f)
                curveToRelative(1.159f, -0.492f, 2.618f, -0.783f, 3.93f, -0.783f)
                curveToRelative(1.705f, 0.0f, 3.131f, 0.562f, 4.24f, 1.672f)
                lineTo(12.0f, 7.64f)
                lineToRelative(0.146f, -0.146f)
                curveToRelative(1.07f, -1.07f, 2.433f, -1.629f, 4.055f, -1.669f)
                close()
            }
        }
        .build()
        return _leanpub!!
    }

private var _leanpub: ImageVector? = null
