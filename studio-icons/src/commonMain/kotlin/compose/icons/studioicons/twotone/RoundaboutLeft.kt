package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.RoundaboutLeft: ImageVector
    get() {
        if (_roundaboutLeft != null) {
            return _roundaboutLeft!!
        }
        _roundaboutLeft = Builder(name = "RoundaboutLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.08f, 8.0f)
                curveToRelative(0.48f, -2.84f, 2.94f, -5.0f, 5.92f, -5.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.97f, -2.16f, 5.44f, -5.0f, 5.92f)
                lineTo(17.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.0f, -6.09f)
                curveToRelative(0.0f, -0.98f, 0.71f, -1.8f, 1.67f, -1.97f)
                curveTo(18.56f, 12.63f, 20.0f, 10.98f, 20.0f, 9.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.98f, 0.0f, -3.63f, 1.44f, -3.94f, 3.33f)
                curveTo(11.89f, 9.29f, 11.07f, 10.0f, 10.09f, 10.0f)
                lineToRelative(-4.26f, 0.0f)
                lineToRelative(1.59f, 1.59f)
                lineTo(6.0f, 13.0f)
                lineTo(2.0f, 9.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(5.83f, 8.0f)
                lineTo(10.08f, 8.0f)
                close()
            }
        }
        .build()
        return _roundaboutLeft!!
    }

private var _roundaboutLeft: ImageVector? = null
