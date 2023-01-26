package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PinDrop: ImageVector
    get() {
        if (_pinDrop != null) {
            return _pinDrop!!
        }
        _pinDrop = Builder(name = "PinDrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveTo(5.45f, 20.0f, 6.0f, 20.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.27f, 0.0f, 7.0f, 2.46f, 7.0f, 7.15f)
                curveToRelative(0.0f, 2.98f, -2.13f, 6.12f, -6.39f, 9.39f)
                curveToRelative(-0.36f, 0.28f, -0.86f, 0.28f, -1.22f, 0.0f)
                curveTo(7.13f, 15.26f, 5.0f, 12.13f, 5.0f, 9.15f)
                curveTo(5.0f, 4.46f, 8.73f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pinDrop!!
    }

private var _pinDrop: ImageVector? = null
