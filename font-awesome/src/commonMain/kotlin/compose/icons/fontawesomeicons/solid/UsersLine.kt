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

public val SolidGroup.UsersLine: ImageVector
    get() {
        if (_usersLine != null) {
            return _usersLine!!
        }
        _usersLine = Builder(name = "UsersLine", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.2f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
                moveTo(32.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(85.6f)
                curveToRelative(10.1f, -39.4f, 38.6f, -71.5f, 75.8f, -86.6f)
                curveToRelative(-9.7f, -6.0f, -21.2f, -9.4f, -33.4f, -9.4f)
                lineTo(96.0f, 192.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                close()
                moveTo(493.6f, 288.0f)
                lineTo(576.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(448.0f, 192.0f)
                curveToRelative(-11.7f, 0.0f, -22.7f, 3.1f, -32.1f, 8.6f)
                curveToRelative(38.1f, 14.8f, 67.4f, 47.3f, 77.7f, 87.4f)
                close()
                moveTo(391.2f, 226.4f)
                curveToRelative(-6.9f, -1.6f, -14.2f, -2.4f, -21.6f, -2.4f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-8.5f, 0.0f, -16.7f, 1.1f, -24.5f, 3.1f)
                curveToRelative(-30.8f, 8.1f, -55.6f, 31.1f, -66.1f, 60.9f)
                curveToRelative(-3.5f, 10.0f, -5.5f, 20.8f, -5.5f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -11.2f, -1.9f, -22.0f, -5.5f, -32.0f)
                curveToRelative(-10.8f, -30.7f, -36.8f, -54.2f, -68.9f, -61.6f)
                close()
                moveTo(563.2f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
                moveTo(321.6f, 192.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
                moveTo(32.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(608.0f, 480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 416.0f)
                close()
            }
        }
        .build()
        return _usersLine!!
    }

private var _usersLine: ImageVector? = null
