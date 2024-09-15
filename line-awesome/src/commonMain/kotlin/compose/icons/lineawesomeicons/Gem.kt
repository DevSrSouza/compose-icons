package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.531f, 6.0f)
                lineTo(4.219f, 12.375f)
                lineTo(3.719f, 12.969f)
                lineTo(4.219f, 13.625f)
                lineTo(15.219f, 27.625f)
                lineTo(16.0f, 28.625f)
                lineTo(16.781f, 27.625f)
                lineTo(27.781f, 13.625f)
                lineTo(28.281f, 12.969f)
                lineTo(27.781f, 12.375f)
                lineTo(22.469f, 6.0f)
                close()
                moveTo(10.469f, 8.0f)
                lineTo(14.125f, 8.0f)
                lineTo(11.438f, 12.0f)
                lineTo(7.125f, 12.0f)
                close()
                moveTo(17.875f, 8.0f)
                lineTo(21.531f, 8.0f)
                lineTo(24.875f, 12.0f)
                lineTo(20.563f, 12.0f)
                close()
                moveTo(16.0f, 8.844f)
                lineTo(18.125f, 12.0f)
                lineTo(13.875f, 12.0f)
                close()
                moveTo(7.031f, 14.0f)
                lineTo(11.25f, 14.0f)
                lineTo(13.625f, 22.406f)
                close()
                moveTo(13.313f, 14.0f)
                lineTo(18.656f, 14.0f)
                lineTo(16.0f, 23.313f)
                close()
                moveTo(20.75f, 14.0f)
                lineTo(24.969f, 14.0f)
                lineTo(18.375f, 22.375f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
