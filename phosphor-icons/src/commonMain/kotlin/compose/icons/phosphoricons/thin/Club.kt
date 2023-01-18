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

public val ThinGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 236.0f)
                lineTo(96.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, -5.2f)
                lineToRelative(12.3f, -39.3f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 76.0f, 96.0f)
                lineToRelative(4.1f, 0.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 95.8f, 0.0f)
                lineTo(180.0f, 96.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, -28.5f, 95.5f)
                lineToRelative(12.3f, 39.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 236.0f)
                close()
                moveTo(101.4f, 228.0f)
                horizontalLineToRelative(53.2f)
                lineToRelative(-14.9f, -47.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 6.8f, -3.7f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 180.0f, 104.0f)
                arcToRelative(42.9f, 42.9f, 0.0f, false, false, -10.1f, 1.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.1f, -4.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.7f, -1.8f)
                arcTo(43.2f, 43.2f, 0.0f, false, false, 172.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                arcToRelative(44.5f, 44.5f, 0.0f, false, false, 6.5f, 23.1f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.1f, 0.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.5f, 3.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -3.3f, 3.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -1.6f, -0.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 23.3f, 71.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 6.8f, 3.7f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
