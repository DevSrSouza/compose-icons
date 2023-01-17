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

public val SimpleIcons.Binance: ImageVector
    get() {
        if (_binance != null) {
            return _binance!!
        }
        _binance = Builder(name = "Binance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.624f, 13.9202f)
                lineToRelative(2.7175f, 2.7154f)
                lineToRelative(-7.353f, 7.353f)
                lineToRelative(-7.353f, -7.352f)
                lineToRelative(2.7175f, -2.7164f)
                lineToRelative(4.6355f, 4.6595f)
                lineToRelative(4.6356f, -4.6595f)
                close()
                moveTo(21.2606f, 9.2836f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-2.7154f, 2.7164f)
                lineTo(18.5682f, 12.0f)
                lineToRelative(2.6924f, -2.7164f)
                close()
                moveTo(11.9886f, 9.2846f)
                lineToRelative(2.7163f, 2.6914f)
                lineToRelative(-2.7164f, 2.7174f)
                verticalLineToRelative(-0.001f)
                lineTo(9.2721f, 12.0f)
                lineToRelative(2.7164f, -2.7154f)
                close()
                moveTo(2.7164f, 9.2836f)
                lineTo(5.4088f, 12.0f)
                lineToRelative(-2.6914f, 2.6924f)
                lineTo(0.0f, 12.0f)
                lineToRelative(2.7164f, -2.7164f)
                close()
                moveTo(11.9885f, 0.0115f)
                lineToRelative(7.353f, 7.329f)
                lineToRelative(-2.7174f, 2.7154f)
                lineToRelative(-4.6356f, -4.6356f)
                lineToRelative(-4.6355f, 4.6595f)
                lineToRelative(-2.7174f, -2.7154f)
                lineToRelative(7.353f, -7.353f)
                close()
            }
        }
        .build()
        return _binance!!
    }

private var _binance: ImageVector? = null
