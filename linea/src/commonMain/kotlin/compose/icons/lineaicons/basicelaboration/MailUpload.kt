package compose.icons.lineaicons.basicelaboration

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicElaborationGroup

public val BasicElaborationGroup.MailUpload: ImageVector
    get() {
        if (_mailUpload != null) {
            return _mailUpload!!
        }
        _mailUpload = Builder(name = "MailUpload", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.998f, 20.0f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(8.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.998f, 12.0f)
                lineTo(31.998f, 32.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 26.0f)
                lineToRelative(31.0f, 19.434f)
                lineToRelative(31.0f, -19.434f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.334f, 21.667f)
                lineToRelative(-10.334f, 4.333f)
                lineToRelative(0.0f, 37.0f)
                lineToRelative(62.0f, 0.0f)
                lineToRelative(0.0f, -37.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-10.334f, -4.333f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 32.0f)
                lineToRelative(0.0f, -31.0f)
                lineToRelative(42.0f, 0.0f)
                lineToRelative(0.0f, 31.0f)
            }
        }
        .build()
        return _mailUpload!!
    }

private var _mailUpload: ImageVector? = null
