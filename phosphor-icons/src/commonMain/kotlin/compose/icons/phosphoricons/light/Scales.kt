package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.6f, 133.8f)
                lineToRelative(-32.0f, -80.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.3f, -0.7f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.1f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.4f, -0.6f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, -0.6f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, -0.1f)
                lineToRelative(-0.5f, -0.4f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.6f, -0.4f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.0f, -0.2f, -0.1f)
                lineToRelative(-0.6f, -0.2f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.7f, -0.2f)
                horizontalLineToRelative(-2.3f)
                lineTo(134.0f, 64.5f)
                lineTo(134.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 67.2f)
                lineTo(54.7f, 82.1f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.8f, 0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, 0.6f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, 0.6f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.4f, 0.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-32.0f, 80.0f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 18.0f, 168.0f)
                curveToRelative(0.0f, 21.9f, 23.3f, 30.0f, 38.0f, 30.0f)
                reflectiveCurveToRelative(38.0f, -8.1f, 38.0f, -30.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -0.4f, -2.2f)
                lineTo(64.2f, 92.3f)
                lineTo(122.0f, 79.5f)
                lineTo(122.0f, 210.0f)
                lineTo(104.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 76.8f)
                lineToRelative(56.2f, -12.5f)
                lineToRelative(-27.8f, 69.5f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -0.4f, 2.2f)
                curveToRelative(0.0f, 21.9f, 23.3f, 30.0f, 38.0f, 30.0f)
                reflectiveCurveToRelative(38.0f, -8.1f, 38.0f, -30.0f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 237.6f, 133.8f)
                close()
                moveTo(56.0f, 186.0f)
                arcToRelative(36.6f, 36.6f, 0.0f, false, true, -17.5f, -4.6f)
                curveToRelative(-5.3f, -3.1f, -8.1f, -7.1f, -8.5f, -12.3f)
                lineToRelative(26.0f, -64.9f)
                lineToRelative(26.0f, 64.9f)
                curveTo(81.1f, 182.9f, 62.6f, 186.0f, 56.0f, 186.0f)
                close()
                moveTo(200.0f, 154.0f)
                arcToRelative(36.6f, 36.6f, 0.0f, false, true, -17.5f, -4.6f)
                curveToRelative(-5.3f, -3.1f, -8.1f, -7.1f, -8.5f, -12.3f)
                lineToRelative(26.0f, -64.9f)
                lineToRelative(26.0f, 64.9f)
                curveTo(225.1f, 150.9f, 206.6f, 154.0f, 200.0f, 154.0f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
