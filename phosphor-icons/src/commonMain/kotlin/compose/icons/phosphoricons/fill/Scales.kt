package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.4f, 133.0f)
                lineToRelative(-32.0f, -80.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.5f, -0.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.6f, -0.8f)
                curveToRelative(-0.1f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                lineToRelative(-0.8f, -0.8f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, -0.1f)
                lineToRelative(-0.7f, -0.5f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-0.9f, -0.5f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.8f, -0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-1.0f, -0.2f)
                horizontalLineToRelative(-3.0f)
                lineTo(136.0f, 62.0f)
                lineTo(136.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 65.6f)
                lineTo(54.3f, 80.2f)
                horizontalLineToRelative(-0.7f)
                lineToRelative(-1.0f, 0.4f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.8f, 0.4f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                lineToRelative(-0.9f, 0.7f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                lineToRelative(-0.6f, 0.7f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.6f, 0.9f)
                lineToRelative(-0.2f, 0.2f)
                lineToRelative(-0.4f, 0.9f)
                horizontalLineToRelative(-0.1f)
                lineTo(16.6f, 165.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.6f, 3.0f)
                curveToRelative(0.0f, 23.3f, 24.5f, 32.0f, 40.0f, 32.0f)
                reflectiveCurveToRelative(40.0f, -8.7f, 40.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.6f, -3.0f)
                lineTo(66.9f, 93.8f)
                lineTo(120.0f, 82.0f)
                lineTo(120.0f, 208.0f)
                lineTo(104.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 208.0f)
                lineTo(136.0f, 78.4f)
                lineToRelative(50.9f, -11.3f)
                lineTo(160.6f, 133.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.6f, 3.0f)
                curveToRelative(0.0f, 23.3f, 24.5f, 32.0f, 40.0f, 32.0f)
                reflectiveCurveToRelative(40.0f, -8.7f, 40.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 239.4f, 133.0f)
                close()
                moveTo(79.4f, 168.0f)
                lineTo(32.6f, 168.0f)
                lineTo(56.0f, 109.5f)
                close()
                moveTo(176.6f, 136.0f)
                lineTo(200.0f, 77.5f)
                lineTo(223.4f, 136.0f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
