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

public val ThinGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.4f, 164.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.4f, 5.5f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, true, -2.0f, 0.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.5f, -2.0f)
                lineToRelative(-20.6f, -35.6f)
                arcToRelative(119.2f, 119.2f, 0.0f, false, true, -41.1f, 19.1f)
                lineToRelative(6.4f, 36.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.2f, 4.6f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.3f)
                lineTo(151.0f, 154.0f)
                arcToRelative(129.6f, 129.6f, 0.0f, false, true, -23.0f, 2.0f)
                arcToRelative(128.7f, 128.7f, 0.0f, false, true, -23.0f, -2.0f)
                lineToRelative(-6.4f, 36.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -4.0f, 3.3f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.2f, -4.6f)
                lineToRelative(6.4f, -36.6f)
                arcTo(120.1f, 120.1f, 0.0f, false, true, 56.0f, 133.2f)
                lineTo(35.4f, 169.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, 2.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.0f, -0.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.5f, -5.4f)
                lineToRelative(21.2f, -36.7f)
                arcToRelative(145.0f, 145.0f, 0.0f, false, true, -20.7f, -20.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.6f, -5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.6f)
                arcToRelative(132.4f, 132.4f, 0.0f, false, false, 22.3f, 21.8f)
                horizontalLineToRelative(0.1f)
                arcTo(113.5f, 113.5f, 0.0f, false, false, 128.0f, 148.0f)
                arcToRelative(113.5f, 113.5f, 0.0f, false, false, 70.5f, -23.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(137.5f, 137.5f, 0.0f, false, false, 22.4f, -21.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, -0.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.6f, 5.6f)
                arcToRelative(140.1f, 140.1f, 0.0f, false, true, -20.7f, 20.9f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
