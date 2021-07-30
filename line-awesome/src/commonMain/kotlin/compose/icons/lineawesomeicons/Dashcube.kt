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

public val LineAwesomeIcons.Dashcube: ImageVector
    get() {
        if (_dashcube != null) {
            return _dashcube!!
        }
        _dashcube = Builder(name = "Dashcube", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.5f, 3.0f)
                lineTo(24.1875f, 3.2813f)
                lineTo(20.4688f, 7.0f)
                lineTo(11.0f, 7.0f)
                curveTo(8.25f, 7.0f, 6.0f, 9.25f, 6.0f, 12.0f)
                lineTo(6.0f, 22.0f)
                curveTo(6.0f, 24.75f, 8.25f, 27.0f, 11.0f, 27.0f)
                lineTo(21.0f, 27.0f)
                curveTo(23.75f, 27.0f, 26.0f, 24.75f, 26.0f, 22.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(24.0f, 6.3125f)
                lineTo(24.0f, 22.0f)
                curveTo(24.0f, 23.668f, 22.668f, 25.0f, 21.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                curveTo(9.332f, 25.0f, 8.0f, 23.668f, 8.0f, 22.0f)
                lineTo(8.0f, 12.0f)
                curveTo(8.0f, 10.332f, 9.332f, 9.0f, 11.0f, 9.0f)
                lineTo(21.3125f, 9.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(11.9063f, 12.0f, 11.0f, 12.9063f, 11.0f, 14.0f)
                lineTo(11.0f, 20.0f)
                curveTo(11.0f, 21.0938f, 11.9063f, 22.0f, 13.0f, 22.0f)
                lineTo(23.4063f, 22.0f)
                lineTo(21.7188f, 20.2813f)
                lineTo(21.0f, 19.5625f)
                lineTo(21.0f, 14.0f)
                curveTo(21.0f, 12.9063f, 20.0938f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(13.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                lineTo(19.0f, 20.0f)
                lineTo(13.0f, 20.0f)
                close()
            }
        }
        .build()
        return _dashcube!!
    }

private var _dashcube: ImageVector? = null
