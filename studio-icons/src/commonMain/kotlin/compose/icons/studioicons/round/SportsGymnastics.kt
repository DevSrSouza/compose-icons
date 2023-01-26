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

public val RoundGroup.SportsGymnastics: ImageVector
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
                moveTo(13.0f, 22.0f)
                curveToRelative(-0.56f, 0.0f, -1.02f, -0.44f, -1.05f, -1.0f)
                lineToRelative(-0.45f, -9.0f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(6.26f, -4.47f)
                curveToRelative(0.42f, -0.3f, 1.0f, -0.23f, 1.34f, 0.16f)
                curveToRelative(0.38f, 0.45f, 0.3f, 1.12f, -0.18f, 1.46f)
                lineTo(11.14f, 8.5f)
                horizontalLineTo(14.0f)
                lineToRelative(7.09f, -4.09f)
                curveToRelative(0.41f, -0.24f, 0.93f, -0.15f, 1.24f, 0.21f)
                curveToRelative(0.36f, 0.43f, 0.3f, 1.07f, -0.14f, 1.41f)
                lineTo(14.5f, 12.0f)
                lineToRelative(-0.45f, 9.0f)
                curveTo(14.02f, 21.56f, 13.56f, 22.0f, 13.0f, 22.0f)
                close()
            }
        }
        .build()
        return _sportsGymnastics!!
    }

private var _sportsGymnastics: ImageVector? = null
