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

public val ThinGroup.NumberOne: ImageVector
    get() {
        if (_numberOne != null) {
            return _numberOne!!
        }
        _numberOne = Builder(name = "NumberOne", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(39.5f)
                lineTo(86.2f, 67.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.5f, -1.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 1.1f, -5.5f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.1f, -0.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 136.0f, 32.0f)
                close()
            }
        }
        .build()
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
