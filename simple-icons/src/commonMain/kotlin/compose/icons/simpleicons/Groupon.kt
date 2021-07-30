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

public val SimpleIcons.Groupon: ImageVector
    get() {
        if (_groupon != null) {
            return _groupon!!
        }
        _groupon = Builder(name = "Groupon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.316f, 20.334f)
                curveTo(5.618f, 22.736f, 8.554f, 24.0f, 12.012f, 24.0f)
                curveToRelative(3.988f, 0.0f, 7.739f, -1.95f, 9.978f, -5.163f)
                curveToRelative(1.353f, -1.95f, 2.01f, -4.158f, 2.01f, -6.755f)
                curveToRelative(0.0f, -0.484f, -0.032f, -1.006f, -0.063f, -1.529f)
                horizontalLineTo(10.595f)
                verticalLineToRelative(4.61f)
                horizontalLineToRelative(6.687f)
                curveToRelative(-1.155f, 2.012f, -3.094f, 3.12f, -5.27f, 3.12f)
                curveToRelative(-3.229f, 0.0f, -6.125f, -2.824f, -6.125f, -6.497f)
                curveToRelative(0.0f, -3.315f, 2.699f, -6.069f, 6.125f, -6.069f)
                curveToRelative(1.844f, 0.0f, 3.355f, 0.749f, 4.811f, 2.239f)
                horizontalLineToRelative(6.52f)
                curveTo(21.468f, 3.019f, 17.084f, 0.0f, 12.083f, 0.0f)
                curveToRelative(-3.323f, 0.0f, -6.22f, 1.17f, -8.53f, 3.409f)
                curveTo(1.25f, 5.647f, 0.0f, 8.572f, 0.0f, 11.754f)
                curveToRelative(-0.008f, 3.417f, 1.108f, 6.271f, 3.316f, 8.58f)
                close()
            }
        }
        .build()
        return _groupon!!
    }

private var _groupon: ImageVector? = null
