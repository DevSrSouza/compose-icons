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

public val SharpGroup.RampLeft: ImageVector
    get() {
        if (_rampLeft != null) {
            return _rampLeft!!
        }
        _rampLeft = Builder(name = "RampLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.83f)
                lineTo(9.41f, 8.41f)
                lineTo(8.0f, 7.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(13.0f, 6.83f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, 4.27f, 4.03f, 7.13f, 6.0f, 8.27f)
                lineToRelative(-1.46f, 1.46f)
                curveToRelative(-1.91f, -1.16f, -3.44f, -2.53f, -4.54f, -4.02f)
                lineTo(13.0f, 21.0f)
                close()
            }
        }
        .build()
        return _rampLeft!!
    }

private var _rampLeft: ImageVector? = null
