package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Influxdb: ImageVector
    get() {
        if (_influxdb != null) {
            return _influxdb!!
        }
        _influxdb = Builder(name = "Influxdb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.778f, 14.482f)
                lineToRelative(-2.287f, -9.959f)
                curveToRelative(-0.13f, -0.545f, -0.624f, -1.09f, -1.169f, -1.248f)
                lineTo(9.87f, 0.051f)
                curveTo(9.74f, 0.0f, 9.584f, 0.0f, 9.426f, 0.0f)
                curveToRelative(-0.443f, 0.0f, -0.909f, 0.18f, -1.222f, 0.443f)
                lineTo(0.716f, 7.412f)
                curveTo(0.3f, 7.776f, 0.092f, 8.504f, 0.222f, 9.024f)
                lineToRelative(2.445f, 10.662f)
                curveToRelative(0.13f, 0.545f, 0.624f, 1.092f, 1.169f, 1.248f)
                lineToRelative(9.775f, 3.015f)
                curveToRelative(0.13f, 0.051f, 0.285f, 0.051f, 0.443f, 0.051f)
                curveToRelative(0.443f, 0.0f, 0.91f, -0.18f, 1.223f, -0.443f)
                lineToRelative(8.007f, -7.435f)
                curveToRelative(0.418f, -0.39f, 0.624f, -1.092f, 0.494f, -1.64f)
                close()
                moveTo(10.962f, 2.417f)
                lineToRelative(7.175f, 2.21f)
                curveToRelative(0.285f, 0.08f, 0.285f, 0.21f, 0.0f, 0.286f)
                lineToRelative(-3.77f, 0.858f)
                curveToRelative(-0.285f, 0.08f, -0.674f, -0.05f, -0.883f, -0.26f)
                lineToRelative(-2.626f, -2.834f)
                curveToRelative(-0.235f, -0.232f, -0.184f, -0.336f, 0.104f, -0.26f)
                close()
                moveTo(15.432f, 15.289f)
                curveToRelative(0.079f, 0.286f, -0.105f, 0.444f, -0.39f, 0.365f)
                lineToRelative(-7.748f, -2.392f)
                curveToRelative(-0.285f, -0.079f, -0.338f, -0.313f, -0.13f, -0.52f)
                lineToRelative(5.93f, -5.514f)
                curveToRelative(0.209f, -0.209f, 0.443f, -0.13f, 0.52f, 0.156f)
                close()
                moveTo(2.667f, 8.267f)
                lineToRelative(6.293f, -5.85f)
                curveToRelative(0.21f, -0.209f, 0.545f, -0.18f, 0.754f, 0.025f)
                lineTo(12.86f, 5.85f)
                curveToRelative(0.209f, 0.21f, 0.18f, 0.545f, -0.026f, 0.754f)
                lineToRelative(-6.293f, 5.85f)
                curveToRelative(-0.21f, 0.21f, -0.545f, 0.181f, -0.754f, -0.025f)
                lineTo(2.64f, 9.024f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, 0.026f, -0.757f)
                close()
                moveTo(4.203f, 17.551f)
                lineTo(2.54f, 10.244f)
                curveToRelative(-0.08f, -0.285f, 0.05f, -0.34f, 0.234f, -0.13f)
                lineTo(5.4f, 12.949f)
                curveToRelative(0.209f, 0.209f, 0.285f, 0.624f, 0.209f, 0.909f)
                lineTo(4.462f, 17.55f)
                curveToRelative(-0.079f, 0.285f, -0.208f, 0.285f, -0.26f, 0.0f)
                close()
                moveTo(13.405f, 21.815f)
                lineToRelative(-8.217f, -2.522f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, -0.364f, -0.675f)
                lineToRelative(1.378f, -4.421f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, 0.675f, -0.365f)
                lineToRelative(8.216f, 2.522f)
                curveToRelative(0.285f, 0.079f, 0.443f, 0.39f, 0.364f, 0.675f)
                lineTo(14.08f, 21.45f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, true, -0.674f, 0.365f)
                close()
                moveTo(20.684f, 15.835f)
                lineTo(15.2f, 20.93f)
                curveToRelative(-0.209f, 0.209f, -0.31f, 0.13f, -0.234f, -0.155f)
                lineToRelative(1.144f, -3.694f)
                curveToRelative(0.079f, -0.285f, 0.39f, -0.573f, 0.674f, -0.624f)
                lineToRelative(3.77f, -0.858f)
                curveToRelative(0.288f, -0.076f, 0.339f, 0.054f, 0.13f, 0.234f)
                close()
                moveTo(21.282f, 14.745f)
                lineToRelative(-4.523f, 1.039f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, -0.65f, -0.39f)
                lineToRelative(-1.922f, -8.372f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.39f, -0.65f)
                lineTo(19.1f, 5.335f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.649f, 0.39f)
                lineToRelative(1.923f, 8.371f)
                curveToRelative(0.079f, 0.31f, -0.102f, 0.596f, -0.39f, 0.65f)
                close()
            }
        }
        .build()
        return _influxdb!!
    }

private var _influxdb: ImageVector? = null
