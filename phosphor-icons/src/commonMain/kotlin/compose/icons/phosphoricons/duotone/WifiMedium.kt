package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) {
            return _wifiMedium!!
        }
        _wifiMedium = Builder(name = "WifiMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(134.0f, 208.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -12.1f, -0.1f)
                lineTo(50.4f, 124.5f)
                arcToRelative(119.9f, 119.9f, 0.0f, false, true, 155.2f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.8f, 80.5f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, -6.2f, -11.0f)
                curveToRelative(-66.3f, -50.0f, -158.9f, -50.0f, -225.2f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -6.2f, 11.0f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 3.7f, 12.3f)
                lineTo(115.8f, 214.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 12.2f, 5.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.1f, -5.6f)
                lineToRelative(103.0f, -121.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 246.8f, 80.5f)
                close()
                moveTo(25.0f, 82.3f)
                lineToRelative(-4.8f, -6.4f)
                lineTo(25.0f, 82.3f)
                close()
                moveTo(128.0f, 203.6f)
                lineTo(61.8f, 125.7f)
                arcToRelative(111.8f, 111.8f, 0.0f, false, true, 132.4f, 0.0f)
                close()
                moveTo(230.9f, 82.4f)
                lineToRelative(-26.3f, 31.0f)
                arcToRelative(128.1f, 128.1f, 0.0f, false, false, -153.1f, 0.0f)
                lineToRelative(-26.4f, -31.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(60.6f, -45.7f, 145.3f, -45.7f, 205.8f, 0.0f)
                close()
            }
        }
        .build()
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
