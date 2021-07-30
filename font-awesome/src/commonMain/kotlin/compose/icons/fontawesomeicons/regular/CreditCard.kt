package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CreditCard: ImageVector
    get() {
        if (_creditCard != null) {
            return _creditCard!!
        }
        _creditCard = Builder(name = "CreditCard", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(527.9f, 32.0f)
                lineTo(48.1f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.1f, 48.0f)
                horizontalLineToRelative(479.8f)
                curveToRelative(26.6f, 0.0f, 48.1f, -21.5f, 48.1f, -48.0f)
                lineTo(576.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.1f, -48.0f)
                close()
                moveTo(54.1f, 80.0f)
                horizontalLineToRelative(467.8f)
                curveToRelative(3.3f, 0.0f, 6.0f, 2.7f, 6.0f, 6.0f)
                verticalLineToRelative(42.0f)
                lineTo(48.1f, 128.0f)
                lineTo(48.1f, 86.0f)
                curveToRelative(0.0f, -3.3f, 2.7f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(521.9f, 432.0f)
                lineTo(54.1f, 432.0f)
                curveToRelative(-3.3f, 0.0f, -6.0f, -2.7f, -6.0f, -6.0f)
                lineTo(48.1f, 256.0f)
                horizontalLineToRelative(479.8f)
                verticalLineToRelative(170.0f)
                curveToRelative(0.0f, 3.3f, -2.7f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(192.0f, 332.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-72.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                close()
                moveTo(384.0f, 332.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                lineTo(236.0f, 384.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(136.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
