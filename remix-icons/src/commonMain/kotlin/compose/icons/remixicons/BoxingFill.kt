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

public val RemixIcons.BoxingFill: ImageVector
    get() {
        if (_boxingFill != null) {
            return _boxingFill!!
        }
        _boxingFill = Builder(name = "BoxingFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 11.0f)
                lineToRelative(0.144f, 0.007f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.35f, 1.349f)
                lineTo(11.0f, 12.5f)
                lineToRelative(-0.007f, 0.144f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.349f, 1.35f)
                lineTo(9.5f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.7f, 0.0f, 3.117f, -1.212f, 3.434f, -2.819f)
                lineToRelative(0.03f, -0.18f)
                lineTo(19.0f, 13.0f)
                curveToRelative(0.711f, 0.0f, 1.388f, -0.149f, 2.0f, -0.416f)
                verticalLineTo(17.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -2.0f, 2.829f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.17f)
                arcTo(3.001f, 3.001f, 0.0f, false, true, 3.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(22.0f, 7.5f)
                verticalLineTo(8.0f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.819f, 2.819f)
                lineTo(19.0f, 11.0f)
                horizontalLineToRelative(-6.337f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, -2.955f, -1.994f)
                lineTo(9.5f, 9.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.729f, 0.0f, -1.412f, 0.195f, -2.001f, 0.536f)
                lineTo(3.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(9.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 22.0f, 7.5f)
                close()
            }
        }
        .build()
        return _boxingFill!!
    }

private var _boxingFill: ImageVector? = null
