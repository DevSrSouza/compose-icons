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

public val SimpleIcons.Medusa: ImageVector
    get() {
        if (_medusa != null) {
            return _medusa!!
        }
        _medusa = Builder(name = "Medusa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.325f, 3.8958f)
                lineTo(14.8913f, 0.7692f)
                arcToRelative(5.7283f, 5.7283f, 0.0f, false, false, -5.7342f, 0.0f)
                lineTo(3.6983f, 3.8958f)
                curveTo(1.9455f, 4.9213f, 0.8437f, 6.8223f, 0.8437f, 8.8484f)
                verticalLineToRelative(6.2783f)
                curveToRelative(0.0f, 2.051f, 1.1018f, 3.927f, 2.8546f, 4.9526f)
                lineToRelative(5.4337f, 3.1515f)
                arcToRelative(5.7283f, 5.7283f, 0.0f, false, false, 5.7343f, 0.0f)
                lineToRelative(5.4338f, -3.1515f)
                curveToRelative(1.7778f, -1.0256f, 2.8545f, -2.9015f, 2.8545f, -4.9526f)
                lineTo(23.1546f, 8.8484f)
                curveToRelative(0.0501f, -2.026f, -1.0517f, -3.927f, -2.8296f, -4.9526f)
                close()
                moveTo(12.0117f, 17.5779f)
                curveToRelative(-3.08f, 0.0f, -5.584f, -2.5013f, -5.584f, -5.5778f)
                curveToRelative(0.0f, -3.0767f, 2.504f, -5.578f, 5.584f, -5.578f)
                curveToRelative(3.08f, 0.0f, 5.609f, 2.5013f, 5.609f, 5.578f)
                curveToRelative(0.0f, 3.0765f, -2.504f, 5.5778f, -5.609f, 5.5778f)
                close()
            }
        }
        .build()
        return _medusa!!
    }

private var _medusa: ImageVector? = null
