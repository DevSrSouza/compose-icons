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

public val LineAwesomeIcons.FeatherAltSolid: ImageVector
    get() {
        if (_featherAltSolid != null) {
            return _featherAltSolid!!
        }
        _featherAltSolid = Builder(name = "FeatherAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 4.0f)
                curveTo(18.197f, 4.0f, 13.799f, 8.795f, 11.686f, 11.1f)
                lineTo(8.637f, 14.176f)
                curveTo(6.936f, 15.875f, 6.0f, 18.134f, 6.0f, 20.539f)
                lineTo(6.0f, 22.0f)
                lineTo(8.027f, 19.973f)
                curveTo(8.159f, 18.317f, 8.863f, 16.776f, 10.047f, 15.592f)
                lineTo(13.16f, 12.451f)
                curveTo(14.996f, 10.449f, 18.729f, 6.378f, 25.975f, 6.023f)
                curveTo(25.753f, 10.545f, 24.086f, 13.697f, 22.377f, 15.875f)
                lineTo(19.0f, 17.0f)
                lineTo(21.418f, 17.0f)
                curveTo(20.724f, 17.756f, 20.067f, 18.365f, 19.549f, 18.84f)
                lineTo(18.568f, 19.811f)
                lineTo(15.0f, 21.0f)
                lineTo(17.367f, 21.0f)
                lineTo(16.41f, 21.947f)
                curveTo(15.088f, 23.269f, 13.331f, 23.998f, 11.461f, 23.998f)
                lineTo(9.416f, 23.998f)
                lineTo(18.707f, 14.707f)
                lineTo(17.293f, 13.293f)
                lineTo(4.0f, 26.586f)
                lineTo(5.414f, 28.0f)
                lineTo(7.416f, 25.998f)
                lineTo(11.461f, 25.998f)
                curveTo(13.865f, 25.998f, 16.125f, 25.061f, 17.828f, 23.357f)
                lineTo(20.898f, 20.313f)
                curveTo(23.203f, 18.201f, 28.0f, 13.804f, 28.0f, 5.0f)
                lineTo(28.0f, 4.0f)
                lineTo(27.0f, 4.0f)
                close()
            }
        }
        .build()
        return _featherAltSolid!!
    }

private var _featherAltSolid: ImageVector? = null
