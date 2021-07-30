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

public val SimpleIcons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.845f, 0.904f)
                curveToRelative(-0.435f, 0.0f, -0.82f, 0.28f, -0.955f, 0.692f)
                curveTo(2.639f, 5.449f, 1.246f, 9.728f, 0.07f, 13.335f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, false, 0.522f, 1.607f)
                lineToRelative(11.071f, 8.045f)
                curveToRelative(0.2f, 0.145f, 0.472f, 0.144f, 0.67f, -0.004f)
                lineToRelative(11.073f, -8.04f)
                arcToRelative(1.436f, 1.436f, 0.0f, false, false, 0.522f, -1.61f)
                curveToRelative(-1.285f, -3.942f, -2.683f, -8.256f, -3.817f, -11.746f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -0.957f, -0.684f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -0.949f, 0.69f)
                lineToRelative(-2.405f, 7.408f)
                lineTo(8.203f, 9.001f)
                lineToRelative(-2.41f, -7.408f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -0.942f, -0.69f)
                horizontalLineToRelative(-0.006f)
                close()
                moveTo(4.839f, 2.324f)
                lineToRelative(2.173f, 6.678f)
                lineTo(2.675f, 9.002f)
                close()
                moveTo(19.165f, 2.324f)
                lineToRelative(2.168f, 6.678f)
                horizontalLineToRelative(-4.341f)
                close()
                moveTo(8.572f, 10.134f)
                horizontalLineToRelative(6.862f)
                curveToRelative(-1.142f, 3.52f, -2.288f, 7.04f, -3.434f, 10.559f)
                lineTo(8.572f, 10.135f)
                close()
                moveTo(3.058f, 10.139f)
                horizontalLineToRelative(4.321f)
                lineToRelative(3.086f, 9.5f)
                close()
                moveTo(16.625f, 10.139f)
                horizontalLineToRelative(4.325f)
                curveToRelative(-2.467f, 3.17f, -4.95f, 6.328f, -7.411f, 9.502f)
                curveToRelative(1.028f, -3.167f, 2.059f, -6.334f, 3.086f, -9.502f)
                close()
                moveTo(2.1f, 10.762f)
                lineToRelative(6.977f, 8.947f)
                lineToRelative(-7.817f, -5.682f)
                arcToRelative(0.305f, 0.305f, 0.0f, false, true, -0.112f, -0.341f)
                close()
                moveTo(21.898f, 10.762f)
                lineToRelative(0.952f, 2.922f)
                arcToRelative(0.305f, 0.305f, 0.0f, false, true, -0.11f, 0.341f)
                verticalLineToRelative(0.002f)
                lineToRelative(-7.82f, 5.68f)
                lineToRelative(0.026f, -0.035f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
