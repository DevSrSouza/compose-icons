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

public val RemixIcons.Compass2Fill: ImageVector
    get() {
        if (_compass2Fill != null) {
            return _compass2Fill!!
        }
        _compass2Fill = Builder(name = "Compass2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.328f, 4.258f)
                lineTo(10.586f, 12.0f)
                lineTo(12.0f, 13.414f)
                lineToRelative(7.742f, -7.742f)
                arcTo(9.957f, 9.957f, 0.0f, false, true, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                curveToRelative(2.4f, 0.0f, 4.604f, 0.847f, 6.328f, 2.258f)
                close()
            }
        }
        .build()
        return _compass2Fill!!
    }

private var _compass2Fill: ImageVector? = null
