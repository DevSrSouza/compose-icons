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

public val BaselineGroup.FireTruck: ImageVector
    get() {
        if (_fireTruck != null) {
            return _fireTruck!!
        }
        _fireTruck = Builder(name = "FireTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9f, 10.69f)
                lineToRelative(-1.44f, -4.32f)
                curveTo(21.18f, 5.55f, 20.42f, 5.0f, 19.56f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.68f)
                curveTo(23.0f, 11.11f, 22.97f, 10.9f, 22.9f, 10.69f)
                close()
                moveTo(7.0f, 19.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(7.55f, 19.0f, 7.0f, 19.0f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(17.55f, 19.0f, 17.0f, 19.0f)
                close()
                moveTo(14.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.56f)
                lineToRelative(1.33f, 4.0f)
                horizontalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(8.5f)
                close()
                moveTo(5.25f, 8.5f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.75f)
                verticalLineTo(8.5f)
                close()
                moveTo(8.5f, 8.5f)
                horizontalLineTo(6.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _fireTruck!!
    }

private var _fireTruck: ImageVector? = null
