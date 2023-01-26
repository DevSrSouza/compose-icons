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

public val TwotoneGroup.NotStarted: ImageVector
    get() {
        if (_notStarted != null) {
            return _notStarted!!
        }
        _notStarted = Builder(name = "NotStarted", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                curveTo(20.0f, 7.59f, 16.41f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(12.0f, 16.0f)
                verticalLineTo(8.0f)
                lineToRelative(5.0f, 4.0f)
                lineTo(12.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(17.0f, 12.0f)
                lineToRelative(-5.0f, -4.0f)
                verticalLineToRelative(8.0f)
                lineTo(17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _notStarted!!
    }

private var _notStarted: ImageVector? = null