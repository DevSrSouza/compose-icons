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
                moveTo(22.286f, 6.858f)
                curveToRelative(-0.945f, 0.0f, -1.714f, 0.766f, -1.714f, 1.714f)
                curveToRelative(0.0f, 1.284f, -0.428f, 1.714f, -1.714f, 1.714f)
                curveToRelative(-0.945f, 0.0f, -1.714f, 0.766f, -1.714f, 1.714f)
                curveToRelative(0.0f, 1.284f, -0.428f, 1.714f, -1.714f, 1.714f)
                curveToRelative(-0.945f, 0.0f, -1.714f, 0.766f, -1.714f, 1.714f)
                curveToRelative(0.0f, 0.945f, 0.766f, 1.714f, 1.714f, 1.714f)
                curveToRelative(0.945f, 0.0f, 1.714f, -0.766f, 1.714f, -1.714f)
                curveToRelative(0.0f, -1.284f, 0.428f, -1.714f, 1.714f, -1.714f)
                curveToRelative(0.945f, 0.0f, 1.714f, -0.766f, 1.714f, -1.714f)
                curveToRelative(0.0f, -1.284f, 0.428f, -1.714f, 1.714f, -1.714f)
                curveToRelative(0.945f, 0.0f, 1.714f, -0.767f, 1.714f, -1.714f)
                curveToRelative(0.0f, -0.945f, -0.768f, -1.714f, -1.714f, -1.714f)
                close()
                moveTo(8.569f, 6.859f)
                curveToRelative(-0.945f, 0.0f, -1.714f, 0.766f, -1.714f, 1.714f)
                curveToRelative(0.0f, 1.284f, -0.428f, 1.714f, -1.714f, 1.714f)
                curveToRelative(-0.945f, 0.0f, -1.714f, 0.766f, -1.714f, 1.714f)
                curveToRelative(0.0f, 0.947f, 0.77f, 1.714f, 1.715f, 1.714f)
                reflectiveCurveTo(6.858f, 12.947f, 6.858f, 12.0f)
                curveToRelative(0.0f, -1.284f, 0.429f, -1.714f, 1.714f, -1.714f)
                reflectiveCurveToRelative(1.714f, 0.428f, 1.714f, 1.714f)
                curveToRelative(0.0f, 0.947f, 0.77f, 1.714f, 1.715f, 1.714f)
                curveToRelative(0.945f, 0.0f, 1.714f, -0.766f, 1.714f, -1.714f)
                curveToRelative(0.0f, -0.945f, -0.766f, -1.714f, -1.717f, -1.714f)
                curveToRelative(-1.284f, 0.0f, -1.714f, -0.428f, -1.714f, -1.714f)
                curveToRelative(0.0f, -0.945f, -0.768f, -1.714f, -1.714f, -1.714f)
                close()
                moveTo(1.714f, 13.715f)
                arcTo(1.714f, 1.714f, 0.0f, false, false, 0.0f, 15.429f)
                arcToRelative(1.714f, 1.714f, 0.0f, false, false, 1.714f, 1.714f)
                arcToRelative(1.714f, 1.714f, 0.0f, false, false, 1.714f, -1.714f)
                arcToRelative(1.714f, 1.714f, 0.0f, false, false, -1.714f, -1.714f)
                close()
            }
        }
        .build()
        return _nano!!
    }

private var _nano: ImageVector? = null
