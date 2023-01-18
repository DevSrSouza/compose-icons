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

public val BoldGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 243.6f)
                arcToRelative(18.7f, 18.7f, 0.0f, false, true, -6.2f, -1.0f)
                curveTo(106.1f, 237.4f, 28.0f, 206.9f, 28.0f, 114.7f)
                lineTo(28.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 92.2f, -78.1f, 122.7f, -93.8f, 127.9f)
                arcTo(18.7f, 18.7f, 0.0f, false, true, 128.0f, 243.6f)
                close()
                moveTo(129.3f, 219.8f)
                close()
                moveTo(52.0f, 60.0f)
                verticalLineToRelative(54.7f)
                curveToRelative(0.0f, 73.4f, 60.5f, 99.3f, 76.0f, 104.7f)
                curveToRelative(15.5f, -5.4f, 76.0f, -31.3f, 76.0f, -104.7f)
                lineTo(204.0f, 60.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
