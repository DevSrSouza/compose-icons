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

public val LineAwesomeIcons.SteamSquare: ImageVector
    get() {
        if (_steamSquare != null) {
            return _steamSquare!!
        }
        _steamSquare = Builder(name = "SteamSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 16.0f)
                lineTo(8.813f, 17.594f)
                curveTo(9.523f, 16.66f, 10.621f, 16.035f, 11.875f, 16.0f)
                lineTo(14.031f, 12.75f)
                curveTo(14.156f, 10.102f, 16.32f, 8.0f, 19.0f, 8.0f)
                curveTo(21.762f, 8.0f, 24.0f, 10.238f, 24.0f, 13.0f)
                curveTo(24.0f, 15.68f, 21.898f, 17.844f, 19.25f, 17.969f)
                lineTo(16.0f, 20.125f)
                curveTo(15.938f, 22.281f, 14.172f, 24.0f, 12.0f, 24.0f)
                curveTo(9.789f, 24.0f, 8.0f, 22.211f, 8.0f, 20.0f)
                curveTo(8.0f, 19.809f, 8.035f, 19.621f, 8.063f, 19.438f)
                lineTo(5.0f, 18.156f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(17.348f, 10.0f, 16.0f, 11.348f, 16.0f, 13.0f)
                curveTo(16.0f, 14.652f, 17.348f, 16.0f, 19.0f, 16.0f)
                curveTo(20.652f, 16.0f, 22.0f, 14.652f, 22.0f, 13.0f)
                curveTo(22.0f, 11.348f, 20.652f, 10.0f, 19.0f, 10.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveTo(20.109f, 11.0f, 21.0f, 11.891f, 21.0f, 13.0f)
                curveTo(21.0f, 14.109f, 20.109f, 15.0f, 19.0f, 15.0f)
                curveTo(17.891f, 15.0f, 17.0f, 14.109f, 17.0f, 13.0f)
                curveTo(17.0f, 11.891f, 17.891f, 11.0f, 19.0f, 11.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(11.547f, 18.0f, 11.117f, 18.148f, 10.781f, 18.406f)
                lineTo(12.375f, 19.063f)
                curveTo(12.887f, 19.273f, 13.152f, 19.863f, 12.938f, 20.375f)
                curveTo(12.777f, 20.758f, 12.391f, 21.0f, 12.0f, 21.0f)
                curveTo(11.871f, 21.0f, 11.75f, 20.992f, 11.625f, 20.938f)
                lineTo(10.031f, 20.25f)
                curveTo(10.16f, 21.23f, 10.984f, 22.0f, 12.0f, 22.0f)
                curveTo(13.105f, 22.0f, 14.0f, 21.105f, 14.0f, 20.0f)
                curveTo(14.0f, 18.895f, 13.105f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _steamSquare!!
    }

private var _steamSquare: ImageVector? = null
