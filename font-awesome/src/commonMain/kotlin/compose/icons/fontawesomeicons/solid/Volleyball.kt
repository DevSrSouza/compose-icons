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

public val SolidGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(511.8f, 267.4f)
                curveToRelative(-26.1f, 8.7f, -53.4f, 13.8f, -81.0f, 15.1f)
                curveToRelative(9.2f, -105.3f, -31.5f, -204.2f, -103.2f, -272.4f)
                curveTo(434.1f, 41.1f, 512.0f, 139.5f, 512.0f, 256.0f)
                curveToRelative(0.0f, 3.8f, -0.1f, 7.6f, -0.2f, 11.4f)
                close()
                moveTo(507.9f, 302.1f)
                curveToRelative(-5.8f, 32.0f, -17.6f, 62.0f, -34.2f, 88.7f)
                curveToRelative(-97.5f, 48.5f, -217.7f, 42.6f, -311.9f, -24.5f)
                curveToRelative(23.7f, -36.2f, 55.4f, -67.7f, 94.5f, -91.8f)
                curveToRelative(79.9f, 43.2f, 170.1f, 50.8f, 251.6f, 27.6f)
                close()
                moveTo(271.9f, 246.6f)
                curveToRelative(-2.5f, -90.9f, -41.1f, -172.7f, -101.9f, -231.7f)
                curveTo(196.8f, 5.2f, 225.8f, 0.0f, 256.0f, 0.0f)
                curveToRelative(2.7f, 0.0f, 5.3f, 0.0f, 7.9f, 0.1f)
                curveToRelative(90.8f, 60.2f, 145.7f, 167.2f, 134.7f, 282.3f)
                curveToRelative(-43.1f, -2.4f, -86.4f, -14.1f, -126.8f, -35.9f)
                close()
                moveTo(138.0f, 28.8f)
                curveToRelative(20.6f, 18.3f, 38.7f, 39.4f, 53.7f, 62.6f)
                curveTo(95.9f, 136.1f, 30.6f, 220.8f, 7.3f, 316.9f)
                curveTo(2.5f, 297.4f, 0.0f, 277.0f, 0.0f, 256.0f)
                curveTo(0.0f, 157.2f, 56.0f, 71.5f, 138.0f, 28.8f)
                close()
                moveTo(207.6f, 119.3f)
                curveToRelative(19.5f, 38.6f, 31.0f, 81.9f, 32.3f, 127.7f)
                curveTo(162.5f, 294.6f, 110.9f, 368.9f, 90.2f, 451.0f)
                curveTo(66.0f, 430.4f, 45.6f, 405.4f, 30.4f, 377.2f)
                curveToRelative(6.7f, -108.7f, 71.9f, -209.9f, 177.1f, -257.9f)
                close()
                moveTo(256.0f, 512.0f)
                curveToRelative(-50.7f, 0.0f, -98.0f, -14.7f, -137.8f, -40.2f)
                curveToRelative(5.6f, -27.0f, 14.8f, -53.1f, 27.4f, -77.7f)
                curveTo(232.2f, 454.6f, 338.1f, 468.8f, 433.0f, 441.0f)
                curveToRelative(-46.0f, 44.0f, -108.3f, 71.0f, -177.0f, 71.0f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
