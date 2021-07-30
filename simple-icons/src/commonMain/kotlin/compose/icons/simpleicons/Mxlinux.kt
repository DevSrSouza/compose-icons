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

public val SimpleIcons.Mxlinux: ImageVector
    get() {
        if (_mxlinux != null) {
            return _mxlinux!!
        }
        _mxlinux = Builder(name = "Mxlinux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 13.301f)
                lineToRelative(3.277f, 3.819f)
                lineToRelative(-0.75f, 0.9f)
                lineToRelative(-2.133f, -2.521f)
                lineToRelative(-1.131f, -1.338f)
                lineToRelative(0.737f, -0.86f)
                close()
                moveTo(24.0f, 2.41f)
                verticalLineToRelative(19.182f)
                curveToRelative(0.0f, 0.655f, -0.531f, 1.186f, -1.186f, 1.186f)
                lineTo(1.186f, 22.778f)
                arcTo(1.186f, 1.186f, 0.0f, false, true, 0.0f, 21.591f)
                lineTo(0.0f, 2.409f)
                curveToRelative(0.0f, -0.655f, 0.531f, -1.186f, 1.186f, -1.186f)
                horizontalLineToRelative(21.628f)
                curveToRelative(0.655f, 0.0f, 1.186f, 0.53f, 1.186f, 1.186f)
                close()
                moveTo(21.759f, 19.5f)
                lineToRelative(-2.116f, -2.542f)
                lineToRelative(-2.115f, -2.541f)
                lineToRelative(-0.586f, 0.704f)
                lineToRelative(-3.25f, -3.788f)
                lineToRelative(4.913f, -5.73f)
                lineToRelative(-1.175f, -1.008f)
                lineToRelative(-4.76f, 5.549f)
                lineToRelative(-4.743f, -5.527f)
                lineToRelative(-1.947f, 1.67f)
                lineToRelative(5.0f, 5.827f)
                lineToRelative(-0.73f, 0.851f)
                lineToRelative(-1.24f, -1.465f)
                lineToRelative(-3.384f, 4.0f)
                lineToRelative(-3.385f, 4.0f)
                horizontalLineToRelative(19.518f)
                close()
            }
        }
        .build()
        return _mxlinux!!
    }

private var _mxlinux: ImageVector? = null
