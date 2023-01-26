package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Contactless: ImageVector
    get() {
        if (_contactless != null) {
            return _contactless!!
        }
        _contactless = Builder(name = "Contactless", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.46f, 14.45f)
                lineTo(7.1f, 13.83f)
                curveToRelative(0.28f, -0.61f, 0.41f, -1.24f, 0.4f, -1.86f)
                curveToRelative(-0.01f, -0.63f, -0.14f, -1.24f, -0.4f, -1.8f)
                lineToRelative(1.36f, -0.63f)
                curveToRelative(0.35f, 0.75f, 0.53f, 1.56f, 0.54f, 2.4f)
                curveTo(9.01f, 12.8f, 8.83f, 13.64f, 8.46f, 14.45f)
                close()
                moveTo(11.53f, 16.01f)
                lineToRelative(-1.3f, -0.74f)
                curveToRelative(0.52f, -0.92f, 0.78f, -1.98f, 0.78f, -3.15f)
                curveToRelative(0.0f, -1.19f, -0.27f, -2.33f, -0.8f, -3.4f)
                lineToRelative(1.34f, -0.67f)
                curveToRelative(0.64f, 1.28f, 0.96f, 2.65f, 0.96f, 4.07f)
                curveTo(12.51f, 13.55f, 12.18f, 14.86f, 11.53f, 16.01f)
                close()
                moveTo(14.67f, 17.33f)
                lineToRelative(-1.35f, -0.66f)
                curveToRelative(0.78f, -1.6f, 1.18f, -3.18f, 1.18f, -4.69f)
                curveToRelative(0.0f, -1.51f, -0.4f, -3.07f, -1.18f, -4.64f)
                lineToRelative(1.34f, -0.67f)
                curveTo(15.56f, 8.45f, 16.0f, 10.23f, 16.0f, 11.98f)
                curveTo(16.0f, 13.72f, 15.56f, 15.52f, 14.67f, 17.33f)
                close()
            }
        }
        .build()
        return _contactless!!
    }

private var _contactless: ImageVector? = null
