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

public val SolidGroup.UserPen: ImageVector
    get() {
        if (_userPen != null) {
            return _userPen!!
        }
        _userPen = Builder(name = "UserPen", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
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
                lineTo(322.8f, 512.0f)
                curveToRelative(-3.1f, -8.8f, -3.7f, -18.4f, -1.4f, -27.8f)
                lineToRelative(15.0f, -60.1f)
                curveToRelative(2.8f, -11.3f, 8.6f, -21.5f, 16.8f, -29.7f)
                lineToRelative(40.3f, -40.3f)
                curveToRelative(-32.1f, -31.0f, -75.7f, -50.1f, -123.9f, -50.1f)
                lineTo(178.3f, 304.0f)
                close()
                moveTo(613.8f, 235.7f)
                curveToRelative(-15.6f, -15.6f, -40.9f, -15.6f, -56.6f, 0.0f)
                lineToRelative(-29.4f, 29.4f)
                lineToRelative(71.0f, 71.0f)
                lineToRelative(29.4f, -29.4f)
                curveToRelative(15.6f, -15.6f, 15.6f, -40.9f, 0.0f, -56.6f)
                lineToRelative(-14.4f, -14.4f)
                close()
                moveTo(375.9f, 417.0f)
                curveToRelative(-4.1f, 4.1f, -7.0f, 9.2f, -8.4f, 14.9f)
                lineToRelative(-15.0f, 60.1f)
                curveToRelative(-1.4f, 5.5f, 0.2f, 11.2f, 4.2f, 15.2f)
                reflectiveCurveToRelative(9.7f, 5.6f, 15.2f, 4.2f)
                lineToRelative(60.1f, -15.0f)
                curveToRelative(5.6f, -1.4f, 10.8f, -4.3f, 14.9f, -8.4f)
                lineTo(576.1f, 358.7f)
                lineToRelative(-71.0f, -71.0f)
                lineTo(375.9f, 417.0f)
                close()
            }
        }
        .build()
        return _userPen!!
    }

private var _userPen: ImageVector? = null
