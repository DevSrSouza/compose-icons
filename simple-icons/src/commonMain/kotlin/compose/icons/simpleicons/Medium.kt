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

public val SimpleIcons.Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(name = "Medium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.54f, 12.0f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, -6.77f, 6.82f)
                arcTo(6.8f, 6.8f, 0.0f, false, true, 0.0f, 12.0f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, 6.77f, -6.82f)
                arcTo(6.8f, 6.8f, 0.0f, false, true, 13.54f, 12.0f)
                close()
                moveTo(20.96f, 12.0f)
                curveToRelative(0.0f, 3.54f, -1.51f, 6.42f, -3.38f, 6.42f)
                curveToRelative(-1.87f, 0.0f, -3.39f, -2.88f, -3.39f, -6.42f)
                reflectiveCurveToRelative(1.52f, -6.42f, 3.39f, -6.42f)
                reflectiveCurveToRelative(3.38f, 2.88f, 3.38f, 6.42f)
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.17f, -0.53f, 5.75f, -1.19f, 5.75f)
                curveToRelative(-0.66f, 0.0f, -1.19f, -2.58f, -1.19f, -5.75f)
                reflectiveCurveToRelative(0.53f, -5.75f, 1.19f, -5.75f)
                curveTo(23.47f, 6.25f, 24.0f, 8.83f, 24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _medium!!
    }

private var _medium: ImageVector? = null
