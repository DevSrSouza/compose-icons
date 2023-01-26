package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.CurrencyRupee: ImageVector
    get() {
        if (_currencyRupee != null) {
            return _currencyRupee!!
        }
        _currencyRupee = Builder(name = "CurrencyRupee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 14.0f)
                horizontalLineTo(9.77f)
                lineToRelative(5.1f, 5.31f)
                curveToRelative(0.61f, 0.64f, 0.16f, 1.69f, -0.72f, 1.69f)
                curveToRelative(-0.27f, 0.0f, -0.53f, -0.11f, -0.72f, -0.31f)
                lineTo(7.4f, 14.41f)
                curveTo(7.14f, 14.15f, 7.0f, 13.79f, 7.0f, 13.43f)
                curveTo(7.0f, 12.64f, 7.64f, 12.0f, 8.43f, 12.0f)
                horizontalLineToRelative(2.07f)
                curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f)
                lineTo(7.0f, 9.0f)
                curveTo(6.45f, 9.0f, 6.0f, 8.55f, 6.0f, 8.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                lineToRelative(6.66f, 0.0f)
                curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f)
                lineTo(7.0f, 5.0f)
                curveTo(6.45f, 5.0f, 6.0f, 4.55f, 6.0f, 4.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineToRelative(-2.26f, 0.0f)
                curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f)
                lineTo(17.0f, 7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineToRelative(-1.02f, 0.0f)
                curveTo(15.72f, 11.8f, 13.36f, 14.0f, 10.5f, 14.0f)
                close()
            }
        }
        .build()
        return _currencyRupee!!
    }

private var _currencyRupee: ImageVector? = null
