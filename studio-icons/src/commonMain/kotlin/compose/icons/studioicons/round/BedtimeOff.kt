package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BedtimeOff: ImageVector
    get() {
        if (_bedtimeOff != null) {
            return _bedtimeOff!!
        }
        _bedtimeOff = Builder(name = "BedtimeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.65f, 3.46f)
                curveToRelative(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f)
                curveTo(9.05f, 2.33f, 7.68f, 2.88f, 6.49f, 3.66f)
                lineToRelative(4.59f, 4.59f)
                curveTo(10.88f, 6.69f, 11.04f, 5.05f, 11.65f, 3.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 3.51f)
                lineTo(2.1f, 3.51f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(-1.4f, 2.11f, -2.02f, 4.77f, -1.46f, 7.56f)
                curveToRelative(0.79f, 3.94f, 3.99f, 7.07f, 7.94f, 7.78f)
                curveToRelative(2.74f, 0.49f, 5.3f, -0.15f, 7.35f, -1.51f)
                lineToRelative(1.57f, 1.57f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                close()
            }
        }
        .build()
        return _bedtimeOff!!
    }

private var _bedtimeOff: ImageVector? = null
