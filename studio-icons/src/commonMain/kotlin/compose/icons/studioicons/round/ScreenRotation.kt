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

public val RoundGroup.ScreenRotation: ImageVector
    get() {
        if (_screenRotation != null) {
            return _screenRotation!!
        }
        _screenRotation = Builder(name = "ScreenRotation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.23f, 1.75f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineTo(1.75f, 8.11f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(12.02f, 12.02f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                lineTo(10.23f, 1.75f)
                close()
                moveTo(14.12f, 20.48f)
                lineTo(3.52f, 9.88f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(4.95f, -4.95f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(10.61f, 10.61f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-4.95f, 4.95f)
                curveToRelative(-0.39f, 0.38f, -1.03f, 0.38f, -1.42f, -0.01f)
                close()
                moveTo(17.61f, 1.4f)
                curveTo(16.04f, 0.57f, 14.06f, -0.03f, 11.81f, 0.02f)
                curveToRelative(-0.18f, 0.0f, -0.26f, 0.22f, -0.14f, 0.35f)
                lineToRelative(3.48f, 3.48f)
                lineToRelative(1.33f, -1.33f)
                curveToRelative(3.09f, 1.46f, 5.34f, 4.37f, 5.89f, 7.86f)
                curveToRelative(0.06f, 0.41f, 0.44f, 0.69f, 0.86f, 0.62f)
                curveToRelative(0.41f, -0.06f, 0.69f, -0.45f, 0.62f, -0.86f)
                curveToRelative(-0.6f, -3.8f, -2.96f, -7.0f, -6.24f, -8.74f)
                close()
                moveTo(8.85f, 20.16f)
                lineToRelative(-1.33f, 1.33f)
                curveToRelative(-3.09f, -1.46f, -5.34f, -4.37f, -5.89f, -7.86f)
                curveToRelative(-0.06f, -0.41f, -0.44f, -0.69f, -0.86f, -0.62f)
                curveToRelative(-0.41f, 0.06f, -0.69f, 0.45f, -0.62f, 0.86f)
                curveToRelative(0.6f, 3.81f, 2.96f, 7.01f, 6.24f, 8.75f)
                curveToRelative(1.57f, 0.83f, 3.55f, 1.43f, 5.8f, 1.38f)
                curveToRelative(0.18f, 0.0f, 0.26f, -0.22f, 0.14f, -0.35f)
                lineToRelative(-3.48f, -3.49f)
                close()
            }
        }
        .build()
        return _screenRotation!!
    }

private var _screenRotation: ImageVector? = null
