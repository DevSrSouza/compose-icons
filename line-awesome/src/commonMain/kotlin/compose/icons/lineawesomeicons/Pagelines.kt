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

public val LineAwesomeIcons.Pagelines: ImageVector
    get() {
        if (_pagelines != null) {
            return _pagelines!!
        }
        _pagelines = Builder(name = "Pagelines", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.094f, 4.0f)
                curveTo(15.094f, 4.0f, 13.887f, 5.664f, 14.25f, 8.281f)
                curveTo(14.527f, 10.262f, 16.18f, 11.504f, 17.094f, 12.031f)
                curveTo(17.125f, 12.984f, 17.102f, 13.957f, 17.0f, 14.938f)
                curveTo(16.539f, 13.813f, 15.508f, 11.844f, 13.594f, 11.156f)
                curveTo(11.734f, 10.484f, 9.375f, 11.344f, 9.375f, 11.344f)
                curveTo(9.691f, 13.66f, 11.211f, 15.461f, 13.688f, 15.906f)
                curveTo(15.273f, 16.191f, 16.332f, 16.008f, 16.875f, 15.875f)
                curveTo(16.625f, 17.547f, 16.164f, 19.199f, 15.5f, 20.688f)
                curveTo(15.141f, 19.582f, 13.988f, 17.32f, 10.656f, 16.938f)
                curveTo(8.699f, 16.715f, 6.844f, 17.938f, 6.844f, 17.938f)
                curveTo(6.844f, 17.938f, 8.035f, 22.219f, 11.875f, 22.219f)
                curveTo(13.434f, 22.219f, 14.465f, 21.863f, 15.063f, 21.594f)
                curveTo(15.031f, 21.656f, 15.004f, 21.719f, 14.969f, 21.781f)
                curveTo(13.262f, 24.863f, 10.559f, 27.0f, 6.469f, 27.0f)
                lineTo(6.469f, 28.0f)
                curveTo(10.914f, 28.0f, 14.012f, 25.559f, 15.844f, 22.25f)
                curveTo(15.957f, 22.047f, 16.051f, 21.836f, 16.156f, 21.625f)
                curveTo(16.43f, 21.832f, 17.914f, 22.875f, 20.844f, 22.875f)
                curveTo(24.082f, 22.875f, 25.531f, 19.219f, 25.531f, 19.219f)
                curveTo(25.531f, 19.219f, 23.914f, 17.875f, 21.438f, 17.875f)
                curveTo(19.094f, 17.875f, 17.34f, 19.742f, 16.531f, 20.813f)
                curveTo(17.176f, 19.305f, 17.629f, 17.68f, 17.875f, 16.031f)
                curveTo(18.051f, 16.066f, 21.395f, 16.668f, 23.281f, 14.75f)
                curveTo(25.219f, 12.781f, 24.906f, 10.969f, 24.906f, 10.969f)
                curveTo(24.906f, 10.969f, 21.648f, 10.504f, 19.875f, 12.125f)
                curveTo(18.758f, 13.148f, 18.168f, 14.848f, 17.938f, 15.625f)
                curveTo(18.113f, 14.297f, 18.152f, 12.973f, 18.094f, 11.688f)
                curveTo(18.449f, 11.031f, 18.938f, 9.91f, 18.938f, 8.438f)
                curveTo(18.938f, 5.242f, 15.094f, 4.0f, 15.094f, 4.0f)
                close()
            }
        }
        .build()
        return _pagelines!!
    }

private var _pagelines: ImageVector? = null
