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

public val FillGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 77.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(208.0f, 59.3f)
                lineTo(179.3f, 88.0f)
                lineToRelative(34.4f, 34.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-6.3f, -6.4f)
                lineToRelative(-84.0f, 84.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -11.3f, 4.7f)
                horizontalLineTo(51.3f)
                lineTo(29.7f, 237.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(40.0f, 204.7f)
                verticalLineTo(155.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 44.7f, 144.0f)
                lineToRelative(11.2f, -11.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(28.8f, 28.9f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(72.8f, 121.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(91.9f, 96.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(28.8f, 28.9f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(108.8f, 85.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(128.7f, 60.0f)
                lineToRelative(-6.1f, -6.1f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.4f, -11.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.5f, -0.2f)
                lineTo(168.0f, 76.7f)
                lineTo(196.7f, 48.0f)
                lineTo(178.6f, 29.9f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.4f, -11.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.5f, -0.2f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 237.7f, 77.7f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
