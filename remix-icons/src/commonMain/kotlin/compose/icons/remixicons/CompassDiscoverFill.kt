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

public val RemixIcons.CompassDiscoverFill: ImageVector
    get() {
        if (_compassDiscoverFill != null) {
            return _compassDiscoverFill!!
        }
        _compassDiscoverFill = Builder(name = "CompassDiscoverFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                curveTo(7.477f, 22.0f, 3.0f, 17.523f, 3.0f, 12.0f)
                reflectiveCurveTo(7.477f, 2.0f, 13.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(8.0f, 11.5f)
                lineToRelative(4.0f, 1.5f)
                lineToRelative(1.5f, 4.002f)
                lineTo(17.0f, 8.0f)
                lineToRelative(-9.0f, 3.5f)
                close()
            }
        }
        .build()
        return _compassDiscoverFill!!
    }

private var _compassDiscoverFill: ImageVector? = null
