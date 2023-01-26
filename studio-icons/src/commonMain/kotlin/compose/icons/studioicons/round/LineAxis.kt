package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.LineAxis: ImageVector
    get() {
        if (_lineAxis != null) {
            return _lineAxis!!
        }
        _lineAxis = Builder(name = "LineAxis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.34f, 6.77f)
                lineTo(21.34f, 6.77f)
                curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f)
                lineToRelative(-3.33f, 3.74f)
                lineToRelative(-5.65f, -5.24f)
                curveTo(10.12f, 4.58f, 8.9f, 4.6f, 8.14f, 5.36f)
                lineTo(2.7f, 10.81f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.09f, 0.09f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(5.44f, -5.45f)
                lineToRelative(5.59f, 5.19f)
                lineToRelative(-1.73f, 1.95f)
                lineToRelative(-2.58f, -2.58f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineTo(2.7f, 16.8f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(2.8f, 18.3f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(5.3f, -5.3f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.81f, 0.81f, 2.14f, 0.77f, 2.91f, -0.09f)
                lineToRelative(1.78f, -2.01f)
                lineToRelative(3.19f, 2.96f)
                curveToRelative(0.39f, 0.36f, 1.0f, 0.35f, 1.38f, -0.03f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.4f, -0.4f, 0.39f, -1.05f, -0.03f, -1.43f)
                lineToRelative(-3.22f, -2.99f)
                lineToRelative(3.35f, -3.77f)
                curveTo(21.73f, 7.74f, 21.71f, 7.14f, 21.34f, 6.77f)
                close()
            }
        }
        .build()
        return _lineAxis!!
    }

private var _lineAxis: ImageVector? = null
