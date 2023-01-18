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

public val RemixIcons.Focus2Fill: ImageVector
    get() {
        if (_focus2Fill != null) {
            return _focus2Fill!!
        }
        _focus2Fill = Builder(name = "Focus2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(4.427f, 0.0f, 8.0f, -3.573f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.573f, -8.0f, -8.0f, -8.0f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.427f, 3.573f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.32f, 0.0f, -6.0f, -2.68f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.68f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.68f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.68f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _focus2Fill!!
    }

private var _focus2Fill: ImageVector? = null
