package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.AngleDoubleDown: ImageVector
    get() {
        if (_angleDoubleDown != null) {
            return _angleDoubleDown!!
        }
        _angleDoubleDown = Builder(name = "AngleDoubleDown", defaultWidth = 320.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.0f, 256.3f)
                lineTo(7.0f, 120.3f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(96.4f, 96.4f)
                lineToRelative(96.4f, -96.4f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineTo(313.0f, 86.3f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-136.0f, 136.0f)
                curveToRelative(-9.4f, 9.5f, -24.6f, 9.5f, -34.0f, 0.1f)
                close()
                moveTo(177.0f, 448.3f)
                lineToRelative(136.0f, -136.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-22.6f, -22.6f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(160.0f, 352.1f)
                lineToRelative(-96.4f, -96.4f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(7.0f, 278.3f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(136.0f, 136.0f)
                curveToRelative(9.4f, 9.5f, 24.6f, 9.5f, 34.0f, 0.1f)
                close()
            }
        }
        .build()
        return _angleDoubleDown!!
    }

private var _angleDoubleDown: ImageVector? = null
