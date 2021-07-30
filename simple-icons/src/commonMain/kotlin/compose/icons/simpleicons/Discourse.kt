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

public val SimpleIcons.Discourse: ImageVector
    get() {
        if (_discourse != null) {
            return _discourse!!
        }
        _discourse = Builder(name = "Discourse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.103f, 0.0f)
                curveTo(18.666f, 0.0f, 24.0f, 5.485f, 24.0f, 11.997f)
                curveToRelative(0.0f, 6.51f, -5.33f, 11.99f, -11.9f, 11.99f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 11.79f)
                curveTo(0.0f, 5.28f, 5.532f, 0.0f, 12.103f, 0.0f)
                close()
                moveTo(12.219f, 4.563f)
                curveToRelative(-2.593f, -0.003f, -4.996f, 1.352f, -6.337f, 3.57f)
                curveToRelative(-1.33f, 2.208f, -1.387f, 4.957f, -0.148f, 7.22f)
                lineTo(4.4f, 19.61f)
                lineToRelative(4.794f, -1.074f)
                curveToRelative(2.745f, 1.225f, 5.965f, 0.676f, 8.136f, -1.39f)
                curveToRelative(2.17f, -2.054f, 2.86f, -5.228f, 1.737f, -7.997f)
                curveToRelative(-1.135f, -2.778f, -3.84f, -4.59f, -6.84f, -4.585f)
                horizontalLineToRelative(-0.008f)
                close()
            }
        }
        .build()
        return _discourse!!
    }

private var _discourse: ImageVector? = null
