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

public val SolidGroup.VirusSlash: ImageVector
    get() {
        if (_virusSlash != null) {
            return _virusSlash!!
        }
        _virusSlash = Builder(name = "VirusSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineToRelative(-154.3f, -121.0f)
                curveToRelative(-2.0f, -30.1f, 20.8f, -60.1f, 56.0f, -60.1f)
                lineTo(544.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(532.5f, 224.0f)
                curveToRelative(-49.9f, 0.0f, -74.9f, -60.3f, -39.6f, -95.6f)
                lineToRelative(8.2f, -8.2f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-8.2f, 8.2f)
                curveTo(412.3f, 118.4f, 352.0f, 93.4f, 352.0f, 43.5f)
                lineTo(352.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(288.0f, 43.5f)
                curveToRelative(0.0f, 49.9f, -60.3f, 74.9f, -95.6f, 39.6f)
                lineTo(184.2f, 75.0f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                curveToRelative(-1.6f, 1.6f, -3.1f, 3.4f, -4.3f, 5.3f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(264.6f, 182.1f)
                curveToRelative(6.9f, -3.9f, 14.9f, -6.1f, 23.4f, -6.1f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 4.4f, -0.6f, 8.7f, -1.7f, 12.7f)
                lineToRelative(-69.7f, -54.6f)
                close()
                moveTo(402.0f, 412.7f)
                lineTo(144.7f, 210.0f)
                curveToRelative(-9.5f, 8.5f, -22.2f, 14.0f, -37.2f, 14.0f)
                lineTo(96.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(49.9f, 0.0f, 74.9f, 60.3f, 39.6f, 95.6f)
                lineToRelative(-8.2f, 8.2f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(8.2f, -8.2f)
                curveToRelative(35.3f, -35.3f, 95.6f, -10.3f, 95.6f, 39.6f)
                lineTo(288.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(352.0f, 468.5f)
                curveToRelative(0.0f, -31.2f, 23.6f, -52.7f, 50.0f, -55.7f)
                close()
            }
        }
        .build()
        return _virusSlash!!
    }

private var _virusSlash: ImageVector? = null
