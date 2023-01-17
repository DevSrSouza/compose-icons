package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.SponsorTiers24: ImageVector
    get() {
        if (_sponsorTiers24 != null) {
            return _sponsorTiers24!!
        }
        _sponsorTiers24 = Builder(name = "SponsorTiers24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.004f, 1.25f)
                curveTo(18.311f, 1.25f, 20.0f, 3.128f, 20.0f, 5.75f)
                curveToRelative(0.0f, 2.292f, -1.23f, 4.464f, -3.295f, 6.485f)
                curveToRelative(-0.481f, 0.47f, -0.98f, 0.909f, -1.482f, 1.31f)
                lineToRelative(0.265f, 1.32f)
                lineToRelative(1.375f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.982f, 0.844f)
                lineToRelative(-3.512f, -1.207f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.488f, 0.0f)
                lineTo(8.37f, 23.209f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.982f, -0.844f)
                lineToRelative(1.378f, -7.512f)
                lineToRelative(0.261f, -1.309f)
                curveToRelative(-0.5f, -0.4f, -1.0f, -0.838f, -1.481f, -1.31f)
                curveTo(5.479f, 10.215f, 4.25f, 8.043f, 4.25f, 5.75f)
                curveToRelative(0.0f, -2.622f, 1.689f, -4.5f, 3.996f, -4.5f)
                curveToRelative(1.55f, 0.0f, 2.947f, 0.752f, 3.832f, 1.967f)
                lineToRelative(0.047f, 0.067f)
                lineToRelative(0.047f, -0.067f)
                arcToRelative(4.726f, 4.726f, 0.0f, false, true, 3.612f, -1.962f)
                lineToRelative(0.22f, -0.005f)
                close()
                moveTo(13.89f, 14.531f)
                curveToRelative(-0.418f, 0.285f, -0.828f, 0.542f, -1.218f, 0.77f)
                lineToRelative(-0.18f, 0.103f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.734f, 0.0f)
                lineToRelative(-0.071f, -0.04f)
                lineToRelative(-0.46f, -0.272f)
                curveToRelative(-0.282f, -0.173f, -0.573f, -0.36f, -0.868f, -0.562f)
                lineToRelative(-0.121f, 0.605f)
                lineToRelative(-1.145f, 6.239f)
                lineToRelative(2.3f, -0.79f)
                arcToRelative(2.248f, 2.248f, 0.0f, false, true, 1.284f, -0.054f)
                lineToRelative(0.18f, 0.053f)
                lineToRelative(2.299f, 0.79f)
                lineToRelative(-1.141f, -6.226f)
                lineToRelative(-0.125f, -0.616f)
                close()
                moveTo(16.004f, 2.75f)
                curveToRelative(-1.464f, 0.0f, -2.731f, 0.983f, -3.159f, 2.459f)
                curveToRelative(-0.209f, 0.721f, -1.231f, 0.721f, -1.44f, 0.0f)
                curveToRelative(-0.428f, -1.476f, -1.695f, -2.459f, -3.16f, -2.459f)
                curveToRelative(-1.44f, 0.0f, -2.495f, 1.173f, -2.495f, 3.0f)
                curveToRelative(0.0f, 1.811f, 1.039f, 3.647f, 2.844f, 5.412f)
                arcToRelative(19.624f, 19.624f, 0.0f, false, false, 3.734f, 2.84f)
                lineToRelative(-0.019f, -0.011f)
                lineToRelative(-0.184f, -0.111f)
                lineToRelative(0.147f, -0.088f)
                arcToRelative(19.81f, 19.81f, 0.0f, false, false, 3.015f, -2.278f)
                lineToRelative(0.37f, -0.352f)
                curveTo(17.46f, 9.397f, 18.5f, 7.561f, 18.5f, 5.75f)
                curveToRelative(0.0f, -1.827f, -1.055f, -3.0f, -2.496f, -3.0f)
                close()
            }
        }
        .build()
        return _sponsorTiers24!!
    }

private var _sponsorTiers24: ImageVector? = null
