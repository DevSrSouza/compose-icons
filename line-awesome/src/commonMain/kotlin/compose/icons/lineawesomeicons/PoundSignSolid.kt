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

public val LineAwesomeIcons.PoundSignSolid: ImageVector
    get() {
        if (_poundSignSolid != null) {
            return _poundSignSolid!!
        }
        _poundSignSolid = Builder(name = "PoundSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.688f, 5.0f)
                curveTo(17.418f, 5.0f, 17.141f, 5.027f, 16.875f, 5.063f)
                curveTo(13.699f, 5.477f, 11.0f, 8.203f, 11.0f, 11.656f)
                curveTo(11.0f, 12.785f, 11.281f, 13.898f, 11.656f, 15.0f)
                lineTo(9.0f, 15.0f)
                lineTo(9.0f, 17.0f)
                lineTo(12.406f, 17.0f)
                curveTo(12.605f, 17.555f, 12.766f, 18.102f, 12.906f, 18.656f)
                curveTo(13.469f, 20.863f, 13.527f, 22.84f, 11.531f, 25.0f)
                lineTo(8.0f, 25.0f)
                lineTo(8.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                lineTo(24.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 25.0f)
                lineTo(14.063f, 25.0f)
                curveTo(15.453f, 22.695f, 15.379f, 20.254f, 14.844f, 18.156f)
                curveTo(14.742f, 17.758f, 14.617f, 17.383f, 14.5f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 15.0f)
                lineTo(13.844f, 15.0f)
                curveTo(13.391f, 13.691f, 13.0f, 12.531f, 13.0f, 11.656f)
                curveTo(13.0f, 8.426f, 16.301f, 6.113f, 19.375f, 7.344f)
                lineTo(20.125f, 5.5f)
                curveTo(19.309f, 5.176f, 18.496f, 5.0f, 17.688f, 5.0f)
                close()
            }
        }
        .build()
        return _poundSignSolid!!
    }

private var _poundSignSolid: ImageVector? = null
