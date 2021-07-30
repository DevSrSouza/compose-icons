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

public val SimpleIcons.Jasmine: ImageVector
    get() {
        if (_jasmine != null) {
            return _jasmine!!
        }
        _jasmine = Builder(name = "Jasmine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.591f, 19.649f)
                horizontalLineToRelative(0.771f)
                verticalLineToRelative(-3.786f)
                horizontalLineToRelative(-0.77f)
                close()
                moveTo(4.717f, 14.619f)
                lineToRelative(-0.238f, -0.733f)
                lineToRelative(3.6f, -1.17f)
                lineToRelative(0.238f, 0.735f)
                lineToRelative(-3.6f, 1.17f)
                moveToRelative(4.645f, -5.762f)
                lineTo(7.138f, 5.796f)
                lineToRelative(0.624f, -0.453f)
                lineToRelative(2.224f, 3.062f)
                lineToRelative(-0.624f, 0.454f)
                moveToRelative(5.315f, 0.028f)
                lineToRelative(-0.624f, -0.454f)
                lineToRelative(2.225f, -3.062f)
                lineToRelative(0.624f, 0.453f)
                lineToRelative(-2.225f, 3.063f)
                moveToRelative(4.592f, 5.78f)
                lineToRelative(-3.6f, -1.17f)
                lineToRelative(0.238f, -0.734f)
                lineToRelative(3.6f, 1.17f)
                lineToRelative(-0.238f, 0.733f)
                moveTo(12.0f, 0.001f)
                curveTo(5.383f, 0.001f, 0.0f, 5.384f, 0.0f, 11.998f)
                curveTo(0.0f, 18.617f, 5.383f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -5.382f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 2.431f)
                curveToRelative(5.284f, 0.0f, 9.569f, 4.283f, 9.569f, 9.567f)
                curveToRelative(0.0f, 5.287f, -4.285f, 9.573f, -9.569f, 9.573f)
                curveToRelative(-5.286f, 0.0f, -9.57f, -4.286f, -9.57f, -9.573f)
                curveToRelative(0.0f, -5.284f, 4.285f, -9.567f, 9.57f, -9.567f)
                moveToRelative(1.552f, 7.96f)
                lineToRelative(0.575f, 1.768f)
                lineToRelative(0.747f, 0.242f)
                lineToRelative(4.736f, -1.538f)
                lineToRelative(-0.86f, -2.645f)
                lineToRelative(-4.736f, 1.539f)
                lineToRelative(-0.462f, 0.635f)
                moveToRelative(0.337f, 2.5f)
                lineToRelative(-1.504f, 1.093f)
                verticalLineToRelative(0.785f)
                lineToRelative(2.927f, 4.03f)
                lineToRelative(2.25f, -1.636f)
                lineToRelative(-2.927f, -4.029f)
                lineToRelative(-0.746f, -0.243f)
                moveToRelative(-2.275f, 1.093f)
                lineToRelative(-1.504f, -1.093f)
                lineToRelative(-0.747f, 0.243f)
                lineToRelative(-2.927f, 4.029f)
                lineToRelative(2.25f, 1.635f)
                lineToRelative(2.928f, -4.029f)
                verticalLineToRelative(-0.785f)
                moveTo(9.873f, 12.16f)
                lineToRelative(0.574f, -1.767f)
                lineToRelative(-0.462f, -0.635f)
                lineToRelative(-4.736f, -1.54f)
                lineToRelative(-0.86f, 2.646f)
                lineToRelative(4.737f, 1.54f)
                lineToRelative(0.747f, -0.244f)
                moveToRelative(1.198f, -2.22f)
                horizontalLineToRelative(1.859f)
                lineToRelative(0.462f, -0.636f)
                verticalLineToRelative(-4.98f)
                lineTo(10.61f, 4.324f)
                verticalLineToRelative(4.98f)
                lineToRelative(0.461f, 0.636f)
            }
        }
        .build()
        return _jasmine!!
    }

private var _jasmine: ImageVector? = null
