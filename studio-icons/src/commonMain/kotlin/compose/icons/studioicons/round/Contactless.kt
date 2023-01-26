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

public val RoundGroup.Contactless: ImageVector
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
                moveTo(8.75f, 13.68f)
                curveToRelative(-0.13f, 0.43f, -0.62f, 0.63f, -1.02f, 0.45f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.34f, -0.16f, -0.51f, -0.54f, -0.4f, -0.9f)
                curveToRelative(0.12f, -0.41f, 0.18f, -0.83f, 0.17f, -1.24f)
                curveToRelative(-0.01f, -0.41f, -0.06f, -0.8f, -0.17f, -1.18f)
                curveToRelative(-0.1f, -0.36f, 0.06f, -0.75f, 0.4f, -0.9f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.42f, -0.19f, 0.91f, 0.04f, 1.04f, 0.49f)
                curveToRelative(0.15f, 0.51f, 0.22f, 1.03f, 0.23f, 1.57f)
                curveTo(9.0f, 12.53f, 8.92f, 13.11f, 8.75f, 13.68f)
                close()
                moveTo(11.89f, 15.27f)
                curveToRelative(-0.17f, 0.41f, -0.67f, 0.57f, -1.06f, 0.35f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.33f, -0.19f, -0.46f, -0.59f, -0.32f, -0.94f)
                curveToRelative(0.33f, -0.77f, 0.49f, -1.63f, 0.49f, -2.56f)
                curveToRelative(0.0f, -0.96f, -0.18f, -1.89f, -0.53f, -2.78f)
                curveToRelative(-0.14f, -0.36f, 0.02f, -0.76f, 0.36f, -0.94f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.2f, 0.87f, -0.02f, 1.03f, 0.39f)
                curveToRelative(0.42f, 1.06f, 0.63f, 2.18f, 0.63f, 3.33f)
                curveTo(12.51f, 13.25f, 12.3f, 14.31f, 11.89f, 15.27f)
                close()
                moveTo(15.0f, 16.6f)
                curveToRelative(-0.17f, 0.4f, -0.64f, 0.58f, -1.02f, 0.39f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.35f, -0.17f, -0.52f, -0.59f, -0.37f, -0.95f)
                curveToRelative(0.59f, -1.39f, 0.89f, -2.75f, 0.89f, -4.06f)
                curveToRelative(0.0f, -1.31f, -0.3f, -2.65f, -0.88f, -4.01f)
                curveToRelative(-0.16f, -0.36f, 0.01f, -0.78f, 0.36f, -0.95f)
                curveTo(14.37f, 6.82f, 14.83f, 7.0f, 15.0f, 7.4f)
                curveToRelative(0.66f, 1.54f, 1.0f, 3.08f, 1.0f, 4.58f)
                curveTo(16.0f, 13.48f, 15.66f, 15.04f, 15.0f, 16.6f)
                close()
            }
        }
        .build()
        return _contactless!!
    }

private var _contactless: ImageVector? = null
