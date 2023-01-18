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

public val RemixIcons.NurseLine: ImageVector
    get() {
        if (_nurseLine != null) {
            return _nurseLine!!
        }
        _nurseLine = Builder(name = "NurseLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveToRelative(4.08f, 0.0f, 7.446f, 3.054f, 7.938f, 7.0f)
                lineTo(4.062f, 22.0f)
                curveToRelative(0.492f, -3.946f, 3.858f, -7.0f, 7.938f, -7.0f)
                close()
                moveTo(10.187f, 17.28f)
                curveTo(8.753f, 17.734f, 7.546f, 18.713f, 6.8f, 20.0f)
                lineTo(12.0f, 20.0f)
                lineToRelative(-1.813f, -2.72f)
                close()
                moveTo(13.814f, 17.28f)
                lineTo(12.0f, 20.0f)
                horizontalLineToRelative(5.199f)
                curveToRelative(-0.745f, -1.287f, -1.952f, -2.266f, -3.385f, -2.72f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(8.0f, 8.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(16.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _nurseLine!!
    }

private var _nurseLine: ImageVector? = null
