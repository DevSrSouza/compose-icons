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

public val FillGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 160.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(115.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineTo(178.0f, 108.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -1.1f, -11.3f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 165.5f, 98.0f)
                lineTo(88.4f, 198.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.1f, 1.6f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(161.1f)
                arcToRelative(116.1f, 116.1f, 0.0f, false, true, 2.2f, -22.2f)
                lineTo(40.9f, 145.0f)
                lineToRelative(2.1f, 0.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, -6.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -6.0f, -9.6f)
                lineToRelative(-22.4f, -6.0f)
                curveTo(37.0f, 82.0f, 74.9f, 51.5f, 120.0f, 48.3f)
                verticalLineTo(71.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 7.5f, 8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.5f, -8.0f)
                verticalLineTo(48.3f)
                arcToRelative(111.5f, 111.5f, 0.0f, false, true, 71.1f, 32.4f)
                arcToRelative(112.7f, 112.7f, 0.0f, false, true, 26.8f, 42.6f)
                lineToRelative(-22.7f, 6.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -6.0f, 9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, 6.2f)
                lineToRelative(2.1f, -0.2f)
                lineToRelative(22.9f, -6.2f)
                arcTo(114.5f, 114.5f, 0.0f, false, true, 240.0f, 160.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
