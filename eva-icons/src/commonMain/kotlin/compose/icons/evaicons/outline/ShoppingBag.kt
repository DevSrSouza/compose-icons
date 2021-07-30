package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.12f, 6.71f)
                lineTo(17.29f, 3.88f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.17f, 3.0f)
                lineTo(8.83f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.12f, 0.88f)
                lineTo(3.88f, 6.71f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 8.83f)
                lineTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(18.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 8.83f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.12f, 6.71f)
                close()
                moveTo(8.12f, 5.29f)
                arcTo(1.05f, 1.05f, 0.0f, false, true, 8.83f, 5.0f)
                horizontalLineToRelative(6.34f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, 0.71f, 0.29f)
                lineTo(17.59f, 7.0f)
                lineTo(6.41f, 7.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 9.0f)
                lineTo(19.0f, 9.0f)
                verticalLineToRelative(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 11.0f)
                close()
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
