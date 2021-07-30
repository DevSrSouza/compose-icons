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

public val SimpleIcons.Kickstarter: ImageVector
    get() {
        if (_kickstarter != null) {
            return _kickstarter!!
        }
        _kickstarter = Builder(name = "Kickstarter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.168f, 0.0f)
                curveToRelative(-3.2f, 0.0f, -5.797f, 2.579f, -5.797f, 5.758f)
                verticalLineToRelative(12.484f)
                curveTo(1.371f, 21.42f, 3.968f, 24.0f, 7.168f, 24.0f)
                curveToRelative(1.981f, 0.0f, 3.716f, -0.978f, 4.768f, -2.479f)
                lineToRelative(0.794f, 0.79f)
                curveToRelative(2.26f, 2.245f, 5.943f, 2.245f, 8.203f, 0.0f)
                arcToRelative(5.724f, 5.724f, 0.0f, false, false, 1.696f, -4.075f)
                arcToRelative(5.724f, 5.724f, 0.0f, false, false, -1.696f, -4.074f)
                lineToRelative(-2.182f, -2.168f)
                lineToRelative(2.182f, -2.156f)
                arcToRelative(5.724f, 5.724f, 0.0f, false, false, 1.696f, -4.074f)
                arcToRelative(5.724f, 5.724f, 0.0f, false, false, -1.696f, -4.074f)
                curveToRelative(-2.26f, -2.246f, -5.942f, -2.246f, -8.203f, 0.0f)
                lineToRelative(-0.794f, 0.789f)
                arcTo(5.797f, 5.797f, 0.0f, false, false, 7.168f, 0.0f)
                close()
            }
        }
        .build()
        return _kickstarter!!
    }

private var _kickstarter: ImageVector? = null
