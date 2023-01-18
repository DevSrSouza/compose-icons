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

public val RemixIcons.HeartPulseFill: ImageVector
    get() {
        if (_heartPulseFill != null) {
            return _heartPulseFill!!
        }
        _heartPulseFill = Builder(name = "HeartPulseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.538f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveToRelative(0.0f, 7.0f, -7.5f, 11.0f, -10.0f, 12.5f)
                curveToRelative(-1.978f, -1.187f, -7.084f, -3.937f, -9.132f, -8.5f)
                horizontalLineToRelative(4.698f)
                lineToRelative(0.934f, -1.556f)
                lineToRelative(3.0f, 5.0f)
                lineTo(13.566f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.566f)
                lineToRelative(-0.934f, 1.556f)
                lineToRelative(-3.0f, -5.0f)
                lineTo(6.434f, 11.0f)
                horizontalLineTo(2.21f)
                curveTo(2.074f, 10.363f, 2.0f, 9.696f, 2.0f, 9.0f)
                curveToRelative(0.0f, -3.5f, 2.5f, -6.0f, 5.5f, -6.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveToRelative(1.0f, -1.0f, 2.64f, -2.0f, 4.5f, -2.0f)
                close()
            }
        }
        .build()
        return _heartPulseFill!!
    }

private var _heartPulseFill: ImageVector? = null
