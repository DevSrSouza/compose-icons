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

public val BaselineGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.48f, 10.41f)
                curveToRelative(-0.39f, 0.39f, -1.04f, 0.39f, -1.43f, 0.0f)
                lineToRelative(-4.47f, -4.46f)
                lineToRelative(-7.05f, 7.04f)
                lineToRelative(-0.66f, -0.63f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0.0f, -4.24f)
                lineToRelative(4.24f, -4.24f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0.0f)
                lineTo(16.48f, 9.0f)
                curveTo(16.87f, 9.39f, 16.87f, 10.02f, 16.48f, 10.41f)
                close()
                moveTo(17.18f, 8.29f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                curveToRelative(-1.27f, 1.27f, -2.61f, 0.22f, -2.83f, 0.0f)
                lineToRelative(-3.76f, -3.76f)
                lineToRelative(-5.57f, 5.57f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f)
                lineToRelative(4.62f, -4.62f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.62f, 4.62f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f)
                lineToRelative(4.62f, -4.62f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.62f, 4.62f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(4.62f, -4.62f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.62f, 4.62f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(8.32f, -8.34f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f)
                lineToRelative(-4.24f, -4.24f)
                curveToRelative(-1.15f, -1.15f, -3.01f, -1.17f, -4.18f, -0.06f)
                lineTo(17.18f, 8.29f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
