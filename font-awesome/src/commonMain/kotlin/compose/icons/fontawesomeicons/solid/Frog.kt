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

public val SolidGroup.Frog: ImageVector
    get() {
        if (_frog != null) {
            return _frog!!
        }
        _frog = Builder(name = "Frog", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(446.53f, 97.43f)
                curveTo(439.67f, 60.23f, 407.19f, 32.0f, 368.0f, 32.0f)
                curveToRelative(-39.23f, 0.0f, -71.72f, 28.29f, -78.54f, 65.54f)
                curveTo(126.75f, 112.96f, -0.5f, 250.12f, 0.0f, 416.98f)
                curveTo(0.11f, 451.9f, 29.08f, 480.0f, 64.0f, 480.0f)
                horizontalLineToRelative(304.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-79.49f)
                lineToRelative(35.8f, -48.33f)
                curveToRelative(24.14f, -36.23f, 10.35f, -88.28f, -33.71f, -106.6f)
                curveToRelative(-23.89f, -9.93f, -51.55f, -4.65f, -72.24f, 10.88f)
                lineToRelative(-32.76f, 24.59f)
                curveToRelative(-7.06f, 5.31f, -17.09f, 3.91f, -22.41f, -3.19f)
                curveToRelative(-5.3f, -7.08f, -3.88f, -17.11f, 3.19f, -22.41f)
                lineToRelative(34.78f, -26.09f)
                curveToRelative(36.84f, -27.66f, 88.28f, -27.62f, 125.13f, 0.0f)
                curveToRelative(10.87f, 8.15f, 45.87f, 39.06f, 40.8f, 93.21f)
                lineTo(469.62f, 480.0f)
                horizontalLineTo(560.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-53.63f)
                lineToRelative(-98.52f, -104.68f)
                lineToRelative(154.44f, -86.65f)
                arcTo(58.16f, 58.16f, 0.0f, false, false, 576.0f, 189.94f)
                curveToRelative(0.0f, -21.4f, -11.72f, -40.95f, -30.48f, -51.23f)
                curveToRelative(-40.56f, -22.22f, -98.99f, -41.28f, -98.99f, -41.28f)
                close()
                moveTo(368.0f, 136.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _frog!!
    }

private var _frog: ImageVector? = null
