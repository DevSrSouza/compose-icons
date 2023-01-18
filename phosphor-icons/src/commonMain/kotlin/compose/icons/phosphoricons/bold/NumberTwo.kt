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

public val BoldGroup.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) {
            return _numberTwo!!
        }
        _numberTwo = Builder(name = "NumberTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -3.8f, -0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.6f, -18.8f)
                lineTo(158.0f, 99.9f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 94.8f, 66.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.1f, -9.4f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 105.0f, 57.0f)
                lineToRelative(-0.3f, 0.4f)
                lineTo(104.0f, 212.0f)
                horizontalLineToRelative(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 224.0f)
                close()
            }
        }
        .build()
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
