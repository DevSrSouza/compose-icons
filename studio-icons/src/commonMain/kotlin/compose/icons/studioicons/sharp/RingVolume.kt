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

public val SharpGroup.RingVolume: ImageVector
    get() {
        if (_ringVolume != null) {
            return _ringVolume!!
        }
        _ringVolume = Builder(name = "RingVolume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.16f, 6.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.56f, 3.55f)
                lineToRelative(1.41f, 1.41f)
                reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.4f, 9.81f)
                lineTo(7.81f, 8.4f)
                lineTo(4.26f, 4.84f)
                lineTo(2.84f, 6.26f)
                curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f)
                close()
                moveTo(0.0f, 17.39f)
                lineToRelative(3.68f, 3.68f)
                lineToRelative(3.92f, -3.11f)
                verticalLineToRelative(-3.37f)
                curveToRelative(2.85f, -0.93f, 5.94f, -0.93f, 8.8f, 0.0f)
                verticalLineToRelative(3.38f)
                lineToRelative(3.91f, 3.1f)
                lineTo(24.0f, 17.39f)
                curveToRelative(-6.41f, -7.19f, -17.59f, -7.19f, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ringVolume!!
    }

private var _ringVolume: ImageVector? = null
