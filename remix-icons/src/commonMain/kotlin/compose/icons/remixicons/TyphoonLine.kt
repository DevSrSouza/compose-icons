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

public val RemixIcons.TyphoonLine: ImageVector
    get() {
        if (_typhoonLine != null) {
            return _typhoonLine!!
        }
        _typhoonLine = Builder(name = "TyphoonLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.654f, 1.7f)
                lineToRelative(-2.782f, 2.533f)
                arcToRelative(9.137f, 9.137f, 0.0f, false, true, 3.49f, 1.973f)
                curveToRelative(3.512f, 3.2f, 3.512f, 8.388f, 0.0f, 11.588f)
                curveToRelative(-2.592f, 2.36f, -6.598f, 3.862f, -12.016f, 4.506f)
                lineToRelative(2.782f, -2.533f)
                arcToRelative(9.137f, 9.137f, 0.0f, false, true, -3.49f, -1.973f)
                curveToRelative(-3.512f, -3.2f, -3.533f, -8.369f, 0.0f, -11.588f)
                curveTo(8.23f, 3.846f, 12.237f, 2.344f, 17.655f, 1.7f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, 2.686f, -7.0f, 6.0f)
                reflectiveCurveToRelative(3.134f, 6.0f, 7.0f, 6.0f)
                reflectiveCurveToRelative(7.0f, -2.686f, 7.0f, -6.0f)
                reflectiveCurveToRelative(-3.134f, -6.0f, -7.0f, -6.0f)
                close()
                moveTo(12.0f, 8.3f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.657f, 4.0f, 3.7f)
                reflectiveCurveToRelative(-1.79f, 3.7f, -4.0f, 3.7f)
                reflectiveCurveToRelative(-4.0f, -1.657f, -4.0f, -3.7f)
                reflectiveCurveToRelative(1.79f, -3.7f, 4.0f, -3.7f)
                close()
                moveTo(12.0f, 10.3f)
                curveToRelative(-1.138f, 0.0f, -2.0f, 0.797f, -2.0f, 1.7f)
                curveToRelative(0.0f, 0.903f, 0.862f, 1.7f, 2.0f, 1.7f)
                reflectiveCurveToRelative(2.0f, -0.797f, 2.0f, -1.7f)
                curveToRelative(0.0f, -0.903f, -0.862f, -1.7f, -2.0f, -1.7f)
                close()
            }
        }
        .build()
        return _typhoonLine!!
    }

private var _typhoonLine: ImageVector? = null
