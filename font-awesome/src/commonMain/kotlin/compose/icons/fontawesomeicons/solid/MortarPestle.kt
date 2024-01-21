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

public val SolidGroup.MortarPestle: ImageVector
    get() {
        if (_mortarPestle != null) {
            return _mortarPestle!!
        }
        _mortarPestle = Builder(name = "MortarPestle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.3f, 11.1f)
                curveTo(493.3f, -1.6f, 474.5f, -3.7f, 461.0f, 6.2f)
                lineTo(252.3f, 160.0f)
                horizontalLineTo(397.3f)
                lineTo(502.6f, 54.6f)
                curveToRelative(11.8f, -11.8f, 12.6f, -30.8f, 1.6f, -43.5f)
                close()
                moveTo(32.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                curveToRelative(0.0f, 82.5f, 43.4f, 147.7f, 123.9f, 176.2f)
                curveToRelative(-11.1f, 13.9f, -19.4f, 30.3f, -23.9f, 48.1f)
                curveTo(127.6f, 497.4f, 142.3f, 512.0f, 160.0f, 512.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.4f, -14.6f, 28.1f, -31.7f)
                curveToRelative(-4.5f, -17.8f, -12.8f, -34.1f, -23.9f, -48.1f)
                curveTo(436.6f, 403.7f, 480.0f, 338.5f, 480.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
