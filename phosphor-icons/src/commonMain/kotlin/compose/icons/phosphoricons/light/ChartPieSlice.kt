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

public val LightGroup.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) {
            return _chartPieSlice!!
        }
        _chartPieSlice = Builder(name = "ChartPieSlice", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 109.5f)
                verticalLineToRelative(-72.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -2.5f, -4.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.5f, -0.8f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 26.0f, 128.0f)
                arcToRelative(104.6f, 104.6f, 0.0f, false, false, 1.7f, 18.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.4f, 4.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 2.5f, 0.6f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.0f, -0.9f)
                lineToRelative(62.4f, -36.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 102.0f, 109.5f)
                close()
                moveTo(90.0f, 106.1f)
                lineTo(38.3f, 135.9f)
                curveToRelative(-0.2f, -2.6f, -0.3f, -5.3f, -0.3f, -7.9f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 90.0f, 46.4f)
                close()
                moveTo(216.5f, 77.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, -0.4f)
                lineToRelative(-0.3f, -0.5f)
                arcTo(101.9f, 101.9f, 0.0f, false, false, 128.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(92.5f)
                lineTo(41.9f, 170.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -2.2f, 8.2f)
                verticalLineToRelative(0.2f)
                lineToRelative(0.3f, 0.5f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 230.0f, 128.0f)
                arcTo(100.9f, 100.9f, 0.0f, false, false, 216.5f, 77.4f)
                close()
                moveTo(134.0f, 38.2f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, 68.7f, 39.7f)
                lineTo(134.0f, 117.6f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.7f, 90.7f, 0.0f, false, true, -74.8f, -39.9f)
                lineTo(208.8f, 88.3f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
