package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Flattr: ImageVector
    get() {
        if (_flattr != null) {
            return _flattr!!
        }
        _flattr = Builder(name = "Flattr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.906f, 12.0f)
                curveTo(1.906f, 6.432f, 6.432f, 1.906f, 12.0f, 1.906f)
                curveToRelative(0.048f, 0.0f, 4.003f, 0.0f, 5.455f, 0.002f)
                lineTo(14.53f, 4.834f)
                lineToRelative(1.344f, 1.344f)
                lineTo(21.903f, 0.0f)
                horizontalLineTo(12.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                verticalLineToRelative(9.331f)
                lineToRelative(1.91f, -1.759f)
                verticalLineToRelative(-0.096f)
                curveToRelative(-0.002f, -0.244f, -0.004f, -7.404f, -0.004f, -7.476f)
                close()
                moveTo(24.0f, 2.668f)
                lineToRelative(-1.91f, 1.76f)
                verticalLineToRelative(0.096f)
                lineTo(22.093f, 12.0f)
                curveToRelative(0.0f, 5.568f, -4.528f, 10.094f, -10.093f, 10.094f)
                curveToRelative(-0.048f, 0.0f, -4.003f, 0.0f, -5.455f, -0.002f)
                lineToRelative(2.925f, -2.926f)
                lineToRelative(-1.344f, -1.344f)
                lineTo(2.097f, 24.0f)
                horizontalLineTo(12.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineTo(2.668f)
                close()
            }
        }
        .build()
        return _flattr!!
    }

private var _flattr: ImageVector? = null
