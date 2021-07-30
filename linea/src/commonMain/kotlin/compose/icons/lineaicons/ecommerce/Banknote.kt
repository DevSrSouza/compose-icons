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

public val EcommerceGroup.Banknote: ImageVector
    get() {
        if (_banknote != null) {
            return _banknote!!
        }
        _banknote = Builder(name = "Banknote", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 16.0f)
                horizontalLineToRelative(62.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-62.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 44.0f)
                curveToRelative(0.0f, -2.762f, -2.238f, -5.0f, -5.0f, -5.0f)
                verticalLineTo(25.0f)
                curveToRelative(2.762f, 0.0f, 5.0f, -2.238f, 5.0f, -5.0f)
                horizontalLineToRelative(44.0f)
                curveToRelative(0.0f, 2.762f, 2.238f, 5.0f, 5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(-2.762f, 0.0f, -5.0f, 2.238f, -5.0f, 5.0f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
            }
        }
        .build()
        return _banknote!!
    }

private var _banknote: ImageVector? = null
