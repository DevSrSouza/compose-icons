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

public val SimpleIcons.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.543f, 7.104f)
                curveToRelative(0.015f, 0.211f, 0.015f, 0.423f, 0.015f, 0.636f)
                curveToRelative(0.0f, 6.507f, -4.954f, 14.01f, -14.01f, 14.01f)
                verticalLineToRelative(-0.003f)
                arcTo(13.94f, 13.94f, 0.0f, false, true, 0.0f, 19.539f)
                arcToRelative(9.88f, 9.88f, 0.0f, false, false, 7.287f, -2.041f)
                arcToRelative(4.93f, 4.93f, 0.0f, false, true, -4.6f, -3.42f)
                arcToRelative(4.916f, 4.916f, 0.0f, false, false, 2.223f, -0.084f)
                arcTo(4.926f, 4.926f, 0.0f, false, true, 0.96f, 9.167f)
                verticalLineToRelative(-0.062f)
                arcToRelative(4.887f, 4.887f, 0.0f, false, false, 2.235f, 0.616f)
                arcTo(4.928f, 4.928f, 0.0f, false, true, 1.67f, 3.148f)
                arcTo(13.98f, 13.98f, 0.0f, false, false, 11.82f, 8.292f)
                arcToRelative(4.929f, 4.929f, 0.0f, false, true, 8.39f, -4.49f)
                arcToRelative(9.868f, 9.868f, 0.0f, false, false, 3.128f, -1.196f)
                arcToRelative(4.941f, 4.941f, 0.0f, false, true, -2.165f, 2.724f)
                arcTo(9.828f, 9.828f, 0.0f, false, false, 24.0f, 4.555f)
                arcToRelative(10.019f, 10.019f, 0.0f, false, true, -2.457f, 2.549f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
