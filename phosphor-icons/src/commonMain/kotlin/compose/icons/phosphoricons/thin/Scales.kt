package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.7f, 134.5f)
                lineToRelative(-32.0f, -80.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.1f, 0.0f, -0.1f, -0.1f, -0.1f, -0.2f)
                lineToRelative(-0.3f, -0.4f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                reflectiveCurveToRelative(-0.2f, -0.3f, -0.4f, -0.4f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.5f, -0.4f)
                lineTo(202.0f, 52.8f)
                lineToRelative(-0.4f, -0.3f)
                horizontalLineToRelative(-2.5f)
                lineTo(132.0f, 67.0f)
                lineTo(132.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 68.8f)
                lineTo(55.1f, 84.1f)
                lineTo(55.0f, 84.1f)
                lineToRelative(-0.5f, 0.2f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.6f, 0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, 0.4f)
                lineTo(53.0f, 85.0f)
                lineToRelative(-0.3f, 0.4f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.1f, 0.2f)
                lineToRelative(-0.3f, 0.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-32.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 168.0f)
                curveToRelative(0.0f, 20.4f, 22.1f, 28.0f, 36.0f, 28.0f)
                reflectiveCurveToRelative(36.0f, -7.6f, 36.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.3f, -1.5f)
                lineTo(61.5f, 90.9f)
                lineTo(124.0f, 77.0f)
                lineTo(124.0f, 212.0f)
                lineTo(104.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 212.0f)
                lineTo(132.0f, 75.2f)
                lineToRelative(61.5f, -13.7f)
                lineToRelative(-29.2f, 73.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.3f, 1.5f)
                curveToRelative(0.0f, 20.4f, 22.1f, 28.0f, 36.0f, 28.0f)
                reflectiveCurveToRelative(36.0f, -7.6f, 36.0f, -28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.7f, 134.5f)
                close()
                moveTo(56.0f, 188.0f)
                curveToRelative(-7.2f, 0.0f, -27.4f, -3.6f, -28.0f, -19.3f)
                lineTo(56.0f, 98.8f)
                lineToRelative(28.0f, 69.9f)
                curveTo(83.4f, 184.4f, 63.2f, 188.0f, 56.0f, 188.0f)
                close()
                moveTo(200.0f, 156.0f)
                curveToRelative(-7.2f, 0.0f, -27.4f, -3.6f, -28.0f, -19.3f)
                lineToRelative(28.0f, -69.9f)
                lineToRelative(28.0f, 69.9f)
                curveTo(227.4f, 152.4f, 207.2f, 156.0f, 200.0f, 156.0f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
