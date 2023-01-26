package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SportsBaseball: ImageVector
    get() {
        if (_sportsBaseball != null) {
            return _sportsBaseball!!
        }
        _sportsBaseball = Builder(name = "SportsBaseball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.81f, 6.28f)
                curveTo(2.67f, 7.9f, 2.0f, 9.87f, 2.0f, 12.0f)
                reflectiveCurveToRelative(0.67f, 4.1f, 1.81f, 5.72f)
                curveTo(6.23f, 16.95f, 8.0f, 14.68f, 8.0f, 12.0f)
                reflectiveCurveTo(6.23f, 7.05f, 3.81f, 6.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.19f, 6.28f)
                curveTo(17.77f, 7.05f, 16.0f, 9.32f, 16.0f, 12.0f)
                reflectiveCurveToRelative(1.77f, 4.95f, 4.19f, 5.72f)
                curveTo(21.33f, 16.1f, 22.0f, 14.13f, 22.0f, 12.0f)
                reflectiveCurveTo(21.33f, 7.9f, 20.19f, 6.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, -3.28f, 1.97f, -6.09f, 4.79f, -7.33f)
                curveTo(17.01f, 3.02f, 14.63f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(6.99f, 3.02f, 5.21f, 4.67f)
                curveTo(8.03f, 5.91f, 10.0f, 8.72f, 10.0f, 12.0f)
                reflectiveCurveToRelative(-1.97f, 6.09f, -4.79f, 7.33f)
                curveTo(6.99f, 20.98f, 9.37f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.01f, -1.02f, 6.79f, -2.67f)
                curveTo(15.97f, 18.09f, 14.0f, 15.28f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sportsBaseball!!
    }

private var _sportsBaseball: ImageVector? = null
