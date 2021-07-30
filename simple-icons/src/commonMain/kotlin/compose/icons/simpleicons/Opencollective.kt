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

public val SimpleIcons.Opencollective: ImageVector
    get() {
        if (_opencollective != null) {
            return _opencollective!!
        }
        _opencollective = Builder(name = "Opencollective", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(2.54f, 0.0f, 4.894f, -0.79f, 6.834f, -2.135f)
                lineToRelative(-3.107f, -3.109f)
                arcToRelative(7.715f, 7.715f, 0.0f, true, true, 0.0f, -13.512f)
                lineToRelative(3.107f, -3.109f)
                arcTo(11.943f, 11.943f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(21.865f, 5.166f)
                lineToRelative(-3.109f, 3.107f)
                arcTo(7.67f, 7.67f, 0.0f, false, true, 19.715f, 12.0f)
                arcToRelative(7.682f, 7.682f, 0.0f, false, true, -0.959f, 3.727f)
                lineToRelative(3.109f, 3.107f)
                arcTo(11.943f, 11.943f, 0.0f, false, false, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.54f, -0.79f, -4.894f, -2.135f, -6.834f)
                close()
            }
        }
        .build()
        return _opencollective!!
    }

private var _opencollective: ImageVector? = null
