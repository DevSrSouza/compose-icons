package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.87f, 2.6688f)
                lineTo(20.8385f, 7.6373f)
                curveTo(21.7172f, 8.516f, 21.7172f, 9.9406f, 20.8385f, 10.8193f)
                lineTo(12.1567f, 19.4998f)
                lineTo(18.2546f, 19.5f)
                curveTo(18.6343f, 19.5f, 18.9481f, 19.7821f, 18.9977f, 20.1482f)
                lineTo(19.0046f, 20.25f)
                curveTo(19.0046f, 20.6297f, 18.7224f, 20.9435f, 18.3563f, 20.9931f)
                lineTo(18.2546f, 21.0f)
                lineTo(9.8446f, 21.0012f)
                curveTo(9.2283f, 21.0348f, 8.6009f, 20.8163f, 8.1302f, 20.3456f)
                lineTo(3.1617f, 15.377f)
                curveTo(2.283f, 14.4984f, 2.283f, 13.0737f, 3.1617f, 12.1951f)
                lineTo(12.688f, 2.6688f)
                curveTo(13.5667f, 1.7901f, 14.9913f, 1.7901f, 15.87f, 2.6688f)
                close()
                moveTo(5.7087f, 11.7678f)
                lineTo(4.2224f, 13.2557f)
                curveTo(3.9295f, 13.5486f, 3.9295f, 14.0235f, 4.2224f, 14.3164f)
                lineTo(9.1909f, 19.2849f)
                curveTo(9.3373f, 19.4314f, 9.5293f, 19.5046f, 9.7212f, 19.5046f)
                lineTo(9.7501f, 19.5f)
                lineTo(9.7886f, 19.5016f)
                curveTo(9.9575f, 19.4864f, 10.1222f, 19.4142f, 10.2515f, 19.2849f)
                lineTo(11.7377f, 17.7978f)
                lineTo(5.7087f, 11.7678f)
                close()
                moveTo(13.7486f, 3.7294f)
                lineTo(6.7697f, 10.7068f)
                lineTo(12.7987f, 16.7368f)
                lineTo(19.7778f, 9.7586f)
                curveTo(20.0707f, 9.4657f, 20.0707f, 8.9909f, 19.7778f, 8.698f)
                lineTo(14.8093f, 3.7294f)
                curveTo(14.5164f, 3.4365f, 14.0415f, 3.4365f, 13.7486f, 3.7294f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
