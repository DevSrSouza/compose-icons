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

public val SimpleIcons.Juejin: ImageVector
    get() {
        if (_juejin != null) {
            return _juejin!!
        }
        _juejin = Builder(name = "Juejin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.316f)
                lineToRelative(7.454f, -5.88f)
                lineToRelative(-2.022f, -1.625f)
                lineTo(12.0f, 11.1f)
                lineToRelative(-0.004f, 0.003f)
                lineToRelative(-5.432f, -4.288f)
                lineToRelative(-2.02f, 1.624f)
                lineToRelative(7.452f, 5.88f)
                close()
                moveTo(12.0f, 7.069f)
                lineTo(14.89f, 4.771f)
                lineTo(12.0f, 2.453f)
                lineToRelative(-0.004f, -0.005f)
                lineToRelative(-2.884f, 2.318f)
                lineToRelative(2.884f, 2.3f)
                close()
                moveTo(12.0f, 18.335f)
                lineTo(11.995f, 18.337f)
                lineTo(2.02f, 10.467f)
                lineTo(0.0f, 12.088f)
                lineToRelative(0.194f, 0.156f)
                lineToRelative(11.803f, 9.308f)
                lineToRelative(7.463f, -5.885f)
                lineTo(24.0f, 12.085f)
                lineToRelative(-2.023f, -1.624f)
                close()
            }
        }
        .build()
        return _juejin!!
    }

private var _juejin: ImageVector? = null
