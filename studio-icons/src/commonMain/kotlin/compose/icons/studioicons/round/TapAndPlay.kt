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

public val RoundGroup.TapAndPlay: ImageVector
    get() {
        if (_tapAndPlay != null) {
            return _tapAndPlay!!
        }
        _tapAndPlay = Builder(name = "TapAndPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.14f, 16.09f)
                curveToRelative(-0.6f, -0.1f, -1.14f, 0.39f, -1.14f, 1.0f)
                curveToRelative(0.0f, 0.49f, 0.36f, 0.9f, 0.85f, 0.98f)
                curveToRelative(2.08f, 0.36f, 3.72f, 2.0f, 4.08f, 4.08f)
                curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f)
                curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 1.0f, -1.14f)
                curveToRelative(-0.48f, -2.95f, -2.81f, -5.29f, -5.77f, -5.77f)
                close()
                moveTo(2.0f, 20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.11f, 12.06f)
                curveToRelative(-0.59f, -0.06f, -1.11f, 0.4f, -1.11f, 0.99f)
                curveToRelative(0.0f, 0.5f, 0.37f, 0.94f, 0.87f, 0.99f)
                curveToRelative(4.27f, 0.41f, 7.67f, 3.81f, 8.08f, 8.08f)
                curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f)
                curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f)
                curveToRelative(-0.51f, -5.2f, -4.63f, -9.32f, -9.83f, -9.84f)
                close()
                moveTo(17.0f, 1.01f)
                lineTo(7.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(7.37f)
                curveToRelative(0.69f, 0.16f, 1.36f, 0.37f, 2.0f, 0.64f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(0.52f, 1.25f, 0.84f, 2.59f, 0.95f, 4.0f)
                lineTo(17.0f, 22.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(19.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f)
                close()
            }
        }
        .build()
        return _tapAndPlay!!
    }

private var _tapAndPlay: ImageVector? = null
