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

public val EcommerceGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(44.0f, 38.0f)
                moveToRelative(-19.0f, 0.0f)
                arcToRelative(19.0f, 19.0f, 0.0f, true, true, 38.0f, 0.0f)
                arcToRelative(19.0f, 19.0f, 0.0f, true, true, -38.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(44.0f, 38.0f)
                moveToRelative(-13.0f, 0.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, true, true, 26.0f, 0.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, true, true, -26.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(30.0f, 51.0f)
                lineToRelative(-29.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(37.0f, 0.0f)
                lineToRelative(0.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.0f, 45.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(27.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.0f, 39.0f)
                lineToRelative(-21.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(22.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.0f, 33.0f)
                lineToRelative(-25.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(25.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.0f, 27.0f)
                lineToRelative(-26.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(23.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(35.0f, 21.0f)
                lineToRelative(-34.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(28.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 20.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-37.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(32.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 9.0f)
                horizontalLineToRelative(37.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-37.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
