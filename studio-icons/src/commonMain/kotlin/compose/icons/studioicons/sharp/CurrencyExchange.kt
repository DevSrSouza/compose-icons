package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CurrencyExchange: ImageVector
    get() {
        if (_currencyExchange != null) {
            return _currencyExchange!!
        }
        _currencyExchange = Builder(name = "CurrencyExchange", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.89f, 11.1f)
                curveToRelative(-1.78f, -0.59f, -2.64f, -0.96f, -2.64f, -1.9f)
                curveToRelative(0.0f, -1.02f, 1.11f, -1.39f, 1.81f, -1.39f)
                curveToRelative(1.31f, 0.0f, 1.79f, 0.99f, 1.9f, 1.34f)
                lineToRelative(1.58f, -0.67f)
                curveTo(15.39f, 8.03f, 14.72f, 6.56f, 13.0f, 6.24f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.26f)
                curveTo(8.52f, 6.82f, 8.51f, 9.12f, 8.51f, 9.22f)
                curveToRelative(0.0f, 2.27f, 2.25f, 2.91f, 3.35f, 3.31f)
                curveToRelative(1.58f, 0.56f, 2.28f, 1.07f, 2.28f, 2.03f)
                curveToRelative(0.0f, 1.13f, -1.05f, 1.61f, -1.98f, 1.61f)
                curveToRelative(-1.82f, 0.0f, -2.34f, -1.87f, -2.4f, -2.09f)
                lineTo(8.1f, 14.75f)
                curveToRelative(0.63f, 2.19f, 2.28f, 2.78f, 2.9f, 2.96f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.24f)
                curveToRelative(0.4f, -0.09f, 2.9f, -0.59f, 2.9f, -3.22f)
                curveTo(15.9f, 13.15f, 15.29f, 11.93f, 12.89f, 11.1f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-2.48f, 0.0f)
                curveToRelative(1.61f, 2.41f, 4.36f, 4.0f, 7.48f, 4.0f)
                curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 6.08f, -4.92f, 11.0f, -11.0f, 11.0f)
                curveToRelative(-3.72f, 0.0f, -7.01f, -1.85f, -9.0f, -4.67f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.92f, 5.92f, 1.0f, 12.0f, 1.0f)
                curveToRelative(3.72f, 0.0f, 7.01f, 1.85f, 9.0f, 4.67f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(7.0f)
                lineToRelative(2.48f, 0.0f)
                curveTo(17.87f, 4.59f, 15.12f, 3.0f, 12.0f, 3.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                horizontalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _currencyExchange!!
    }

private var _currencyExchange: ImageVector? = null
