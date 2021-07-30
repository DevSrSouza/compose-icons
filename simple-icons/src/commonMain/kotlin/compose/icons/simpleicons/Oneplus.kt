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

public val SimpleIcons.Oneplus: ImageVector
    get() {
        if (_oneplus != null) {
            return _oneplus!!
        }
        _oneplus = Builder(name = "Oneplus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.74f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(20.26f)
                lineTo(20.26f, 12.428f)
                horizontalLineToRelative(-2.256f)
                verticalLineToRelative(9.317f)
                lineTo(2.254f, 21.745f)
                lineTo(2.254f, 5.995f)
                horizontalLineToRelative(9.318f)
                lineTo(11.572f, 3.742f)
                close()
                moveTo(18.004f, 0.0f)
                verticalLineToRelative(3.74f)
                horizontalLineToRelative(-3.758f)
                verticalLineToRelative(2.256f)
                horizontalLineToRelative(3.758f)
                verticalLineToRelative(3.758f)
                horizontalLineToRelative(2.255f)
                lineTo(20.259f, 5.996f)
                lineTo(24.0f, 5.996f)
                lineTo(24.0f, 3.74f)
                horizontalLineToRelative(-3.758f)
                lineTo(20.242f, 0.0f)
                close()
                moveTo(11.554f, 18.756f)
                lineTo(11.554f, 8.862f)
                lineTo(9.562f, 8.862f)
                curveToRelative(0.0f, 0.682f, -0.228f, 1.189f, -0.577f, 1.504f)
                curveToRelative(-0.367f, 0.297f, -0.91f, 0.437f, -1.556f, 0.437f)
                horizontalLineToRelative(-0.245f)
                verticalLineToRelative(1.625f)
                horizontalLineToRelative(2.133f)
                verticalLineToRelative(6.31f)
                horizontalLineToRelative(2.237f)
                close()
            }
        }
        .build()
        return _oneplus!!
    }

private var _oneplus: ImageVector? = null
