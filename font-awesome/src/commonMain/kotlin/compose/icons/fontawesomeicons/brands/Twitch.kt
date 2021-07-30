package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.17f, 103.47f)
                horizontalLineTo(352.54f)
                verticalLineToRelative(109.7f)
                horizontalLineToRelative(38.63f)
                close()
                moveTo(285.0f, 103.0f)
                horizontalLineTo(246.37f)
                verticalLineTo(212.75f)
                horizontalLineTo(285.0f)
                close()
                moveTo(120.83f, 0.0f)
                lineTo(24.31f, 91.42f)
                verticalLineTo(420.58f)
                horizontalLineTo(140.14f)
                verticalLineTo(512.0f)
                lineToRelative(96.53f, -91.42f)
                horizontalLineToRelative(77.25f)
                lineTo(487.69f, 256.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(449.07f, 237.75f)
                lineToRelative(-77.22f, 73.12f)
                horizontalLineTo(294.61f)
                lineToRelative(-67.6f, 64.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineTo(140.14f)
                verticalLineTo(36.58f)
                horizontalLineTo(449.07f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
