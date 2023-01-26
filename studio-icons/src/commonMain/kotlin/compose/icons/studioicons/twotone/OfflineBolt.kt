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

public val TwotoneGroup.OfflineBolt: ImageVector
    get() {
        if (_offlineBolt != null) {
            return _offlineBolt!!
        }
        _offlineBolt = Builder(name = "OfflineBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.02f)
                curveTo(7.6f, 4.02f, 4.02f, 7.6f, 4.02f, 12.0f)
                reflectiveCurveTo(7.6f, 19.98f, 12.0f, 19.98f)
                reflectiveCurveToRelative(7.98f, -3.58f, 7.98f, -7.98f)
                reflectiveCurveTo(16.4f, 4.02f, 12.0f, 4.02f)
                close()
                moveTo(11.39f, 19.0f)
                verticalLineToRelative(-5.5f)
                horizontalLineTo(8.25f)
                lineToRelative(4.5f, -8.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.0f)
                lineTo(11.39f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.02f)
                curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f)
                reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f)
                reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f)
                reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f)
                close()
                moveTo(12.0f, 19.98f)
                curveToRelative(-4.4f, 0.0f, -7.98f, -3.58f, -7.98f, -7.98f)
                reflectiveCurveTo(7.6f, 4.02f, 12.0f, 4.02f)
                reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12.0f)
                reflectiveCurveTo(16.4f, 19.98f, 12.0f, 19.98f)
                close()
                moveTo(12.75f, 5.0f)
                lineToRelative(-4.5f, 8.5f)
                horizontalLineToRelative(3.14f)
                lineTo(11.39f, 19.0f)
                lineToRelative(4.36f, -8.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(12.75f, 5.0f)
                close()
            }
        }
        .build()
        return _offlineBolt!!
    }

private var _offlineBolt: ImageVector? = null
