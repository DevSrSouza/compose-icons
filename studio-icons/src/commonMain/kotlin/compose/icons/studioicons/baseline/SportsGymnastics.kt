package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SportsGymnastics: ImageVector
    get() {
        if (_sportsGymnastics != null) {
            return _sportsGymnastics!!
        }
        _sportsGymnastics = Builder(name = "SportsGymnastics", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f)
                close()
                moveTo(1.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(7.0f, -5.0f)
                lineToRelative(1.31f, 1.52f)
                lineTo(11.14f, 8.5f)
                horizontalLineTo(14.0f)
                lineTo(21.8f, 4.0f)
                lineTo(23.0f, 5.4f)
                lineTo(14.5f, 12.0f)
                lineTo(14.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.5f, -10.0f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _sportsGymnastics!!
    }

private var _sportsGymnastics: ImageVector? = null
