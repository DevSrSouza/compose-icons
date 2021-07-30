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

public val LineAwesomeIcons.Redhat: ImageVector
    get() {
        if (_redhat != null) {
            return _redhat!!
        }
        _redhat = Builder(name = "Redhat", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3887f, 6.002f)
                curveTo(15.6117f, 6.002f, 15.3852f, 7.082f, 14.4512f, 7.082f)
                curveTo(13.5462f, 7.082f, 12.889f, 6.2715f, 12.043f, 6.2715f)
                curveTo(11.236f, 6.2715f, 10.7135f, 6.864f, 10.3105f, 8.082f)
                curveTo(8.9335f, 12.245f, 8.9939f, 12.0681f, 9.0039f, 12.2871f)
                curveTo(9.0039f, 13.6191f, 13.8812f, 17.9902f, 20.4102f, 17.9902f)
                lineTo(20.4102f, 18.0f)
                curveTo(22.0912f, 18.0f, 24.5195f, 17.6247f, 24.5195f, 15.4707f)
                curveTo(24.5395f, 15.1067f, 24.5695f, 15.3778f, 23.4785f, 10.3008f)
                curveTo(23.2525f, 9.2698f, 23.045f, 8.8013f, 21.373f, 7.9063f)
                curveTo(20.065f, 7.1873f, 17.2247f, 6.002f, 16.3887f, 6.002f)
                close()
                moveTo(8.2695f, 13.0391f)
                curveTo(5.9695f, 13.1491f, 3.0f, 13.5702f, 3.0f, 16.2402f)
                curveTo(3.0f, 20.6102f, 13.1898f, 26.0f, 21.2598f, 26.0f)
                curveTo(27.4398f, 26.0f, 29.0f, 23.1602f, 29.0f, 20.9102f)
                curveTo(29.0f, 19.1402f, 27.4991f, 17.1395f, 24.7891f, 15.9395f)
                curveTo(25.0201f, 17.1775f, 25.0f, 17.5587f, 25.0f, 17.7207f)
                curveTo(25.0f, 19.8277f, 22.8448f, 21.0f, 20.0078f, 21.0f)
                curveTo(13.6128f, 21.011f, 8.0f, 16.8734f, 8.0f, 14.1484f)
                curveTo(8.0f, 13.7684f, 8.1295f, 13.3871f, 8.2695f, 13.0391f)
                close()
            }
        }
        .build()
        return _redhat!!
    }

private var _redhat: ImageVector? = null
