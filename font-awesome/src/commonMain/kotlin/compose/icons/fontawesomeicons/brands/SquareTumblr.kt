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

public val BrandsGroup.SquareTumblr: ImageVector
    get() {
        if (_squareTumblr != null) {
            return _squareTumblr!!
        }
        _squareTumblr = Builder(name = "SquareTumblr", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(256.8f, 416.0f)
                curveToRelative(-75.5f, 0.0f, -91.9f, -55.5f, -91.9f, -87.9f)
                verticalLineToRelative(-90.0f)
                horizontalLineTo(135.2f)
                curveToRelative(-3.4f, 0.0f, -6.2f, -2.8f, -6.2f, -6.2f)
                verticalLineTo(189.4f)
                curveToRelative(0.0f, -4.5f, 2.8f, -8.5f, 7.1f, -10.0f)
                curveToRelative(38.8f, -13.7f, 50.9f, -47.5f, 52.7f, -73.2f)
                curveToRelative(0.5f, -6.9f, 4.1f, -10.2f, 10.0f, -10.2f)
                horizontalLineToRelative(44.3f)
                curveToRelative(3.4f, 0.0f, 6.2f, 2.8f, 6.2f, 6.2f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(51.9f)
                curveToRelative(3.4f, 0.0f, 6.2f, 2.8f, 6.2f, 6.2f)
                verticalLineToRelative(51.1f)
                curveToRelative(0.0f, 3.4f, -2.8f, 6.2f, -6.2f, 6.2f)
                horizontalLineTo(249.1f)
                verticalLineTo(321.0f)
                curveToRelative(0.0f, 21.4f, 14.8f, 33.5f, 42.5f, 22.4f)
                curveToRelative(3.0f, -1.2f, 5.6f, -2.0f, 8.0f, -1.4f)
                curveToRelative(2.2f, 0.5f, 3.6f, 2.1f, 4.6f, 4.9f)
                lineTo(318.0f, 387.1f)
                curveToRelative(1.0f, 3.2f, 2.0f, 6.7f, -0.3f, 9.1f)
                curveToRelative(-8.5f, 9.1f, -31.2f, 19.8f, -60.9f, 19.8f)
                close()
            }
        }
        .build()
        return _squareTumblr!!
    }

private var _squareTumblr: ImageVector? = null
