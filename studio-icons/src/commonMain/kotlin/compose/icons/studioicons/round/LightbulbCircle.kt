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

public val RoundGroup.LightbulbCircle: ImageVector
    get() {
        if (_lightbulbCircle != null) {
            return _lightbulbCircle!!
        }
        _lightbulbCircle = Builder(name = "LightbulbCircle", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveTo(13.5f, 18.33f, 12.83f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(14.25f, 16.5f)
                horizontalLineToRelative(-4.5f)
                curveTo(9.34f, 16.5f, 9.0f, 16.16f, 9.0f, 15.75f)
                verticalLineToRelative(0.0f)
                curveTo(9.0f, 15.34f, 9.34f, 15.0f, 9.75f, 15.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.0f)
                curveTo(15.0f, 16.16f, 14.66f, 16.5f, 14.25f, 16.5f)
                close()
                moveTo(14.97f, 14.0f)
                horizontalLineTo(9.03f)
                curveTo(7.8f, 13.09f, 7.0f, 11.64f, 7.0f, 10.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                curveTo(17.0f, 11.64f, 16.2f, 13.09f, 14.97f, 14.0f)
                close()
            }
        }
        .build()
        return _lightbulbCircle!!
    }

private var _lightbulbCircle: ImageVector? = null
