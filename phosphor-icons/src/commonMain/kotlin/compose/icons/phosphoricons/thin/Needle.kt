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

public val ThinGroup.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.8f, 69.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(16.0f, -16.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 186.8f, 69.2f)
                close()
                moveTo(220.0f, 72.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, true, -10.5f, 25.5f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -2.2f, 1.1f)
                curveToRelative(-21.7f, 3.7f, -52.7f, 21.4f, -89.9f, 51.3f)
                curveTo(65.1f, 196.7f, 43.0f, 218.6f, 42.8f, 218.8f)
                lineToRelative(-0.2f, 0.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.6f, 0.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.2f, -0.2f, 22.1f, -22.3f, 44.9f, -50.6f)
                curveToRelative(29.9f, -37.2f, 47.6f, -68.2f, 51.3f, -89.9f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, 1.1f, -2.2f)
                lineToRelative(24.0f, -24.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 220.0f, 72.0f)
                close()
                moveTo(212.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -47.8f, -19.8f)
                lineTo(141.1f, 75.3f)
                curveToRelative(-5.3f, 28.0f, -29.5f, 63.4f, -52.5f, 92.1f)
                curveToRelative(28.7f, -23.0f, 64.1f, -47.2f, 92.1f, -52.5f)
                lineToRelative(23.1f, -23.1f)
                arcTo(27.8f, 27.8f, 0.0f, false, false, 212.0f, 72.0f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
