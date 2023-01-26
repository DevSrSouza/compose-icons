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

public val RoundGroup.SensorsOff: ImageVector
    get() {
        if (_sensorsOff != null) {
            return _sensorsOff!!
        }
        _sensorsOff = Builder(name = "SensorsOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.68f, 18.32f)
                curveToRelative(-0.42f, 0.42f, -1.12f, 0.39f, -1.5f, -0.08f)
                curveTo(2.82f, 16.53f, 2.0f, 14.36f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(8.14f, 10.96f)
                curveTo(8.05f, 11.29f, 8.0f, 11.64f, 8.0f, 12.0f)
                curveToRelative(0.0f, 0.8f, 0.24f, 1.55f, 0.64f, 2.17f)
                curveToRelative(0.27f, 0.41f, 0.24f, 0.94f, -0.1f, 1.29f)
                curveToRelative(-0.43f, 0.43f, -1.17f, 0.4f, -1.51f, -0.11f)
                curveTo(6.38f, 14.4f, 6.0f, 13.24f, 6.0f, 12.0f)
                curveToRelative(0.0f, -0.93f, 0.21f, -1.8f, 0.58f, -2.59f)
                lineTo(5.11f, 7.94f)
                curveTo(4.4f, 9.13f, 4.0f, 10.52f, 4.0f, 12.0f)
                curveToRelative(0.0f, 1.89f, 0.66f, 3.63f, 1.76f, 5.0f)
                curveTo(6.08f, 17.39f, 6.04f, 17.96f, 5.68f, 18.32f)
                close()
                moveTo(15.46f, 8.54f)
                curveToRelative(-0.35f, 0.35f, -0.37f, 0.88f, -0.11f, 1.29f)
                curveTo(15.76f, 10.45f, 16.0f, 11.2f, 16.0f, 12.0f)
                curveToRelative(0.0f, 0.36f, -0.05f, 0.71f, -0.14f, 1.04f)
                lineToRelative(1.55f, 1.55f)
                curveTo(17.79f, 13.8f, 18.0f, 12.93f, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.24f, -0.38f, -2.4f, -1.03f, -3.36f)
                curveTo(16.63f, 8.14f, 15.9f, 8.1f, 15.46f, 8.54f)
                close()
                moveTo(18.32f, 5.68f)
                curveToRelative(-0.36f, 0.36f, -0.4f, 0.92f, -0.08f, 1.32f)
                curveToRelative(1.1f, 1.37f, 1.76f, 3.11f, 1.76f, 5.0f)
                curveToRelative(0.0f, 1.48f, -0.4f, 2.87f, -1.11f, 4.06f)
                lineToRelative(1.45f, 1.45f)
                curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f)
                curveToRelative(0.0f, -2.36f, -0.82f, -4.53f, -2.18f, -6.24f)
                curveTo(19.44f, 5.29f, 18.74f, 5.26f, 18.32f, 5.68f)
                close()
            }
        }
        .build()
        return _sensorsOff!!
    }

private var _sensorsOff: ImageVector? = null
