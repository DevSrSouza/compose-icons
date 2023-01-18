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

public val RemixIcons.H2: ImageVector
    get() {
        if (_h2 != null) {
            return _h2!!
        }
        _h2 = Builder(name = "H2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.5f, 8.0f)
                curveToRelative(2.071f, 0.0f, 3.75f, 1.679f, 3.75f, 3.75f)
                curveToRelative(0.0f, 0.857f, -0.288f, 1.648f, -0.772f, 2.28f)
                lineToRelative(-0.148f, 0.18f)
                lineTo(18.034f, 18.0f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.556f)
                lineToRelative(4.82f, -5.546f)
                curveToRelative(0.268f, -0.307f, 0.43f, -0.709f, 0.43f, -1.148f)
                curveToRelative(0.0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
                curveToRelative(-0.918f, 0.0f, -1.671f, 0.707f, -1.744f, 1.606f)
                lineToRelative(-0.006f, 0.144f)
                horizontalLineToRelative(-2.0f)
                curveTo(14.75f, 9.679f, 16.429f, 8.0f, 18.5f, 8.0f)
                close()
            }
        }
        .build()
        return _h2!!
    }

private var _h2: ImageVector? = null
