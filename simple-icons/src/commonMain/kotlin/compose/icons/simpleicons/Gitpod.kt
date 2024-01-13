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

public val SimpleIcons.Gitpod: ImageVector
    get() {
        if (_gitpod != null) {
            return _gitpod!!
        }
        _gitpod = Builder(name = "Gitpod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.033f, 1.195f)
                arcToRelative(2.387f, 2.387f, 0.0f, false, true, -0.87f, 3.235f)
                lineToRelative(-6.98f, 4.04f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, false, -0.3f, 0.522f)
                verticalLineToRelative(6.342f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.3f, 0.521f)
                lineToRelative(5.524f, 3.199f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, false, 0.586f, 0.0f)
                lineToRelative(5.527f, -3.199f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, 0.299f, -0.52f)
                verticalLineTo(11.39f)
                lineToRelative(-4.969f, 2.838f)
                arcToRelative(2.326f, 2.326f, 0.0f, false, true, -3.19f, -0.9f)
                arcToRelative(2.388f, 2.388f, 0.0f, false, true, 0.89f, -3.23f)
                lineToRelative(7.108f, -4.062f)
                curveTo(20.123f, 4.8f, 22.8f, 6.384f, 22.8f, 8.901f)
                verticalLineToRelative(6.914f)
                arcToRelative(4.524f, 4.524f, 0.0f, false, true, -2.245f, 3.919f)
                lineToRelative(-6.345f, 3.672f)
                arcToRelative(4.407f, 4.407f, 0.0f, false, true, -4.422f, 0.0f)
                lineToRelative(-6.344f, -3.672f)
                arcTo(4.524f, 4.524f, 0.0f, false, true, 1.2f, 15.816f)
                verticalLineTo(8.51f)
                arcToRelative(4.524f, 4.524f, 0.0f, false, true, 2.245f, -3.918f)
                lineToRelative(7.393f, -4.28f)
                arcToRelative(2.326f, 2.326f, 0.0f, false, true, 3.195f, 0.883f)
                close()
            }
        }
        .build()
        return _gitpod!!
    }

private var _gitpod: ImageVector? = null
