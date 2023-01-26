package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Call: ImageVector
    get() {
        if (_call != null) {
            return _call!!
        }
        _call = Builder(name = "Call", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.01f, 15.38f)
                curveToRelative(-1.23f, 0.0f, -2.42f, -0.2f, -3.53f, -0.56f)
                curveToRelative(-0.35f, -0.12f, -0.74f, -0.03f, -1.01f, 0.24f)
                lineToRelative(-1.57f, 1.97f)
                curveToRelative(-2.83f, -1.35f, -5.48f, -3.9f, -6.89f, -6.83f)
                lineToRelative(1.95f, -1.66f)
                curveToRelative(0.27f, -0.28f, 0.35f, -0.67f, 0.24f, -1.02f)
                curveToRelative(-0.37f, -1.11f, -0.56f, -2.3f, -0.56f, -3.53f)
                curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f)
                horizontalLineTo(4.19f)
                curveTo(3.65f, 3.0f, 3.0f, 3.24f, 3.0f, 3.99f)
                curveTo(3.0f, 13.28f, 10.73f, 21.0f, 20.01f, 21.0f)
                curveToRelative(0.71f, 0.0f, 0.99f, -0.63f, 0.99f, -1.18f)
                verticalLineToRelative(-3.45f)
                curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f)
                close()
            }
        }
        .build()
        return _call!!
    }

private var _call: ImageVector? = null
