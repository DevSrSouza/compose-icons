package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup._360: ImageVector
    get() {
        if (__360 != null) {
            return __360!!
        }
        __360 = Builder(name = "_360", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveTo(6.48f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f)
                curveToRelative(0.0f, 2.24f, 2.94f, 4.13f, 7.0f, 4.77f)
                verticalLineToRelative(2.02f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f)
                verticalLineToRelative(1.52f)
                curveToRelative(-3.15f, -0.56f, -5.0f, -1.9f, -5.0f, -2.73f)
                curveToRelative(0.0f, -1.06f, 3.04f, -3.0f, 8.0f, -3.0f)
                reflectiveCurveToRelative(8.0f, 1.94f, 8.0f, 3.0f)
                curveToRelative(0.0f, 0.66f, -1.2f, 1.68f, -3.32f, 2.34f)
                curveToRelative(-0.41f, 0.13f, -0.68f, 0.51f, -0.68f, 0.94f)
                curveToRelative(0.0f, 0.67f, 0.65f, 1.16f, 1.28f, 0.96f)
                curveTo(20.11f, 15.36f, 22.0f, 13.79f, 22.0f, 12.0f)
                curveToRelative(0.0f, -2.76f, -4.48f, -5.0f, -10.0f, -5.0f)
                close()
            }
        }
        .build()
        return __360!!
    }

private var __360: ImageVector? = null
