package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) {
            return _numberTwo!!
        }
        _numberTwo = Builder(name = "NumberTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(80.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.5f, -0.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.7f, -5.0f)
                lineToRelative(87.6f, -116.8f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 91.1f, 64.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.7f, -6.2f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 98.0f, 53.1f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.2f, 0.3f)
                lineTo(96.0f, 216.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 224.0f)
                close()
            }
        }
        .build()
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
