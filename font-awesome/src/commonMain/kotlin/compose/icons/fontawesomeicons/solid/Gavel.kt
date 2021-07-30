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
                moveTo(504.971f, 199.362f)
                lineToRelative(-22.627f, -22.627f)
                curveToRelative(-9.373f, -9.373f, -24.569f, -9.373f, -33.941f, 0.0f)
                lineToRelative(-5.657f, 5.657f)
                lineTo(329.608f, 69.255f)
                lineToRelative(5.657f, -5.657f)
                curveToRelative(9.373f, -9.373f, 9.373f, -24.569f, 0.0f, -33.941f)
                lineTo(312.638f, 7.029f)
                curveToRelative(-9.373f, -9.373f, -24.569f, -9.373f, -33.941f, 0.0f)
                lineTo(154.246f, 131.48f)
                curveToRelative(-9.373f, 9.373f, -9.373f, 24.569f, 0.0f, 33.941f)
                lineToRelative(22.627f, 22.627f)
                curveToRelative(9.373f, 9.373f, 24.569f, 9.373f, 33.941f, 0.0f)
                lineToRelative(5.657f, -5.657f)
                lineToRelative(39.598f, 39.598f)
                lineToRelative(-81.04f, 81.04f)
                lineToRelative(-5.657f, -5.657f)
                curveToRelative(-12.497f, -12.497f, -32.758f, -12.497f, -45.255f, 0.0f)
                lineTo(9.373f, 412.118f)
                curveToRelative(-12.497f, 12.497f, -12.497f, 32.758f, 0.0f, 45.255f)
                lineToRelative(45.255f, 45.255f)
                curveToRelative(12.497f, 12.497f, 32.758f, 12.497f, 45.255f, 0.0f)
                lineToRelative(114.745f, -114.745f)
                curveToRelative(12.497f, -12.497f, 12.497f, -32.758f, 0.0f, -45.255f)
                lineToRelative(-5.657f, -5.657f)
                lineToRelative(81.04f, -81.04f)
                lineToRelative(39.598f, 39.598f)
                lineToRelative(-5.657f, 5.657f)
                curveToRelative(-9.373f, 9.373f, -9.373f, 24.569f, 0.0f, 33.941f)
                lineToRelative(22.627f, 22.627f)
                curveToRelative(9.373f, 9.373f, 24.569f, 9.373f, 33.941f, 0.0f)
                lineToRelative(124.451f, -124.451f)
                curveToRelative(9.372f, -9.372f, 9.372f, -24.568f, 0.0f, -33.941f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
