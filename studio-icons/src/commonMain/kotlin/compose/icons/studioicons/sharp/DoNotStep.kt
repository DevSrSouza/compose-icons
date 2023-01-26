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

public val SharpGroup.DoNotStep: ImageVector
    get() {
        if (_doNotStep != null) {
            return _doNotStep!!
        }
        _doNotStep = Builder(name = "DoNotStep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineToRelative(8.24f, 8.24f)
                lineToRelative(-0.69f, 0.72f)
                lineTo(6.87f, 11.1f)
                curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f)
                lineToRelative(1.75f, 1.75f)
                lineToRelative(-0.69f, 0.72f)
                lineToRelative(-1.63f, -1.63f)
                curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f)
                lineToRelative(1.63f, 1.63f)
                lineToRelative(-0.7f, 0.72f)
                lineToRelative(-1.74f, -1.74f)
                curveTo(2.83f, 15.43f, 1.34f, 15.82f, 1.0f, 15.92f)
                lineTo(1.0f, 20.0f)
                horizontalLineToRelative(9.5f)
                lineToRelative(3.33f, -3.33f)
                lineToRelative(5.94f, 5.94f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(18.51f, 15.68f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.48f, -4.48f)
                lineTo(23.0f, 11.2f)
                lineTo(18.51f, 15.68f)
                close()
                moveTo(20.88f, 9.08f)
                lineToRelative(-4.48f, 4.48f)
                lineTo(9.3f, 6.47f)
                lineTo(13.8f, 2.0f)
                lineTo(20.88f, 9.08f)
                close()
            }
        }
        .build()
        return _doNotStep!!
    }

private var _doNotStep: ImageVector? = null
