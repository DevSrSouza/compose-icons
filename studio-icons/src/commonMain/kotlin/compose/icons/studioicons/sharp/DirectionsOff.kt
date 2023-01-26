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

public val SharpGroup.DirectionsOff: ImageVector
    get() {
        if (_directionsOff != null) {
            return _directionsOff!!
        }
        _directionsOff = Builder(name = "DirectionsOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-1.33f, 1.34f)
                lineToRelative(3.45f, 3.45f)
                lineToRelative(3.79f, -3.79f)
                lineToRelative(-10.4f, -10.42f)
                lineToRelative(-3.8f, 3.8f)
                lineToRelative(4.79f, 4.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineToRelative(3.99f, 3.99f)
                lineToRelative(-3.79f, 3.79f)
                lineTo(12.01f, 22.4f)
                lineToRelative(3.79f, -3.79f)
                lineToRelative(3.99f, 3.99f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(9.99f, 12.82f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.18f)
                lineTo(9.99f, 12.82f)
                close()
            }
        }
        .build()
        return _directionsOff!!
    }

private var _directionsOff: ImageVector? = null
