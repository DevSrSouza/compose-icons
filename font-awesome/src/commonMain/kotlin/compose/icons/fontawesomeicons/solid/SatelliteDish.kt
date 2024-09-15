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
                curveToRelative(7.39f, 7.3f, 6.19f, 20.1f, -3.0f, 25.0f)
                curveToRelative(-77.71f, 41.8f, -176.73f, 29.91f, -242.34f, -35.71f)
                curveTo(-5.5f, 386.28f, -17.4f, 287.36f, 24.41f, 209.55f)
                curveToRelative(4.89f, -9.1f, 17.69f, -10.3f, 25.0f, -3.0f)
                lineTo(166.23f, 323.37f)
                lineToRelative(27.39f, -27.39f)
                curveToRelative(-0.69f, -2.61f, -1.59f, -5.0f, -1.59f, -7.81f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                curveToRelative(-2.8f, 0.0f, -5.2f, -0.89f, -7.8f, -1.59f)
                lineToRelative(-27.41f, 27.41f)
                close()
                moveTo(511.98f, 303.07f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -16.0f, 17.0f)
                lineTo(463.86f, 320.07f)
                arcToRelative(15.97f, 15.97f, 0.0f, false, true, -15.89f, -15.0f)
                curveTo(440.47f, 175.55f, 336.45f, 70.53f, 207.03f, 63.53f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, true, -15.0f, -15.91f)
                lineTo(192.03f, 16.03f)
                arcTo(16.09f, 16.09f, 0.0f, false, true, 209.03f, 0.02f)
                curveTo(372.25f, 8.62f, 503.47f, 139.84f, 511.98f, 303.07f)
                close()
                moveTo(415.96f, 302.77f)
                arcToRelative(16.21f, 16.21f, 0.0f, false, true, -16.11f, 17.3f)
                lineTo(367.64f, 320.07f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, true, -15.89f, -14.71f)
                curveToRelative(-6.91f, -77.01f, -68.12f, -138.91f, -144.92f, -145.22f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, -14.8f, -15.89f)
                lineTo(192.03f, 112.13f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, true, 17.3f, -16.1f)
                curveTo(319.45f, 104.54f, 407.56f, 192.65f, 415.96f, 302.77f)
                close()
            }
        }
        .build()
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
