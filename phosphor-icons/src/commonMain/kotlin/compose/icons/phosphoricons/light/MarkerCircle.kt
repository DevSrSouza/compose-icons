package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) {
            return _markerCircle!!
        }
        _markerCircle = Builder(name = "MarkerCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 55.9f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 55.9f, 200.1f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.1f, 55.9f)
                close()
                moveTo(86.0f, 207.6f)
                lineTo(86.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(31.6f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -84.0f, 0.0f)
                close()
                moveTo(104.0f, 142.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineTo(102.0f, 162.0f)
                lineTo(102.0f, 144.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 104.0f, 142.0f)
                close()
                moveTo(115.5f, 130.0f)
                lineTo(126.0f, 79.6f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(140.5f, 130.0f)
                close()
                moveTo(191.6f, 191.6f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 182.0f, 200.0f)
                lineTo(182.0f, 176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(166.0f, 144.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.3f, -14.0f)
                lineToRelative(-11.0f, -52.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -27.4f, 0.0f)
                lineToRelative(-11.0f, 52.9f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 90.0f, 144.0f)
                verticalLineToRelative(18.0f)
                lineTo(88.0f, 162.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -9.6f, -8.4f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 127.2f, 0.0f)
                close()
            }
        }
        .build()
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
