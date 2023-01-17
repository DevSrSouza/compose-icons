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

public val SimpleIcons.Freebsd: ImageVector
    get() {
        if (_freebsd != null) {
            return _freebsd!!
        }
        _freebsd = Builder(name = "Freebsd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.682f, 2.406f)
                curveToRelative(-0.001f, -0.149f, -0.097f, -0.187f, -0.24f, -0.189f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(0.659f)
                horizontalLineToRelative(0.108f)
                verticalLineToRelative(-0.282f)
                horizontalLineToRelative(0.102f)
                lineToRelative(0.17f, 0.282f)
                horizontalLineToRelative(0.122f)
                lineToRelative(-0.184f, -0.29f)
                curveToRelative(0.102f, -0.012f, 0.175f, -0.065f, 0.172f, -0.18f)
                close()
                moveTo(23.3f, 2.502f)
                verticalLineToRelative(-0.193f)
                horizontalLineToRelative(0.13f)
                curveToRelative(0.06f, -0.002f, 0.145f, 0.011f, 0.143f, 0.089f)
                curveToRelative(0.005f, 0.09f, -0.08f, 0.107f, -0.153f, 0.103f)
                horizontalLineToRelative(-0.12f)
                close()
                moveTo(21.851f, 1.49f)
                curveToRelative(1.172f, 1.171f, -2.077f, 6.319f, -2.626f, 6.869f)
                curveToRelative(-0.549f, 0.548f, -1.944f, 0.044f, -3.115f, -1.128f)
                curveToRelative(-1.172f, -1.171f, -1.676f, -2.566f, -1.127f, -3.115f)
                curveToRelative(0.549f, -0.55f, 5.697f, -3.798f, 6.868f, -2.626f)
                close()
                moveTo(1.652f, 6.61f)
                curveTo(0.626f, 4.818f, -0.544f, 2.215f, 0.276f, 1.395f)
                curveToRelative(0.81f, -0.81f, 3.355f, 0.319f, 5.144f, 1.334f)
                arcTo(11.003f, 11.003f, 0.0f, false, false, 1.652f, 6.61f)
                close()
                moveTo(20.602f, 7.028f)
                arcToRelative(10.584f, 10.584f, 0.0f, false, true, 1.368f, 5.218f)
                curveToRelative(0.0f, 5.874f, -4.762f, 10.636f, -10.637f, 10.636f)
                curveTo(5.459f, 22.882f, 0.697f, 18.12f, 0.697f, 12.246f)
                curveTo(0.697f, 6.371f, 5.459f, 1.61f, 11.333f, 1.61f)
                curveToRelative(1.771f, 0.0f, 3.441f, 0.433f, 4.909f, 1.199f)
                curveToRelative(-0.361f, 0.201f, -0.69f, 0.398f, -0.969f, 0.574f)
                curveToRelative(-0.428f, -0.077f, -0.778f, -0.017f, -0.998f, 0.202f)
                curveToRelative(-0.402f, 0.402f, -0.269f, 1.245f, 0.263f, 2.2f)
                curveToRelative(0.273f, 0.539f, 0.701f, 1.124f, 1.25f, 1.674f)
                curveToRelative(0.103f, 0.104f, 0.208f, 0.202f, 0.315f, 0.297f)
                curveToRelative(1.519f, 1.446f, 3.205f, 2.111f, 3.829f, 1.486f)
                curveToRelative(0.267f, -0.267f, 0.297f, -0.728f, 0.132f, -1.287f)
                curveToRelative(0.167f, -0.27f, 0.35f, -0.584f, 0.538f, -0.927f)
                close()
                moveTo(23.416f, 1.94f)
                curveToRelative(-0.322f, 0.0f, -0.584f, 0.266f, -0.584f, 0.595f)
                reflectiveCurveToRelative(0.261f, 0.595f, 0.584f, 0.595f)
                curveToRelative(0.323f, 0.0f, 0.584f, -0.266f, 0.584f, -0.595f)
                reflectiveCurveToRelative(-0.261f, -0.595f, -0.584f, -0.595f)
                close()
                moveTo(23.416f, 3.027f)
                curveToRelative(-0.252f, 0.0f, -0.457f, -0.22f, -0.457f, -0.492f)
                reflectiveCurveToRelative(0.204f, -0.492f, 0.457f, -0.492f)
                curveToRelative(0.252f, 0.0f, 0.457f, 0.22f, 0.457f, 0.492f)
                reflectiveCurveToRelative(-0.204f, 0.492f, -0.457f, 0.492f)
                close()
            }
        }
        .build()
        return _freebsd!!
    }

private var _freebsd: ImageVector? = null
