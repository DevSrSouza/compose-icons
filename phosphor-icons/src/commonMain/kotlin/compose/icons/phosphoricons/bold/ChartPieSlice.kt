package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) {
            return _chartPieSlice!!
        }
        _chartPieSlice = Builder(name = "ChartPieSlice", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.7f, 74.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, -0.4f)
                lineToRelative(-0.3f, -0.5f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 128.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(89.1f)
                lineTo(38.9f, 165.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 34.5f, 182.0f)
                verticalLineToRelative(0.2f)
                lineToRelative(0.3f, 0.5f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 236.0f, 128.0f)
                arcTo(107.1f, 107.1f, 0.0f, false, false, 221.7f, 74.4f)
                close()
                moveTo(140.0f, 44.9f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, 54.0f, 31.2f)
                lineToRelative(-54.0f, 31.1f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.4f, 84.4f, 0.0f, false, true, -66.0f, -32.0f)
                lineTo(206.0f, 96.8f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(94.0f, 116.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.0f, -10.4f)
                verticalLineTo(40.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 83.0f, 29.8f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 20.6f, 139.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.5f, 9.5f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 5.4f, 1.3f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 6.0f, -1.6f)
                close()
                moveTo(76.0f, 62.0f)
                verticalLineTo(99.2f)
                lineTo(44.7f, 117.3f)
                arcTo(84.5f, 84.5f, 0.0f, false, true, 76.0f, 62.0f)
                close()
            }
        }
        .build()
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
