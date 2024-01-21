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

public val SimpleIcons.Forgejo: ImageVector
    get() {
        if (_forgejo != null) {
            return _forgejo!!
        }
        _forgejo = Builder(name = "Forgejo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7773f, 0.0f)
                curveToRelative(1.6018f, 0.0f, 2.9004f, 1.2986f, 2.9004f, 2.9005f)
                reflectiveCurveToRelative(-1.2986f, 2.9004f, -2.9004f, 2.9004f)
                curveToRelative(-1.0854f, 0.0f, -2.0315f, -0.596f, -2.5288f, -1.4787f)
                lineTo(12.91f, 4.3222f)
                curveToRelative(-2.3322f, 0.0f, -4.2272f, 1.8718f, -4.2649f, 4.195f)
                lineToRelative(-7.0E-4f, 2.1175f)
                arcToRelative(7.0759f, 7.0759f, 0.0f, false, true, 4.148f, -1.4205f)
                lineToRelative(0.1176f, -0.001f)
                lineToRelative(1.3385f, 2.0E-4f)
                curveToRelative(0.4973f, -0.8827f, 1.4434f, -1.4788f, 2.5288f, -1.4788f)
                curveToRelative(1.6018f, 0.0f, 2.9004f, 1.2986f, 2.9004f, 2.9005f)
                reflectiveCurveToRelative(-1.2986f, 2.9004f, -2.9004f, 2.9004f)
                curveToRelative(-1.0854f, 0.0f, -2.0315f, -0.596f, -2.5288f, -1.4787f)
                lineTo(12.91f, 12.0568f)
                curveToRelative(-2.3322f, 0.0f, -4.2272f, 1.8718f, -4.2649f, 4.195f)
                lineToRelative(-7.0E-4f, 2.319f)
                curveToRelative(0.8827f, 0.4973f, 1.4788f, 1.4434f, 1.4788f, 2.5287f)
                curveToRelative(0.0f, 1.602f, -1.2986f, 2.9005f, -2.9005f, 2.9005f)
                curveToRelative(-1.6018f, 0.0f, -2.9004f, -1.2986f, -2.9004f, -2.9005f)
                curveToRelative(0.0f, -1.0853f, 0.596f, -2.0314f, 1.4788f, -2.5287f)
                lineToRelative(-2.0E-4f, -9.9831f)
                curveToRelative(0.0f, -3.887f, 3.1195f, -7.0453f, 6.9915f, -7.108f)
                lineToRelative(0.1176f, -0.001f)
                horizontalLineToRelative(1.3385f)
                curveTo(14.7458f, 0.5962f, 15.692f, 0.0f, 16.7773f, 0.0f)
                close()
                moveTo(7.2227f, 19.9052f)
                curveToRelative(-0.6596f, 0.0f, -1.1943f, 0.5347f, -1.1943f, 1.1943f)
                reflectiveCurveToRelative(0.5347f, 1.1943f, 1.1943f, 1.1943f)
                reflectiveCurveToRelative(1.1944f, -0.5347f, 1.1944f, -1.1943f)
                reflectiveCurveToRelative(-0.5348f, -1.1943f, -1.1944f, -1.1943f)
                close()
                moveTo(16.7773f, 9.4408f)
                curveToRelative(-0.6596f, 0.0f, -1.1944f, 0.5347f, -1.1944f, 1.1943f)
                reflectiveCurveToRelative(0.5348f, 1.1943f, 1.1944f, 1.1943f)
                curveToRelative(0.6596f, 0.0f, 1.1943f, -0.5347f, 1.1943f, -1.1943f)
                reflectiveCurveToRelative(-0.5347f, -1.1943f, -1.1943f, -1.1943f)
                close()
                moveTo(16.7773f, 1.7062f)
                curveToRelative(-0.6596f, 0.0f, -1.1944f, 0.5347f, -1.1944f, 1.1943f)
                reflectiveCurveToRelative(0.5348f, 1.1943f, 1.1944f, 1.1943f)
                curveToRelative(0.6596f, 0.0f, 1.1943f, -0.5347f, 1.1943f, -1.1943f)
                reflectiveCurveToRelative(-0.5347f, -1.1943f, -1.1943f, -1.1943f)
                close()
            }
        }
        .build()
        return _forgejo!!
    }

private var _forgejo: ImageVector? = null
