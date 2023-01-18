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

public val RemixIcons.MouseFill: ImageVector
    get() {
        if (_mouseFill != null) {
            return _mouseFill!!
        }
        _mouseFill = Builder(name = "MouseFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.141f, 2.0f)
                horizontalLineToRelative(1.718f)
                curveToRelative(2.014f, 0.0f, 3.094f, 0.278f, 4.072f, 0.801f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, 2.268f, 2.268f)
                curveToRelative(0.523f, 0.978f, 0.801f, 2.058f, 0.801f, 4.072f)
                verticalLineToRelative(5.718f)
                curveToRelative(0.0f, 2.014f, -0.278f, 3.094f, -0.801f, 4.072f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, -2.268f, 2.268f)
                curveToRelative(-0.978f, 0.523f, -2.058f, 0.801f, -4.072f, 0.801f)
                horizontalLineTo(11.14f)
                curveToRelative(-2.014f, 0.0f, -3.094f, -0.278f, -4.072f, -0.801f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, -2.268f, -2.268f)
                curveTo(4.278f, 17.953f, 4.0f, 16.873f, 4.0f, 14.859f)
                verticalLineTo(9.14f)
                curveToRelative(0.0f, -2.014f, 0.278f, -3.094f, 0.801f, -4.072f)
                arcTo(5.452f, 5.452f, 0.0f, false, true, 7.07f, 2.801f)
                curveTo(8.047f, 2.278f, 9.127f, 2.0f, 11.141f, 2.0f)
                close()
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mouseFill!!
    }

private var _mouseFill: ImageVector? = null
