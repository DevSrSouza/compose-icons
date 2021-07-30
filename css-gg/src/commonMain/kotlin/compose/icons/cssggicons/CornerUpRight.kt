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

public val CssGgIcons.CornerUpRight: ImageVector
    get() {
        if (_cornerUpRight != null) {
            return _cornerUpRight!!
        }
        _cornerUpRight = Builder(name = "CornerUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3724f, 14.7219f)
                lineTo(14.7835f, 16.1391f)
                lineTo(21.1612f, 9.7889f)
                lineTo(14.811f, 3.4113f)
                lineTo(13.3937f, 4.8224f)
                lineTo(17.1702f, 8.6153f)
                lineTo(6.8646f, 8.593f)
                curveTo(4.6555f, 8.5883f, 2.8608f, 10.3753f, 2.856f, 12.5844f)
                lineTo(2.8387f, 20.5844f)
                lineTo(4.8387f, 20.5887f)
                lineTo(4.856f, 12.5887f)
                curveTo(4.8584f, 11.4841f, 5.7557f, 10.5907f, 6.8603f, 10.593f)
                lineTo(17.496f, 10.616f)
                lineTo(13.3724f, 14.7219f)
                close()
            }
        }
        .build()
        return _cornerUpRight!!
    }

private var _cornerUpRight: ImageVector? = null
