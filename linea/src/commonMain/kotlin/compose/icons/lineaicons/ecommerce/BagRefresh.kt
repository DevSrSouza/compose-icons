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

public val EcommerceGroup.BagRefresh: ImageVector
    get() {
        if (_bagRefresh != null) {
            return _bagRefresh!!
        }
        _bagRefresh = Builder(name = "BagRefresh", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 42.0f)
                curveToRelative(0.0f, 4.418f, 3.582f, 9.0f, 8.0f, 9.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 55.0f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(-3.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.0f, 42.0f)
                curveToRelative(0.0f, -4.418f, -3.582f, -9.0f, -8.0f, -9.0f)
                horizontalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 29.0f)
                lineToRelative(-3.0f, 4.0f)
                lineToRelative(3.0f, 4.0f)
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
        return _bagRefresh!!
    }

private var _bagRefresh: ImageVector? = null
