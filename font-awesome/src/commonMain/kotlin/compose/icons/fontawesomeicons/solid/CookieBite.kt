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

public val SolidGroup.CookieBite: ImageVector
    get() {
        if (_cookieBite != null) {
            return _cookieBite!!
        }
        _cookieBite = Builder(name = "CookieBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.5f, 27.6f)
                curveToRelative(-0.8f, -5.4f, -4.9f, -9.8f, -10.3f, -10.6f)
                verticalLineToRelative(0.0f)
                curveToRelative(-22.1f, -3.1f, -44.6f, 0.9f, -64.4f, 11.4f)
                lineToRelative(-74.0f, 39.5f)
                curveTo(89.1f, 78.4f, 73.2f, 94.9f, 63.4f, 115.0f)
                lineTo(26.7f, 190.6f)
                curveToRelative(-9.8f, 20.1f, -13.0f, 42.9f, -9.1f, 64.9f)
                lineToRelative(14.5f, 82.8f)
                curveToRelative(3.9f, 22.1f, 14.6f, 42.3f, 30.7f, 57.9f)
                lineToRelative(60.3f, 58.4f)
                curveToRelative(16.1f, 15.6f, 36.6f, 25.6f, 58.7f, 28.7f)
                lineToRelative(83.0f, 11.7f)
                curveToRelative(22.1f, 3.1f, 44.6f, -0.9f, 64.4f, -11.4f)
                lineToRelative(74.0f, -39.5f)
                curveToRelative(19.7f, -10.5f, 35.6f, -27.0f, 45.4f, -47.2f)
                lineToRelative(36.7f, -75.5f)
                curveToRelative(9.8f, -20.1f, 13.0f, -42.9f, 9.1f, -64.9f)
                verticalLineToRelative(0.0f)
                curveToRelative(-0.9f, -5.3f, -5.3f, -9.3f, -10.6f, -10.1f)
                curveToRelative(-51.5f, -8.2f, -92.8f, -47.1f, -104.5f, -97.4f)
                curveToRelative(-1.8f, -7.6f, -8.0f, -13.4f, -15.7f, -14.6f)
                curveToRelative(-54.6f, -8.7f, -97.7f, -52.0f, -106.2f, -106.8f)
                close()
                moveTo(208.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(144.0f, 336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(368.0f, 272.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _cookieBite!!
    }

private var _cookieBite: ImageVector? = null
