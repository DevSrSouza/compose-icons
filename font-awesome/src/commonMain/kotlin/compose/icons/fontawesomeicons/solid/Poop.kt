package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Poop: ImageVector
    get() {
        if (_poop != null) {
            return _poop!!
        }
        _poop = Builder(name = "Poop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(451.36f, 369.14f)
                curveTo(468.66f, 355.99f, 480.0f, 335.41f, 480.0f, 312.0f)
                curveToRelative(0.0f, -39.77f, -32.24f, -72.0f, -72.0f, -72.0f)
                horizontalLineToRelative(-14.07f)
                curveToRelative(13.42f, -11.73f, 22.07f, -28.78f, 22.07f, -48.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                horizontalLineToRelative(-5.88f)
                curveToRelative(3.57f, -10.05f, 5.88f, -20.72f, 5.88f, -32.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-5.17f, 0.0f, -10.15f, 0.74f, -15.11f, 1.52f)
                curveTo(250.31f, 14.64f, 256.0f, 30.62f, 256.0f, 48.0f)
                curveToRelative(0.0f, 44.18f, -35.82f, 80.0f, -80.0f, 80.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                curveToRelative(0.0f, 19.22f, 8.65f, 36.27f, 22.07f, 48.0f)
                horizontalLineTo(104.0f)
                curveToRelative(-39.76f, 0.0f, -72.0f, 32.23f, -72.0f, 72.0f)
                curveToRelative(0.0f, 23.41f, 11.34f, 43.99f, 28.64f, 57.14f)
                curveTo(26.31f, 374.62f, 0.0f, 404.12f, 0.0f, 440.0f)
                curveToRelative(0.0f, 39.76f, 32.24f, 72.0f, 72.0f, 72.0f)
                horizontalLineToRelative(368.0f)
                curveToRelative(39.76f, 0.0f, 72.0f, -32.24f, 72.0f, -72.0f)
                curveToRelative(0.0f, -35.88f, -26.31f, -65.38f, -60.64f, -70.86f)
                close()
            }
        }
        .build()
        return _poop!!
    }

private var _poop: ImageVector? = null
