package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.NumberNine: ImageVector
    get() {
        if (_numberNine != null) {
            return _numberNine!!
        }
        _numberNine = Builder(name = "NumberNine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.4f, 120.1f)
                lineToRelative(0.2f, -0.5f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 128.0f, 152.0f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, 19.4f, -3.0f)
                lineToRelative(-42.5f, 70.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.7f, 11.0f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, 4.1f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.9f, -3.9f)
                lineToRelative(64.1f, -106.9f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.1f, -0.1f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 41.2f, -23.4f)
                lineToRelative(-0.2f, 0.4f)
                arcTo(48.1f, 48.1f, 0.0f, false, true, 128.0f, 136.0f)
                close()
            }
        }
        .build()
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
