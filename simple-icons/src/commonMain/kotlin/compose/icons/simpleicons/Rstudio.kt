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

public val SimpleIcons.Rstudio: ImageVector
    get() {
        if (_rstudio != null) {
            return _rstudio!!
        }
        _rstudio = Builder(name = "Rstudio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.178f, 0.002f)
                arcToRelative(12.002f, 12.002f, 0.0f, false, false, -8.662f, 3.515f)
                arcToRelative(12.002f, 12.002f, 0.0f, false, false, 0.0f, 16.97f)
                arcToRelative(12.002f, 12.002f, 0.0f, false, false, 16.97f, 0.0f)
                arcToRelative(12.002f, 12.002f, 0.0f, false, false, 0.0f, -16.97f)
                arcTo(12.002f, 12.002f, 0.0f, false, false, 12.179f, 0.002f)
                close()
                moveTo(7.77f, 5.995f)
                curveToRelative(0.562f, 0.128f, 1.05f, 0.217f, 1.663f, 0.217f)
                curveToRelative(0.921f, 0.0f, 1.863f, -0.217f, 2.786f, -0.217f)
                curveToRelative(1.79f, 0.0f, 3.45f, 0.814f, 3.45f, 2.8f)
                curveToRelative(0.0f, 1.54f, -0.921f, 2.517f, -2.35f, 2.93f)
                lineToRelative(2.788f, 4.107f)
                horizontalLineToRelative(1.301f)
                verticalLineToRelative(1.01f)
                horizontalLineToRelative(-1.986f)
                lineToRelative(-3.293f, -4.934f)
                horizontalLineToRelative(-1.757f)
                verticalLineToRelative(3.924f)
                horizontalLineToRelative(1.718f)
                verticalLineToRelative(1.01f)
                lineTo(7.77f, 16.842f)
                verticalLineToRelative(-1.01f)
                horizontalLineToRelative(1.483f)
                lineTo(9.253f, 7.134f)
                lineTo(7.77f, 6.951f)
                verticalLineToRelative(-0.957f)
                close()
                moveTo(12.236f, 7.007f)
                curveToRelative(-0.596f, 0.0f, -1.213f, 0.053f, -1.864f, 0.127f)
                verticalLineToRelative(3.798f)
                lineToRelative(0.941f, 0.02f)
                curveToRelative(2.298f, 0.034f, 3.183f, -0.85f, 3.183f, -2.026f)
                curveToRelative(0.0f, -1.376f, -0.997f, -1.919f, -2.26f, -1.919f)
                close()
            }
        }
        .build()
        return _rstudio!!
    }

private var _rstudio: ImageVector? = null
