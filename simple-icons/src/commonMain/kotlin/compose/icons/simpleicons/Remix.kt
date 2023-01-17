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

public val SimpleIcons.Remix: ImageVector
    get() {
        if (_remix != null) {
            return _remix!!
        }
        _remix = Builder(name = "Remix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.511f, 18.508f)
                curveToRelative(0.216f, 2.773f, 0.216f, 4.073f, 0.216f, 5.492f)
                horizontalLineTo(15.31f)
                curveToRelative(0.0f, -0.309f, 0.006f, -0.592f, 0.011f, -0.878f)
                curveToRelative(0.018f, -0.892f, 0.036f, -1.821f, -0.109f, -3.698f)
                curveToRelative(-0.19f, -2.747f, -1.374f, -3.358f, -3.55f, -3.358f)
                horizontalLineTo(1.574f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.396f)
                curveToRelative(2.748f, 0.0f, 4.122f, -0.835f, 4.122f, -3.049f)
                curveToRelative(0.0f, -1.946f, -1.374f, -3.125f, -4.122f, -3.125f)
                horizontalLineTo(1.573f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(11.541f)
                curveToRelative(6.221f, 0.0f, 9.313f, 2.938f, 9.313f, 7.632f)
                curveToRelative(0.0f, 3.511f, -2.176f, 5.8f, -5.114f, 6.182f)
                curveToRelative(2.48f, 0.497f, 3.93f, 1.909f, 4.198f, 4.694f)
                close()
                moveTo(1.573f, 24.0f)
                verticalLineToRelative(-3.727f)
                horizontalLineToRelative(6.784f)
                curveToRelative(1.133f, 0.0f, 1.379f, 0.84f, 1.379f, 1.342f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _remix!!
    }

private var _remix: ImageVector? = null
