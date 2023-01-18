package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.KeynoteFill: ImageVector
    get() {
        if (_keynoteFill != null) {
            return _keynoteFill!!
        }
        _keynoteFill = Builder(name = "KeynoteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(2.992f)
                curveToRelative(-0.548f, 0.0f, -0.906f, -0.43f, -0.797f, -0.977f)
                lineToRelative(1.61f, -8.046f)
                curveTo(3.913f, 2.437f, 4.445f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(13.998f)
                curveToRelative(0.553f, 0.0f, 1.087f, 0.43f, 1.196f, 0.977f)
                lineToRelative(1.61f, 8.046f)
                curveToRelative(0.108f, 0.54f, -0.26f, 0.977f, -0.797f, 0.977f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _keynoteFill!!
    }

private var _keynoteFill: ImageVector? = null
