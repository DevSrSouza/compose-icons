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

public val SharpGroup.BusAlert: ImageVector
    get() {
        if (_busAlert != null) {
            return _busAlert!!
        }
        _busAlert = Builder(name = "BusAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(7.29f)
                curveToRelative(-0.77f, -2.6f, 0.21f, -4.61f, 0.37f, -4.97f)
                curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.95f, 0.38f, 1.81f, 1.0f, 2.44f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.06f)
                curveToRelative(0.62f, -0.63f, 1.0f, -1.49f, 1.0f, -2.44f)
                verticalLineTo(13.0f)
                curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(5.67f, 17.0f, 5.0f, 16.33f, 5.0f, 15.5f)
                reflectiveCurveTo(5.67f, 14.0f, 6.5f, 14.0f)
                reflectiveCurveTo(8.0f, 14.67f, 8.0f, 15.5f)
                reflectiveCurveTo(7.33f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(15.0f, 15.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(12.0f, 16.33f, 12.0f, 15.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveTo(15.0f, 14.67f, 15.0f, 15.5f)
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
                moveTo(18.5f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.5f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _busAlert!!
    }

private var _busAlert: ImageVector? = null
