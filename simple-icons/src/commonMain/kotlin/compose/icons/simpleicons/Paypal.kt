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

public val SimpleIcons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.016f, 19.198f)
                horizontalLineToRelative(-4.2f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.555f, -0.65f)
                lineTo(5.093f, 0.584f)
                arcTo(0.692f, 0.692f, 0.0f, false, true, 5.776f, 0.0f)
                horizontalLineToRelative(7.222f)
                curveToRelative(3.417f, 0.0f, 5.904f, 2.488f, 5.846f, 5.5f)
                curveToRelative(-0.006f, 0.25f, -0.027f, 0.5f, -0.066f, 0.747f)
                arcTo(6.794f, 6.794f, 0.0f, false, true, 12.071f, 12.0f)
                horizontalLineTo(8.743f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.682f, 0.583f)
                lineToRelative(-0.325f, 2.056f)
                lineToRelative(-0.013f, 0.083f)
                lineToRelative(-0.692f, 4.39f)
                lineToRelative(-0.015f, 0.087f)
                close()
                moveTo(19.79f, 6.142f)
                curveToRelative(-0.01f, 0.087f, -0.01f, 0.175f, -0.023f, 0.261f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, true, -7.695f, 6.598f)
                horizontalLineTo(9.007f)
                lineToRelative(-0.283f, 1.795f)
                lineToRelative(-0.013f, 0.083f)
                lineToRelative(-0.692f, 4.39f)
                lineToRelative(-0.134f, 0.843f)
                lineToRelative(-0.014f, 0.088f)
                horizontalLineTo(6.86f)
                lineToRelative(-0.497f, 3.15f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, 0.555f, 0.65f)
                horizontalLineToRelative(3.612f)
                curveToRelative(0.34f, 0.0f, 0.63f, -0.249f, 0.683f, -0.585f)
                lineToRelative(0.952f, -6.031f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, true, 0.683f, -0.584f)
                horizontalLineToRelative(2.126f)
                arcToRelative(6.793f, 6.793f, 0.0f, false, false, 6.707f, -5.752f)
                curveToRelative(0.306f, -1.95f, -0.466f, -3.744f, -1.89f, -4.906f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
