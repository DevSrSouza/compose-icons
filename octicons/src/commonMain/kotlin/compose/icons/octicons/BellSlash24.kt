package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.BellSlash24: ImageVector
    get() {
        if (_bellSlash24 != null) {
            return _bellSlash24!!
        }
        _bellSlash24 = Builder(name = "BellSlash24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(20.5f, 20.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineTo(17.94f, 19.0f)
                lineTo(15.5f, 19.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                lineTo(3.518f, 19.0f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, true, -1.263f, -2.36f)
                lineToRelative(2.2f, -3.298f)
                arcTo(3.249f, 3.249f, 0.0f, false, false, 5.0f, 11.539f)
                lineTo(5.0f, 7.0f)
                curveToRelative(0.0f, -0.294f, 0.025f, -0.583f, 0.073f, -0.866f)
                lineTo(1.22f, 2.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(6.5f, 7.56f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(3.979f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -0.797f, 2.635f)
                lineToRelative(-2.2f, 3.298f)
                lineToRelative(-0.003f, 0.01f)
                lineToRelative(0.001f, 0.007f)
                lineToRelative(0.004f, 0.006f)
                lineToRelative(0.006f, 0.004f)
                lineToRelative(0.007f, 0.001f)
                lineTo(16.44f, 17.5f)
                close()
                moveTo(10.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                close()
                moveTo(12.0f, 2.5f)
                curveToRelative(-1.463f, 0.0f, -2.8f, 0.485f, -3.788f, 1.257f)
                lineToRelative(-0.04f, 0.032f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.935f, -1.173f)
                lineToRelative(0.05f, -0.04f)
                curveTo(8.548f, 1.59f, 10.212f, 1.0f, 12.0f, 1.0f)
                curveToRelative(3.681f, 0.0f, 7.0f, 2.565f, 7.0f, 6.0f)
                verticalLineToRelative(4.539f)
                curveToRelative(0.0f, 0.642f, 0.19f, 1.269f, 0.546f, 1.803f)
                lineToRelative(1.328f, 1.992f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.248f, 0.832f)
                lineToRelative(-1.328f, -1.992f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -0.798f, -2.635f)
                lineTo(17.5f, 7.0f)
                curveToRelative(0.0f, -2.364f, -2.383f, -4.5f, -5.5f, -4.5f)
                close()
            }
        }
        .build()
        return _bellSlash24!!
    }

private var _bellSlash24: ImageVector? = null
