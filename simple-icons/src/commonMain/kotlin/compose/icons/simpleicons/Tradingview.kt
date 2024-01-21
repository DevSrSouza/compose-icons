package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tradingview: ImageVector
    get() {
        if (_tradingview != null) {
            return _tradingview!!
        }
        _tradingview = Builder(name = "Tradingview", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8654f, 8.2789f)
                curveToRelative(0.0f, 1.3541f, -1.0978f, 2.4519f, -2.452f, 2.4519f)
                curveToRelative(-1.354f, 0.0f, -2.4519f, -1.0978f, -2.4519f, -2.452f)
                curveToRelative(0.0f, -1.354f, 1.0978f, -2.4518f, 2.452f, -2.4518f)
                curveToRelative(1.3541f, 0.0f, 2.4519f, 1.0977f, 2.4519f, 2.4519f)
                close()
                moveTo(9.75f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(4.9038f)
                horizontalLineToRelative(4.8462f)
                verticalLineToRelative(7.2692f)
                lineTo(9.75f, 18.173f)
                close()
                moveTo(18.3462f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineToRelative(-5.1058f, 12.173f)
                horizontalLineToRelative(-5.6538f)
                close()
            }
        }
        .build()
        return _tradingview!!
    }

private var _tradingview: ImageVector? = null
