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

public val RoundGroup.RailwayAlert: ImageVector
    get() {
        if (_railwayAlert != null) {
            return _railwayAlert!!
        }
        _railwayAlert = Builder(name = "RailwayAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(7.29f)
                curveToRelative(-0.77f, -2.6f, 0.21f, -4.61f, 0.37f, -4.97f)
                curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.43f, 3.57f, 20.0f, 5.5f, 20.0f)
                lineToRelative(-1.21f, 0.81f)
                curveTo(4.11f, 20.93f, 4.0f, 21.13f, 4.0f, 21.35f)
                verticalLineToRelative(0.0f)
                curveTo(4.0f, 21.71f, 4.29f, 22.0f, 4.65f, 22.0f)
                horizontalLineToRelative(10.7f)
                curveToRelative(0.36f, 0.0f, 0.65f, -0.29f, 0.65f, -0.65f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.22f, -0.11f, -0.42f, -0.29f, -0.54f)
                lineTo(14.5f, 20.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(13.0f)
                curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveTo(11.5f, 16.33f, 10.83f, 17.0f, 10.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f)
                close()
                moveTo(18.0f, 9.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveTo(17.5f, 8.22f, 17.72f, 8.0f, 18.0f, 8.0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveTo(18.5f, 8.78f, 18.28f, 9.0f, 18.0f, 9.0f)
                close()
                moveTo(18.5f, 6.5f)
                curveTo(18.5f, 6.78f, 18.28f, 7.0f, 18.0f, 7.0f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                curveTo(17.5f, 3.22f, 17.72f, 3.0f, 18.0f, 3.0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _railwayAlert!!
    }

private var _railwayAlert: ImageVector? = null
