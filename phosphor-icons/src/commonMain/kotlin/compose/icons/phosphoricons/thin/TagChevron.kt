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

public val ThinGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.4f, 121.3f)
                lineToRelative(-42.7f, -64.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -10.0f, -5.3f)
                lineTo(24.0f, 52.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.5f, 2.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.2f, 4.1f)
                lineToRelative(45.0f, 67.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 4.4f)
                lineToRelative(-45.0f, 67.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.2f, 4.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 24.0f, 204.0f)
                lineTo(179.7f, 204.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.0f, -5.4f)
                lineToRelative(42.7f, -64.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 232.4f, 121.3f)
                close()
                moveTo(225.7f, 130.2f)
                lineTo(183.1f, 194.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -3.4f, 1.8f)
                lineTo(31.5f, 196.0f)
                lineToRelative(40.9f, -61.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -13.4f)
                lineTo(31.5f, 60.0f)
                lineTo(179.7f, 60.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 3.4f, 1.8f)
                lineToRelative(42.6f, 64.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 225.7f, 130.2f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
