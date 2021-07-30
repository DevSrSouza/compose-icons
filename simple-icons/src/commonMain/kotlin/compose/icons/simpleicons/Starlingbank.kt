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
                curveTo(5.3726f, 0.0f, 0.0f, 5.3727f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.3726f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.6279f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.6273f, -5.3721f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(15.6094f, 4.7559f)
                verticalLineToRelative(1.4668f)
                curveToRelative(-3.1771f, 0.0f, -5.754f, 2.5766f, -5.754f, 5.7539f)
                lineTo(8.3888f, 11.9766f)
                curveToRelative(0.0f, -3.9882f, 3.2327f, -7.2207f, 7.2207f, -7.2207f)
                close()
                moveTo(14.1445f, 11.9766f)
                horizontalLineToRelative(1.4668f)
                curveToRelative(0.0f, 3.9889f, -3.233f, 7.2226f, -7.2226f, 7.2226f)
                verticalLineToRelative(-1.4687f)
                curveToRelative(3.1787f, 0.0f, 5.7558f, -2.5757f, 5.7558f, -5.754f)
                close()
            }
        }
        .build()
        return _starlingbank!!
    }

private var _starlingbank: ImageVector? = null
