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

public val SharpGroup.CurrencyYen: ImageVector
    get() {
        if (_currencyYen != null) {
            return _currencyYen!!
        }
        _currencyYen = Builder(name = "CurrencyYen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.92f, 11.0f)
                lineToRelative(4.08f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(4.08f, 0.0f)
                lineToRelative(-5.08f, -8.0f)
                lineToRelative(2.37f, 0.0f)
                lineToRelative(4.63f, 7.29f)
                lineToRelative(4.63f, -7.29f)
                lineToRelative(2.37f, 0.0f)
                close()
            }
        }
        .build()
        return _currencyYen!!
    }

private var _currencyYen: ImageVector? = null
