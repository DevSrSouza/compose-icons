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

public val LightGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.2f, 163.8f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 227.0f, 172.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -3.0f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.2f, -3.0f)
                lineToRelative(-19.5f, -33.7f)
                arcToRelative(121.3f, 121.3f, 0.0f, false, true, -38.2f, 17.7f)
                lineToRelative(6.1f, 34.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.9f, 6.9f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -5.9f, -5.0f)
                lineToRelative(-6.1f, -34.3f)
                arcTo(131.3f, 131.3f, 0.0f, false, true, 128.0f, 158.0f)
                arcToRelative(132.6f, 132.6f, 0.0f, false, true, -21.4f, -1.7f)
                lineToRelative(-6.1f, 34.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, 5.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.9f, -6.9f)
                lineToRelative(6.1f, -34.8f)
                arcToRelative(124.7f, 124.7f, 0.0f, false, true, -38.2f, -17.7f)
                lineTo(37.1f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.2f, 3.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -3.0f, -0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.2f, -8.2f)
                lineTo(47.0f, 128.7f)
                arcToRelative(148.1f, 148.1f, 0.0f, false, true, -19.7f, -20.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.4f, -7.5f)
                arcToRelative(131.5f, 131.5f, 0.0f, false, false, 21.5f, 21.3f)
                lineToRelative(0.4f, 0.2f)
                arcTo(111.4f, 111.4f, 0.0f, false, false, 128.0f, 146.0f)
                arcToRelative(111.4f, 111.4f, 0.0f, false, false, 69.4f, -23.4f)
                lineToRelative(0.3f, -0.2f)
                arcToRelative(128.5f, 128.5f, 0.0f, false, false, 21.6f, -21.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.4f, 7.5f)
                arcToRelative(149.4f, 149.4f, 0.0f, false, true, -19.8f, 20.2f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
