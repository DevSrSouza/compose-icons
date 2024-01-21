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

public val SolidGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.2f, 17.0f)
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
                lineToRelative(-14.6f, -82.8f)
                curveToRelative(-3.9f, -22.1f, -14.6f, -42.3f, -30.7f, -57.9f)
                lineTo(388.9f, 57.5f)
                curveToRelative(-16.1f, -15.6f, -36.6f, -25.6f, -58.7f, -28.7f)
                lineTo(247.2f, 17.0f)
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
