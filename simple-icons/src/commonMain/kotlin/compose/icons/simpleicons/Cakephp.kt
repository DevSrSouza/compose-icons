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

public val SimpleIcons.Cakephp: ImageVector
    get() {
        if (_cakephp != null) {
            return _cakephp!!
        }
        _cakephp = Builder(name = "Cakephp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.875f)
                verticalLineToRelative(3.745f)
                curveToRelative(0.0f, 2.067f, 5.37f, 3.743f, 12.0f, 3.743f)
                lineTo(12.0f, 17.62f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -1.68f, -12.0f, -3.743f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(21.384f, 16.208f)
                lineTo(12.0f, 13.875f)
                verticalLineToRelative(3.745f)
                lineToRelative(9.384f, 2.333f)
                curveTo(23.02f, 19.313f, 24.0f, 18.503f, 24.0f, 17.62f)
                verticalLineToRelative(-3.745f)
                curveToRelative(0.0f, 0.882f, -0.98f, 1.692f, -2.616f, 2.333f)
                close()
                moveTo(12.0f, 10.133f)
                verticalLineToRelative(3.742f)
                curveToRelative(-6.627f, 0.0f, -12.0f, -1.677f, -12.0f, -3.744f)
                lineTo(0.0f, 6.38f)
                curveToRelative(0.0f, -2.064f, 5.37f, -3.743f, 12.0f, -3.743f)
                curveToRelative(6.625f, 0.0f, 12.0f, 1.68f, 12.0f, 3.744f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.883f, -0.98f, 1.69f, -2.616f, 2.334f)
                lineTo(12.0f, 10.13f)
                verticalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _cakephp!!
    }

private var _cakephp: ImageVector? = null
