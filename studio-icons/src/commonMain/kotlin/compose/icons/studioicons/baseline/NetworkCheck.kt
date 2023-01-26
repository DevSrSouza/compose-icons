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

public val BaselineGroup.NetworkCheck: ImageVector
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
                moveTo(1.0f, 9.0f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(2.88f, -2.88f, 6.79f, -4.08f, 10.53f, -3.62f)
                lineToRelative(1.19f, -2.68f)
                curveTo(9.89f, 3.84f, 4.74f, 5.27f, 1.0f, 9.0f)
                close()
                moveTo(21.0f, 11.0f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(-1.64f, -1.64f, -3.55f, -2.82f, -5.59f, -3.57f)
                lineToRelative(-0.53f, 2.82f)
                curveToRelative(1.5f, 0.62f, 2.9f, 1.53f, 4.12f, 2.75f)
                close()
                moveTo(17.0f, 15.0f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(-0.8f, -0.8f, -1.7f, -1.42f, -2.66f, -1.89f)
                lineToRelative(-0.55f, 2.92f)
                curveToRelative(0.42f, 0.27f, 0.83f, 0.59f, 1.21f, 0.97f)
                close()
                moveTo(5.0f, 13.0f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(1.13f, -1.13f, 2.56f, -1.79f, 4.03f, -2.0f)
                lineToRelative(1.28f, -2.88f)
                curveToRelative(-2.63f, -0.08f, -5.3f, 0.87f, -7.31f, 2.88f)
                close()
            }
        }
        .build()
        return _networkCheck!!
    }

private var _networkCheck: ImageVector? = null
