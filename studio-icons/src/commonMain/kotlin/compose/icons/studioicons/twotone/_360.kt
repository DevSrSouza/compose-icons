package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup._360: ImageVector
    get() {
        if (__360 != null) {
            return __360!!
        }
        __360 = Builder(name = "_360", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.77f)
                verticalLineTo(20.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(2.73f)
                curveToRelative(-3.15f, -0.56f, -5.0f, -1.9f, -5.0f, -2.73f)
                curveToRelative(0.0f, -1.06f, 3.04f, -3.0f, 8.0f, -3.0f)
                reflectiveCurveToRelative(8.0f, 1.94f, 8.0f, 3.0f)
                curveToRelative(0.0f, 0.73f, -1.46f, 1.89f, -4.0f, 2.53f)
                verticalLineToRelative(2.05f)
                curveToRelative(3.53f, -0.77f, 6.0f, -2.53f, 6.0f, -4.58f)
                curveToRelative(0.0f, -2.76f, -4.48f, -5.0f, -10.0f, -5.0f)
                reflectiveCurveTo(2.0f, 9.24f, 2.0f, 12.0f)
                curveToRelative(0.0f, 2.24f, 2.94f, 4.13f, 7.0f, 4.77f)
                close()
            }
        }
        .build()
        return __360!!
    }

private var __360: ImageVector? = null
