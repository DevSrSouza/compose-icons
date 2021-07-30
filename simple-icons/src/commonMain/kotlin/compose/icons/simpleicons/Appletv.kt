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

public val SimpleIcons.Appletv: ImageVector
    get() {
        if (_appletv != null) {
            return _appletv!!
        }
        _appletv = Builder(name = "Appletv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.57f, 17.735f)
                horizontalLineToRelative(-1.815f)
                lineToRelative(-3.34f, -9.203f)
                horizontalLineToRelative(1.633f)
                lineToRelative(2.02f, 5.987f)
                curveToRelative(0.075f, 0.231f, 0.273f, 0.9f, 0.586f, 2.012f)
                lineToRelative(0.297f, -0.997f)
                lineToRelative(0.33f, -1.006f)
                lineToRelative(2.094f, -6.004f)
                lineTo(24.0f, 8.524f)
                close()
                moveTo(15.226f, 17.669f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, -1.55f, 0.207f)
                curveToRelative(-1.23f, 0.0f, -1.84f, -0.693f, -1.84f, -2.087f)
                lineTo(11.836f, 9.646f)
                horizontalLineToRelative(-1.063f)
                lineTo(10.773f, 8.532f)
                horizontalLineToRelative(1.121f)
                lineTo(11.894f, 7.081f)
                lineToRelative(1.476f, -0.602f)
                verticalLineToRelative(2.062f)
                horizontalLineToRelative(1.707f)
                verticalLineToRelative(1.113f)
                lineTo(13.38f, 9.654f)
                verticalLineToRelative(5.805f)
                curveToRelative(0.0f, 0.446f, 0.074f, 0.75f, 0.214f, 0.932f)
                curveToRelative(0.14f, 0.182f, 0.396f, 0.264f, 0.75f, 0.264f)
                curveToRelative(0.207f, 0.0f, 0.495f, -0.041f, 0.883f, -0.115f)
                close()
                moveTo(7.936f, 12.326f)
                curveToRelative(0.017f, 1.764f, 1.55f, 2.358f, 1.567f, 2.366f)
                curveToRelative(-0.017f, 0.042f, -0.248f, 0.842f, -0.808f, 1.658f)
                curveToRelative(-0.487f, 0.71f, -0.99f, 1.418f, -1.79f, 1.435f)
                curveToRelative(-0.783f, 0.016f, -1.03f, -0.462f, -1.93f, -0.462f)
                curveToRelative(-0.89f, 0.0f, -1.17f, 0.445f, -1.913f, 0.478f)
                curveToRelative(-0.758f, 0.025f, -1.344f, -0.775f, -1.838f, -1.484f)
                curveToRelative(-0.998f, -1.451f, -1.765f, -4.098f, -0.734f, -5.88f)
                curveToRelative(0.51f, -0.89f, 1.426f, -1.451f, 2.416f, -1.46f)
                curveToRelative(0.75f, -0.016f, 1.468f, 0.512f, 1.93f, 0.512f)
                curveToRelative(0.461f, 0.0f, 1.327f, -0.627f, 2.234f, -0.536f)
                curveToRelative(0.38f, 0.016f, 1.452f, 0.157f, 2.136f, 1.154f)
                curveToRelative(-0.058f, 0.033f, -1.278f, 0.743f, -1.27f, 2.219f)
                moveTo(6.468f, 7.988f)
                curveToRelative(0.404f, -0.495f, 0.685f, -1.18f, 0.61f, -1.864f)
                curveToRelative(-0.585f, 0.025f, -1.294f, 0.388f, -1.723f, 0.883f)
                curveToRelative(-0.38f, 0.437f, -0.71f, 1.138f, -0.619f, 1.806f)
                curveToRelative(0.652f, 0.05f, 1.328f, -0.338f, 1.732f, -0.825f)
                close()
            }
        }
        .build()
        return _appletv!!
    }

private var _appletv: ImageVector? = null
