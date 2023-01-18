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

public val LightGroup.Crosshair: ImageVector
    get() {
        if (_crosshair != null) {
            return _crosshair!!
        }
        _crosshair = Builder(name = "Crosshair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 122.0f)
                lineTo(221.8f, 122.0f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 134.0f, 34.2f)
                lineTo(134.0f, 20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 34.2f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 34.2f, 122.0f)
                lineTo(20.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(34.2f, 134.0f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 122.0f, 221.8f)
                lineTo(122.0f, 236.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 221.8f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 221.8f, 134.0f)
                lineTo(236.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(134.0f, 209.8f)
                lineTo(134.0f, 196.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(13.8f)
                arcTo(82.3f, 82.3f, 0.0f, false, true, 46.2f, 134.0f)
                lineTo(60.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(46.2f, 122.0f)
                arcTo(82.3f, 82.3f, 0.0f, false, true, 122.0f, 46.2f)
                lineTo(122.0f, 60.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 46.2f)
                arcTo(82.3f, 82.3f, 0.0f, false, true, 209.8f, 122.0f)
                lineTo(196.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(13.8f)
                arcTo(82.3f, 82.3f, 0.0f, false, true, 134.0f, 209.8f)
                close()
                moveTo(128.0f, 90.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 90.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 128.0f, 154.0f)
                close()
            }
        }
        .build()
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
