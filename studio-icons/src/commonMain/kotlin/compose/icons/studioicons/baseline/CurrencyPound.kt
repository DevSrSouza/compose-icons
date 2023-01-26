package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CurrencyPound: ImageVector
    get() {
        if (_currencyPound != null) {
            return _currencyPound!!
        }
        _currencyPound = Builder(name = "CurrencyPound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                curveToRelative(1.93f, 0.0f, 3.62f, -1.17f, 4.0f, -3.0f)
                lineToRelative(-1.75f, -0.88f)
                curveTo(16.0f, 18.21f, 15.33f, 19.0f, 14.0f, 19.0f)
                lineToRelative(-4.9f, 0.0f)
                curveToRelative(0.83f, -1.0f, 1.5f, -2.34f, 1.5f, -4.0f)
                curveToRelative(0.0f, -0.35f, -0.03f, -0.69f, -0.08f, -1.0f)
                lineTo(14.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-4.18f, 0.0f)
                curveTo(9.0f, 10.42f, 8.0f, 9.6f, 8.0f, 8.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.5f, 0.0f, 2.79f, 0.95f, 3.28f, 2.28f)
                lineTo(16.63f, 6.0f)
                curveToRelative(-0.8f, -2.05f, -2.79f, -3.5f, -5.13f, -3.5f)
                curveTo(8.46f, 2.5f, 6.0f, 4.96f, 6.0f, 8.0f)
                curveToRelative(0.0f, 1.78f, 0.79f, 2.9f, 1.49f, 4.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.47f, 0.0f)
                curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1.0f)
                curveToRelative(0.0f, 2.7f, -2.6f, 4.0f, -2.6f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _currencyPound!!
    }

private var _currencyPound: ImageVector? = null
