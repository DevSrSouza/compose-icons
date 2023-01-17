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

public val SolidGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(199.5f)
                lineToRelative(111.5f, -66.9f)
                curveToRelative(15.2f, -9.1f, 34.8f, -4.2f, 43.9f, 11.0f)
                reflectiveCurveToRelative(4.2f, 34.8f, -11.0f, 43.9f)
                lineTo(254.2f, 256.0f)
                lineToRelative(114.3f, 68.6f)
                curveToRelative(15.2f, 9.1f, 20.1f, 28.7f, 11.0f, 43.9f)
                reflectiveCurveToRelative(-28.7f, 20.1f, -43.9f, 11.0f)
                lineTo(224.0f, 312.5f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(312.5f)
                lineTo(48.5f, 379.4f)
                curveToRelative(-15.2f, 9.1f, -34.8f, 4.2f, -43.9f, -11.0f)
                reflectiveCurveToRelative(-4.2f, -34.8f, 11.0f, -43.9f)
                lineTo(129.8f, 256.0f)
                lineTo(15.5f, 187.4f)
                curveToRelative(-15.2f, -9.1f, -20.1f, -28.7f, -11.0f, -43.9f)
                reflectiveCurveToRelative(28.7f, -20.1f, 43.9f, -11.0f)
                lineTo(160.0f, 199.5f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
