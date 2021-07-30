package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.8f, 458.1f)
                lineToRelative(-55.0f, -42.5f)
                curveToRelative(15.4f, -1.4f, 29.2f, -13.7f, 29.2f, -31.1f)
                verticalLineToRelative(-257.0f)
                curveToRelative(0.0f, -25.5f, -29.1f, -40.4f, -50.4f, -25.8f)
                lineTo(448.0f, 177.3f)
                verticalLineToRelative(137.2f)
                lineToRelative(-32.0f, -24.7f)
                verticalLineToRelative(-178.0f)
                curveToRelative(0.0f, -26.4f, -21.4f, -47.8f, -47.8f, -47.8f)
                horizontalLineTo(123.9f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2.0f, 28.5f, -0.8f, 23.0f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7.0f, -4.2f, 17.0f, 2.8f, 22.4f)
                lineTo(42.7f, 82.0f)
                lineTo(416.0f, 370.6f)
                lineToRelative(178.5f, 138.0f)
                curveToRelative(7.0f, 5.4f, 17.0f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.5f, -6.9f, 4.2f, -17.0f, -2.8f, -22.4f)
                close()
                moveTo(32.0f, 400.2f)
                curveToRelative(0.0f, 26.4f, 21.4f, 47.8f, 47.8f, 47.8f)
                horizontalLineToRelative(288.4f)
                curveToRelative(11.2f, 0.0f, 21.4f, -4.0f, 29.6f, -10.5f)
                lineTo(32.0f, 154.7f)
                verticalLineToRelative(245.5f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
