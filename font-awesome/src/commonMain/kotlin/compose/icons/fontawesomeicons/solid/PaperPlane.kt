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

public val SolidGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.0f, 3.2f)
                lineTo(12.5f, 270.6f)
                curveToRelative(-18.1f, 10.4f, -15.8f, 35.6f, 2.2f, 43.2f)
                lineTo(121.0f, 358.4f)
                lineToRelative(287.3f, -253.2f)
                curveToRelative(5.5f, -4.9f, 13.3f, 2.6f, 8.6f, 8.3f)
                lineTo(176.0f, 407.0f)
                verticalLineToRelative(80.5f)
                curveToRelative(0.0f, 23.6f, 28.5f, 32.9f, 42.5f, 15.8f)
                lineTo(282.0f, 426.0f)
                lineToRelative(124.6f, 52.2f)
                curveToRelative(14.2f, 6.0f, 30.4f, -2.9f, 33.0f, -18.2f)
                lineToRelative(72.0f, -432.0f)
                curveTo(515.0f, 7.8f, 493.3f, -6.8f, 476.0f, 3.2f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
