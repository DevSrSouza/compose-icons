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

public val FillGroup.Plugs: ImageVector
    get() {
        if (_plugs != null) {
            return _plugs!!
        }
        _plugs = Builder(name = "Plugs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 29.7f)
                lineTo(211.3f, 56.0f)
                lineToRelative(5.4f, 5.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, 45.2f)
                lineTo(191.3f, 132.0f)
                lineToRelative(2.4f, 2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-8.0f, -8.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-56.0f, -56.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-8.0f, -8.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineToRelative(2.3f, 2.4f)
                lineToRelative(25.4f, -25.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 45.2f, 0.0f)
                lineToRelative(5.4f, 5.4f)
                lineToRelative(26.3f, -26.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
                moveTo(138.3f, 138.3f)
                lineTo(120.0f, 156.7f)
                lineTo(99.3f, 136.0f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(88.0f, 124.7f)
                lineToRelative(-6.3f, -6.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-8.0f, -8.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineToRelative(2.4f, 2.3f)
                lineTo(39.3f, 149.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                lineToRelative(5.4f, 5.4f)
                lineTo(18.3f, 226.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(56.0f, 211.3f)
                lineToRelative(5.4f, 5.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 45.2f, 0.0f)
                lineTo(132.0f, 191.3f)
                lineToRelative(2.3f, 2.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineToRelative(-8.0f, -8.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-6.4f, -6.3f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                close()
            }
        }
        .build()
        return _plugs!!
    }

private var _plugs: ImageVector? = null
