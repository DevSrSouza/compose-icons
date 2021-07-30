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

public val LineAwesomeIcons.HeartSolid: ImageVector
    get() {
        if (_heartSolid != null) {
            return _heartSolid!!
        }
        _heartSolid = Builder(name = "HeartSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 5.0f)
                curveToRelative(-2.892f, 0.0f, -5.327f, 1.804f, -6.5f, 2.854f)
                curveTo(14.827f, 6.804f, 12.392f, 5.0f, 9.5f, 5.0f)
                curveTo(5.364f, 5.0f, 2.0f, 8.364f, 2.0f, 12.5f)
                curveToRelative(0.0f, 2.59f, 2.365f, 4.947f, 2.46f, 5.041f)
                lineTo(16.0f, 29.081f)
                lineToRelative(11.534f, -11.534f)
                curveTo(27.635f, 17.447f, 30.0f, 15.09f, 30.0f, 12.5f)
                curveTo(30.0f, 8.364f, 26.636f, 5.0f, 22.5f, 5.0f)
                close()
            }
        }
        .build()
        return _heartSolid!!
    }

private var _heartSolid: ImageVector? = null
