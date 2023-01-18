package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) {
            return _chartPieSlice!!
        }
        _chartPieSlice = Builder(name = "ChartPieSlice", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 116.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.0f, -7.0f)
                verticalLineToRelative(-72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.7f, -7.6f)
                arcTo(104.3f, 104.3f, 0.0f, false, false, 24.0f, 128.0f)
                arcToRelative(109.1f, 109.1f, 0.0f, false, false, 1.7f, 19.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.6f, 5.8f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 3.3f, 0.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -1.1f)
                close()
                moveTo(88.0f, 49.6f)
                verticalLineToRelative(55.3f)
                lineTo(40.1f, 132.6f)
                curveToRelative(-0.1f, -1.6f, -0.1f, -3.1f, -0.1f, -4.6f)
                arcTo(88.3f, 88.3f, 0.0f, false, true, 88.0f, 49.6f)
                close()
                moveTo(218.3f, 76.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.2f, -0.4f)
                lineToRelative(-0.4f, -0.5f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 128.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(91.4f)
                lineTo(40.9f, 169.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.0f, 10.9f)
                verticalLineToRelative(0.2f)
                lineToRelative(0.3f, 0.5f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 232.0f, 128.0f)
                arcTo(103.5f, 103.5f, 0.0f, false, false, 218.3f, 76.4f)
                close()
                moveTo(136.0f, 40.4f)
                arcToRelative(88.2f, 88.2f, 0.0f, false, true, 63.9f, 36.9f)
                lineTo(136.0f, 114.1f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.3f, 88.3f, 0.0f, false, true, -71.9f, -37.3f)
                lineTo(207.9f, 91.1f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
