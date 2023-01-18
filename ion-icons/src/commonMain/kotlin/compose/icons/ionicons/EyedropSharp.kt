package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.EyedropSharp: ImageVector
    get() {
        if (_eyedropSharp != null) {
            return _eyedropSharp!!
        }
        _eyedropSharp = Builder(name = "EyedropSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 96.22f)
                arcToRelative(63.84f, 63.84f, 0.0f, false, false, -18.95f, -45.61f)
                arcToRelative(65.0f, 65.0f, 0.0f, false, false, -45.71f, -19.0f)
                horizontalLineToRelative(-0.76f)
                arcToRelative(61.78f, 61.78f, 0.0f, false, false, -44.22f, 19.09f)
                lineToRelative(-74.88f, 74.88f)
                lineTo(261.6f, 91.72f)
                lineToRelative(-34.07f, 33.91f)
                lineToRelative(-33.85f, 34.0f)
                lineToRelative(44.0f, 44.0f)
                lineTo(32.0f, 409.37f)
                verticalLineTo(480.0f)
                horizontalLineToRelative(70.63f)
                lineToRelative(205.7f, -205.71f)
                lineTo(352.0f, 317.94f)
                lineToRelative(11.31f, -11.19f)
                curveToRelative(0.11f, -0.1f, 10.42f, -10.31f, 22.79f, -22.68f)
                lineToRelative(33.85f, -34.0f)
                lineToRelative(-33.89f, -33.89f)
                lineTo(461.0f, 141.23f)
                arcTo(63.18f, 63.18f, 0.0f, false, false, 480.0f, 96.22f)
                close()
                moveTo(245.0f, 292.35f)
                lineTo(219.65f, 267.0f)
                lineToRelative(40.68f, -40.69f)
                lineToRelative(25.38f, 25.38f)
                close()
            }
        }
        .build()
        return _eyedropSharp!!
    }

private var _eyedropSharp: ImageVector? = null
