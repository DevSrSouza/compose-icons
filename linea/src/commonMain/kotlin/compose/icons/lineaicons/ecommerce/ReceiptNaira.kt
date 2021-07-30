package compose.icons.lineaicons.ecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.EcommerceGroup

public val EcommerceGroup.ReceiptNaira: ImageVector
    get() {
        if (_receiptNaira != null) {
            return _receiptNaira!!
        }
        _receiptNaira = Builder(name = "ReceiptNaira", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(52.0f, 62.999f)
                lineToRelative(0.0f, -62.0f)
                lineToRelative(-26.0f, 0.0f)
                lineToRelative(-14.0f, 14.0f)
                lineToRelative(0.0f, 48.001f)
                lineToRelative(4.0f, -2.0f)
                lineToRelative(4.0f, 2.0f)
                lineToRelative(4.0f, -2.0f)
                lineToRelative(4.0f, 2.0f)
                lineToRelative(4.0f, -2.0f)
                lineToRelative(4.0f, 2.0f)
                lineToRelative(4.0f, -2.0f)
                lineToRelative(4.0f, 2.0f)
                lineToRelative(4.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.999f)
                lineToRelative(14.0f, 0.0f)
                lineToRelative(0.0f, -14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.0f, 48.0f)
                lineToRelative(0.0f, -27.0f)
                lineToRelative(0.929f, 0.0f)
                lineToRelative(13.142f, 26.0f)
                lineToRelative(0.929f, 0.0f)
                lineToRelative(0.0f, -27.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 31.0f)
                lineTo(44.0f, 31.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 37.0f)
                lineTo(44.0f, 37.0f)
            }
        }
        .build()
        return _receiptNaira!!
    }

private var _receiptNaira: ImageVector? = null
