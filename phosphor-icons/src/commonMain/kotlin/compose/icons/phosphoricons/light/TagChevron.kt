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

public val LightGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 120.2f)
                lineToRelative(-42.6f, -64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 179.7f, 50.0f)
                lineTo(24.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 9.3f)
                lineToRelative(45.1f, 67.6f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.0f, 2.2f)
                lineTo(19.0f, 196.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 9.3f)
                lineTo(179.7f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.7f, -6.2f)
                lineToRelative(42.6f, -64.0f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 234.0f, 120.2f)
                close()
                moveTo(224.1f, 129.1f)
                lineTo(181.4f, 193.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.7f, 0.9f)
                lineTo(35.2f, 194.0f)
                lineTo(74.0f, 135.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 0.0f, -15.6f)
                lineTo(35.2f, 62.0f)
                lineTo(179.7f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.7f, 0.9f)
                lineToRelative(42.7f, 64.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 224.1f, 129.1f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
