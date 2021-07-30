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

public val LineAwesomeIcons.MailBulkSolid: ImageVector
    get() {
        if (_mailBulkSolid != null) {
            return _mailBulkSolid!!
        }
        _mailBulkSolid = Builder(name = "MailBulkSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                lineTo(2.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 24.0f)
                lineTo(30.0f, 24.0f)
                lineTo(30.0f, 11.0f)
                lineTo(23.0f, 11.0f)
                lineTo(23.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                lineTo(12.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(14.0f, 13.0f)
                lineTo(28.0f, 13.0f)
                lineTo(28.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                lineTo(19.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 13.0f)
                close()
                moveTo(23.0f, 15.0f)
                lineTo(23.0f, 17.0f)
                lineTo(26.0f, 17.0f)
                lineTo(26.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                close()
                moveTo(4.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 18.1133f)
                lineTo(10.9609f, 21.8672f)
                curveTo(10.6819f, 22.0412f, 10.3191f, 22.0422f, 10.0391f, 21.8672f)
                lineTo(4.0f, 18.1152f)
                lineTo(4.0f, 17.0f)
                close()
                moveTo(17.0f, 20.4688f)
                lineTo(17.0f, 26.0f)
                lineTo(4.0f, 26.0f)
                lineTo(4.0f, 20.4707f)
                lineTo(8.9824f, 23.5664f)
                curveTo(9.4504f, 23.8574f, 9.976f, 24.0039f, 10.5f, 24.0039f)
                curveTo(11.024f, 24.0039f, 11.5486f, 23.8575f, 12.0156f, 23.5645f)
                lineTo(17.0f, 20.4688f)
                close()
            }
        }
        .build()
        return _mailBulkSolid!!
    }

private var _mailBulkSolid: ImageVector? = null
