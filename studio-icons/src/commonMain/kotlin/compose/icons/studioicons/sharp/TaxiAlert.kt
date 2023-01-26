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

public val SharpGroup.TaxiAlert: ImageVector
    get() {
        if (_taxiAlert != null) {
            return _taxiAlert!!
        }
        _taxiAlert = Builder(name = "TaxiAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f)
                horizontalLineTo(4.81f)
                lineToRelative(1.04f, -3.0f)
                horizontalLineToRelative(5.44f)
                curveTo(11.1f, 7.37f, 11.0f, 6.7f, 11.0f, 6.0f)
                reflectiveCurveToRelative(0.1f, -1.37f, 0.29f, -2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.43f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(-0.09f, -0.27f)
                curveTo(19.3f, 12.9f, 18.66f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(5.67f, 17.0f, 5.0f, 16.33f, 5.0f, 15.5f)
                reflectiveCurveTo(5.67f, 14.0f, 6.5f, 14.0f)
                reflectiveCurveTo(8.0f, 14.67f, 8.0f, 15.5f)
                reflectiveCurveTo(7.33f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(15.5f, 17.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(16.33f, 17.0f, 15.5f, 17.0f)
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
        return _taxiAlert!!
    }

private var _taxiAlert: ImageVector? = null
