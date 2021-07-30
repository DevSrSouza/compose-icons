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

public val CssGgIcons.MailOpen: ImageVector
    get() {
        if (_mailOpen != null) {
            return _mailOpen!!
        }
        _mailOpen = Builder(name = "MailOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.05f, 10.0151f)
                curveTo(2.7918f, 9.3071f, 2.9467f, 8.4823f, 3.5147f, 7.9143f)
                lineTo(9.8787f, 1.5503f)
                curveTo(11.0503f, 0.3787f, 12.9498f, 0.3787f, 14.1213f, 1.5503f)
                lineTo(20.4853f, 7.9143f)
                curveTo(21.0534f, 8.4824f, 21.2083f, 9.3073f, 20.9499f, 10.0154f)
                curveTo(20.9824f, 10.1139f, 20.9999f, 10.2191f, 20.9999f, 10.3285f)
                verticalLineTo(21.3285f)
                curveTo(20.9999f, 22.4331f, 20.1045f, 23.3285f, 18.9999f, 23.3285f)
                horizontalLineTo(4.9999f)
                curveTo(3.8954f, 23.3285f, 2.9999f, 22.4331f, 2.9999f, 21.3285f)
                verticalLineTo(10.3285f)
                curveTo(2.9999f, 10.219f, 3.0175f, 10.1137f, 3.05f, 10.0151f)
                close()
                moveTo(4.929f, 9.3285f)
                lineTo(11.2929f, 2.9645f)
                curveTo(11.6834f, 2.574f, 12.3166f, 2.574f, 12.7071f, 2.9645f)
                lineTo(19.0711f, 9.3285f)
                horizontalLineTo(19.0408f)
                verticalLineTo(9.3588f)
                lineTo(12.7071f, 15.6924f)
                curveTo(12.3166f, 16.083f, 11.6834f, 16.083f, 11.2929f, 15.6924f)
                lineTo(4.929f, 9.3285f)
                close()
                moveTo(18.9999f, 12.2281f)
                lineTo(14.1213f, 17.1067f)
                curveTo(12.9498f, 18.2782f, 11.0503f, 18.2782f, 9.8787f, 17.1067f)
                lineTo(4.9999f, 12.2279f)
                lineTo(4.9999f, 21.3285f)
                horizontalLineTo(18.9999f)
                verticalLineTo(12.2281f)
                close()
            }
        }
        .build()
        return _mailOpen!!
    }

private var _mailOpen: ImageVector? = null
