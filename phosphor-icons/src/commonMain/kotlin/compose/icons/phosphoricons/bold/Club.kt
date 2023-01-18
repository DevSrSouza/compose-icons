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

public val BoldGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.7f, 88.4f)
                arcTo(57.4f, 57.4f, 0.0f, false, false, 188.0f, 76.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 68.0f, 76.0f)
                arcToRelative(57.4f, 57.4f, 0.0f, false, false, 1.3f, 12.4f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 76.0f, 208.0f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, 12.5f, -1.3f)
                lineToRelative(-4.3f, 23.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 244.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -14.2f)
                lineToRelative(-4.3f, -23.1f)
                arcTo(57.0f, 57.0f, 0.0f, false, false, 180.0f, 208.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 6.7f, -119.6f)
                close()
                moveTo(180.0f, 184.0f)
                arcToRelative(35.6f, 35.6f, 0.0f, false, true, -21.4f, -7.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -13.5f, -0.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -5.4f, 12.4f)
                lineToRelative(5.8f, 31.2f)
                horizontalLineToRelative(-35.0f)
                lineToRelative(5.8f, -31.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -5.4f, -12.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -13.5f, 0.6f)
                arcTo(35.6f, 35.6f, 0.0f, false, true, 76.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                arcToRelative(37.5f, 37.5f, 0.0f, false, true, 8.2f, 0.9f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, 4.9f, 0.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 9.8f, -9.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -1.4f, -9.1f)
                lineToRelative(-0.2f, -0.3f)
                arcTo(35.4f, 35.4f, 0.0f, false, true, 92.0f, 76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 66.8f, 18.7f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, -1.9f, 5.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.0f, 13.1f)
                arcToRelative(36.6f, 36.6f, 0.0f, false, true, 8.1f, -0.9f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
