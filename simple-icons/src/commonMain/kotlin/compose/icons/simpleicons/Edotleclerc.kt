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

public val SimpleIcons.Edotleclerc: ImageVector
    get() {
        if (_edotleclerc != null) {
            return _edotleclerc!!
        }
        _edotleclerc = Builder(name = "Edotleclerc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0006f, 0.0f)
                curveTo(5.4304f, 0.0f, 0.104f, 5.373f, 0.104f, 12.0006f)
                curveTo(0.1041f, 18.628f, 5.4304f, 24.0f, 12.0006f, 24.0f)
                curveToRelative(6.57f, 0.0f, 11.8953f, -5.372f, 11.8953f, -11.9994f)
                curveTo(23.8959f, 5.373f, 18.5705f, 0.0f, 12.0006f, 0.0f)
                close()
                moveTo(12.0006f, 2.491f)
                curveToRelative(5.2064f, 0.0f, 9.4266f, 4.2576f, 9.4266f, 9.5096f)
                curveToRelative(0.0f, 5.2518f, -4.2202f, 9.5085f, -9.4266f, 9.5085f)
                curveToRelative(-5.2065f, 0.0f, -9.4278f, -4.2567f, -9.4278f, -9.5085f)
                curveToRelative(0.0f, -5.252f, 4.2213f, -9.5097f, 9.4278f, -9.5097f)
                close()
                moveTo(13.1483f, 4.4822f)
                curveToRelative(-1.4425f, 0.0f, -2.7735f, 0.4696f, -3.8562f, 1.266f)
                horizontalLineToRelative(3.1929f)
                lineTo(12.485f, 8.982f)
                curveToRelative(-0.556f, 0.0284f, -1.0156f, 0.4782f, -1.0156f, 1.0436f)
                verticalLineToRelative(5.4499f)
                horizontalLineToRelative(0.9442f)
                curveToRelative(1.2058f, 0.0f, 1.5093f, -1.4532f, 1.5093f, -1.4532f)
                horizontalLineToRelative(2.836f)
                lineToRelative(0.001f, 2.5939f)
                curveToRelative(1.7738f, -1.1835f, 2.9437f, -3.215f, 2.9437f, -5.5212f)
                curveToRelative(0.0f, -3.6525f, -2.9346f, -6.6128f, -6.5554f, -6.6128f)
                close()
                moveTo(6.49f, 6.7322f)
                verticalLineToRelative(1.6204f)
                curveToRelative(0.5462f, 0.1418f, 1.018f, 0.6113f, 1.018f, 1.3817f)
                verticalLineToRelative(5.4592f)
                curveToRelative(0.0f, 0.6162f, -0.4365f, 1.1693f, -1.018f, 1.315f)
                verticalLineToRelative(2.0943f)
                horizontalLineToRelative(9.3003f)
                lineTo(15.7903f, 15.004f)
                lineToRelative(-1.2344f, 0.007f)
                curveToRelative(-0.348f, 0.8466f, -1.1771f, 1.4415f, -2.1422f, 1.4415f)
                horizontalLineToRelative(-1.913f)
                lineTo(10.5007f, 9.691f)
                curveToRelative(0.0f, -0.6981f, 0.4543f, -1.1824f, 1.0156f, -1.335f)
                lineTo(11.5163f, 6.7322f)
                close()
            }
        }
        .build()
        return _edotleclerc!!
    }

private var _edotleclerc: ImageVector? = null
