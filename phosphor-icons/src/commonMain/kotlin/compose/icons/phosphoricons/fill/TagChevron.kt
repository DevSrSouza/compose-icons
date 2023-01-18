package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.7f, 136.9f)
                lineToRelative(-42.7f, 64.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.3f, 7.1f)
                horizontalLineTo(24.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -7.0f, -4.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.3f, -8.2f)
                lineTo(62.4f, 128.0f)
                lineTo(17.3f, 60.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.3f, -8.2f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 24.0f, 48.0f)
                horizontalLineTo(179.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 193.0f, 55.1f)
                lineToRelative(42.7f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 235.7f, 136.9f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
