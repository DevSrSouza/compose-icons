package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.RollerSkating: ImageVector
    get() {
        if (_rollerSkating != null) {
            return _rollerSkating!!
        }
        _rollerSkating = Builder(name = "RollerSkating", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                lineToRelative(-0.01f, -6.0f)
                lineToRelative(-5.71f, -1.43f)
                curveTo(13.4f, 8.35f, 12.7f, 7.76f, 12.32f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(3.02f)
                lineTo(12.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(5.0f, 23.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveTo(6.66f, 23.0f, 5.0f, 23.0f)
                close()
                moveTo(19.0f, 23.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveTo(20.66f, 23.0f, 19.0f, 23.0f)
                close()
                moveTo(12.0f, 23.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveTo(13.66f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _rollerSkating!!
    }

private var _rollerSkating: ImageVector? = null
