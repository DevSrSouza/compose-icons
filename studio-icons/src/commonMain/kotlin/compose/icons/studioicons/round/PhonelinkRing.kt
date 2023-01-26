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

public val RoundGroup.PhonelinkRing: ImageVector
    get() {
        if (_phonelinkRing != null) {
            return _phonelinkRing!!
        }
        _phonelinkRing = Builder(name = "PhonelinkRing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                lineTo(4.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(16.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(20.63f, 8.26f)
                curveToRelative(-0.26f, -0.32f, -0.74f, -0.36f, -1.04f, -0.06f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(-0.25f, 0.25f, -0.26f, 0.65f, -0.05f, 0.93f)
                curveToRelative(1.26f, 1.64f, 1.25f, 3.87f, -0.02f, 5.57f)
                curveToRelative(-0.21f, 0.28f, -0.19f, 0.67f, 0.05f, 0.92f)
                lineToRelative(0.05f, 0.05f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.26f, 1.03f, -0.05f)
                curveToRelative(1.8f, -2.13f, 1.8f, -5.19f, 0.01f, -7.39f)
                close()
                moveTo(17.42f, 10.37f)
                lineToRelative(-0.06f, 0.06f)
                curveToRelative(-0.2f, 0.2f, -0.26f, 0.5f, -0.15f, 0.76f)
                curveToRelative(0.21f, 0.49f, 0.21f, 1.03f, 0.0f, 1.52f)
                curveToRelative(-0.11f, 0.26f, -0.05f, 0.56f, 0.15f, 0.76f)
                lineToRelative(0.08f, 0.08f)
                curveToRelative(0.32f, 0.32f, 0.87f, 0.25f, 1.09f, -0.15f)
                curveToRelative(0.49f, -0.89f, 0.49f, -1.94f, -0.01f, -2.86f)
                curveToRelative(-0.22f, -0.42f, -0.77f, -0.5f, -1.1f, -0.17f)
                close()
            }
        }
        .build()
        return _phonelinkRing!!
    }

private var _phonelinkRing: ImageVector? = null
