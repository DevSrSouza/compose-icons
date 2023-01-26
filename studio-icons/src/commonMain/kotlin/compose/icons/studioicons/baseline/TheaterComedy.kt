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

public val BaselineGroup.TheaterComedy: ImageVector
    get() {
        if (_theaterComedy != null) {
            return _theaterComedy!!
        }
        _theaterComedy = Builder(name = "TheaterComedy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.5f)
                curveTo(2.0f, 19.54f, 4.46f, 22.0f, 7.5f, 22.0f)
                reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.5f)
                close()
                moveTo(7.5f, 18.5f)
                curveTo(6.12f, 18.5f, 5.0f, 17.83f, 5.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                curveTo(10.0f, 17.83f, 8.88f, 18.5f, 7.5f, 18.5f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(9.0f, 13.45f, 9.45f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(5.0f, 13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(4.0f, 13.45f, 4.45f, 13.0f, 5.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, -0.83f, 1.12f, -1.5f, 2.5f, -1.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 0.67f, 2.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(14.0f)
                verticalLineToRelative(0.39f)
                curveToRelative(0.75f, 0.38f, 1.6f, 0.61f, 2.5f, 0.61f)
                curveToRelative(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(14.0f, 8.08f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(15.0f, 7.64f, 14.55f, 8.08f, 14.0f, 8.08f)
                close()
                moveTo(19.0f, 8.08f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(20.0f, 7.64f, 19.55f, 8.08f, 19.0f, 8.08f)
                close()
            }
        }
        .build()
        return _theaterComedy!!
    }

private var _theaterComedy: ImageVector? = null
