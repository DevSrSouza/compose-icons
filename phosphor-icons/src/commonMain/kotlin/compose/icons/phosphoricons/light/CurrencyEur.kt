package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) {
            return _currencyEur!!
        }
        _currencyEur = Builder(name = "CurrencyEur", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(191.2f, 190.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 58.3f, 150.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(58.0f)
                verticalLineTo(118.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(58.3f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 191.2f, 56.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.5f, 0.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 70.3f, 106.0f)
                horizontalLineTo(136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(70.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(70.3f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, 112.4f, 40.7f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 191.2f, 190.7f)
                close()
            }
        }
        .build()
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
