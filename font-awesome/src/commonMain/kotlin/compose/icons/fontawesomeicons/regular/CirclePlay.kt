package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CirclePlay: ImageVector
    get() {
        if (_circlePlay != null) {
            return _circlePlay!!
        }
        _circlePlay = Builder(name = "CirclePlay", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, false, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(188.3f, 147.1f)
                curveToRelative(7.6f, -4.2f, 16.8f, -4.1f, 24.3f, 0.5f)
                lineToRelative(144.0f, 88.0f)
                curveToRelative(7.1f, 4.4f, 11.5f, 12.1f, 11.5f, 20.5f)
                reflectiveCurveToRelative(-4.4f, 16.1f, -11.5f, 20.5f)
                lineToRelative(-144.0f, 88.0f)
                curveToRelative(-7.4f, 4.5f, -16.7f, 4.7f, -24.3f, 0.5f)
                reflectiveCurveToRelative(-12.3f, -12.2f, -12.3f, -20.9f)
                verticalLineTo(168.0f)
                curveToRelative(0.0f, -8.7f, 4.7f, -16.7f, 12.3f, -20.9f)
                close()
            }
        }
        .build()
        return _circlePlay!!
    }

private var _circlePlay: ImageVector? = null
