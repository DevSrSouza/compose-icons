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
                curveTo(12.0391f, 2.0f, 8.0f, 6.0391f, 8.0f, 11.0f)
                curveTo(8.0f, 12.5313f, 8.3828f, 13.957f, 9.0625f, 15.2188f)
                curveTo(9.457f, 14.5039f, 9.9063f, 13.832f, 10.375f, 13.1875f)
                curveTo(10.1445f, 12.4961f, 10.0f, 11.7695f, 10.0f, 11.0f)
                curveTo(10.0f, 7.1406f, 13.1406f, 4.0f, 17.0f, 4.0f)
                curveTo(20.8594f, 4.0f, 24.0f, 7.1406f, 24.0f, 11.0f)
                curveTo(24.0f, 14.8594f, 20.8594f, 18.0f, 17.0f, 18.0f)
                curveTo(16.1836f, 18.0f, 15.4141f, 17.8516f, 14.6875f, 17.5938f)
                curveTo(14.3438f, 18.1563f, 14.0273f, 18.7422f, 13.75f, 19.375f)
                curveTo(14.7617f, 19.7695f, 15.8516f, 20.0f, 17.0f, 20.0f)
                curveTo(21.9609f, 20.0f, 26.0f, 15.9609f, 26.0f, 11.0f)
                curveTo(26.0f, 6.0391f, 21.9609f, 2.0f, 17.0f, 2.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveTo(15.3438f, 8.0f, 14.0f, 9.3438f, 14.0f, 11.0f)
                curveTo(14.0f, 11.3359f, 14.0859f, 11.6367f, 14.1875f, 11.9375f)
                curveTo(8.457f, 17.2422f, 8.0f, 25.2109f, 8.0f, 29.0f)
                lineTo(10.0f, 29.0f)
                curveTo(10.0f, 25.3867f, 10.418f, 18.2578f, 15.4063f, 13.5313f)
                curveTo(15.8672f, 13.8242f, 16.4141f, 14.0f, 17.0f, 14.0f)
                curveTo(18.6563f, 14.0f, 20.0f, 12.6563f, 20.0f, 11.0f)
                curveTo(20.0f, 9.3438f, 18.6563f, 8.0f, 17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _tencentWeibo!!
    }

private var _tencentWeibo: ImageVector? = null
