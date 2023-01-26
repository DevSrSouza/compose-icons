package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Cyclone: ImageVector
    get() {
        if (_cyclone != null) {
            return _cyclone!!
        }
        _cyclone = Builder(name = "Cyclone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveTo(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.11f)
                lineTo(22.0f, 6.11f)
                curveToRelative(0.0f, -0.46f, -0.3f, -0.86f, -0.74f, -0.97f)
                curveTo(19.23f, 4.6f, 16.03f, 4.0f, 12.0f, 4.0f)
                curveTo(9.85f, 4.0f, 7.89f, 4.86f, 6.46f, 6.24f)
                curveToRelative(0.1f, -0.65f, 0.28f, -1.69f, 0.62f, -2.96f)
                curveTo(7.25f, 2.64f, 6.78f, 2.0f, 6.11f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.66f, 2.0f, 5.26f, 2.3f, 5.14f, 2.74f)
                curveTo(4.6f, 4.77f, 4.0f, 7.97f, 4.0f, 12.0f)
                curveToRelative(0.0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f)
                curveToRelative(-0.65f, -0.1f, -1.69f, -0.28f, -2.96f, -0.62f)
                curveTo(2.64f, 16.75f, 2.0f, 17.22f, 2.0f, 17.89f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f)
                curveTo(4.77f, 19.4f, 7.97f, 20.0f, 12.0f, 20.0f)
                curveToRelative(2.15f, 0.0f, 4.11f, -0.86f, 5.54f, -2.24f)
                curveToRelative(-0.1f, 0.65f, -0.28f, 1.69f, -0.62f, 2.96f)
                curveToRelative(-0.17f, 0.64f, 0.3f, 1.28f, 0.97f, 1.28f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.46f, 0.0f, 0.86f, -0.3f, 0.97f, -0.74f)
                curveTo(19.4f, 19.23f, 20.0f, 16.03f, 20.0f, 12.0f)
                curveToRelative(0.0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f)
                curveToRelative(0.65f, 0.1f, 1.69f, 0.28f, 2.96f, 0.62f)
                curveTo(21.36f, 7.25f, 22.0f, 6.78f, 22.0f, 6.11f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveTo(15.31f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cyclone!!
    }

private var _cyclone: ImageVector? = null
