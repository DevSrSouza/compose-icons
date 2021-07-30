package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Producthunt: ImageVector
    get() {
        if (_producthunt != null) {
            return _producthunt!!
        }
        _producthunt = Builder(name = "Producthunt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.604f, 8.4f)
                horizontalLineToRelative(-3.405f)
                lineTo(10.199f, 12.0f)
                horizontalLineToRelative(3.405f)
                curveToRelative(0.995f, 0.0f, 1.801f, -0.806f, 1.801f, -1.801f)
                curveToRelative(0.0f, -0.993f, -0.805f, -1.799f, -1.801f, -1.799f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.604f, 14.4f)
                horizontalLineToRelative(-3.405f)
                lineTo(10.199f, 18.0f)
                lineTo(7.801f, 18.0f)
                lineTo(7.801f, 6.0f)
                horizontalLineToRelative(5.804f)
                curveToRelative(2.319f, 0.0f, 4.2f, 1.88f, 4.2f, 4.199f)
                curveToRelative(0.0f, 2.321f, -1.881f, 4.201f, -4.201f, 4.201f)
                close()
            }
        }
        .build()
        return _producthunt!!
    }

private var _producthunt: ImageVector? = null
