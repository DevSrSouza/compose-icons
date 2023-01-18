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

public val ThinGroup.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) {
            return _numberCircleThree!!
        }
        _numberCircleThree = Builder(name = "NumberCircleThree", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(146.6f, 129.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -45.2f, 45.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 107.0f, 169.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 17.0f, -41.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.5f, -2.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.2f, -4.1f)
                lineTo(144.3f, 88.0f)
                lineTo(104.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 3.5f, 2.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.2f, 4.2f)
                lineToRelative(-24.2f, 34.5f)
                arcTo(30.7f, 30.7f, 0.0f, false, true, 146.6f, 129.4f)
                close()
            }
        }
        .build()
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
