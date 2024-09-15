package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.DirectionsSolid: ImageVector
    get() {
        if (_directionsSolid != null) {
            return _directionsSolid!!
        }
        _directionsSolid = Builder(name = "DirectionsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(15.23f, 3.0f, 14.457f, 3.293f, 13.875f, 3.875f)
                lineTo(13.75f, 4.031f)
                lineTo(4.031f, 13.75f)
                lineTo(3.875f, 13.875f)
                curveTo(2.711f, 15.039f, 2.711f, 16.961f, 3.875f, 18.125f)
                lineTo(13.875f, 28.125f)
                curveTo(15.039f, 29.289f, 16.961f, 29.289f, 18.125f, 28.125f)
                lineTo(28.125f, 18.125f)
                curveTo(29.289f, 16.961f, 29.289f, 15.039f, 28.125f, 13.875f)
                lineTo(18.125f, 3.875f)
                curveTo(17.543f, 3.293f, 16.77f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.254f, 5.0f, 16.52f, 5.082f, 16.719f, 5.281f)
                lineTo(26.719f, 15.281f)
                curveTo(27.117f, 15.679f, 27.117f, 16.32f, 26.719f, 16.719f)
                lineTo(16.719f, 26.719f)
                curveTo(16.321f, 27.117f, 15.68f, 27.117f, 15.281f, 26.719f)
                lineTo(5.281f, 16.719f)
                curveTo(4.883f, 16.321f, 4.883f, 15.68f, 5.281f, 15.281f)
                lineTo(15.281f, 5.281f)
                curveTo(15.48f, 5.082f, 15.746f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(17.0f, 11.0f)
                lineTo(17.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                curveTo(11.895f, 14.0f, 11.0f, 14.895f, 11.0f, 16.0f)
                lineTo(11.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 19.0f)
                lineTo(21.0f, 15.0f)
                lineTo(17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _directionsSolid!!
    }

private var _directionsSolid: ImageVector? = null
