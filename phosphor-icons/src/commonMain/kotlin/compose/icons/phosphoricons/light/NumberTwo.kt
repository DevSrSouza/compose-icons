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

public val LightGroup.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) {
            return _numberTwo!!
        }
        _numberTwo = Builder(name = "NumberTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -1.9f, -0.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 74.0f, 224.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 1.3f, -3.8f)
                lineToRelative(87.6f, -116.8f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 89.3f, 63.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 78.2f, 59.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 94.6f, 51.2f)
                lineToRelative(-0.2f, 0.2f)
                lineTo(92.0f, 218.0f)
                horizontalLineToRelative(84.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 224.0f)
                close()
            }
        }
        .build()
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
