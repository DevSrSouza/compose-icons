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

public val RemixIcons.PixelfedFill: ImageVector
    get() {
        if (_pixelfedFill != null) {
            return _pixelfedFill!!
        }
        _pixelfedFill = Builder(name = "PixelfedFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.031f, 8.099f)
                horizontalLineToRelative(-2.624f)
                curveToRelative(-0.988f, 0.0f, -1.789f, 0.776f, -1.789f, 1.733f)
                verticalLineToRelative(6.748f)
                lineToRelative(2.595f, -2.471f)
                horizontalLineToRelative(1.818f)
                curveToRelative(1.713f, 0.0f, 3.101f, -1.345f, 3.101f, -3.005f)
                reflectiveCurveToRelative(-1.388f, -3.005f, -3.1f, -3.005f)
                close()
            }
        }
        .build()
        return _pixelfedFill!!
    }

private var _pixelfedFill: ImageVector? = null
