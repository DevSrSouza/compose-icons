package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.45f, 8.0f)
                curveToRelative(66.27f, 0.12f, 126.44f, 26.23f, 170.86f, 68.68f)
                lineToRelative(35.72f, -35.72f)
                curveTo(478.15f, 25.85f, 504.0f, 36.56f, 504.0f, 57.94f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(345.94f)
                curveToRelative(-21.38f, 0.0f, -32.09f, -25.85f, -16.97f, -40.97f)
                lineToRelative(41.75f, -41.75f)
                curveToRelative(-30.86f, -28.9f, -70.8f, -44.91f, -113.23f, -45.27f)
                curveToRelative(-92.4f, -0.8f, -170.28f, 73.98f, -169.48f, 169.44f)
                curveTo(88.76f, 348.01f, 162.18f, 424.0f, 256.0f, 424.0f)
                curveToRelative(41.13f, 0.0f, 80.0f, -14.68f, 110.63f, -41.56f)
                curveToRelative(4.74f, -4.16f, 11.91f, -3.91f, 16.37f, 0.55f)
                lineToRelative(39.66f, 39.66f)
                curveToRelative(4.87f, 4.87f, 4.63f, 12.81f, -0.48f, 17.43f)
                curveTo(378.2f, 479.81f, 319.93f, 504.0f, 256.0f, 504.0f)
                curveTo(119.03f, 504.0f, 8.0f, 392.97f, 8.0f, 256.0f)
                curveTo(8.0f, 119.19f, 119.65f, 7.76f, 256.45f, 8.0f)
                close()
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null
