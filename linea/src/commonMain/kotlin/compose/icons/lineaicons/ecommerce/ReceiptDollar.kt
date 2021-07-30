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

public val EcommerceGroup.ReceiptDollar: ImageVector
    get() {
        if (_receiptDollar != null) {
            return _receiptDollar!!
        }
        _receiptDollar = Builder(name = "ReceiptDollar", defaultWidth = 64.0.dp, defaultHeight =
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
                moveTo(38.0f, 28.0f)
                curveToRelative(0.0f, 0.0f, 0.161f, -4.0f, -6.0f, -4.0f)
                reflectiveCurveToRelative(-6.0f, 3.0f, -6.0f, 5.0f)
                reflectiveCurveToRelative(0.523f, 4.0f, 6.0f, 4.0f)
                curveToRelative(6.161f, 0.0f, 7.0f, 4.315f, 7.0f, 5.0f)
                curveToRelative(0.0f, 1.369f, 0.53f, 6.0f, -7.0f, 6.0f)
                curveToRelative(-6.161f, 0.0f, -6.0f, -3.315f, -6.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(34.0f, 21.0f)
                lineTo(34.0f, 48.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(30.0f, 21.0f)
                lineTo(30.0f, 48.0f)
            }
        }
        .build()
        return _receiptDollar!!
    }

private var _receiptDollar: ImageVector? = null
