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

public val SolidGroup.PesoSign: ImageVector
    get() {
        if (_pesoSign != null) {
            return _pesoSign!!
        }
        _pesoSign = Builder(name = "PesoSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(46.3f, 32.0f, 32.0f, 46.3f, 32.0f, 64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(96.0f, 384.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(68.4f, 0.0f, 127.7f, -39.0f, 156.8f, -96.0f)
                lineTo(352.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(0.5f, -5.3f, 0.7f, -10.6f, 0.7f, -16.0f)
                reflectiveCurveToRelative(-0.2f, -10.7f, -0.7f, -16.0f)
                horizontalLineToRelative(0.7f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(332.8f, 128.0f)
                curveTo(303.7f, 71.0f, 244.4f, 32.0f, 176.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(254.4f, 128.0f)
                lineTo(96.0f, 128.0f)
                lineTo(96.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(30.5f, 0.0f, 58.2f, 12.2f, 78.4f, 32.0f)
                close()
                moveTo(96.0f, 192.0f)
                lineTo(286.9f, 192.0f)
                curveToRelative(0.7f, 5.2f, 1.1f, 10.6f, 1.1f, 16.0f)
                reflectiveCurveToRelative(-0.4f, 10.8f, -1.1f, 16.0f)
                lineTo(96.0f, 224.0f)
                lineTo(96.0f, 192.0f)
                close()
                moveTo(254.4f, 288.0f)
                curveToRelative(-20.2f, 19.8f, -47.9f, 32.0f, -78.4f, 32.0f)
                lineTo(96.0f, 320.0f)
                lineTo(96.0f, 288.0f)
                lineTo(254.4f, 288.0f)
                close()
            }
        }
        .build()
        return _pesoSign!!
    }

private var _pesoSign: ImageVector? = null
