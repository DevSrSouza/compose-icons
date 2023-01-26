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

public val SharpGroup.RoundaboutLeft: ImageVector
    get() {
        if (_roundaboutLeft != null) {
            return _roundaboutLeft!!
        }
        _roundaboutLeft = Builder(name = "RoundaboutLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-6.17f, 0.0f)
                lineToRelative(1.59f, 1.59f)
                lineTo(6.0f, 13.0f)
                lineTo(2.0f, 9.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(5.83f, 8.0f)
                lineToRelative(4.25f, 0.0f)
                curveToRelative(0.48f, -2.84f, 2.94f, -5.0f, 5.92f, -5.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.97f, -2.16f, 5.44f, -5.0f, 5.92f)
                lineTo(17.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.0f, -8.0f)
                lineTo(16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _roundaboutLeft!!
    }

private var _roundaboutLeft: ImageVector? = null
