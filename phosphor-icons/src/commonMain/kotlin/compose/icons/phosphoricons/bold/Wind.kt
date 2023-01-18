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

public val BoldGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -8.9f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 93.2f, 44.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 120.0f, 104.0f)
                close()
                moveTo(208.0f, 72.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -26.8f, 12.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 0.9f, 16.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -0.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 8.9f, -4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(32.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(208.0f, 144.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
                moveTo(152.0f, 160.0f)
                lineTo(40.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(152.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -8.9f, -4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -0.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -0.9f, 16.9f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 152.0f, 160.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
