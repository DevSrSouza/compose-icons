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

public val FillGroup.NumberOne: ImageVector
    get() {
        if (_numberOne != null) {
            return _numberOne!!
        }
        _numberOne = Builder(name = "NumberOne", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(47.0f)
                lineTo(88.4f, 70.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.1f, -2.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 2.3f, -11.1f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 8.2f, -0.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 32.0f)
                close()
            }
        }
        .build()
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
