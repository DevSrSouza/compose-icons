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

public val FillGroup.TrendUp: ImageVector
    get() {
        if (_trendUp != null) {
            return _trendUp!!
        }
        _trendUp = Builder(name = "TrendUp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 56.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.9f, 7.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                lineTo(200.0f, 99.3f)
                lineToRelative(-58.3f, 58.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(96.0f, 123.3f)
                lineTo(29.7f, 189.7f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 24.0f, 192.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(72.0f, -72.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                lineTo(136.0f, 140.7f)
                lineTo(188.7f, 88.0f)
                lineTo(162.3f, 61.7f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, -8.8f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 168.0f, 48.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 56.0f)
                close()
            }
        }
        .build()
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null