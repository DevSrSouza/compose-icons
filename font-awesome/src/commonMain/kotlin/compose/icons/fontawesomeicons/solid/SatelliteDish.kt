package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) {
            return _satelliteDish!!
        }
        _satelliteDish = Builder(name = "SatelliteDish", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.45f, 462.59f)
                curveToRelative(7.392f, 7.298f, 6.188f, 20.097f, -3.0f, 25.004f)
                curveToRelative(-77.713f, 41.803f, -176.726f, 29.91f, -242.343f, -35.708f)
                curveTo(-5.496f, 386.282f, -17.404f, 287.362f, 24.414f, 209.554f)
                curveToRelative(4.891f, -9.095f, 17.69f, -10.298f, 25.003f, -3.0f)
                lineTo(166.229f, 323.367f)
                lineToRelative(27.394f, -27.395f)
                curveToRelative(-0.688f, -2.61f, -1.594f, -5.001f, -1.594f, -7.814f)
                arcToRelative(32.004f, 32.004f, 0.0f, true, true, 32.004f, 32.005f)
                curveToRelative(-2.797f, 0.0f, -5.204f, -0.891f, -7.798f, -1.594f)
                lineToRelative(-27.41f, 27.41f)
                close()
                moveTo(511.976f, 303.067f)
                arcToRelative(16.103f, 16.103f, 0.0f, false, true, -16.002f, 17.002f)
                lineTo(463.86f, 320.07f)
                arcToRelative(15.97f, 15.97f, 0.0f, false, true, -15.893f, -15.002f)
                curveTo(440.467f, 175.549f, 336.453f, 70.534f, 207.031f, 63.533f)
                arcToRelative(15.845f, 15.845f, 0.0f, false, true, -15.002f, -15.909f)
                lineTo(192.029f, 16.027f)
                arcTo(16.094f, 16.094f, 0.0f, false, true, 209.031f, 0.024f)
                curveTo(372.255f, 8.619f, 503.475f, 139.841f, 511.976f, 303.067f)
                close()
                moveTo(415.964f, 302.77f)
                arcToRelative(16.211f, 16.211f, 0.0f, false, true, -16.111f, 17.299f)
                lineTo(367.645f, 320.07f)
                arcToRelative(16.069f, 16.069f, 0.0f, false, true, -15.893f, -14.705f)
                curveToRelative(-6.907f, -77.011f, -68.118f, -138.91f, -144.925f, -145.224f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, -14.799f, -15.893f)
                lineTo(192.029f, 112.134f)
                arcToRelative(16.134f, 16.134f, 0.0f, false, true, 17.299f, -16.096f)
                curveTo(319.451f, 104.539f, 407.556f, 192.645f, 415.964f, 302.77f)
                close()
            }
        }
        .build()
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
