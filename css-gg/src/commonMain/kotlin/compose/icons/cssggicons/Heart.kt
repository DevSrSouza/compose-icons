package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0122f, 5.5717f)
                lineTo(10.9252f, 4.4847f)
                curveTo(8.7773f, 2.3368f, 5.2949f, 2.3368f, 3.147f, 4.4847f)
                curveTo(0.9992f, 6.6326f, 0.9992f, 10.115f, 3.147f, 12.2629f)
                lineTo(11.9859f, 21.1017f)
                lineTo(11.9877f, 21.0999f)
                lineTo(12.014f, 21.1262f)
                lineTo(20.8528f, 12.2874f)
                curveTo(23.0007f, 10.1395f, 23.0007f, 6.6571f, 20.8528f, 4.5092f)
                curveTo(18.705f, 2.3613f, 15.2226f, 2.3613f, 13.0747f, 4.5092f)
                lineTo(12.0122f, 5.5717f)
                close()
                moveTo(11.9877f, 18.2715f)
                lineTo(16.9239f, 13.3352f)
                lineTo(18.3747f, 11.9342f)
                lineTo(18.3762f, 11.9356f)
                lineTo(19.4386f, 10.8732f)
                curveTo(20.8055f, 9.5063f, 20.8055f, 7.2903f, 19.4386f, 5.9234f)
                curveTo(18.0718f, 4.5566f, 15.8557f, 4.5566f, 14.4889f, 5.9234f)
                lineTo(12.0133f, 8.399f)
                lineTo(12.006f, 8.3918f)
                lineTo(12.005f, 8.3929f)
                lineTo(9.511f, 5.8989f)
                curveTo(8.1442f, 4.5321f, 5.9281f, 4.5321f, 4.5613f, 5.8989f)
                curveTo(3.1944f, 7.2657f, 3.1944f, 9.4818f, 4.5613f, 10.8487f)
                lineTo(7.1007f, 13.3881f)
                lineTo(7.1025f, 13.3863f)
                lineTo(11.9877f, 18.2715f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
