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

public val BoldGroup.NumberOne: ImageVector
    get() {
        if (_numberOne != null) {
            return _numberOne!!
        }
        _numberOne = Builder(name = "NumberOne", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(54.4f)
                lineTo(90.7f, 74.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 74.0f, 70.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 77.3f, 54.0f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.4f, -0.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 32.0f)
                close()
            }
        }
        .build()
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
