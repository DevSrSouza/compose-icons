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

public val SolidGroup.AustralSign: ImageVector
    get() {
        if (_australSign != null) {
            return _australSign!!
        }
        _australSign = Builder(name = "AustralSign", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.5f, 51.7f)
                curveTo(248.6f, 39.8f, 236.9f, 32.0f, 224.0f, 32.0f)
                reflectiveCurveToRelative(-24.6f, 7.8f, -29.5f, 19.7f)
                lineTo(122.7f, 224.0f)
                lineTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(96.0f, 288.0f)
                lineTo(82.7f, 320.0f)
                lineTo(32.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(56.0f, 384.0f)
                lineTo(34.5f, 435.7f)
                curveToRelative(-6.8f, 16.3f, 0.9f, 35.0f, 17.2f, 41.8f)
                reflectiveCurveToRelative(35.0f, -0.9f, 41.8f, -17.2f)
                lineTo(125.3f, 384.0f)
                lineTo(322.7f, 384.0f)
                lineToRelative(31.8f, 76.3f)
                curveToRelative(6.8f, 16.3f, 25.5f, 24.0f, 41.8f, 17.2f)
                reflectiveCurveToRelative(24.0f, -25.5f, 17.2f, -41.8f)
                lineTo(392.0f, 384.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(365.3f, 320.0f)
                lineTo(352.0f, 288.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(325.3f, 224.0f)
                lineTo(253.5f, 51.7f)
                close()
                moveTo(256.0f, 224.0f)
                lineTo(192.0f, 224.0f)
                lineToRelative(32.0f, -76.8f)
                lineTo(256.0f, 224.0f)
                close()
                moveTo(165.3f, 288.0f)
                lineTo(282.7f, 288.0f)
                lineTo(296.0f, 320.0f)
                lineTo(152.0f, 320.0f)
                lineToRelative(13.3f, -32.0f)
                close()
            }
        }
        .build()
        return _australSign!!
    }

private var _australSign: ImageVector? = null
