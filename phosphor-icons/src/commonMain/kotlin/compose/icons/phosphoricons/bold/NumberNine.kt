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

public val BoldGroup.NumberNine: ImageVector
    get() {
        if (_numberNine != null) {
            return _numberNine!!
        }
        _numberNine = Builder(name = "NumberNine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.8f, 122.2f)
                lineToRelative(0.3f, -0.6f)
                arcTo(67.2f, 67.2f, 0.0f, false, false, 196.0f, 88.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, true, false, -56.9f, 67.1f)
                lineToRelative(-37.6f, 62.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 4.1f, 16.5f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 6.1f, 1.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.3f, -5.8f)
                lineToRelative(64.1f, -107.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(128.0f, 132.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 37.8f, -21.5f)
                lineToRelative(-0.3f, 0.5f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 132.0f)
                close()
            }
        }
        .build()
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
