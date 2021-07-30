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

public val SimpleIcons.Nano: ImageVector
    get() {
        if (_nano != null) {
            return _nano!!
        }
        _nano = Builder(name = "Nano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2864f, 6.8576f)
                curveToRelative(-0.9453f, 0.0f, -1.7135f, 0.7665f, -1.7135f, 1.7136f)
                curveToRelative(0.0f, 1.2843f, -0.4275f, 1.7136f, -1.7136f, 1.7136f)
                curveToRelative(-0.9453f, 0.0f, -1.7135f, 0.7664f, -1.7135f, 1.7135f)
                curveToRelative(0.0f, 1.2843f, -0.4276f, 1.7136f, -1.7136f, 1.7136f)
                curveToRelative(-0.9453f, 0.0f, -1.7135f, 0.7664f, -1.7135f, 1.7135f)
                curveToRelative(0.0f, 0.9454f, 0.7665f, 1.7136f, 1.7135f, 1.7136f)
                curveToRelative(0.9454f, 0.0f, 1.7136f, -0.7665f, 1.7136f, -1.7136f)
                curveToRelative(0.0f, -1.2843f, 0.4275f, -1.7135f, 1.7135f, -1.7135f)
                curveToRelative(0.9454f, 0.0f, 1.7136f, -0.7665f, 1.7136f, -1.7136f)
                curveToRelative(0.0f, -1.2843f, 0.4275f, -1.7135f, 1.7135f, -1.7135f)
                curveToRelative(0.9454f, 0.0f, 1.7136f, -0.7666f, 1.7136f, -1.7136f)
                curveToRelative(0.0f, -0.9454f, -0.7682f, -1.7136f, -1.7136f, -1.7136f)
                close()
                moveTo(8.5694f, 6.8593f)
                curveToRelative(-0.9453f, 0.0f, -1.7135f, 0.7665f, -1.7135f, 1.7136f)
                curveToRelative(0.0f, 1.2843f, -0.4275f, 1.7136f, -1.7135f, 1.7136f)
                curveToRelative(-0.9454f, 0.0f, -1.7136f, 0.7664f, -1.7136f, 1.7135f)
                curveToRelative(0.0f, 0.947f, 0.77f, 1.7135f, 1.7153f, 1.7135f)
                reflectiveCurveTo(6.8576f, 12.9471f, 6.8576f, 12.0f)
                curveToRelative(0.0f, -1.2843f, 0.4293f, -1.7135f, 1.7136f, -1.7135f)
                reflectiveCurveToRelative(1.7136f, 0.4275f, 1.7136f, 1.7135f)
                curveToRelative(0.0f, 0.947f, 0.7698f, 1.7135f, 1.7152f, 1.7135f)
                curveToRelative(0.9453f, 0.0f, 1.7135f, -0.7664f, 1.7135f, -1.7135f)
                curveToRelative(0.0f, -0.9454f, -0.7664f, -1.7135f, -1.7169f, -1.7135f)
                curveToRelative(-1.2843f, 0.0f, -1.7135f, -0.4276f, -1.7135f, -1.7136f)
                curveToRelative(0.0f, -0.9453f, -0.7683f, -1.7136f, -1.7136f, -1.7136f)
                close()
                moveTo(1.7135f, 13.7153f)
                arcTo(1.7136f, 1.7136f, 0.0f, false, false, 0.0f, 15.4287f)
                arcToRelative(1.7136f, 1.7136f, 0.0f, false, false, 1.7135f, 1.7136f)
                arcToRelative(1.7136f, 1.7136f, 0.0f, false, false, 1.7136f, -1.7136f)
                arcToRelative(1.7136f, 1.7136f, 0.0f, false, false, -1.7135f, -1.7136f)
                close()
            }
        }
        .build()
        return _nano!!
    }

private var _nano: ImageVector? = null
