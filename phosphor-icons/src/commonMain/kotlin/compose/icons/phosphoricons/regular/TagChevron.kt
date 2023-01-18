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

public val RegularGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.7f, 119.1f)
                lineTo(193.0f, 55.1f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 179.7f, 48.0f)
                lineTo(24.0f, 48.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -7.0f, 4.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.3f, 8.2f)
                lineTo(62.4f, 128.0f)
                lineTo(17.3f, 195.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.3f, 8.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 7.0f, 4.2f)
                lineTo(179.7f, 208.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 13.3f, -7.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(42.7f, -64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 235.7f, 119.1f)
                close()
                moveTo(179.7f, 192.0f)
                lineTo(39.0f, 192.0f)
                lineToRelative(36.7f, -55.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -17.8f)
                lineTo(39.0f, 64.0f)
                lineTo(179.7f, 64.0f)
                lineToRelative(42.7f, 64.0f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
