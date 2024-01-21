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

public val SimpleIcons.Vtex: ImageVector
    get() {
        if (_vtex != null) {
            return _vtex!!
        }
        _vtex = Builder(name = "Vtex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2027f, 1.7925f)
                horizontalLineTo(4.2812f)
                curveToRelative(-1.3897f, 0.0f, -2.2795f, 1.4698f, -1.6293f, 2.6917f)
                lineToRelative(1.7927f, 3.3773f)
                horizontalLineTo(1.1947f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.5873f, 0.1537f)
                arcToRelative(1.1924f, 1.1924f, 0.0f, false, false, -0.4356f, 0.421f)
                arcToRelative(1.1847f, 1.1847f, 0.0f, false, false, -0.0342f, 1.1683f)
                lineToRelative(5.766f, 10.858f)
                curveToRelative(0.1017f, 0.191f, 0.2537f, 0.3507f, 0.4399f, 0.4622f)
                arcToRelative(1.1996f, 1.1996f, 0.0f, false, false, 1.2326f, 0.0f)
                arcToRelative(1.1913f, 1.1913f, 0.0f, false, false, 0.4398f, -0.4623f)
                lineToRelative(1.566f, -2.933f)
                lineToRelative(1.9647f, 3.7006f)
                curveToRelative(0.6914f, 1.3016f, 2.5645f, 1.304f, 3.2584f, 0.0038f)
                lineTo(23.7878f, 4.416f)
                curveToRelative(0.635f, -1.1895f, -0.2314f, -2.6235f, -1.5851f, -2.6235f)
                close()
                moveTo(14.1524f, 8.978f)
                lineToRelative(-3.8733f, 7.2533f)
                arcToRelative(0.7932f, 0.7932f, 0.0f, false, true, -0.2927f, 0.3074f)
                arcToRelative(0.7986f, 0.7986f, 0.0f, false, true, -0.82f, 0.0f)
                arcToRelative(0.7933f, 0.7933f, 0.0f, false, true, -0.2927f, -0.3074f)
                lineTo(5.0378f, 9.0086f)
                arcToRelative(0.7883f, 0.7883f, 0.0f, false, true, 0.0208f, -0.7776f)
                arcToRelative(0.7933f, 0.7933f, 0.0f, false, true, 0.2891f, -0.281f)
                arcToRelative(0.7985f, 0.7985f, 0.0f, false, true, 0.3906f, -0.1033f)
                horizontalLineToRelative(7.7307f)
                arcToRelative(0.7769f, 0.7769f, 0.0f, false, true, 0.381f, 0.0998f)
                arcToRelative(0.7717f, 0.7717f, 0.0f, false, true, 0.2823f, 0.2736f)
                arcToRelative(0.7672f, 0.7672f, 0.0f, false, true, 0.02f, 0.758f)
                close()
            }
        }
        .build()
        return _vtex!!
    }

private var _vtex: ImageVector? = null
