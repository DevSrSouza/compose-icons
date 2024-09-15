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

public val SolidGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 255.53f)
                curveToRelative(0.25f, 136.64f, -111.18f, 248.37f, -247.82f, 248.47f)
                curveToRelative(-59.01f, 0.04f, -113.22f, -20.53f, -155.82f, -54.91f)
                curveToRelative(-11.08f, -8.94f, -11.9f, -25.54f, -1.84f, -35.61f)
                lineToRelative(11.27f, -11.27f)
                curveToRelative(8.61f, -8.61f, 22.35f, -9.55f, 31.89f, -1.98f)
                curveTo(173.06f, 425.14f, 212.78f, 440.0f, 256.0f, 440.0f)
                curveToRelative(101.71f, 0.0f, 184.0f, -82.31f, 184.0f, -184.0f)
                curveToRelative(0.0f, -101.71f, -82.31f, -184.0f, -184.0f, -184.0f)
                curveToRelative(-48.81f, 0.0f, -93.15f, 18.97f, -126.07f, 49.93f)
                lineToRelative(50.75f, 50.75f)
                curveToRelative(10.08f, 10.08f, 2.94f, 27.31f, -11.31f, 27.31f)
                lineTo(24.0f, 200.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                lineTo(8.0f, 38.63f)
                curveToRelative(0.0f, -14.25f, 17.23f, -21.39f, 27.31f, -11.31f)
                lineToRelative(49.37f, 49.37f)
                curveTo(129.21f, 34.14f, 189.55f, 8.0f, 256.0f, 8.0f)
                curveToRelative(136.81f, 0.0f, 247.75f, 110.78f, 248.0f, 247.53f)
                close()
                moveTo(323.09f, 334.32f)
                lineToRelative(9.82f, -12.63f)
                curveToRelative(8.14f, -10.46f, 6.25f, -25.54f, -4.21f, -33.68f)
                lineTo(288.0f, 256.35f)
                lineTo(288.0f, 152.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(135.65f)
                lineToRelative(65.41f, 50.87f)
                curveToRelative(10.46f, 8.14f, 25.54f, 6.25f, 33.68f, -4.21f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
