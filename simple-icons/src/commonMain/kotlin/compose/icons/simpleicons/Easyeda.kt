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

public val SimpleIcons.Easyeda: ImageVector
    get() {
        if (_easyeda != null) {
            return _easyeda!!
        }
        _easyeda = Builder(name = "Easyeda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.31f, 3.108f)
                arcToRelative(7.67f, 7.67f, 0.0f, false, false, -3.015f, 0.545f)
                arcToRelative(7.67f, 7.67f, 0.0f, false, false, -1.73f, 0.951f)
                arcToRelative(7.865f, 7.865f, 0.0f, false, false, -1.59f, 1.567f)
                arcToRelative(6.308f, 6.308f, 0.0f, false, false, -0.764f, -0.047f)
                curveTo(2.78f, 6.124f, 0.0f, 8.91f, 0.0f, 12.35f)
                arcToRelative(6.217f, 6.217f, 0.0f, false, false, 4.146f, 5.868f)
                arcToRelative(3.759f, 3.759f, 0.0f, false, false, 7.326f, -1.574f)
                lineToRelative(5.3f, -2.673f)
                lineToRelative(-0.04f, -0.078f)
                lineToRelative(0.499f, -0.257f)
                lineToRelative(-1.021f, -2.027f)
                lineToRelative(-0.499f, 0.25f)
                lineToRelative(-0.047f, -0.086f)
                lineToRelative(-5.291f, 2.658f)
                arcToRelative(3.727f, 3.727f, 0.0f, false, false, -2.627f, -1.076f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, -3.42f, 2.198f)
                arcToRelative(3.723f, 3.723f, 0.0f, false, true, -1.7f, -4.146f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, true, 5.549f, -2.214f)
                arcToRelative(5.211f, 5.211f, 0.0f, false, true, 6.585f, -3.32f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 3.538f, 4.373f)
                arcToRelative(2.913f, 2.913f, 0.0f, false, true, 3.188f, 2.899f)
                arcToRelative(2.909f, 2.909f, 0.0f, false, true, -2.65f, 2.899f)
                horizontalLineToRelative(-2.135f)
                verticalLineToRelative(2.517f)
                horizontalLineToRelative(2.244f)
                lineToRelative(0.11f, -0.016f)
                arcToRelative(5.407f, 5.407f, 0.0f, false, false, 4.925f, -5.852f)
                arcToRelative(5.459f, 5.459f, 0.0f, false, false, -1.574f, -3.375f)
                arcTo(5.355f, 5.355f, 0.0f, false, false, 20.3f, 8.01f)
                arcToRelative(7.725f, 7.725f, 0.0f, false, false, -6.99f, -4.901f)
                close()
                moveTo(7.748f, 15.367f)
                curveToRelative(0.965f, 0.0f, 1.753f, 0.791f, 1.753f, 1.761f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, -1.753f, 1.753f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, -1.754f, -1.753f)
                arcToRelative(1.756f, 1.756f, 0.0f, false, true, 1.754f, -1.753f)
                close()
            }
        }
        .build()
        return _easyeda!!
    }

private var _easyeda: ImageVector? = null
