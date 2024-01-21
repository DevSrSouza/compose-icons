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

public val SolidGroup.TurkishLiraSign: ImageVector
    get() {
        if (_turkishLiraSign != null) {
            return _turkishLiraSign!!
        }
        _turkishLiraSign = Builder(name = "TurkishLiraSign", defaultWidth = 384.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(99.3f)
                lineTo(247.2f, 65.2f)
                curveToRelative(17.0f, -4.9f, 34.7f, 5.0f, 39.6f, 22.0f)
                reflectiveCurveToRelative(-5.0f, 34.7f, -22.0f, 39.6f)
                lineTo(128.0f, 165.9f)
                verticalLineToRelative(29.4f)
                lineToRelative(119.2f, -34.1f)
                curveToRelative(17.0f, -4.9f, 34.7f, 5.0f, 39.6f, 22.0f)
                reflectiveCurveToRelative(-5.0f, 34.7f, -22.0f, 39.6f)
                lineTo(128.0f, 261.9f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(63.8f)
                curveToRelative(68.2f, 0.0f, 124.4f, -53.5f, 127.8f, -121.6f)
                lineToRelative(0.4f, -8.0f)
                curveToRelative(0.9f, -17.7f, 15.9f, -31.2f, 33.6f, -30.4f)
                reflectiveCurveToRelative(31.2f, 15.9f, 30.4f, 33.6f)
                lineToRelative(-0.4f, 8.0f)
                curveTo(378.5f, 399.8f, 294.1f, 480.0f, 191.8f, 480.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(280.1f)
                lineToRelative(-23.2f, 6.6f)
                curveToRelative(-17.0f, 4.9f, -34.7f, -5.0f, -39.6f, -22.0f)
                reflectiveCurveToRelative(5.0f, -34.7f, 22.0f, -39.6f)
                lineTo(64.0f, 213.6f)
                verticalLineTo(184.1f)
                lineToRelative(-23.2f, 6.6f)
                curveToRelative(-17.0f, 4.9f, -34.7f, -5.0f, -39.6f, -22.0f)
                reflectiveCurveToRelative(5.0f, -34.7f, 22.0f, -39.6f)
                lineTo(64.0f, 117.6f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _turkishLiraSign!!
    }

private var _turkishLiraSign: ImageVector? = null
