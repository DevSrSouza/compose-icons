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

public val RoundGroup.Html: ImageVector
    get() {
        if (_html != null) {
            return _html!!
        }
        _html = Builder(name = "Html", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(9.75f)
                curveTo(20.0f, 9.34f, 20.34f, 9.0f, 20.75f, 9.0f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(21.0f)
                close()
                moveTo(16.0f, 10.49f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.76f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveTo(16.0f, 13.66f, 16.0f, 13.25f)
                verticalLineTo(10.49f)
                close()
                moveTo(5.0f, 9.75f)
                curveTo(5.0f, 9.34f, 4.66f, 9.0f, 4.25f, 9.0f)
                reflectiveCurveTo(3.5f, 9.34f, 3.5f, 9.75f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.75f)
                curveTo(1.5f, 9.34f, 1.16f, 9.0f, 0.75f, 9.0f)
                reflectiveCurveTo(0.0f, 9.34f, 0.0f, 9.75f)
                verticalLineToRelative(4.5f)
                curveTo(0.0f, 14.66f, 0.34f, 15.0f, 0.75f, 15.0f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.75f)
                curveTo(3.5f, 14.66f, 3.84f, 15.0f, 4.25f, 15.0f)
                reflectiveCurveTo(5.0f, 14.66f, 5.0f, 14.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(10.25f, 10.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                curveTo(11.0f, 9.34f, 10.66f, 9.0f, 10.25f, 9.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(6.34f, 9.0f, 6.0f, 9.34f, 6.0f, 9.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.75f)
                curveTo(7.75f, 14.66f, 8.09f, 15.0f, 8.5f, 15.0f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _html!!
    }

private var _html: ImageVector? = null
