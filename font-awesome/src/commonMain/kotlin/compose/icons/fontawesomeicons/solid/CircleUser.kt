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

public val SolidGroup.CircleUser: ImageVector
    get() {
        if (_circleUser != null) {
            return _circleUser!!
        }
        _circleUser = Builder(name = "CircleUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.0f, 384.2f)
                curveTo(376.9f, 345.8f, 335.4f, 320.0f, 288.0f, 320.0f)
                lineTo(224.0f, 320.0f)
                curveToRelative(-47.4f, 0.0f, -88.9f, 25.8f, -111.0f, 64.2f)
                curveToRelative(35.2f, 39.2f, 86.2f, 63.8f, 143.0f, 63.8f)
                reflectiveCurveToRelative(107.8f, -24.7f, 143.0f, -63.8f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(256.0f, 272.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 0.0f, -144.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 0.0f, 144.0f)
                close()
            }
        }
        .build()
        return _circleUser!!
    }

private var _circleUser: ImageVector? = null
