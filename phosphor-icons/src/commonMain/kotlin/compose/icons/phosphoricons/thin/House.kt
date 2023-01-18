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

public val ThinGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 220.0f)
                lineTo(160.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(148.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(112.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.5f, -3.5f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 36.0f, 208.0f)
                lineTo(36.0f, 115.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 3.9f, -8.8f)
                lineToRelative(80.0f, -72.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.2f, 0.0f)
                lineToRelative(80.0f, 72.8f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 3.9f, 8.8f)
                lineTo(220.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                close()
                moveTo(112.0f, 148.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 115.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.3f, -2.9f)
                lineToRelative(-80.0f, -72.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -5.4f, 0.0f)
                lineToRelative(-80.0f, 72.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.3f, 2.9f)
                lineTo(44.0f, 208.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(100.0f, 160.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 148.0f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
