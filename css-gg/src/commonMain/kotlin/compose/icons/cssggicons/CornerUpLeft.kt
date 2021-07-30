package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerUpLeft: ImageVector
    get() {
        if (_cornerUpLeft != null) {
            return _cornerUpLeft!!
        }
        _cornerUpLeft = Builder(name = "CornerUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6276f, 14.7219f)
                lineTo(9.2164f, 16.1391f)
                lineTo(2.8387f, 9.7889f)
                lineTo(9.189f, 3.4113f)
                lineTo(10.6062f, 4.8224f)
                lineTo(6.8297f, 8.6153f)
                lineTo(17.1353f, 8.593f)
                curveTo(19.3445f, 8.5883f, 21.1392f, 10.3753f, 21.144f, 12.5844f)
                lineTo(21.1612f, 20.5844f)
                lineTo(19.1612f, 20.5887f)
                lineTo(19.144f, 12.5887f)
                curveTo(19.1416f, 11.4841f, 18.2442f, 10.5907f, 17.1396f, 10.593f)
                lineTo(6.5039f, 10.616f)
                lineTo(10.6276f, 14.7219f)
                close()
            }
        }
        .build()
        return _cornerUpLeft!!
    }

private var _cornerUpLeft: ImageVector? = null
