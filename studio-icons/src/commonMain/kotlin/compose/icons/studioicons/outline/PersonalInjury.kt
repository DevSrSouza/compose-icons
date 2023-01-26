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

public val OutlineGroup.PersonalInjury: ImageVector
    get() {
        if (_personalInjury != null) {
            return _personalInjury!!
        }
        _personalInjury = Builder(name = "PersonalInjury", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(8.0f, 3.79f, 8.0f, 6.0f)
                curveTo(8.0f, 8.21f, 9.79f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveTo(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(18.39f, 12.56f)
                curveTo(16.71f, 11.7f, 14.53f, 11.0f, 12.0f, 11.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.78f)
                curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                curveTo(7.71f, 13.73f, 9.63f, 13.0f, 12.0f, 13.0f)
                curveToRelative(0.76f, 0.0f, 1.47f, 0.07f, 2.13f, 0.2f)
                lineToRelative(-1.55f, 3.3f)
                horizontalLineTo(9.75f)
                curveTo(8.23f, 16.5f, 7.0f, 17.73f, 7.0f, 19.25f)
                curveTo(7.0f, 20.77f, 8.23f, 22.0f, 9.75f, 22.0f)
                horizontalLineToRelative(2.18f)
                horizontalLineTo(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.78f)
                curveTo(20.0f, 14.1f, 19.39f, 13.07f, 18.39f, 12.56f)
                close()
                moveTo(10.94f, 20.0f)
                horizontalLineTo(9.75f)
                curveTo(9.34f, 20.0f, 9.0f, 19.66f, 9.0f, 19.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(1.89f)
                lineTo(10.94f, 20.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(-4.85f)
                lineToRelative(2.94f, -6.27f)
                curveToRelative(0.54f, 0.2f, 1.01f, 0.41f, 1.4f, 0.61f)
                curveTo(17.8f, 14.5f, 18.0f, 14.84f, 18.0f, 15.22f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _personalInjury!!
    }

private var _personalInjury: ImageVector? = null
