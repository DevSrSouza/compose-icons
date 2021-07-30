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

public val EcommerceGroup.BagPlus: ImageVector
    get() {
        if (_bagPlus != null) {
            return _bagPlus!!
        }
        _bagPlus = Builder(name = "BagPlus", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 33.0f)
                lineTo(32.0f, 51.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 42.0f)
                lineTo(23.0f, 42.0f)
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
        return _bagPlus!!
    }

private var _bagPlus: ImageVector? = null
