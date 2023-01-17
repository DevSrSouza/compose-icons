package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Gear24: ImageVector
    get() {
        if (_gear24 != null) {
            return _gear24!!
        }
        _gear24 = Builder(name = "Gear24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(14.5f, 12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(0.266f, 0.0f, 0.532f, 0.009f, 0.797f, 0.028f)
                curveToRelative(0.763f, 0.055f, 1.345f, 0.617f, 1.512f, 1.304f)
                lineToRelative(0.352f, 1.45f)
                curveToRelative(0.019f, 0.078f, 0.09f, 0.171f, 0.225f, 0.221f)
                curveToRelative(0.247f, 0.089f, 0.49f, 0.19f, 0.728f, 0.302f)
                curveToRelative(0.13f, 0.061f, 0.246f, 0.044f, 0.315f, 0.002f)
                lineToRelative(1.275f, -0.776f)
                curveToRelative(0.603f, -0.368f, 1.411f, -0.353f, 1.99f, 0.147f)
                curveToRelative(0.402f, 0.349f, 0.78f, 0.726f, 1.128f, 1.129f)
                curveToRelative(0.501f, 0.578f, 0.515f, 1.386f, 0.147f, 1.99f)
                lineToRelative(-0.776f, 1.274f)
                curveToRelative(-0.042f, 0.069f, -0.058f, 0.185f, 0.002f, 0.315f)
                curveToRelative(0.112f, 0.238f, 0.213f, 0.481f, 0.303f, 0.728f)
                curveToRelative(0.048f, 0.135f, 0.142f, 0.205f, 0.22f, 0.225f)
                lineToRelative(1.45f, 0.352f)
                curveToRelative(0.687f, 0.167f, 1.249f, 0.749f, 1.303f, 1.512f)
                curveToRelative(0.038f, 0.531f, 0.038f, 1.063f, 0.0f, 1.594f)
                curveToRelative(-0.054f, 0.763f, -0.616f, 1.345f, -1.303f, 1.512f)
                lineToRelative(-1.45f, 0.352f)
                curveToRelative(-0.078f, 0.019f, -0.171f, 0.09f, -0.221f, 0.225f)
                curveToRelative(-0.089f, 0.248f, -0.19f, 0.491f, -0.302f, 0.728f)
                curveToRelative(-0.061f, 0.13f, -0.044f, 0.246f, -0.002f, 0.315f)
                lineToRelative(0.776f, 1.275f)
                curveToRelative(0.368f, 0.603f, 0.353f, 1.411f, -0.147f, 1.99f)
                curveToRelative(-0.349f, 0.402f, -0.726f, 0.78f, -1.129f, 1.128f)
                curveToRelative(-0.578f, 0.501f, -1.386f, 0.515f, -1.99f, 0.147f)
                lineToRelative(-1.274f, -0.776f)
                curveToRelative(-0.069f, -0.042f, -0.185f, -0.058f, -0.314f, 0.002f)
                arcToRelative(8.606f, 8.606f, 0.0f, false, true, -0.729f, 0.303f)
                curveToRelative(-0.135f, 0.048f, -0.205f, 0.142f, -0.225f, 0.22f)
                lineToRelative(-0.352f, 1.45f)
                curveToRelative(-0.167f, 0.687f, -0.749f, 1.249f, -1.512f, 1.303f)
                curveToRelative(-0.531f, 0.038f, -1.063f, 0.038f, -1.594f, 0.0f)
                curveToRelative(-0.763f, -0.054f, -1.345f, -0.616f, -1.512f, -1.303f)
                lineToRelative(-0.352f, -1.45f)
                curveToRelative(-0.019f, -0.078f, -0.09f, -0.171f, -0.225f, -0.221f)
                arcToRelative(8.138f, 8.138f, 0.0f, false, true, -0.728f, -0.302f)
                curveToRelative(-0.13f, -0.061f, -0.246f, -0.044f, -0.315f, -0.002f)
                lineToRelative(-1.275f, 0.776f)
                curveToRelative(-0.603f, 0.368f, -1.411f, 0.353f, -1.99f, -0.147f)
                curveToRelative(-0.402f, -0.349f, -0.78f, -0.726f, -1.128f, -1.129f)
                curveToRelative(-0.501f, -0.578f, -0.515f, -1.386f, -0.147f, -1.99f)
                lineToRelative(0.776f, -1.274f)
                curveToRelative(0.042f, -0.069f, 0.058f, -0.185f, -0.002f, -0.314f)
                arcToRelative(8.606f, 8.606f, 0.0f, false, true, -0.303f, -0.729f)
                curveToRelative(-0.048f, -0.135f, -0.142f, -0.205f, -0.22f, -0.225f)
                lineToRelative(-1.45f, -0.352f)
                curveToRelative(-0.687f, -0.167f, -1.249f, -0.749f, -1.304f, -1.512f)
                arcToRelative(11.158f, 11.158f, 0.0f, false, true, 0.0f, -1.594f)
                curveToRelative(0.055f, -0.763f, 0.617f, -1.345f, 1.304f, -1.512f)
                lineToRelative(1.45f, -0.352f)
                curveToRelative(0.078f, -0.019f, 0.171f, -0.09f, 0.221f, -0.225f)
                curveToRelative(0.089f, -0.248f, 0.19f, -0.491f, 0.302f, -0.728f)
                curveToRelative(0.061f, -0.13f, 0.044f, -0.246f, 0.002f, -0.315f)
                lineToRelative(-0.776f, -1.275f)
                curveToRelative(-0.368f, -0.603f, -0.353f, -1.411f, 0.147f, -1.99f)
                curveToRelative(0.349f, -0.402f, 0.726f, -0.78f, 1.129f, -1.128f)
                curveToRelative(0.578f, -0.501f, 1.386f, -0.515f, 1.99f, -0.147f)
                lineToRelative(1.274f, 0.776f)
                curveToRelative(0.069f, 0.042f, 0.185f, 0.058f, 0.315f, -0.002f)
                curveToRelative(0.238f, -0.112f, 0.481f, -0.213f, 0.728f, -0.303f)
                curveToRelative(0.135f, -0.048f, 0.205f, -0.142f, 0.225f, -0.22f)
                lineToRelative(0.352f, -1.45f)
                curveToRelative(0.167f, -0.687f, 0.749f, -1.249f, 1.512f, -1.304f)
                curveTo(11.466f, 1.01f, 11.732f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(11.31f, 2.525f)
                curveToRelative(-0.055f, 0.004f, -0.135f, 0.05f, -0.161f, 0.161f)
                lineToRelative(-0.353f, 1.45f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, true, -1.172f, 1.277f)
                arcToRelative(7.147f, 7.147f, 0.0f, false, false, -0.6f, 0.249f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, true, -1.734f, -0.074f)
                lineToRelative(-1.274f, -0.776f)
                curveToRelative(-0.098f, -0.06f, -0.186f, -0.036f, -0.228f, 0.0f)
                arcToRelative(9.774f, 9.774f, 0.0f, false, false, -0.976f, 0.976f)
                curveToRelative(-0.036f, 0.042f, -0.06f, 0.131f, 0.0f, 0.228f)
                lineToRelative(0.776f, 1.274f)
                curveToRelative(0.314f, 0.529f, 0.342f, 1.18f, 0.074f, 1.734f)
                arcToRelative(7.147f, 7.147f, 0.0f, false, false, -0.249f, 0.6f)
                arcToRelative(1.831f, 1.831f, 0.0f, false, true, -1.278f, 1.173f)
                lineToRelative(-1.45f, 0.351f)
                curveToRelative(-0.11f, 0.027f, -0.156f, 0.107f, -0.16f, 0.162f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, false, 0.0f, 1.38f)
                curveToRelative(0.004f, 0.055f, 0.05f, 0.135f, 0.161f, 0.161f)
                lineToRelative(1.45f, 0.353f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, true, 1.277f, 1.172f)
                curveToRelative(0.074f, 0.204f, 0.157f, 0.404f, 0.249f, 0.6f)
                curveToRelative(0.268f, 0.553f, 0.24f, 1.204f, -0.074f, 1.733f)
                lineToRelative(-0.776f, 1.275f)
                curveToRelative(-0.06f, 0.098f, -0.036f, 0.186f, 0.0f, 0.228f)
                curveToRelative(0.301f, 0.348f, 0.628f, 0.675f, 0.976f, 0.976f)
                curveToRelative(0.042f, 0.036f, 0.131f, 0.06f, 0.228f, 0.0f)
                lineToRelative(1.274f, -0.776f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, true, 1.734f, -0.075f)
                curveToRelative(0.196f, 0.093f, 0.396f, 0.176f, 0.6f, 0.25f)
                arcToRelative(1.831f, 1.831f, 0.0f, false, true, 1.173f, 1.278f)
                lineToRelative(0.351f, 1.45f)
                curveToRelative(0.027f, 0.11f, 0.107f, 0.156f, 0.162f, 0.16f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, false, 1.38f, 0.0f)
                curveToRelative(0.055f, -0.004f, 0.135f, -0.05f, 0.161f, -0.161f)
                lineToRelative(0.353f, -1.45f)
                arcToRelative(1.834f, 1.834f, 0.0f, false, true, 1.172f, -1.278f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, false, 0.6f, -0.248f)
                arcToRelative(1.831f, 1.831f, 0.0f, false, true, 1.733f, 0.074f)
                lineToRelative(1.275f, 0.776f)
                curveToRelative(0.098f, 0.06f, 0.186f, 0.036f, 0.228f, 0.0f)
                curveToRelative(0.348f, -0.301f, 0.675f, -0.628f, 0.976f, -0.976f)
                curveToRelative(0.036f, -0.042f, 0.06f, -0.131f, 0.0f, -0.228f)
                lineToRelative(-0.776f, -1.275f)
                arcToRelative(1.834f, 1.834f, 0.0f, false, true, -0.075f, -1.733f)
                curveToRelative(0.093f, -0.196f, 0.176f, -0.396f, 0.25f, -0.6f)
                arcToRelative(1.831f, 1.831f, 0.0f, false, true, 1.278f, -1.173f)
                lineToRelative(1.45f, -0.351f)
                curveToRelative(0.11f, -0.027f, 0.156f, -0.107f, 0.16f, -0.162f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, false, 0.0f, -1.38f)
                curveToRelative(-0.004f, -0.055f, -0.05f, -0.135f, -0.161f, -0.161f)
                lineToRelative(-1.45f, -0.353f)
                curveToRelative(-0.626f, -0.152f, -1.08f, -0.625f, -1.278f, -1.172f)
                arcToRelative(6.576f, 6.576f, 0.0f, false, false, -0.248f, -0.6f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, true, 0.074f, -1.734f)
                lineToRelative(0.776f, -1.274f)
                curveToRelative(0.06f, -0.098f, 0.036f, -0.186f, 0.0f, -0.228f)
                arcToRelative(9.774f, 9.774f, 0.0f, false, false, -0.976f, -0.976f)
                curveToRelative(-0.042f, -0.036f, -0.131f, -0.06f, -0.228f, 0.0f)
                lineToRelative(-1.275f, 0.776f)
                arcToRelative(1.831f, 1.831f, 0.0f, false, true, -1.733f, 0.074f)
                arcToRelative(6.88f, 6.88f, 0.0f, false, false, -0.6f, -0.249f)
                arcToRelative(1.835f, 1.835f, 0.0f, false, true, -1.173f, -1.278f)
                lineToRelative(-0.351f, -1.45f)
                curveToRelative(-0.027f, -0.11f, -0.107f, -0.156f, -0.162f, -0.16f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, false, -1.38f, 0.0f)
                close()
            }
        }
        .build()
        return _gear24!!
    }

private var _gear24: ImageVector? = null
