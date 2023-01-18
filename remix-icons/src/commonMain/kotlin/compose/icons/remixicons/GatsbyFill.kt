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

public val RemixIcons.GatsbyFill: ImageVector
    get() {
        if (_gatsbyFill != null) {
            return _gatsbyFill!!
        }
        _gatsbyFill = Builder(name = "GatsbyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(6.429f, 17.571f)
                curveToRelative(-1.5f, -1.5f, -2.286f, -3.5f, -2.286f, -5.428f)
                lineToRelative(7.786f, 7.714f)
                curveToRelative(-2.0f, -0.071f, -4.0f, -0.786f, -5.5f, -2.286f)
                close()
                moveTo(13.714f, 19.643f)
                lineToRelative(-9.357f, -9.357f)
                curveToRelative(0.786f, -3.5f, 3.929f, -6.143f, 7.643f, -6.143f)
                curveToRelative(2.643f, 0.0f, 4.929f, 1.286f, 6.357f, 3.214f)
                lineToRelative(-1.071f, 0.929f)
                curveTo(16.07f, 6.643f, 14.143f, 5.57f, 12.0f, 5.57f)
                curveToRelative(-2.786f, 0.0f, -5.143f, 1.786f, -6.071f, 4.286f)
                lineToRelative(8.214f, 8.214f)
                curveToRelative(2.071f, -0.714f, 3.643f, -2.5f, 4.143f, -4.642f)
                horizontalLineToRelative(-3.429f)
                lineTo(14.857f, 12.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.714f, -2.643f, 6.857f, -6.143f, 7.643f)
                close()
            }
        }
        .build()
        return _gatsbyFill!!
    }

private var _gatsbyFill: ImageVector? = null
