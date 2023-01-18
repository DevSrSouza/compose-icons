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

public val ThinGroup.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) {
            return _chartPieSlice!!
        }
        _chartPieSlice = Builder(name = "ChartPieSlice", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 109.5f)
                verticalLineToRelative(-72.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.7f, -3.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -3.6f, -0.5f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 28.0f, 128.0f)
                arcToRelative(102.1f, 102.1f, 0.0f, false, false, 1.7f, 18.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.2f, 2.9f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 1.7f, 0.4f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.0f, -0.6f)
                lineTo(98.0f, 113.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 109.5f)
                close()
                moveTo(92.0f, 107.2f)
                lineTo(36.7f, 139.2f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 36.0f, 128.0f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 92.0f, 43.3f)
                close()
                moveTo(214.7f, 78.2f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                reflectiveCurveToRelative(-0.1f, -0.1f, -0.1f, -0.2f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 128.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(93.7f)
                lineTo(42.9f, 172.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.5f, 5.5f)
                lineToRelative(0.2f, 0.3f)
                lineToRelative(0.2f, 0.4f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 228.0f, 128.0f)
                arcTo(99.1f, 99.1f, 0.0f, false, false, 214.7f, 78.2f)
                close()
                moveTo(132.0f, 36.1f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 73.6f, 42.5f)
                lineTo(132.0f, 121.1f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.4f, 92.4f, 0.0f, false, true, -77.6f, -42.6f)
                lineTo(209.6f, 85.5f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
