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

public val RegularGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 240.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.4f, -3.3f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -1.2f, -7.1f)
                lineToRelative(9.3f, -30.0f)
                arcTo(55.0f, 55.0f, 0.0f, false, true, 76.0f, 204.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 74.3f, 92.0f)
                arcTo(56.8f, 56.8f, 0.0f, false, true, 72.0f, 76.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 112.0f, 0.0f)
                arcToRelative(56.8f, 56.8f, 0.0f, false, true, -2.3f, 16.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 180.0f, 204.0f)
                arcToRelative(55.0f, 55.0f, 0.0f, false, true, -21.7f, -4.4f)
                lineToRelative(9.3f, 30.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -1.2f, 7.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 160.0f, 240.0f)
                close()
                moveTo(106.9f, 224.0f)
                horizontalLineToRelative(42.2f)
                lineToRelative(-13.3f, -42.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.8f, -7.5f)
                arcToRelative(39.9f, 39.9f, 0.0f, true, false, 21.3f, -65.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -5.9f, -0.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -4.2f, -8.1f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, 1.3f, -3.4f)
                arcTo(39.6f, 39.6f, 0.0f, false, false, 168.0f, 76.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 93.9f, 97.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, 1.1f, 6.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.5f, 6.1f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, true, -3.3f, -0.1f)
                arcTo(40.6f, 40.6f, 0.0f, false, false, 76.0f, 108.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 30.4f, 66.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.8f, 7.5f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
