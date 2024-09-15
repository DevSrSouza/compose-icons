package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Starlingbank: ImageVector
    get() {
        if (_starlingbank != null) {
            return _starlingbank!!
        }
        _starlingbank = Builder(name = "Starlingbank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.627f, -5.372f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(15.609f, 4.756f)
                verticalLineToRelative(1.467f)
                curveToRelative(-3.177f, 0.0f, -5.754f, 2.577f, -5.754f, 5.754f)
                lineTo(8.389f, 11.977f)
                curveToRelative(0.0f, -3.988f, 3.233f, -7.221f, 7.221f, -7.221f)
                close()
                moveTo(14.144f, 11.977f)
                horizontalLineToRelative(1.467f)
                curveToRelative(0.0f, 3.989f, -3.233f, 7.223f, -7.223f, 7.223f)
                verticalLineToRelative(-1.469f)
                curveToRelative(3.179f, 0.0f, 5.756f, -2.576f, 5.756f, -5.754f)
                close()
            }
        }
        .build()
        return _starlingbank!!
    }

private var _starlingbank: ImageVector? = null
