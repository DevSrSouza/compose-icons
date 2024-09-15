package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.InfinitySolid: ImageVector
    get() {
        if (_infinitySolid != null) {
            return _infinitySolid!!
        }
        _infinitySolid = Builder(name = "InfinitySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                curveTo(5.145f, 9.0f, 2.0f, 12.145f, 2.0f, 16.0f)
                curveTo(2.0f, 19.859f, 5.141f, 23.0f, 9.0f, 23.0f)
                curveTo(11.93f, 23.0f, 13.719f, 21.391f, 15.094f, 19.406f)
                curveTo(14.684f, 18.746f, 14.34f, 18.094f, 14.0f, 17.469f)
                curveTo(12.773f, 19.496f, 11.398f, 21.0f, 9.0f, 21.0f)
                curveTo(6.242f, 21.0f, 4.0f, 18.758f, 4.0f, 16.0f)
                curveTo(4.0f, 13.227f, 6.227f, 11.0f, 9.0f, 11.0f)
                curveTo(10.617f, 11.0f, 11.645f, 11.578f, 12.594f, 12.563f)
                curveTo(13.543f, 13.547f, 14.344f, 14.969f, 15.156f, 16.469f)
                curveTo(15.969f, 17.969f, 16.793f, 19.547f, 18.0f, 20.813f)
                curveTo(19.207f, 22.078f, 20.871f, 23.0f, 23.0f, 23.0f)
                curveTo(26.855f, 23.0f, 30.0f, 19.855f, 30.0f, 16.0f)
                curveTo(30.0f, 12.141f, 26.859f, 9.0f, 23.0f, 9.0f)
                curveTo(20.086f, 9.0f, 18.285f, 10.559f, 16.906f, 12.5f)
                curveTo(17.316f, 13.148f, 17.691f, 13.785f, 18.031f, 14.406f)
                curveTo(19.25f, 12.438f, 20.609f, 11.0f, 23.0f, 11.0f)
                curveTo(25.758f, 11.0f, 28.0f, 13.242f, 28.0f, 16.0f)
                curveTo(28.0f, 18.773f, 25.773f, 21.0f, 23.0f, 21.0f)
                curveTo(21.41f, 21.0f, 20.41f, 20.422f, 19.469f, 19.438f)
                curveTo(18.527f, 18.453f, 17.723f, 17.031f, 16.906f, 15.531f)
                curveTo(16.09f, 14.031f, 15.25f, 12.453f, 14.031f, 11.188f)
                curveTo(12.813f, 9.922f, 11.148f, 9.0f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _infinitySolid!!
    }

private var _infinitySolid: ImageVector? = null
