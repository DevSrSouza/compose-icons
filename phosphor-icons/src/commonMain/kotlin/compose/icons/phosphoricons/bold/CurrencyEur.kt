package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) {
            return _currencyEur!!
        }
        _currencyEur = Builder(name = "CurrencyEur", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.4f, 186.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 53.5f, 160.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(120.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(53.5f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 195.4f, 52.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                arcTo(59.3f, 59.3f, 0.0f, false, false, 136.0f, 52.0f)
                arcTo(60.1f, 60.1f, 0.0f, false, false, 78.2f, 96.0f)
                horizontalLineTo(136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(76.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(78.2f)
                arcTo(60.1f, 60.1f, 0.0f, false, false, 136.0f, 204.0f)
                arcToRelative(59.3f, 59.3f, 0.0f, false, false, 42.4f, -17.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 195.4f, 186.4f)
                close()
            }
        }
        .build()
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
