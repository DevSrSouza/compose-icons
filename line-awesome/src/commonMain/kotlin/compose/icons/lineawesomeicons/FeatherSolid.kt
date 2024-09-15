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

public val LineAwesomeIcons.FeatherSolid: ImageVector
    get() {
        if (_featherSolid != null) {
            return _featherSolid!!
        }
        _featherSolid = Builder(name = "FeatherSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 4.0f)
                curveTo(19.698f, 4.0f, 18.021f, 4.725f, 16.797f, 6.021f)
                lineTo(8.637f, 14.176f)
                curveTo(6.937f, 15.875f, 6.0f, 18.134f, 6.0f, 20.539f)
                lineTo(6.0f, 22.0f)
                lineTo(8.027f, 19.973f)
                curveTo(8.159f, 18.317f, 8.864f, 16.777f, 10.051f, 15.59f)
                lineTo(18.23f, 7.414f)
                curveTo(19.092f, 6.501f, 20.254f, 6.0f, 21.5f, 6.0f)
                curveTo(23.981f, 6.0f, 26.0f, 8.019f, 26.0f, 10.5f)
                curveTo(26.0f, 11.746f, 25.498f, 12.906f, 24.564f, 13.789f)
                lineTo(22.533f, 15.822f)
                lineTo(19.0f, 17.0f)
                lineTo(21.355f, 17.0f)
                lineTo(17.537f, 20.82f)
                lineTo(14.0f, 22.0f)
                lineTo(16.354f, 22.0f)
                curveTo(15.038f, 23.288f, 13.305f, 24.0f, 11.461f, 24.0f)
                lineTo(9.414f, 24.0f)
                lineTo(18.707f, 14.707f)
                lineTo(17.293f, 13.293f)
                lineTo(4.0f, 26.586f)
                lineTo(5.414f, 28.0f)
                lineTo(7.414f, 26.0f)
                lineTo(11.461f, 26.0f)
                curveTo(13.865f, 26.0f, 16.125f, 25.064f, 17.824f, 23.363f)
                lineTo(25.957f, 15.223f)
                curveTo(27.275f, 13.979f, 28.0f, 12.302f, 28.0f, 10.5f)
                curveTo(28.0f, 6.916f, 25.084f, 4.0f, 21.5f, 4.0f)
                close()
            }
        }
        .build()
        return _featherSolid!!
    }

private var _featherSolid: ImageVector? = null
