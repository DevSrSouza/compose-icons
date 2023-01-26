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

public val RoundGroup.Php: ImageVector
    get() {
        if (_php != null) {
            return _php!!
        }
        _php = Builder(name = "Php", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(20.0f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(13.0f, 12.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveTo(9.5f, 14.66f, 9.5f, 14.25f)
                verticalLineToRelative(-4.5f)
                curveTo(9.5f, 9.34f, 9.84f, 9.0f, 10.25f, 9.0f)
                reflectiveCurveTo(11.0f, 9.34f, 11.0f, 9.75f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.75f)
                curveTo(13.0f, 9.34f, 13.34f, 9.0f, 13.75f, 9.0f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveTo(13.0f, 14.66f, 13.0f, 14.25f)
                verticalLineTo(12.5f)
                close()
                moveTo(18.0f, 14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(20.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(14.25f)
                close()
                moveTo(3.0f, 10.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                curveTo(7.33f, 9.0f, 8.0f, 9.68f, 8.0f, 10.5f)
                verticalLineToRelative(1.0f)
                curveTo(8.0f, 12.32f, 7.33f, 13.0f, 6.5f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.25f)
                curveTo(4.5f, 14.66f, 4.16f, 15.0f, 3.75f, 15.0f)
                reflectiveCurveTo(3.0f, 14.66f, 3.0f, 14.25f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _php!!
    }

private var _php: ImageVector? = null
