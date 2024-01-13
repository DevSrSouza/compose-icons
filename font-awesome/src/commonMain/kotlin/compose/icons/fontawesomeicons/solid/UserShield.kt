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

public val SolidGroup.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 224.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(178.3f, 304.0f)
                curveTo(79.8f, 304.0f, 0.0f, 383.8f, 0.0f, 482.3f)
                curveTo(0.0f, 498.7f, 13.3f, 512.0f, 29.7f, 512.0f)
                lineTo(418.3f, 512.0f)
                curveToRelative(1.8f, 0.0f, 3.5f, -0.2f, 5.3f, -0.5f)
                curveToRelative(-76.3f, -55.1f, -99.8f, -141.0f, -103.1f, -200.2f)
                curveToRelative(-16.1f, -4.8f, -33.1f, -7.3f, -50.7f, -7.3f)
                lineTo(178.3f, 304.0f)
                close()
                moveTo(487.1f, 225.7f)
                lineToRelative(-120.0f, 48.0f)
                curveTo(358.0f, 277.4f, 352.0f, 286.2f, 352.0f, 296.0f)
                curveToRelative(0.0f, 63.3f, 25.9f, 168.8f, 134.8f, 214.2f)
                curveToRelative(5.9f, 2.5f, 12.6f, 2.5f, 18.5f, 0.0f)
                curveTo(614.1f, 464.8f, 640.0f, 359.3f, 640.0f, 296.0f)
                curveToRelative(0.0f, -9.8f, -6.0f, -18.6f, -15.1f, -22.3f)
                lineToRelative(-120.0f, -48.0f)
                curveToRelative(-5.7f, -2.3f, -12.1f, -2.3f, -17.8f, 0.0f)
                close()
                moveTo(591.4f, 312.0f)
                curveToRelative(-3.9f, 50.7f, -27.2f, 116.7f, -95.4f, 149.7f)
                lineTo(496.0f, 273.8f)
                lineTo(591.4f, 312.0f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
