package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CoinFill: ImageVector
    get() {
        if (_coinFill != null) {
            return _coinFill!!
        }
        _coinFill = Builder(name = "CoinFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.314f, -4.925f, 6.0f, -11.0f, 6.0f)
                curveToRelative(-5.967f, 0.0f, -10.824f, -2.591f, -10.995f, -5.823f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 3.314f, 4.925f, 6.0f, 11.0f, 6.0f)
                reflectiveCurveToRelative(11.0f, -2.686f, 11.0f, -6.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 2.686f, 11.0f, 6.0f)
                reflectiveCurveToRelative(-4.925f, 6.0f, -11.0f, 6.0f)
                reflectiveCurveToRelative(-11.0f, -2.686f, -11.0f, -6.0f)
                reflectiveCurveToRelative(4.925f, -6.0f, 11.0f, -6.0f)
                close()
            }
        }
        .build()
        return _coinFill!!
    }

private var _coinFill: ImageVector? = null
