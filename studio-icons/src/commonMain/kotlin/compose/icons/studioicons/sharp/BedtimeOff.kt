package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BedtimeOff: ImageVector
    get() {
        if (_bedtimeOff != null) {
            return _bedtimeOff!!
        }
        _bedtimeOff = Builder(name = "BedtimeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.27f, 2.27f)
                curveTo(2.61f, 8.08f, 2.0f, 9.97f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.04f, 0.0f, 3.93f, -0.62f, 5.51f, -1.66f)
                lineToRelative(2.27f, 2.27f)
                lineTo(21.19f, 21.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.34f, 2.02f)
                curveToRelative(-2.18f, -0.07f, -4.19f, 0.55f, -5.85f, 1.64f)
                lineToRelative(4.59f, 4.59f)
                curveTo(10.81f, 6.2f, 11.18f, 4.03f, 12.34f, 2.02f)
                close()
            }
        }
        .build()
        return _bedtimeOff!!
    }

private var _bedtimeOff: ImageVector? = null
