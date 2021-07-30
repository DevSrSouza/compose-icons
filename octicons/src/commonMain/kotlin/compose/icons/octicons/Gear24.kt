package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(14.5f, 12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveToRelative(-0.268f, 0.0f, -0.534f, 0.01f, -0.797f, 0.028f)
                curveToRelative(-0.763f, 0.055f, -1.345f, 0.617f, -1.512f, 1.304f)
                lineToRelative(-0.352f, 1.45f)
                curveToRelative(-0.02f, 0.078f, -0.09f, 0.172f, -0.225f, 0.22f)
                arcToRelative(8.45f, 8.45f, 0.0f, false, false, -0.728f, 0.303f)
                curveToRelative(-0.13f, 0.06f, -0.246f, 0.044f, -0.315f, 0.002f)
                lineToRelative(-1.274f, -0.776f)
                curveToRelative(-0.604f, -0.368f, -1.412f, -0.354f, -1.99f, 0.147f)
                curveToRelative(-0.403f, 0.348f, -0.78f, 0.726f, -1.129f, 1.128f)
                curveToRelative(-0.5f, 0.579f, -0.515f, 1.387f, -0.147f, 1.99f)
                lineToRelative(0.776f, 1.275f)
                curveToRelative(0.042f, 0.069f, 0.059f, 0.185f, -0.002f, 0.315f)
                curveToRelative(-0.112f, 0.237f, -0.213f, 0.48f, -0.302f, 0.728f)
                curveToRelative(-0.05f, 0.135f, -0.143f, 0.206f, -0.221f, 0.225f)
                lineToRelative(-1.45f, 0.352f)
                curveToRelative(-0.687f, 0.167f, -1.249f, 0.749f, -1.304f, 1.512f)
                arcToRelative(11.149f, 11.149f, 0.0f, false, false, 0.0f, 1.594f)
                curveToRelative(0.055f, 0.763f, 0.617f, 1.345f, 1.304f, 1.512f)
                lineToRelative(1.45f, 0.352f)
                curveToRelative(0.078f, 0.02f, 0.172f, 0.09f, 0.22f, 0.225f)
                curveToRelative(0.09f, 0.248f, 0.191f, 0.491f, 0.303f, 0.729f)
                curveToRelative(0.06f, 0.129f, 0.044f, 0.245f, 0.002f, 0.314f)
                lineToRelative(-0.776f, 1.274f)
                curveToRelative(-0.368f, 0.604f, -0.354f, 1.412f, 0.147f, 1.99f)
                curveToRelative(0.348f, 0.403f, 0.726f, 0.78f, 1.128f, 1.129f)
                curveToRelative(0.579f, 0.5f, 1.387f, 0.515f, 1.99f, 0.147f)
                lineToRelative(1.275f, -0.776f)
                curveToRelative(0.069f, -0.042f, 0.185f, -0.059f, 0.315f, 0.002f)
                curveToRelative(0.237f, 0.112f, 0.48f, 0.213f, 0.728f, 0.302f)
                curveToRelative(0.135f, 0.05f, 0.206f, 0.143f, 0.225f, 0.221f)
                lineToRelative(0.352f, 1.45f)
                curveToRelative(0.167f, 0.687f, 0.749f, 1.249f, 1.512f, 1.303f)
                arcToRelative(11.125f, 11.125f, 0.0f, false, false, 1.594f, 0.0f)
                curveToRelative(0.763f, -0.054f, 1.345f, -0.616f, 1.512f, -1.303f)
                lineToRelative(0.352f, -1.45f)
                curveToRelative(0.02f, -0.078f, 0.09f, -0.172f, 0.225f, -0.22f)
                curveToRelative(0.248f, -0.09f, 0.491f, -0.191f, 0.729f, -0.303f)
                curveToRelative(0.129f, -0.06f, 0.245f, -0.044f, 0.314f, -0.002f)
                lineToRelative(1.274f, 0.776f)
                curveToRelative(0.604f, 0.368f, 1.412f, 0.354f, 1.99f, -0.147f)
                curveToRelative(0.403f, -0.348f, 0.78f, -0.726f, 1.129f, -1.128f)
                curveToRelative(0.5f, -0.579f, 0.515f, -1.387f, 0.147f, -1.99f)
                lineToRelative(-0.776f, -1.275f)
                curveToRelative(-0.042f, -0.069f, -0.059f, -0.185f, 0.002f, -0.315f)
                curveToRelative(0.112f, -0.237f, 0.213f, -0.48f, 0.302f, -0.728f)
                curveToRelative(0.05f, -0.135f, 0.143f, -0.206f, 0.221f, -0.225f)
                lineToRelative(1.45f, -0.352f)
                curveToRelative(0.687f, -0.167f, 1.249f, -0.749f, 1.303f, -1.512f)
                arcToRelative(11.125f, 11.125f, 0.0f, false, false, 0.0f, -1.594f)
                curveToRelative(-0.054f, -0.763f, -0.616f, -1.345f, -1.303f, -1.512f)
                lineToRelative(-1.45f, -0.352f)
                curveToRelative(-0.078f, -0.02f, -0.172f, -0.09f, -0.22f, -0.225f)
                arcToRelative(8.469f, 8.469f, 0.0f, false, false, -0.303f, -0.728f)
                curveToRelative(-0.06f, -0.13f, -0.044f, -0.246f, -0.002f, -0.315f)
                lineToRelative(0.776f, -1.274f)
                curveToRelative(0.368f, -0.604f, 0.354f, -1.412f, -0.147f, -1.99f)
                curveToRelative(-0.348f, -0.403f, -0.726f, -0.78f, -1.128f, -1.129f)
                curveToRelative(-0.579f, -0.5f, -1.387f, -0.515f, -1.99f, -0.147f)
                lineToRelative(-1.275f, 0.776f)
                curveToRelative(-0.069f, 0.042f, -0.185f, 0.059f, -0.315f, -0.002f)
                arcToRelative(8.465f, 8.465f, 0.0f, false, false, -0.728f, -0.302f)
                curveToRelative(-0.135f, -0.05f, -0.206f, -0.143f, -0.225f, -0.221f)
                lineToRelative(-0.352f, -1.45f)
                curveToRelative(-0.167f, -0.687f, -0.749f, -1.249f, -1.512f, -1.304f)
                arcTo(11.149f, 11.149f, 0.0f, false, false, 12.0f, 1.0f)
                close()
                moveTo(11.31f, 2.525f)
                arcToRelative(9.648f, 9.648f, 0.0f, false, true, 1.38f, 0.0f)
                curveToRelative(0.055f, 0.004f, 0.135f, 0.05f, 0.162f, 0.16f)
                lineToRelative(0.351f, 1.45f)
                curveToRelative(0.153f, 0.628f, 0.626f, 1.08f, 1.173f, 1.278f)
                curveToRelative(0.205f, 0.074f, 0.405f, 0.157f, 0.6f, 0.249f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, 1.733f, -0.074f)
                lineToRelative(1.275f, -0.776f)
                curveToRelative(0.097f, -0.06f, 0.186f, -0.036f, 0.228f, 0.0f)
                curveToRelative(0.348f, 0.302f, 0.674f, 0.628f, 0.976f, 0.976f)
                curveToRelative(0.036f, 0.042f, 0.06f, 0.13f, 0.0f, 0.228f)
                lineToRelative(-0.776f, 1.274f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, -0.074f, 1.734f)
                curveToRelative(0.092f, 0.195f, 0.175f, 0.395f, 0.248f, 0.6f)
                curveToRelative(0.198f, 0.547f, 0.652f, 1.02f, 1.278f, 1.172f)
                lineToRelative(1.45f, 0.353f)
                curveToRelative(0.111f, 0.026f, 0.157f, 0.106f, 0.161f, 0.161f)
                arcToRelative(9.653f, 9.653f, 0.0f, false, true, 0.0f, 1.38f)
                curveToRelative(-0.004f, 0.055f, -0.05f, 0.135f, -0.16f, 0.162f)
                lineToRelative(-1.45f, 0.351f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, false, -1.278f, 1.173f)
                arcToRelative(6.926f, 6.926f, 0.0f, false, true, -0.25f, 0.6f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, 0.075f, 1.733f)
                lineToRelative(0.776f, 1.275f)
                curveToRelative(0.06f, 0.097f, 0.036f, 0.186f, 0.0f, 0.228f)
                arcToRelative(9.555f, 9.555f, 0.0f, false, true, -0.976f, 0.976f)
                curveToRelative(-0.042f, 0.036f, -0.13f, 0.06f, -0.228f, 0.0f)
                lineToRelative(-1.275f, -0.776f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, -1.733f, -0.074f)
                arcToRelative(6.926f, 6.926f, 0.0f, false, true, -0.6f, 0.248f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, false, -1.172f, 1.278f)
                lineToRelative(-0.353f, 1.45f)
                curveToRelative(-0.026f, 0.111f, -0.106f, 0.157f, -0.161f, 0.161f)
                arcToRelative(9.653f, 9.653f, 0.0f, false, true, -1.38f, 0.0f)
                curveToRelative(-0.055f, -0.004f, -0.135f, -0.05f, -0.162f, -0.16f)
                lineToRelative(-0.351f, -1.45f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, false, -1.173f, -1.278f)
                arcToRelative(6.928f, 6.928f, 0.0f, false, true, -0.6f, -0.25f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, -1.734f, 0.075f)
                lineToRelative(-1.274f, 0.776f)
                curveToRelative(-0.097f, 0.06f, -0.186f, 0.036f, -0.228f, 0.0f)
                arcToRelative(9.56f, 9.56f, 0.0f, false, true, -0.976f, -0.976f)
                curveToRelative(-0.036f, -0.042f, -0.06f, -0.13f, 0.0f, -0.228f)
                lineToRelative(0.776f, -1.275f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, 0.074f, -1.733f)
                arcToRelative(6.948f, 6.948f, 0.0f, false, true, -0.249f, -0.6f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, false, -1.277f, -1.172f)
                lineToRelative(-1.45f, -0.353f)
                curveToRelative(-0.111f, -0.026f, -0.157f, -0.106f, -0.161f, -0.161f)
                arcToRelative(9.648f, 9.648f, 0.0f, false, true, 0.0f, -1.38f)
                curveToRelative(0.004f, -0.055f, 0.05f, -0.135f, 0.16f, -0.162f)
                lineToRelative(1.45f, -0.351f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, false, 1.278f, -1.173f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, true, 0.249f, -0.6f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, -0.074f, -1.734f)
                lineToRelative(-0.776f, -1.274f)
                curveToRelative(-0.06f, -0.097f, -0.036f, -0.186f, 0.0f, -0.228f)
                curveToRelative(0.302f, -0.348f, 0.628f, -0.674f, 0.976f, -0.976f)
                curveToRelative(0.042f, -0.036f, 0.13f, -0.06f, 0.228f, 0.0f)
                lineToRelative(1.274f, 0.776f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, false, 1.734f, 0.074f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, true, 0.6f, -0.249f)
                arcToRelative(1.833f, 1.833f, 0.0f, false, false, 1.172f, -1.277f)
                lineToRelative(0.353f, -1.45f)
                curveToRelative(0.026f, -0.111f, 0.106f, -0.157f, 0.161f, -0.161f)
                close()
            }
        }
        .build()
        return _gear24!!
    }

private var _gear24: ImageVector? = null
