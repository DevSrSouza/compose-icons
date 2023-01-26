package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) {
            return _wifiOff!!
        }
        _wifiOff = Builder(name = "WifiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(-3.73f, -3.73f, -8.87f, -5.15f, -13.7f, -4.31f)
                lineToRelative(2.58f, 2.58f)
                curveToRelative(3.3f, -0.02f, 6.61f, 1.22f, 9.12f, 3.73f)
                close()
                moveTo(19.0f, 13.0f)
                curveToRelative(-1.08f, -1.08f, -2.36f, -1.85f, -3.72f, -2.33f)
                lineToRelative(3.02f, 3.02f)
                lineToRelative(0.7f, -0.69f)
                close()
                moveTo(9.0f, 17.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f)
                close()
                moveTo(3.41f, 1.64f)
                lineTo(2.0f, 3.05f)
                lineTo(5.05f, 6.1f)
                curveTo(3.59f, 6.83f, 2.22f, 7.79f, 1.0f, 9.0f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(1.23f, -1.23f, 2.65f, -2.16f, 4.17f, -2.78f)
                lineToRelative(2.24f, 2.24f)
                curveTo(7.79f, 10.89f, 6.27f, 11.74f, 5.0f, 13.0f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(1.35f, -1.35f, 3.11f, -2.04f, 4.89f, -2.06f)
                lineToRelative(7.08f, 7.08f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 1.64f)
                close()
            }
        }
        .build()
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
