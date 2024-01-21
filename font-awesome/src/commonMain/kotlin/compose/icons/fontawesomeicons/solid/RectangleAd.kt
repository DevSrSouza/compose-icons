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

public val SolidGroup.RectangleAd: ImageVector
    get() {
        if (_rectangleAd != null) {
            return _rectangleAd!!
        }
        _rectangleAd = Builder(name = "RectangleAd", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(512.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(576.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(229.5f, 173.3f)
                lineToRelative(72.0f, 144.0f)
                curveToRelative(5.9f, 11.9f, 1.1f, 26.3f, -10.7f, 32.2f)
                reflectiveCurveToRelative(-26.3f, 1.1f, -32.2f, -10.7f)
                lineTo(253.2f, 328.0f)
                lineTo(162.8f, 328.0f)
                lineToRelative(-5.4f, 10.7f)
                curveToRelative(-5.9f, 11.9f, -20.3f, 16.7f, -32.2f, 10.7f)
                reflectiveCurveToRelative(-16.7f, -20.3f, -10.7f, -32.2f)
                lineToRelative(72.0f, -144.0f)
                curveToRelative(4.1f, -8.1f, 12.4f, -13.3f, 21.5f, -13.3f)
                reflectiveCurveToRelative(17.4f, 5.1f, 21.5f, 13.3f)
                close()
                moveTo(208.0f, 237.7f)
                lineTo(186.8f, 280.0f)
                horizontalLineToRelative(42.3f)
                lineTo(208.0f, 237.7f)
                close()
                moveTo(392.0f, 256.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                close()
                moveTo(416.0f, 212.1f)
                lineTo(416.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(96.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                curveToRelative(-6.6f, 0.0f, -12.6f, -2.7f, -17.0f, -7.0f)
                curveToRelative(-9.4f, 4.5f, -19.9f, 7.0f, -31.0f, 7.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, -32.2f, -72.0f, -72.0f)
                reflectiveCurveToRelative(32.2f, -72.0f, 72.0f, -72.0f)
                curveToRelative(8.4f, 0.0f, 16.5f, 1.4f, 24.0f, 4.1f)
                close()
            }
        }
        .build()
        return _rectangleAd!!
    }

private var _rectangleAd: ImageVector? = null
