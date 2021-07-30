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

public val CssGgIcons.Eventbrite: ImageVector
    get() {
        if (_eventbrite != null) {
            return _eventbrite!!
        }
        _eventbrite = Builder(name = "Eventbrite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.6734f, 17.4378f)
                curveTo(12.3057f, 18.5419f, 9.5858f, 17.9679f, 7.8544f, 16.2039f)
                lineTo(21.8647f, 9.6707f)
                curveTo(21.7105f, 9.0297f, 21.4902f, 8.3945f, 21.2008f, 7.7738f)
                curveTo(18.8667f, 2.7684f, 12.9169f, 0.6028f, 7.9115f, 2.9369f)
                curveTo(2.9061f, 5.2709f, 0.7406f, 11.2207f, 3.0746f, 16.2261f)
                curveTo(5.4087f, 21.2315f, 11.3585f, 23.3971f, 16.3639f, 21.063f)
                curveTo(19.016f, 19.8263f, 20.8708f, 17.5746f, 21.6815f, 14.986f)
                horizontalLineTo(17.3424f)
                curveTo(16.7484f, 16.0235f, 15.8393f, 16.8941f, 14.6734f, 17.4378f)
                close()
                moveTo(9.602f, 6.5621f)
                curveTo(7.2344f, 7.6662f, 5.9257f, 10.1185f, 6.164f, 12.5786f)
                lineTo(16.4208f, 7.7958f)
                curveTo(14.6894f, 6.0319f, 11.9696f, 5.458f, 9.602f, 6.5621f)
                close()
            }
        }
        .build()
        return _eventbrite!!
    }

private var _eventbrite: ImageVector? = null
