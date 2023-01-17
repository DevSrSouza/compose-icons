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

public val SimpleIcons.Planetscale: ImageVector
    get() {
        if (_planetscale != null) {
            return _planetscale!!
        }
        _planetscale = Builder(name = "Planetscale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                curveToRelative(4.873f, 0.0f, 9.067f, 2.904f, 10.947f, 7.077f)
                lineToRelative(-15.87f, 15.87f)
                arcToRelative(11.981f, 11.981f, 0.0f, false, true, -1.935f, -1.099f)
                lineTo(14.99f, 12.0f)
                lineTo(12.0f, 12.0f)
                lineToRelative(-8.485f, 8.485f)
                arcTo(11.962f, 11.962f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(12.004f, 24.0f)
                lineTo(24.0f, 12.004f)
                curveTo(23.998f, 18.628f, 18.628f, 23.998f, 12.004f, 24.0f)
                close()
            }
        }
        .build()
        return _planetscale!!
    }

private var _planetscale: ImageVector? = null
