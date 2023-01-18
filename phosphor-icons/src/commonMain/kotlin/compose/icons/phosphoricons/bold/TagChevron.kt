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

public val BoldGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.0f, 116.9f)
                lineToRelative(-42.6f, -64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 179.7f, 44.0f)
                horizontalLineTo(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 14.0f, 62.6f)
                lineTo(57.6f, 128.0f)
                lineTo(14.0f, 193.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -0.6f, 12.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 212.0f)
                horizontalLineTo(179.7f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 16.7f, -8.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(42.6f, -64.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 239.0f, 116.9f)
                close()
                moveTo(177.6f, 188.0f)
                horizontalLineTo(46.4f)
                lineTo(79.0f, 139.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 0.0f, -22.2f)
                lineTo(46.4f, 68.0f)
                horizontalLineTo(177.6f)
                lineToRelative(40.0f, 60.0f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
