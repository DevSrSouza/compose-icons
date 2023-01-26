package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TheaterComedy: ImageVector
    get() {
        if (_theaterComedy != null) {
            return _theaterComedy!!
        }
        _theaterComedy = Builder(name = "TheaterComedy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.31f)
                curveTo(14.55f, 9.8f, 15.64f, 9.0f, 16.99f, 9.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, 0.84f, 2.5f, 1.88f)
                horizontalLineTo(14.5f)
                verticalLineToRelative(3.56f)
                curveTo(15.26f, 14.8f, 16.11f, 15.0f, 17.0f, 15.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(15.0f, 7.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(15.55f, 7.5f, 15.0f, 7.5f)
                close()
                moveTo(19.0f, 7.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(19.55f, 7.5f, 19.0f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 16.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(7.0f, 17.88f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -0.84f, -2.5f, -1.88f)
                horizontalLineToRelative(5.0f)
                curveTo(9.5f, 17.04f, 8.38f, 17.88f, 7.0f, 17.88f)
                close()
                moveTo(9.0f, 12.5f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveTo(8.45f, 12.5f, 9.0f, 12.5f)
                close()
                moveTo(5.0f, 12.5f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveTo(4.45f, 12.5f, 5.0f, 12.5f)
                close()
            }
        }
        .build()
        return _theaterComedy!!
    }

private var _theaterComedy: ImageVector? = null
