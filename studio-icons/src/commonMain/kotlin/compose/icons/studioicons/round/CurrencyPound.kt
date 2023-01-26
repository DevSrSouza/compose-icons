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

public val RoundGroup.CurrencyPound: ImageVector
    get() {
        if (_currencyPound != null) {
            return _currencyPound!!
        }
        _currencyPound = Builder(name = "CurrencyPound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.21f, 17.61f)
                curveToRelative(-0.47f, -0.24f, -1.03f, -0.05f, -1.31f, 0.4f)
                curveTo(15.54f, 18.61f, 14.93f, 19.0f, 14.0f, 19.0f)
                lineToRelative(-4.9f, 0.0f)
                curveToRelative(0.83f, -1.0f, 1.5f, -2.34f, 1.5f, -4.0f)
                curveToRelative(0.0f, -0.35f, -0.03f, -0.69f, -0.08f, -1.0f)
                lineTo(13.0f, 14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineToRelative(-3.18f, 0.0f)
                curveTo(9.0f, 10.42f, 8.0f, 9.6f, 8.0f, 8.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.2f, 0.0f, 2.26f, 0.61f, 2.89f, 1.53f)
                curveToRelative(0.27f, 0.4f, 0.77f, 0.59f, 1.22f, 0.4f)
                curveToRelative(0.6f, -0.25f, 0.8f, -0.99f, 0.43f, -1.53f)
                curveToRelative(-0.99f, -1.45f, -2.66f, -2.4f, -4.54f, -2.4f)
                curveTo(8.46f, 2.5f, 6.0f, 4.96f, 6.0f, 8.0f)
                curveToRelative(0.0f, 1.78f, 0.79f, 2.9f, 1.49f, 4.0f)
                lineTo(7.0f, 12.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineToRelative(1.47f, 0.0f)
                curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1.0f)
                curveToRelative(0.0f, 1.9f, -1.29f, 3.11f, -2.06f, 3.66f)
                curveTo(6.2f, 18.9f, 6.0f, 19.29f, 6.0f, 19.71f)
                verticalLineToRelative(0.0f)
                curveTo(6.0f, 20.42f, 6.58f, 21.0f, 7.29f, 21.0f)
                horizontalLineTo(14.0f)
                curveToRelative(1.55f, 0.0f, 2.95f, -0.76f, 3.63f, -2.0f)
                curveTo(17.91f, 18.49f, 17.72f, 17.86f, 17.21f, 17.61f)
                close()
            }
        }
        .build()
        return _currencyPound!!
    }

private var _currencyPound: ImageVector? = null
