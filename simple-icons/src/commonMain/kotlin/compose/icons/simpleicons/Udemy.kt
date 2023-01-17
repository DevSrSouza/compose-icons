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

public val SimpleIcons.Udemy: ImageVector
    get() {
        if (_udemy != null) {
            return _udemy!!
        }
        _udemy = Builder(name = "Udemy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(5.81f, 3.573f)
                verticalLineToRelative(3.574f)
                lineToRelative(6.189f, -3.574f)
                lineToRelative(6.191f, 3.574f)
                verticalLineTo(3.573f)
                close()
                moveTo(5.81f, 10.148f)
                verticalLineToRelative(8.144f)
                curveToRelative(0.0f, 1.85f, 0.589f, 3.243f, 1.741f, 4.234f)
                reflectiveCurveTo(10.177f, 24.0f, 11.973f, 24.0f)
                reflectiveCurveToRelative(3.269f, -0.482f, 4.448f, -1.474f)
                curveToRelative(1.179f, -0.991f, 1.768f, -2.439f, 1.768f, -4.314f)
                verticalLineToRelative(-8.064f)
                horizontalLineToRelative(-3.242f)
                verticalLineToRelative(7.85f)
                curveToRelative(0.0f, 2.036f, -1.509f, 3.055f, -2.948f, 3.055f)
                curveToRelative(-1.428f, 0.0f, -2.947f, -0.991f, -2.947f, -3.027f)
                verticalLineToRelative(-7.878f)
                close()
            }
        }
        .build()
        return _udemy!!
    }

private var _udemy: ImageVector? = null
