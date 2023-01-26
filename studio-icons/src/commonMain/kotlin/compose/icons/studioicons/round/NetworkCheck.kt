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

public val RoundGroup.NetworkCheck: ImageVector
    get() {
        if (_networkCheck != null) {
            return _networkCheck!!
        }
        _networkCheck = Builder(name = "NetworkCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9f, 5.0f)
                curveToRelative(-0.17f, 0.0f, -0.32f, 0.09f, -0.41f, 0.23f)
                lineToRelative(-0.07f, 0.15f)
                lineToRelative(-5.18f, 11.65f)
                curveToRelative(-0.16f, 0.29f, -0.26f, 0.61f, -0.26f, 0.96f)
                curveToRelative(0.0f, 1.11f, 0.9f, 2.01f, 2.01f, 2.01f)
                curveToRelative(0.96f, 0.0f, 1.77f, -0.68f, 1.96f, -1.59f)
                lineToRelative(0.01f, -0.03f)
                lineTo(16.4f, 5.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(2.06f, 10.06f)
                curveToRelative(0.51f, 0.51f, 1.33f, 0.55f, 1.89f, 0.09f)
                curveToRelative(2.76f, -2.26f, 6.24f, -3.18f, 9.58f, -2.76f)
                lineToRelative(1.19f, -2.68f)
                curveToRelative(-4.35f, -0.78f, -8.96f, 0.3f, -12.57f, 3.25f)
                curveToRelative(-0.64f, 0.53f, -0.68f, 1.51f, -0.09f, 2.1f)
                close()
                moveTo(21.94f, 10.06f)
                curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f)
                curveToRelative(-1.36f, -1.11f, -2.86f, -1.95f, -4.44f, -2.53f)
                lineToRelative(-0.53f, 2.82f)
                curveToRelative(1.13f, 0.47f, 2.19f, 1.09f, 3.17f, 1.89f)
                curveToRelative(0.58f, 0.46f, 1.39f, 0.43f, 1.9f, -0.08f)
                close()
                moveTo(17.91f, 14.09f)
                curveToRelative(0.6f, -0.6f, 0.56f, -1.63f, -0.14f, -2.12f)
                curveToRelative(-0.46f, -0.33f, -0.94f, -0.61f, -1.44f, -0.86f)
                lineToRelative(-0.55f, 2.92f)
                curveToRelative(0.11f, 0.07f, 0.22f, 0.14f, 0.32f, 0.22f)
                curveToRelative(0.57f, 0.4f, 1.33f, 0.32f, 1.81f, -0.16f)
                close()
                moveTo(6.08f, 14.08f)
                curveToRelative(0.5f, 0.5f, 1.27f, 0.54f, 1.85f, 0.13f)
                curveToRelative(0.94f, -0.66f, 2.01f, -1.06f, 3.1f, -1.22f)
                lineToRelative(1.28f, -2.88f)
                curveToRelative(-2.13f, -0.06f, -4.28f, 0.54f, -6.09f, 1.84f)
                curveToRelative(-0.69f, 0.51f, -0.74f, 1.53f, -0.14f, 2.13f)
                close()
            }
        }
        .build()
        return _networkCheck!!
    }

private var _networkCheck: ImageVector? = null
