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

public val SolidGroup.BitcoinSign: ImageVector
    get() {
        if (_bitcoinSign != null) {
            return _bitcoinSign!!
        }
        _bitcoinSign = Builder(name = "BitcoinSign", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 32.0f)
                curveTo(48.0f, 14.3f, 62.3f, 0.0f, 80.0f, 0.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(112.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                lineTo(144.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(208.0f, 64.0f)
                curveToRelative(0.0f, 1.5f, -0.1f, 3.1f, -0.3f, 4.5f)
                curveTo(254.1f, 82.2f, 288.0f, 125.1f, 288.0f, 176.0f)
                curveToRelative(0.0f, 24.2f, -7.7f, 46.6f, -20.7f, 64.9f)
                curveToRelative(31.7f, 19.8f, 52.7f, 55.0f, 52.7f, 95.1f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(144.0f, 448.0f)
                lineTo(112.0f, 448.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(48.0f, 448.0f)
                lineTo(41.7f, 448.0f)
                curveTo(18.7f, 448.0f, 0.0f, 429.3f, 0.0f, 406.3f)
                lineTo(0.0f, 288.0f)
                lineTo(0.0f, 265.7f)
                lineTo(0.0f, 224.0f)
                lineTo(0.0f, 101.6f)
                curveTo(0.0f, 80.8f, 16.8f, 64.0f, 37.6f, 64.0f)
                lineTo(48.0f, 64.0f)
                lineTo(48.0f, 32.0f)
                close()
                moveTo(64.0f, 224.0f)
                lineTo(176.0f, 224.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(64.0f, 128.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(176.0f, 288.0f)
                lineTo(64.0f, 288.0f)
                verticalLineToRelative(96.0f)
                lineTo(208.0f, 384.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(176.0f, 288.0f)
                close()
            }
        }
        .build()
        return _bitcoinSign!!
    }

private var _bitcoinSign: ImageVector? = null
