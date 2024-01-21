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

public val SimpleIcons.Shadow: ImageVector
    get() {
        if (_shadow != null) {
            return _shadow!!
        }
        _shadow = Builder(name = "Shadow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.3727f, 0.0f, 0.0f, 5.3727f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.5145f, 1.511f, 6.6754f, 3.9181f, 8.8702f)
                arcToRelative(4.457f, 4.457f, 0.0f, false, true, -0.1998f, -1.3238f)
                curveToRelative(0.0f, -2.4597f, 1.9938f, -4.4535f, 4.4536f, -4.4535f)
                curveToRelative(2.4596f, 0.0f, 4.4535f, 1.9938f, 4.4535f, 4.4535f)
                curveToRelative(0.0f, 1.9565f, -1.262f, 3.6171f, -3.016f, 4.2153f)
                curveTo(10.382f, 23.9178f, 11.1815f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.6273f, 0.0f, 12.0f, -5.3727f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6273f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shadow!!
    }

private var _shadow: ImageVector? = null
