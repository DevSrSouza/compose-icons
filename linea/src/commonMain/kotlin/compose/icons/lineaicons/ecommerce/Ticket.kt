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

public val EcommerceGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(57.0f, 18.0f)
                curveToRelative(-1.504f, 1.504f, -2.705f, 2.0f, -5.0f, 2.0f)
                curveToRelative(-4.59f, 0.0f, -8.0f, -3.41f, -8.0f, -8.0f)
                curveToRelative(0.0f, -2.295f, 0.496f, -3.496f, 2.0f, -5.0f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(1.0f, 40.0f)
                lineToRelative(6.0f, 6.0f)
                curveToRelative(1.504f, -1.504f, 2.705f, -2.0f, 5.0f, -2.0f)
                curveToRelative(4.59f, 0.0f, 8.0f, 3.41f, 8.0f, 8.0f)
                curveToRelative(0.0f, 2.295f, -0.496f, 3.496f, -2.0f, 5.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(39.0f, -39.0f)
                lineTo(57.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.0f, 15.0f)
                lineTo(30.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(45.0f, 34.0f)
                lineTo(49.0f, 38.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 21.0f)
                lineTo(36.0f, 25.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(39.0f, 28.0f)
                lineTo(43.0f, 32.0f)
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
