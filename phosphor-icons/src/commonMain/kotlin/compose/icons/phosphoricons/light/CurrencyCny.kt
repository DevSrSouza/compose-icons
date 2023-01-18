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

public val LightGroup.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) {
            return _currencyCny!!
        }
        _currencyCny = Builder(name = "CurrencyCny", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 58.0f, 64.0f)
                close()
                moveTo(216.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                horizontalLineTo(176.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, -18.0f)
                verticalLineTo(126.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(98.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -58.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, false, 70.0f, -70.0f)
                verticalLineTo(126.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, 30.0f, 30.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 170.0f)
                close()
            }
        }
        .build()
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
