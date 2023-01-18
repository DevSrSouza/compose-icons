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

public val LightGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 78.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 164.0f, 78.0f)
                close()
                moveTo(164.0f, 38.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 38.0f)
                close()
                moveTo(253.2f, 196.9f)
                lineTo(196.0f, 100.6f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -24.0f, 0.0f)
                lineToRelative(-27.9f, 46.9f)
                lineToRelative(-44.0f, -74.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -24.2f, 0.0f)
                lineTo(2.8f, 197.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 8.0f, 206.0f)
                lineTo(248.0f, 206.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.2f, -9.1f)
                close()
                moveTo(86.3f, 78.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 3.4f, 0.0f)
                lineTo(115.2f, 122.0f)
                lineTo(60.8f, 122.0f)
                close()
                moveTo(18.5f, 194.0f)
                lineToRelative(35.3f, -60.0f)
                horizontalLineToRelative(68.4f)
                lineToRelative(16.7f, 28.4f)
                horizontalLineToRelative(0.0f)
                lineTo(157.5f, 194.0f)
                close()
                moveTo(171.4f, 194.0f)
                lineTo(151.1f, 159.4f)
                lineTo(182.3f, 106.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 3.4f, 0.0f)
                lineTo(237.5f, 194.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
