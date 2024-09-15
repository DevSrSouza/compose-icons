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

public val LineAwesomeIcons.TencentWeibo: ImageVector
    get() {
        if (_tencentWeibo != null) {
            return _tencentWeibo!!
        }
        _tencentWeibo = Builder(name = "TencentWeibo", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                curveTo(12.039f, 2.0f, 8.0f, 6.039f, 8.0f, 11.0f)
                curveTo(8.0f, 12.531f, 8.383f, 13.957f, 9.063f, 15.219f)
                curveTo(9.457f, 14.504f, 9.906f, 13.832f, 10.375f, 13.188f)
                curveTo(10.145f, 12.496f, 10.0f, 11.77f, 10.0f, 11.0f)
                curveTo(10.0f, 7.141f, 13.141f, 4.0f, 17.0f, 4.0f)
                curveTo(20.859f, 4.0f, 24.0f, 7.141f, 24.0f, 11.0f)
                curveTo(24.0f, 14.859f, 20.859f, 18.0f, 17.0f, 18.0f)
                curveTo(16.184f, 18.0f, 15.414f, 17.852f, 14.688f, 17.594f)
                curveTo(14.344f, 18.156f, 14.027f, 18.742f, 13.75f, 19.375f)
                curveTo(14.762f, 19.77f, 15.852f, 20.0f, 17.0f, 20.0f)
                curveTo(21.961f, 20.0f, 26.0f, 15.961f, 26.0f, 11.0f)
                curveTo(26.0f, 6.039f, 21.961f, 2.0f, 17.0f, 2.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveTo(15.344f, 8.0f, 14.0f, 9.344f, 14.0f, 11.0f)
                curveTo(14.0f, 11.336f, 14.086f, 11.637f, 14.188f, 11.938f)
                curveTo(8.457f, 17.242f, 8.0f, 25.211f, 8.0f, 29.0f)
                lineTo(10.0f, 29.0f)
                curveTo(10.0f, 25.387f, 10.418f, 18.258f, 15.406f, 13.531f)
                curveTo(15.867f, 13.824f, 16.414f, 14.0f, 17.0f, 14.0f)
                curveTo(18.656f, 14.0f, 20.0f, 12.656f, 20.0f, 11.0f)
                curveTo(20.0f, 9.344f, 18.656f, 8.0f, 17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _tencentWeibo!!
    }

private var _tencentWeibo: ImageVector? = null
