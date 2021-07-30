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

public val BrandsGroup.Html5: ImageVector
    get() {
        if (_html5 != null) {
            return _html5!!
        }
        _html5 = Builder(name = "Html5", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineToRelative(34.9f, 395.8f)
                lineTo(191.5f, 480.0f)
                lineToRelative(157.6f, -52.2f)
                lineTo(384.0f, 32.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(308.2f, 159.9f)
                lineTo(124.4f, 159.9f)
                lineToRelative(4.1f, 49.4f)
                horizontalLineToRelative(175.6f)
                lineToRelative(-13.6f, 148.4f)
                lineToRelative(-97.9f, 27.0f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(-1.1f)
                lineToRelative(-98.7f, -27.3f)
                lineToRelative(-6.0f, -75.8f)
                horizontalLineToRelative(47.7f)
                lineTo(138.0f, 320.0f)
                lineToRelative(53.5f, 14.5f)
                lineToRelative(53.7f, -14.5f)
                lineToRelative(6.0f, -62.2f)
                lineTo(84.3f, 257.8f)
                lineTo(71.5f, 112.2f)
                horizontalLineToRelative(241.1f)
                lineToRelative(-4.4f, 47.7f)
                close()
            }
        }
        .build()
        return _html5!!
    }

private var _html5: ImageVector? = null
