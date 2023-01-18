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

public val ThinGroup.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) {
            return _numberCircleTwo!!
        }
        _numberCircleTwo = Builder(name = "NumberCircleTwo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(151.1f, 119.8f)
                lineTo(112.0f, 172.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(104.0f, 180.0f)
                lineToRelative(-1.3f, -0.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 176.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.9f, -2.5f)
                lineToRelative(43.7f, -58.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -35.0f, -18.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.4f, -3.1f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 104.0f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, -4.8f, 15.7f)
                close()
            }
        }
        .build()
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
