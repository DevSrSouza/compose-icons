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

public val SimpleIcons.Ubuntu: ImageVector
    get() {
        if (_ubuntu != null) {
            return _ubuntu!!
        }
        _ubuntu = Builder(name = "Ubuntu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.61f, 0.455f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, -3.41f, 3.41f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, 3.41f, 3.41f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, 3.41f, -3.41f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, -3.41f, -3.41f)
                close()
                moveTo(12.92f, 0.8f)
                curveTo(8.923f, 0.777f, 5.137f, 2.941f, 3.148f, 6.451f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.26f, -0.007f)
                arcToRelative(4.92f, 4.92f, 0.0f, false, true, 2.585f, 0.737f)
                arcTo(8.316f, 8.316f, 0.0f, false, true, 12.688f, 3.6f)
                arcTo(4.944f, 4.944f, 0.0f, false, true, 13.723f, 0.834f)
                arcTo(11.008f, 11.008f, 0.0f, false, false, 12.92f, 0.8f)
                close()
                moveTo(22.146f, 5.794f)
                arcToRelative(4.915f, 4.915f, 0.0f, false, true, -1.918f, 2.246f)
                arcToRelative(8.36f, 8.36f, 0.0f, false, true, -0.273f, 8.303f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, true, 1.632f, 2.54f)
                arcToRelative(11.156f, 11.156f, 0.0f, false, false, 0.559f, -13.089f)
                close()
                moveTo(3.41f, 7.932f)
                arcTo(3.41f, 3.41f, 0.0f, false, false, 0.0f, 11.342f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, 3.41f, 3.409f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, 3.41f, -3.41f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, -3.41f, -3.41f)
                close()
                moveTo(5.437f, 15.798f)
                arcToRelative(4.908f, 4.908f, 0.0f, false, true, -2.915f, 0.358f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, false, 7.991f, 6.698f)
                arcToRelative(11.234f, 11.234f, 0.0f, false, false, 2.422f, 0.249f)
                arcToRelative(4.879f, 4.879f, 0.0f, false, true, -0.999f, -2.85f)
                arcToRelative(8.484f, 8.484f, 0.0f, false, true, -0.836f, -0.136f)
                arcToRelative(8.304f, 8.304f, 0.0f, false, true, -5.663f, -4.32f)
                close()
                moveTo(16.842f, 16.726f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, -3.41f, 3.41f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, 3.41f, 3.41f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, 3.41f, -3.41f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, -3.41f, -3.41f)
                close()
            }
        }
        .build()
        return _ubuntu!!
    }

private var _ubuntu: ImageVector? = null
