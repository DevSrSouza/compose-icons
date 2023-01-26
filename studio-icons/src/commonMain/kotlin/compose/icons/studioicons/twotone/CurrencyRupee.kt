package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.CurrencyRupee: ImageVector
    get() {
        if (_currencyRupee != null) {
            return _currencyRupee!!
        }
        _currencyRupee = Builder(name = "CurrencyRupee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.66f, 7.0f)
                curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-3.26f, 0.0f)
                curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f)
                lineTo(18.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-2.02f, 0.0f)
                curveToRelative(-0.25f, 2.8f, -2.61f, 5.0f, -5.48f, 5.0f)
                horizontalLineTo(9.77f)
                lineToRelative(6.73f, 7.0f)
                horizontalLineToRelative(-2.77f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f)
                lineTo(6.0f, 9.0f)
                verticalLineTo(7.0f)
                lineTo(13.66f, 7.0f)
                close()
            }
        }
        .build()
        return _currencyRupee!!
    }

private var _currencyRupee: ImageVector? = null
