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

public val SimpleIcons.Oxygen: ImageVector
    get() {
        if (_oxygen != null) {
            return _oxygen!!
        }
        _oxygen = Builder(name = "Oxygen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.89f, 12.0f)
                curveToRelative(0.0f, -6.627f, -5.324f, -12.0f, -11.89f, -12.0f)
                reflectiveCurveTo(0.109f, 5.373f, 0.109f, 12.0f)
                reflectiveCurveTo(5.433f, 24.0f, 12.0f, 24.0f)
                curveToRelative(2.014f, 0.0f, 3.91f, -0.508f, 5.573f, -1.4f)
                curveToRelative(0.62f, 0.354f, 1.338f, 0.558f, 2.105f, 0.558f)
                curveToRelative(2.326f, 0.0f, 4.212f, -1.865f, 4.212f, -4.165f)
                curveToRelative(0.0f, -0.946f, -0.319f, -1.818f, -0.857f, -2.517f)
                curveToRelative(0.552f, -1.383f, 0.857f, -2.894f, 0.857f, -4.476f)
                close()
                moveTo(2.488f, 12.005f)
                curveToRelative(0.0f, -5.448f, 4.269f, -9.864f, 9.535f, -9.864f)
                reflectiveCurveToRelative(9.535f, 4.416f, 9.535f, 9.864f)
                curveToRelative(0.0f, 1.07f, -0.166f, 2.099f, -0.471f, 3.063f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, false, -1.408f, -0.239f)
                curveToRelative(-2.326f, 0.0f, -4.212f, 1.865f, -4.212f, 4.165f)
                curveToRelative(0.0f, 0.72f, 0.185f, 1.397f, 0.51f, 1.988f)
                arcToRelative(9.21f, 9.21f, 0.0f, false, true, -3.953f, 0.888f)
                curveToRelative(-5.267f, -0.001f, -9.536f, -4.418f, -9.536f, -9.865f)
                close()
                moveTo(19.679f, 21.869f)
                curveToRelative(-1.514f, 0.021f, -2.84f, -1.267f, -2.819f, -2.788f)
                curveToRelative(0.0f, -1.54f, 1.262f, -2.788f, 2.819f, -2.788f)
                curveToRelative(1.507f, -0.025f, 2.843f, 1.27f, 2.819f, 2.788f)
                curveToRelative(0.0f, 1.54f, -1.263f, 2.788f, -2.819f, 2.788f)
                close()
            }
        }
        .build()
        return _oxygen!!
    }

private var _oxygen: ImageVector? = null
