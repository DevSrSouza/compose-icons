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

public val LineAwesomeIcons.AccessibleIcon: ImageVector
    get() {
        if (_accessibleIcon != null) {
            return _accessibleIcon!!
        }
        _accessibleIcon = Builder(name = "AccessibleIcon", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveTo(22.355f, 4.0f, 21.0f, 5.355f, 21.0f, 7.0f)
                curveTo(21.0f, 8.645f, 22.355f, 10.0f, 24.0f, 10.0f)
                curveTo(25.645f, 10.0f, 27.0f, 8.645f, 27.0f, 7.0f)
                curveTo(27.0f, 5.355f, 25.645f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(24.0f, 6.0f)
                curveTo(24.563f, 6.0f, 25.0f, 6.438f, 25.0f, 7.0f)
                curveTo(25.0f, 7.563f, 24.563f, 8.0f, 24.0f, 8.0f)
                curveTo(23.438f, 8.0f, 23.0f, 7.563f, 23.0f, 7.0f)
                curveTo(23.0f, 6.438f, 23.438f, 6.0f, 24.0f, 6.0f)
                close()
                moveTo(18.563f, 9.031f)
                lineTo(14.969f, 9.438f)
                curveTo(14.398f, 9.504f, 13.922f, 9.844f, 13.594f, 10.313f)
                lineTo(13.563f, 10.281f)
                lineTo(13.531f, 10.344f)
                lineTo(11.219f, 13.406f)
                lineTo(12.781f, 14.594f)
                lineTo(15.156f, 11.5f)
                lineTo(15.219f, 11.438f)
                lineTo(17.406f, 11.188f)
                lineTo(15.719f, 15.031f)
                curveTo(13.465f, 15.121f, 11.465f, 16.262f, 10.25f, 18.0f)
                lineTo(13.031f, 18.0f)
                curveTo(13.863f, 17.379f, 14.887f, 17.0f, 16.0f, 17.0f)
                curveTo(18.758f, 17.0f, 21.0f, 19.242f, 21.0f, 22.0f)
                curveTo(21.0f, 24.758f, 18.758f, 27.0f, 16.0f, 27.0f)
                curveTo(14.371f, 27.0f, 12.945f, 26.207f, 12.031f, 25.0f)
                lineTo(9.688f, 25.0f)
                curveTo(10.813f, 27.359f, 13.215f, 29.0f, 16.0f, 29.0f)
                curveTo(19.859f, 29.0f, 23.0f, 25.859f, 23.0f, 22.0f)
                curveTo(23.0f, 21.66f, 22.953f, 21.328f, 22.906f, 21.0f)
                lineTo(24.875f, 21.0f)
                lineTo(23.344f, 26.75f)
                lineTo(25.281f, 27.25f)
                lineTo(26.938f, 21.031f)
                lineTo(27.0f, 20.813f)
                lineTo(26.969f, 20.563f)
                curveTo(26.77f, 19.648f, 25.934f, 19.0f, 25.0f, 19.0f)
                lineTo(22.313f, 19.0f)
                curveTo(22.02f, 18.387f, 21.637f, 17.844f, 21.188f, 17.344f)
                lineTo(22.813f, 13.938f)
                lineTo(22.844f, 13.875f)
                lineTo(22.844f, 13.844f)
                curveTo(23.348f, 12.449f, 22.742f, 10.887f, 21.438f, 10.188f)
                lineTo(19.75f, 9.25f)
                lineTo(19.75f, 9.281f)
                curveTo(19.391f, 9.09f, 18.965f, 8.984f, 18.563f, 9.031f)
                close()
                moveTo(19.469f, 11.375f)
                lineTo(20.5f, 11.938f)
                curveTo(20.945f, 12.176f, 21.141f, 12.684f, 20.969f, 13.156f)
                lineTo(19.594f, 16.0f)
                curveTo(19.035f, 15.664f, 18.43f, 15.422f, 17.781f, 15.25f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(7.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(4.0f, 22.0f)
                lineTo(4.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 22.0f)
                close()
            }
        }
        .build()
        return _accessibleIcon!!
    }

private var _accessibleIcon: ImageVector? = null
