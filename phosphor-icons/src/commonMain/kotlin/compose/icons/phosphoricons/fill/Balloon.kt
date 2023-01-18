package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                curveToRelative(0.0f, 23.4f, 9.4f, 49.4f, 25.1f, 69.5f)
                curveToRelative(11.9f, 15.2f, 26.2f, 25.7f, 41.3f, 30.9f)
                lineTo(96.6f, 229.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.8f, 7.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 104.0f, 240.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.6f, -3.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.8f, -7.5f)
                lineToRelative(-9.8f, -24.6f)
                curveToRelative(15.1f, -5.2f, 29.4f, -15.7f, 41.3f, -30.9f)
                curveTo(206.6f, 153.4f, 216.0f, 127.4f, 216.0f, 104.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(176.7f, 103.9f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.9f, -6.7f)
                arcToRelative(39.7f, 39.7f, 0.0f, false, false, -32.7f, -32.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -6.6f, -9.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 9.2f, -6.5f)
                arcToRelative(55.9f, 55.9f, 0.0f, false, true, 45.9f, 45.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 176.7f, 103.9f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
