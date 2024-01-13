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

public val SimpleIcons.Celestron: ImageVector
    get() {
        if (_celestron != null) {
            return _celestron!!
        }
        _celestron = Builder(name = "Celestron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.002f)
                curveToRelative(-6.6266f, 0.0f, -12.0f, 5.3712f, -12.0f, 12.0f)
                curveToRelative(0.0f, 6.6275f, 5.3734f, 11.996f, 12.0f, 11.996f)
                curveToRelative(1.7452f, 0.0f, 3.4033f, -0.3698f, 4.8984f, -1.041f)
                curveTo(10.7585f, 21.2392f, 2.2788f, 17.3246f, 3.25f, 9.5312f)
                curveToRelative(0.6406f, -5.1338f, 7.2145f, -8.46f, 13.8047f, -8.414f)
                curveTo(15.518f, 0.4012f, 13.8062f, 0.002f, 12.0f, 0.002f)
                close()
                moveTo(17.4297f, 1.8457f)
                curveToRelative(-5.0918f, -0.049f, -9.3055f, 2.0411f, -9.6875f, 5.5566f)
                curveToRelative(-0.6046f, 5.5956f, 7.1547f, 8.8084f, 11.8437f, 10.1407f)
                curveToRelative(0.9056f, 0.2592f, 1.8969f, 0.4197f, 2.7676f, 0.5234f)
                curveTo(23.399f, 16.286f, 24.0f, 14.2111f, 24.0f, 12.002f)
                curveToRelative(0.0f, -4.2502f, -2.21f, -7.9827f, -5.541f, -10.1172f)
                arcToRelative(18.6755f, 18.6755f, 0.0f, false, false, -1.0293f, -0.0391f)
                close()
            }
        }
        .build()
        return _celestron!!
    }

private var _celestron: ImageVector? = null
