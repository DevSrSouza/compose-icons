package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(114.0f, 227.6f)
                horizontalLineTo(92.4f)
                curveTo(76.7f, 227.6f, 64.0f, 240.3f, 64.0f, 256.0f)
                reflectiveCurveToRelative(12.7f, 28.4f, 28.4f, 28.4f)
                horizontalLineTo(114.0f)
                curveToRelative(50.7f, 0.0f, 76.1f, 61.3f, 40.2f, 97.1f)
                lineTo(139.0f, 396.8f)
                curveToRelative(-11.5f, 10.7f, -12.2f, 28.7f, -1.6f, 40.2f)
                reflectiveCurveToRelative(28.7f, 12.2f, 40.2f, 1.6f)
                curveToRelative(0.5f, -0.5f, 1.1f, -1.0f, 1.6f, -1.6f)
                lineToRelative(15.2f, -15.2f)
                curveToRelative(35.8f, -35.8f, 97.1f, -10.5f, 97.1f, 40.2f)
                verticalLineToRelative(21.5f)
                curveToRelative(0.0f, 15.7f, 12.8f, 28.4f, 28.5f, 28.4f)
                curveToRelative(15.7f, 0.0f, 28.4f, -12.7f, 28.4f, -28.4f)
                verticalLineTo(462.0f)
                curveToRelative(0.0f, -26.6f, 17.0f, -45.9f, 38.2f, -53.4f)
                lineToRelative(-244.5f, -189.0f)
                curveTo(133.7f, 224.7f, 123.9f, 227.5f, 114.0f, 227.6f)
                close()
                moveTo(617.0f, 505.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -7.0f, 4.2f, -17.0f, -2.8f, -22.5f)
                lineTo(470.6f, 332.0f)
                curveToRelative(4.2f, -25.4f, 24.9f, -47.5f, 55.4f, -47.5f)
                horizontalLineToRelative(21.5f)
                curveToRelative(15.7f, 0.0f, 28.4f, -12.7f, 28.4f, -28.4f)
                reflectiveCurveToRelative(-12.7f, -28.4f, -28.4f, -28.4f)
                horizontalLineTo(526.0f)
                curveToRelative(-50.7f, 0.0f, -76.1f, -61.3f, -40.2f, -97.1f)
                lineToRelative(15.2f, -15.3f)
                curveToRelative(10.7f, -11.5f, 10.0f, -29.5f, -1.6f, -40.2f)
                curveToRelative(-10.9f, -10.1f, -27.7f, -10.1f, -38.6f, 0.0f)
                lineToRelative(-15.2f, 15.2f)
                curveToRelative(-35.8f, 35.8f, -97.1f, 10.5f, -97.1f, -40.2f)
                verticalLineTo(28.5f)
                curveTo(348.4f, 12.7f, 335.7f, 0.0f, 320.0f, 0.0f)
                curveToRelative(-15.7f, 0.0f, -28.4f, 12.7f, -28.4f, 28.4f)
                verticalLineTo(50.0f)
                curveToRelative(0.0f, 50.7f, -61.3f, 76.1f, -97.1f, 40.2f)
                lineTo(179.2f, 75.0f)
                curveToRelative(-11.1f, -11.1f, -29.4f, -10.6f, -40.5f, 0.5f)
                lineTo(45.5f, 3.4f)
                curveToRelative(-7.0f, -5.4f, -17.0f, -4.2f, -22.5f, 2.8f)
                lineTo(3.4f, 31.5f)
                curveToRelative(-5.4f, 7.0f, -4.2f, 17.0f, 2.8f, 22.5f)
                lineToRelative(588.4f, 454.7f)
                curveTo(601.5f, 514.1f, 611.6f, 512.8f, 617.0f, 505.8f)
                close()
                moveTo(335.4f, 227.5f)
                lineToRelative(-62.9f, -48.6f)
                curveToRelative(4.9f, -1.8f, 10.2f, -2.8f, 15.4f, -2.9f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                curveTo(336.0f, 225.2f, 335.5f, 226.3f, 335.4f, 227.5f)
                close()
            }
        }
        .build()
        return _virusSlash!!
    }

private var _virusSlash: ImageVector? = null
