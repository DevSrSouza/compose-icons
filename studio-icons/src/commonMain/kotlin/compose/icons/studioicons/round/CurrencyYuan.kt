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

public val RoundGroup.CurrencyYuan: ImageVector
    get() {
        if (_currencyYuan != null) {
            return _currencyYuan!!
        }
        _currencyYuan = Builder(name = "CurrencyYuan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.72f)
                lineTo(5.98f, 4.54f)
                curveTo(5.55f, 3.87f, 6.03f, 3.0f, 6.82f, 3.0f)
                curveToRelative(0.34f, 0.0f, 0.66f, 0.17f, 0.84f, 0.46f)
                lineTo(12.0f, 10.29f)
                lineToRelative(4.34f, -6.83f)
                curveTo(16.52f, 3.17f, 16.84f, 3.0f, 17.18f, 3.0f)
                curveToRelative(0.79f, 0.0f, 1.27f, 0.87f, 0.84f, 1.54f)
                lineTo(13.28f, 12.0f)
                horizontalLineTo(17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                curveTo(13.0f, 20.55f, 12.55f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _currencyYuan!!
    }

private var _currencyYuan: ImageVector? = null
