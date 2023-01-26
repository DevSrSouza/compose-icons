package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SupervisorAccount: ImageVector
    get() {
        if (_supervisorAccount != null) {
            return _supervisorAccount!!
        }
        _supervisorAccount = Builder(name = "SupervisorAccount", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.77f, 17.0f)
                horizontalLineToRelative(4.28f)
                curveToRelative(0.01f, -0.06f, 0.12f, -0.58f, 0.29f, -0.99f)
                curveToRelative(-0.11f, 0.0f, -0.23f, -0.01f, -0.34f, -0.01f)
                curveToRelative(-1.53f, 0.0f, -3.25f, 0.5f, -4.23f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(10.93f, 5.0f, 9.0f, 5.0f)
                reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f)
                reflectiveCurveTo(7.07f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(9.0f, 7.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.83f, 10.0f, 9.0f, 10.0f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(8.17f, 7.0f, 9.0f, 7.0f)
                close()
                moveTo(9.05f, 17.0f)
                lineTo(4.77f, 17.0f)
                curveToRelative(0.99f, -0.5f, 2.7f, -1.0f, 4.23f, -1.0f)
                curveToRelative(0.11f, 0.0f, 0.23f, 0.01f, 0.34f, 0.01f)
                curveToRelative(0.34f, -0.73f, 0.93f, -1.33f, 1.64f, -1.81f)
                curveToRelative(-0.73f, -0.13f, -1.42f, -0.2f, -1.98f, -0.2f)
                curveToRelative(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f)
                lineTo(2.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
                close()
                moveTo(16.5f, 14.5f)
                curveToRelative(-1.84f, 0.0f, -5.5f, 1.01f, -5.5f, 3.0f)
                lineTo(11.0f, 19.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.99f, -3.66f, -3.0f, -5.5f, -3.0f)
                close()
                moveTo(17.71f, 12.68f)
                curveToRelative(0.76f, -0.43f, 1.29f, -1.24f, 1.29f, -2.18f)
                curveTo(19.0f, 9.12f, 17.88f, 8.0f, 16.5f, 8.0f)
                reflectiveCurveTo(14.0f, 9.12f, 14.0f, 10.5f)
                curveToRelative(0.0f, 0.94f, 0.53f, 1.75f, 1.29f, 2.18f)
                curveToRelative(0.36f, 0.2f, 0.77f, 0.32f, 1.21f, 0.32f)
                reflectiveCurveToRelative(0.85f, -0.12f, 1.21f, -0.32f)
                close()
            }
        }
        .build()
        return _supervisorAccount!!
    }

private var _supervisorAccount: ImageVector? = null
