package compose.icons.lineaicons.ecommerce

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
import compose.icons.lineaicons.EcommerceGroup

public val EcommerceGroup.BagDownload: ImageVector
    get() {
        if (_bagDownload != null) {
            return _bagDownload!!
        }
        _bagDownload = Builder(name = "BagDownload", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 43.0f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(-8.0f, -8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 51.0f)
                lineTo(32.0f, 31.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(44.0f, 18.0f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(0.0f, 45.0f)
                lineToRelative(-44.0f, 0.0f)
                lineToRelative(0.0f, -45.0f)
                lineToRelative(10.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -5.523f, 4.477f, -10.0f, 10.0f, -10.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                verticalLineToRelative(13.0f)
            }
        }
        .build()
        return _bagDownload!!
    }

private var _bagDownload: ImageVector? = null
