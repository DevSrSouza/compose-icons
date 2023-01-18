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

public val RemixIcons._24HoursFill: ImageVector
    get() {
        if (__24HoursFill != null) {
            return __24HoursFill!!
        }
        __24HoursFill = Builder(name = "_24HoursFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.85f, -0.353f, 1.616f, -0.92f, 2.162f)
                lineTo(12.17f, 20.0f)
                lineTo(15.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(-1.724f)
                lineToRelative(3.693f, -3.555f)
                curveToRelative(0.19f, -0.183f, 0.307f, -0.438f, 0.307f, -0.721f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                lineTo(9.0f, 16.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(18.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, 2.527f, 1.171f, 4.78f, 3.0f, 6.246f)
                verticalLineToRelative(2.416f)
                curveTo(4.011f, 18.933f, 2.0f, 15.702f, 2.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(5.185f, 0.0f, 9.449f, 3.947f, 9.95f, 9.0f)
                horizontalLineToRelative(-2.012f)
                curveTo(19.446f, 7.054f, 16.08f, 4.0f, 12.0f, 4.0f)
                curveTo(9.536f, 4.0f, 7.332f, 5.114f, 5.865f, 6.865f)
                lineTo(8.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 3.0f)
                lineToRelative(2.447f, 2.446f)
                curveTo(6.28f, 3.336f, 8.984f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return __24HoursFill!!
    }

private var __24HoursFill: ImageVector? = null
