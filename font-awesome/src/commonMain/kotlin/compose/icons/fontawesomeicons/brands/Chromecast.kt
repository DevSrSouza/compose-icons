package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Chromecast: ImageVector
    get() {
        if (_chromecast != null) {
            return _chromecast!!
        }
        _chromecast = Builder(name = "Chromecast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.8f, 64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-23.6f, 0.0f, -42.7f, 19.1f, -42.7f, 42.7f)
                verticalLineToRelative(63.9f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(-63.9f)
                horizontalLineToRelative(383.8f)
                verticalLineToRelative(298.6f)
                horizontalLineTo(298.6f)
                verticalLineTo(448.0f)
                horizontalLineTo(448.0f)
                curveToRelative(23.6f, 0.0f, 42.7f, -19.1f, 42.7f, -42.7f)
                verticalLineTo(106.7f)
                curveTo(490.7f, 83.1f, 471.4f, 64.0f, 447.8f, 64.0f)
                close()
                moveTo(21.3f, 383.6f)
                lineTo(21.3f, 383.6f)
                lineToRelative(0.0f, 63.9f)
                horizontalLineToRelative(63.9f)
                curveTo(85.2f, 412.2f, 56.6f, 383.6f, 21.3f, 383.6f)
                lineTo(21.3f, 383.6f)
                close()
                moveTo(21.3f, 298.6f)
                verticalLineTo(341.0f)
                curveToRelative(58.9f, 0.0f, 106.6f, 48.1f, 106.6f, 107.0f)
                horizontalLineToRelative(42.7f)
                curveTo(170.7f, 365.6f, 103.7f, 298.7f, 21.3f, 298.6f)
                close()
                moveTo(213.4f, 448.0f)
                horizontalLineToRelative(42.7f)
                curveToRelative(-0.5f, -129.5f, -105.3f, -234.3f, -234.8f, -234.6f)
                lineToRelative(0.0f, 42.4f)
                curveTo(127.3f, 255.6f, 213.3f, 342.0f, 213.4f, 448.0f)
                close()
            }
        }
        .build()
        return _chromecast!!
    }

private var _chromecast: ImageVector? = null
