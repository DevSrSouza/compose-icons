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

public val RemixIcons.MouseLine: ImageVector
    get() {
        if (_mouseLine != null) {
            return _mouseLine!!
        }
        _mouseLine = Builder(name = "MouseLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.141f, 4.0f)
                curveToRelative(-1.582f, 0.0f, -2.387f, 0.169f, -3.128f, 0.565f)
                arcToRelative(3.453f, 3.453f, 0.0f, false, false, -1.448f, 1.448f)
                curveTo(6.169f, 6.753f, 6.0f, 7.559f, 6.0f, 9.14f)
                verticalLineToRelative(5.718f)
                curveToRelative(0.0f, 1.582f, 0.169f, 2.387f, 0.565f, 3.128f)
                curveToRelative(0.337f, 0.63f, 0.818f, 1.111f, 1.448f, 1.448f)
                curveToRelative(0.74f, 0.396f, 1.546f, 0.565f, 3.128f, 0.565f)
                horizontalLineToRelative(1.718f)
                curveToRelative(1.582f, 0.0f, 2.387f, -0.169f, 3.128f, -0.565f)
                arcToRelative(3.453f, 3.453f, 0.0f, false, false, 1.448f, -1.448f)
                curveToRelative(0.396f, -0.74f, 0.565f, -1.546f, 0.565f, -3.128f)
                lineTo(18.0f, 9.14f)
                curveToRelative(0.0f, -1.582f, -0.169f, -2.387f, -0.565f, -3.128f)
                arcToRelative(3.453f, 3.453f, 0.0f, false, false, -1.448f, -1.448f)
                curveTo(15.247f, 4.169f, 14.441f, 4.0f, 12.86f, 4.0f)
                lineTo(11.14f, 4.0f)
                close()
                moveTo(11.141f, 2.0f)
                horizontalLineToRelative(1.718f)
                curveToRelative(2.014f, 0.0f, 3.094f, 0.278f, 4.072f, 0.801f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, 2.268f, 2.268f)
                curveToRelative(0.523f, 0.978f, 0.801f, 2.058f, 0.801f, 4.072f)
                verticalLineToRelative(5.718f)
                curveToRelative(0.0f, 2.014f, -0.278f, 3.094f, -0.801f, 4.072f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, -2.268f, 2.268f)
                curveToRelative(-0.978f, 0.523f, -2.058f, 0.801f, -4.072f, 0.801f)
                lineTo(11.14f, 22.0f)
                curveToRelative(-2.014f, 0.0f, -3.094f, -0.278f, -4.072f, -0.801f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, -2.268f, -2.268f)
                curveTo(4.278f, 17.953f, 4.0f, 16.873f, 4.0f, 14.859f)
                lineTo(4.0f, 9.14f)
                curveToRelative(0.0f, -2.014f, 0.278f, -3.094f, 0.801f, -4.072f)
                arcTo(5.452f, 5.452f, 0.0f, false, true, 7.07f, 2.801f)
                curveTo(8.047f, 2.278f, 9.127f, 2.0f, 11.141f, 2.0f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _mouseLine!!
    }

private var _mouseLine: ImageVector? = null
