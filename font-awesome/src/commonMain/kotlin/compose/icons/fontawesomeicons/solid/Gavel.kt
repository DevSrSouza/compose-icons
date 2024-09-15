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

public val SolidGroup.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.97f, 199.36f)
                lineToRelative(-22.63f, -22.63f)
                curveToRelative(-9.37f, -9.37f, -24.57f, -9.37f, -33.94f, 0.0f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(329.61f, 69.25f)
                lineToRelative(5.66f, -5.66f)
                curveToRelative(9.37f, -9.37f, 9.37f, -24.57f, 0.0f, -33.94f)
                lineTo(312.64f, 7.03f)
                curveToRelative(-9.37f, -9.37f, -24.57f, -9.37f, -33.94f, 0.0f)
                lineTo(154.25f, 131.48f)
                curveToRelative(-9.37f, 9.37f, -9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(22.63f, 22.63f)
                curveToRelative(9.37f, 9.37f, 24.57f, 9.37f, 33.94f, 0.0f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(39.6f, 39.6f)
                lineToRelative(-81.04f, 81.04f)
                lineToRelative(-5.66f, -5.66f)
                curveToRelative(-12.5f, -12.5f, -32.76f, -12.5f, -45.26f, 0.0f)
                lineTo(9.37f, 412.12f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0.0f, 45.26f)
                lineToRelative(45.26f, 45.26f)
                curveToRelative(12.5f, 12.5f, 32.76f, 12.5f, 45.26f, 0.0f)
                lineToRelative(114.75f, -114.75f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.76f, 0.0f, -45.26f)
                lineToRelative(-5.66f, -5.66f)
                lineToRelative(81.04f, -81.04f)
                lineToRelative(39.6f, 39.6f)
                lineToRelative(-5.66f, 5.66f)
                curveToRelative(-9.37f, 9.37f, -9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(22.63f, 22.63f)
                curveToRelative(9.37f, 9.37f, 24.57f, 9.37f, 33.94f, 0.0f)
                lineToRelative(124.45f, -124.45f)
                curveToRelative(9.37f, -9.37f, 9.37f, -24.57f, 0.0f, -33.94f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
