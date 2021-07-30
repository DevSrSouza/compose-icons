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

public val EcommerceGroup.Banknotes: ImageVector
    get() {
        if (_banknotes != null) {
            return _banknotes!!
        }
        _banknotes = Builder(name = "Banknotes", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 24.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(-52.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(52.0f, 0.0f)
                lineToRelative(0.0f, 26.0f)
                lineToRelative(-8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 46.0f)
                curveToRelative(0.0f, -3.0f, -2.0f, -4.0f, -5.0f, -4.0f)
                verticalLineTo(32.0f)
                curveToRelative(3.0f, 0.0f, 5.0f, -1.0f, 5.0f, -4.0f)
                horizontalLineToRelative(35.0f)
                curveToRelative(0.0f, 3.0f, 2.0f, 4.0f, 4.0f, 4.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(-2.0f, 0.0f, -4.0f, 1.0f, -4.0f, 4.0f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.0f, 37.0f)
                moveToRelative(-5.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f)
            }
        }
        .build()
        return _banknotes!!
    }

private var _banknotes: ImageVector? = null
