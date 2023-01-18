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

public val ThinGroup.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) {
            return _numberTwo!!
        }
        _numberTwo = Builder(name = "NumberTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(80.0f)
                lineToRelative(-1.3f, -0.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 76.0f, 224.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 0.9f, -2.5f)
                lineToRelative(87.6f, -117.0f)
                arcTo(43.4f, 43.4f, 0.0f, false, false, 172.0f, 80.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 87.5f, 62.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 82.2f, 65.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.1f, -5.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 91.0f, 49.3f)
                horizontalLineTo(171.0f)
                lineTo(88.0f, 220.0f)
                horizontalLineToRelative(88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 224.0f)
                close()
            }
        }
        .build()
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
