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

public val RoundGroup.RingVolume: ImageVector
    get() {
        if (_ringVolume != null) {
            return _ringVolume!!
        }
        _ringVolume = Builder(name = "RingVolume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.98f, 7.0f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.98f)
                lineTo(13.0f, 2.98f)
                curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f)
                verticalLineToRelative(3.03f)
                curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.98f, 0.99f)
                close()
                moveTo(16.9f, 9.11f)
                curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f)
                curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f)
                curveToRelative(0.39f, -0.38f, 0.39f, -1.01f, 0.0f, -1.39f)
                curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f)
                lineTo(16.89f, 7.7f)
                curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f)
                lineToRelative(0.01f, 0.02f)
                close()
                moveTo(5.71f, 9.1f)
                curveToRelative(0.38f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f)
                curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f)
                lineTo(4.96f, 5.54f)
                curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f)
                lineToRelative(-0.02f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f)
                curveToRelative(0.63f, 0.62f, 1.54f, 1.53f, 2.16f, 2.16f)
                close()
                moveTo(23.29f, 16.23f)
                curveToRelative(-6.41f, -5.66f, -16.07f, -5.66f, -22.48f, 0.0f)
                curveToRelative(-0.85f, 0.75f, -0.85f, 2.08f, -0.05f, 2.88f)
                lineToRelative(1.22f, 1.22f)
                curveToRelative(0.72f, 0.72f, 1.86f, 0.78f, 2.66f, 0.15f)
                lineToRelative(2.0f, -1.59f)
                curveToRelative(0.48f, -0.38f, 0.76f, -0.96f, 0.76f, -1.57f)
                verticalLineToRelative(-2.6f)
                curveToRelative(3.02f, -0.98f, 6.29f, -0.99f, 9.32f, 0.0f)
                verticalLineToRelative(2.61f)
                curveToRelative(0.0f, 0.61f, 0.28f, 1.19f, 0.76f, 1.57f)
                lineToRelative(1.99f, 1.58f)
                curveToRelative(0.8f, 0.63f, 1.94f, 0.57f, 2.66f, -0.15f)
                lineToRelative(1.22f, -1.22f)
                curveToRelative(0.79f, -0.8f, 0.79f, -2.13f, -0.06f, -2.88f)
                close()
            }
        }
        .build()
        return _ringVolume!!
    }

private var _ringVolume: ImageVector? = null
