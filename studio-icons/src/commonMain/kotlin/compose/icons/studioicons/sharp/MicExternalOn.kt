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

public val SharpGroup.MicExternalOn: ImageVector
    get() {
        if (_micExternalOn != null) {
            return _micExternalOn!!
        }
        _micExternalOn = Builder(name = "MicExternalOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.22f, 7.0f)
                horizontalLineTo(4.78f)
                curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f)
                close()
                moveTo(20.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(18.0f)
                horizontalLineTo(6.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -1.79f, 0.0f, -4.0f)
                horizontalLineTo(5.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                lineTo(9.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _micExternalOn!!
    }

private var _micExternalOn: ImageVector? = null
