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

public val SimpleIcons.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.76f, 0.0f, 3.1484f, 2.4895f, 3.1484f, 12.0f)
                reflectiveCurveTo(6.76f, 24.0f, 12.0f, 24.0f)
                curveToRelative(5.24f, 0.0f, 8.8516f, -2.4895f, 8.8516f, -12.0f)
                reflectiveCurveTo(17.24f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.2227f, 1.6816f)
                lineToRelative(6.2148f, 6.2149f)
                lineTo(13.334f, 12.0f)
                lineToRelative(4.1035f, 4.1035f)
                lineToRelative(-6.2148f, 6.2149f)
                lineTo(11.2227f, 14.125f)
                lineToRelative(-3.418f, 3.42f)
                lineToRelative(-1.2422f, -1.2442f)
                lineTo(10.8515f, 12.0f)
                lineToRelative(-4.289f, -4.3008f)
                lineToRelative(1.2422f, -1.2441f)
                lineToRelative(3.418f, 3.4199f)
                lineTo(11.2227f, 1.6816f)
                close()
                moveTo(12.9707f, 5.9258f)
                verticalLineToRelative(3.9687f)
                lineToRelative(1.9844f, -1.9843f)
                lineToRelative(-1.9844f, -1.9844f)
                close()
                moveTo(12.9707f, 14.1074f)
                verticalLineToRelative(3.9668f)
                lineToRelative(1.9844f, -1.9844f)
                lineToRelative(-1.9844f, -1.9824f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
