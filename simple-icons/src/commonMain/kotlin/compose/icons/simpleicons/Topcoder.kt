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

public val SimpleIcons.Topcoder: ImageVector
    get() {
        if (_topcoder != null) {
            return _topcoder!!
        }
        _topcoder = Builder(name = "Topcoder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 7.555f)
                curveToRelative(-1.87f, 0.0f, -3.88f, 0.979f, -5.559f, 2.678f)
                curveToRelative(1.741f, 0.384f, 3.587f, 0.997f, 5.046f, 1.662f)
                lineToRelative(0.513f, 0.23f)
                curveToRelative(0.204f, -0.09f, 0.367f, -0.163f, 0.513f, -0.23f)
                curveToRelative(1.464f, -0.667f, 3.318f, -1.282f, 5.064f, -1.667f)
                curveToRelative(-1.645f, -1.796f, -3.508f, -2.673f, -5.577f, -2.673f)
                close()
                moveTo(20.755f, 10.278f)
                curveToRelative(-0.675f, 0.016f, -1.44f, 0.101f, -2.282f, 0.254f)
                curveToRelative(0.608f, 0.784f, 1.26f, 2.0f, 1.928f, 3.503f)
                arcToRelative(43.559f, 43.559f, 0.0f, false, true, 0.981f, 2.4f)
                curveToRelative(0.305f, -0.06f, 0.58f, -0.232f, 0.825f, -0.542f)
                curveToRelative(1.393f, -1.761f, 2.038f, -3.366f, 1.708f, -4.349f)
                curveToRelative(-0.26f, -0.776f, -1.152f, -1.19f, -2.515f, -1.258f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, false, -0.645f, -0.008f)
                close()
                moveTo(3.249f, 10.278f)
                arcToRelative(8.844f, 8.844f, 0.0f, false, false, -0.646f, 0.008f)
                curveToRelative(-1.365f, 0.068f, -2.258f, 0.481f, -2.518f, 1.258f)
                curveToRelative(-0.33f, 0.983f, 0.315f, 2.588f, 1.708f, 4.35f)
                curveToRelative(0.258f, 0.325f, 0.549f, 0.499f, 0.873f, 0.55f)
                curveToRelative(0.15f, -1.468f, 1.501f, -4.253f, 2.868f, -5.911f)
                arcToRelative(14.877f, 14.877f, 0.0f, false, false, -2.285f, -0.254f)
                close()
                moveTo(17.939f, 10.63f)
                curveToRelative(-1.184f, 0.197f, -3.63f, 0.971f, -5.15f, 1.638f)
                lineToRelative(-0.036f, 0.017f)
                arcToRelative(10.22f, 10.22f, 0.0f, false, true, 1.798f, 0.599f)
                curveToRelative(1.268f, 0.55f, 1.504f, 0.694f, 5.169f, 3.06f)
                curveToRelative(0.206f, 0.134f, 0.37f, 0.227f, 0.587f, 0.32f)
                curveToRelative(0.194f, 0.084f, 0.383f, 0.143f, 0.566f, 0.174f)
                arcToRelative(42.717f, 42.717f, 0.0f, false, false, -1.316f, -3.092f)
                curveToRelative(-0.46f, -0.96f, -0.906f, -1.758f, -1.323f, -2.338f)
                curveToRelative(-0.1f, -0.14f, -0.2f, -0.266f, -0.295f, -0.378f)
                close()
                moveTo(6.073f, 10.634f)
                curveToRelative(-1.35f, 1.538f, -2.758f, 4.38f, -2.927f, 5.802f)
                curveToRelative(0.361f, -0.061f, 0.79f, -0.24f, 1.222f, -0.49f)
                curveToRelative(0.317f, -0.185f, 0.65f, -0.394f, 1.054f, -0.659f)
                curveToRelative(0.243f, -0.16f, 1.153f, -0.768f, 1.087f, -0.724f)
                curveToRelative(1.939f, -1.29f, 3.253f, -1.982f, 4.678f, -2.288f)
                curveToRelative(-1.589f, -0.69f, -3.798f, -1.417f, -5.114f, -1.64f)
                close()
            }
        }
        .build()
        return _topcoder!!
    }

private var _topcoder: ImageVector? = null
