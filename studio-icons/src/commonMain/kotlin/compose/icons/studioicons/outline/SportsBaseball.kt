package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SportsBaseball: ImageVector
    get() {
        if (_sportsBaseball != null) {
            return _sportsBaseball!!
        }
        _sportsBaseball = Builder(name = "SportsBaseball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.61f, 16.78f)
                curveTo(4.6f, 15.45f, 4.0f, 13.8f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.6f, -3.45f, 1.61f, -4.78f)
                curveTo(7.06f, 8.31f, 8.0f, 10.05f, 8.0f, 12.0f)
                reflectiveCurveTo(7.06f, 15.69f, 5.61f, 16.78f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.89f, 0.0f, -3.63f, -0.66f, -5.0f, -1.76f)
                curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.24f)
                reflectiveCurveTo(8.83f, 7.23f, 7.0f, 5.76f)
                curveTo(8.37f, 4.66f, 10.11f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(3.63f, 0.66f, 5.0f, 1.76f)
                curveToRelative(-1.83f, 1.47f, -3.0f, 3.71f, -3.0f, 6.24f)
                reflectiveCurveToRelative(1.17f, 4.77f, 3.0f, 6.24f)
                curveTo(15.63f, 19.34f, 13.89f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(18.39f, 16.78f)
                curveTo(16.94f, 15.69f, 16.0f, 13.95f, 16.0f, 12.0f)
                reflectiveCurveToRelative(0.94f, -3.69f, 2.39f, -4.78f)
                curveTo(19.4f, 8.55f, 20.0f, 10.2f, 20.0f, 12.0f)
                reflectiveCurveTo(19.4f, 15.45f, 18.39f, 16.78f)
                close()
            }
        }
        .build()
        return _sportsBaseball!!
    }

private var _sportsBaseball: ImageVector? = null
