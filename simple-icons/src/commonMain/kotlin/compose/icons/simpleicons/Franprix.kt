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

public val SimpleIcons.Franprix: ImageVector
    get() {
        if (_franprix != null) {
            return _franprix!!
        }
        _franprix = Builder(name = "Franprix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.305f)
                curveToRelative(3.691f, 0.0f, 6.323f, -3.071f, 6.13f, -6.286f)
                curveToRelative(-2.124f, -0.17f, -5.069f, 0.791f, -6.13f, 3.79f)
                curveTo(10.939f, 0.81f, 7.993f, -0.15f, 5.87f, 0.02f)
                curveTo(5.677f, 3.234f, 8.309f, 6.305f, 12.0f, 6.305f)
                moveToRelative(11.002f, 6.962f)
                curveToRelative(-0.139f, -3.413f, -2.821f, -6.362f, -6.55f, -6.362f)
                curveToRelative(-1.69f, 0.0f, -3.236f, 0.635f, -4.452f, 1.744f)
                curveToRelative(-1.217f, -1.11f, -2.763f, -1.744f, -4.452f, -1.744f)
                curveToRelative(-3.729f, 0.0f, -6.412f, 2.949f, -6.55f, 6.362f)
                curveTo(0.758f, 19.19f, 5.913f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.087f, 0.0f, 11.242f, -4.81f, 11.002f, -10.733f)
            }
        }
        .build()
        return _franprix!!
    }

private var _franprix: ImageVector? = null
