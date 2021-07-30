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

public val SimpleIcons.Valve: ImageVector
    get() {
        if (_valve != null) {
            return _valve!!
        }
        _valve = Builder(name = "Valve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.579f)
                verticalLineToRelative(6.842f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 8.58f)
                close()
                moveTo(1.8f, 9.994f)
                horizontalLineToRelative(0.793f)
                lineToRelative(0.776f, 3.044f)
                lineToRelative(0.76f, -3.044f)
                horizontalLineToRelative(0.836f)
                lineToRelative(-1.227f, 4.029f)
                lineTo(3.0f, 14.023f)
                close()
                moveTo(7.288f, 9.994f)
                horizontalLineToRelative(1.084f)
                lineToRelative(1.145f, 4.034f)
                horizontalLineToRelative(-0.814f)
                lineToRelative(-0.27f, -1.007f)
                lineTo(7.228f, 13.021f)
                reflectiveCurveToRelative(-0.21f, 0.81f, -0.254f, 0.99f)
                curveToRelative(-0.242f, 0.017f, -0.83f, 0.0f, -0.83f, 0.0f)
                close()
                moveTo(11.472f, 9.994f)
                horizontalLineToRelative(0.792f)
                verticalLineToRelative(3.352f)
                horizontalLineToRelative(1.69f)
                verticalLineToRelative(0.677f)
                horizontalLineToRelative(-2.482f)
                close()
                moveTo(14.922f, 9.994f)
                horizontalLineToRelative(0.816f)
                lineToRelative(0.776f, 3.005f)
                lineToRelative(0.754f, -3.005f)
                horizontalLineToRelative(0.815f)
                lineToRelative(-1.222f, 4.034f)
                horizontalLineToRelative(-0.716f)
                close()
                moveTo(19.75f, 9.994f)
                horizontalLineToRelative(1.69f)
                verticalLineToRelative(0.522f)
                horizontalLineToRelative(-1.084f)
                verticalLineToRelative(0.584f)
                horizontalLineToRelative(0.99f)
                verticalLineToRelative(0.523f)
                horizontalLineToRelative(-0.99f)
                verticalLineToRelative(0.6f)
                horizontalLineToRelative(1.084f)
                verticalLineToRelative(0.523f)
                horizontalLineToRelative(-1.69f)
                close()
                moveTo(7.848f, 10.674f)
                lineToRelative(-0.426f, 1.702f)
                horizontalLineToRelative(0.89f)
                close()
            }
        }
        .build()
        return _valve!!
    }

private var _valve: ImageVector? = null
