package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CartArrowDownSolid: ImageVector
    get() {
        if (_cartArrowDownSolid != null) {
            return _cartArrowDownSolid!!
        }
        _cartArrowDownSolid = Builder(name = "CartArrowDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                curveTo(3.4492f, 7.0f, 3.0f, 7.4492f, 3.0f, 8.0f)
                curveTo(3.0f, 8.5508f, 3.4492f, 9.0f, 4.0f, 9.0f)
                lineTo(6.2188f, 9.0f)
                lineTo(8.8438f, 19.5f)
                curveTo(9.0664f, 20.3906f, 9.8633f, 21.0f, 10.7813f, 21.0f)
                lineTo(23.25f, 21.0f)
                curveTo(24.1523f, 21.0f, 24.918f, 20.4023f, 25.1563f, 19.5313f)
                lineTo(27.75f, 10.0f)
                lineTo(25.6563f, 10.0f)
                lineTo(23.25f, 19.0f)
                lineTo(10.7813f, 19.0f)
                lineTo(8.1563f, 8.5f)
                curveTo(7.9336f, 7.6094f, 7.1367f, 7.0f, 6.2188f, 7.0f)
                close()
                moveTo(22.0f, 21.0f)
                curveTo(20.3555f, 21.0f, 19.0f, 22.3555f, 19.0f, 24.0f)
                curveTo(19.0f, 25.6445f, 20.3555f, 27.0f, 22.0f, 27.0f)
                curveTo(23.6445f, 27.0f, 25.0f, 25.6445f, 25.0f, 24.0f)
                curveTo(25.0f, 22.3555f, 23.6445f, 21.0f, 22.0f, 21.0f)
                close()
                moveTo(13.0f, 21.0f)
                curveTo(11.3555f, 21.0f, 10.0f, 22.3555f, 10.0f, 24.0f)
                curveTo(10.0f, 25.6445f, 11.3555f, 27.0f, 13.0f, 27.0f)
                curveTo(14.6445f, 27.0f, 16.0f, 25.6445f, 16.0f, 24.0f)
                curveTo(16.0f, 22.3555f, 14.6445f, 21.0f, 13.0f, 21.0f)
                close()
                moveTo(16.0f, 7.0f)
                lineTo(16.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(17.0f, 16.0f)
                lineTo(21.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(13.0f, 23.0f)
                curveTo(13.5625f, 23.0f, 14.0f, 23.4375f, 14.0f, 24.0f)
                curveTo(14.0f, 24.5625f, 13.5625f, 25.0f, 13.0f, 25.0f)
                curveTo(12.4375f, 25.0f, 12.0f, 24.5625f, 12.0f, 24.0f)
                curveTo(12.0f, 23.4375f, 12.4375f, 23.0f, 13.0f, 23.0f)
                close()
                moveTo(22.0f, 23.0f)
                curveTo(22.5625f, 23.0f, 23.0f, 23.4375f, 23.0f, 24.0f)
                curveTo(23.0f, 24.5625f, 22.5625f, 25.0f, 22.0f, 25.0f)
                curveTo(21.4375f, 25.0f, 21.0f, 24.5625f, 21.0f, 24.0f)
                curveTo(21.0f, 23.4375f, 21.4375f, 23.0f, 22.0f, 23.0f)
                close()
            }
        }
        .build()
        return _cartArrowDownSolid!!
    }

private var _cartArrowDownSolid: ImageVector? = null
