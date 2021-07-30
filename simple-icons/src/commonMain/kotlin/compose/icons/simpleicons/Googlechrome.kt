package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlechrome: ImageVector
    get() {
        if (_googlechrome != null) {
            return _googlechrome!!
        }
        _googlechrome = Builder(name = "Googlechrome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.21f, 0.0f, 4.831f, 1.757f, 2.632f, 4.501f)
                lineToRelative(3.953f, 6.848f)
                arcTo(5.454f, 5.454f, 0.0f, false, true, 12.0f, 6.545f)
                horizontalLineToRelative(10.691f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(1.931f, 5.47f)
                arcTo(11.943f, 11.943f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.012f, 4.42f, 10.991f, 10.189f, 11.864f)
                lineToRelative(3.953f, -6.847f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, true, -6.865f, -2.29f)
                close()
                moveTo(15.273f, 7.636f)
                arcToRelative(5.446f, 5.446f, 0.0f, false, true, 1.45f, 7.09f)
                lineToRelative(0.002f, 0.001f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-5.344f, 9.257f)
                curveToRelative(0.206f, 0.01f, 0.413f, 0.016f, 0.621f, 0.016f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -1.54f, -0.29f, -3.011f, -0.818f, -4.364f)
                close()
                moveTo(12.0f, 16.364f)
                arcToRelative(4.364f, 4.364f, 0.0f, true, true, 0.0f, -8.728f)
                arcToRelative(4.364f, 4.364f, 0.0f, false, true, 0.0f, 8.728f)
                close()
            }
        }
        .build()
        return _googlechrome!!
    }

private var _googlechrome: ImageVector? = null
