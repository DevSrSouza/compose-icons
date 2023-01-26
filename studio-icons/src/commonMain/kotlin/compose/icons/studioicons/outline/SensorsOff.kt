package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SensorsOff: ImageVector
    get() {
        if (_sensorsOff != null) {
            return _sensorsOff!!
        }
        _sensorsOff = Builder(name = "SensorsOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.14f, 10.96f)
                curveTo(8.05f, 11.29f, 8.0f, 11.64f, 8.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(6.67f, 15.16f, 6.0f, 13.66f, 6.0f, 12.0f)
                curveToRelative(0.0f, -0.93f, 0.21f, -1.8f, 0.58f, -2.59f)
                lineTo(5.11f, 7.94f)
                curveTo(4.4f, 9.13f, 4.0f, 10.52f, 4.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, 0.9f, 4.21f, 2.35f, 5.65f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(3.12f, 17.26f, 2.0f, 14.76f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(8.14f, 10.96f)
                close()
                moveTo(17.42f, 14.59f)
                curveTo(17.79f, 13.8f, 18.0f, 12.93f, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.66f, -0.67f, -3.16f, -1.76f, -4.24f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f)
                curveToRelative(0.0f, 0.36f, -0.05f, 0.71f, -0.14f, 1.04f)
                lineTo(17.42f, 14.59f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 1.48f, -0.4f, 2.87f, -1.11f, 4.06f)
                lineToRelative(1.45f, 1.45f)
                curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f)
                curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sensorsOff!!
    }

private var _sensorsOff: ImageVector? = null
