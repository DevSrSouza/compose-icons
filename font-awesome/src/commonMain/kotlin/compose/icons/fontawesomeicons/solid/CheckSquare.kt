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

public val SolidGroup.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) {
            return _checkSquare!!
        }
        _checkSquare = Builder(name = "CheckSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 480.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(195.314f, 381.941f)
                lineToRelative(184.0f, -184.0f)
                curveToRelative(6.248f, -6.248f, 6.248f, -16.379f, 0.0f, -22.627f)
                lineToRelative(-22.627f, -22.627f)
                curveToRelative(-6.248f, -6.248f, -16.379f, -6.249f, -22.628f, 0.0f)
                lineTo(184.0f, 302.745f)
                lineToRelative(-70.059f, -70.059f)
                curveToRelative(-6.248f, -6.248f, -16.379f, -6.248f, -22.628f, 0.0f)
                lineToRelative(-22.627f, 22.627f)
                curveToRelative(-6.248f, 6.248f, -6.248f, 16.379f, 0.0f, 22.627f)
                lineToRelative(104.0f, 104.0f)
                curveToRelative(6.249f, 6.25f, 16.379f, 6.25f, 22.628f, 0.001f)
                close()
            }
        }
        .build()
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
