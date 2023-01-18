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

public val FillGroup.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) {
            return _airplaneTilt!!
        }
        _airplaneTilt = Builder(name = "AirplaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.1f, 86.2f)
                lineToRelative(-29.8f, 28.0f)
                lineToRelative(30.2f, 83.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -1.8f, 8.4f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -6.4f, 2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -5.9f, -3.5f)
                lineToRelative(-42.6f, -62.3f)
                lineTo(116.0f, 183.5f)
                verticalLineTo(204.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.3f, 5.7f)
                lineToRelative(-20.0f, 20.0f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 88.0f, 232.0f)
                lineToRelative(-1.8f, -0.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.8f, -5.2f)
                lineTo(67.5f, 188.5f)
                lineTo(29.4f, 175.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.2f, -5.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 2.1f, -7.5f)
                lineToRelative(20.0f, -20.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 52.0f, 140.0f)
                horizontalLineTo(72.7f)
                lineToRelative(18.7f, -18.8f)
                lineTo(27.6f, 78.7f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 24.0f, 72.8f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 2.3f, -6.5f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 8.4f, -1.8f)
                lineToRelative(83.1f, 30.2f)
                lineToRelative(26.6f, -28.2f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, 1.0f, -1.1f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 47.0f, 43.3f)
                arcTo(6.4f, 6.4f, 0.0f, false, true, 215.1f, 86.2f)
                close()
            }
        }
        .build()
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
