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

public val ThinGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 164.0f, 76.0f)
                close()
                moveTo(164.0f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 36.0f)
                close()
                moveTo(251.4f, 198.0f)
                lineTo(194.3f, 101.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -20.6f, 0.0f)
                lineToRelative(-29.6f, 49.9f)
                lineTo(98.3f, 73.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -20.6f, 0.0f)
                lineTo(4.6f, 198.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.1f, 4.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 8.0f, 204.0f)
                lineTo(248.0f, 204.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.5f, -2.0f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 251.4f, 198.0f)
                close()
                moveTo(84.6f, 77.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 6.8f, 0.0f)
                lineTo(118.7f, 124.0f)
                lineTo(57.3f, 124.0f)
                close()
                moveTo(15.0f, 196.0f)
                lineToRelative(37.6f, -64.0f)
                horizontalLineToRelative(70.8f)
                lineTo(161.0f, 196.0f)
                close()
                moveTo(170.3f, 196.0f)
                lineTo(148.7f, 159.4f)
                lineTo(180.6f, 105.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 6.8f, 0.0f)
                lineTo(241.0f, 196.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
