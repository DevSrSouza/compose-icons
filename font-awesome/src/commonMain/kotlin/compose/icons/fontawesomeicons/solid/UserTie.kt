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

public val SolidGroup.UserTie: ImageVector
    get() {
        if (_userTie != null) {
            return _userTie!!
        }
        _userTie = Builder(name = "UserTie", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 96.0f, 128.0f)
                close()
                moveTo(190.5f, 328.2f)
                lineToRelative(18.6f, 31.0f)
                lineTo(175.8f, 483.1f)
                lineToRelative(-36.0f, -146.9f)
                curveToRelative(-2.0f, -8.1f, -9.8f, -13.4f, -17.9f, -11.3f)
                curveTo(51.9f, 342.4f, 0.0f, 405.8f, 0.0f, 481.3f)
                curveToRelative(0.0f, 17.0f, 13.8f, 30.7f, 30.7f, 30.7f)
                lineTo(162.5f, 512.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f)
                lineTo(168.0f, 512.0f)
                lineTo(280.0f, 512.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f)
                lineTo(417.3f, 512.0f)
                curveToRelative(17.0f, 0.0f, 30.7f, -13.8f, 30.7f, -30.7f)
                curveToRelative(0.0f, -75.5f, -51.9f, -138.9f, -121.9f, -156.4f)
                curveToRelative(-8.1f, -2.0f, -15.9f, 3.3f, -17.9f, 11.3f)
                lineToRelative(-36.0f, 146.9f)
                lineTo(238.9f, 359.2f)
                lineToRelative(18.6f, -31.0f)
                curveToRelative(6.4f, -10.7f, -1.3f, -24.2f, -13.7f, -24.2f)
                lineTo(224.0f, 304.0f)
                lineTo(204.3f, 304.0f)
                curveToRelative(-12.4f, 0.0f, -20.1f, 13.6f, -13.7f, 24.2f)
                close()
            }
        }
        .build()
        return _userTie!!
    }

private var _userTie: ImageVector? = null
