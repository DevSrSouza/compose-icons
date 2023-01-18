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

public val FillGroup.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) {
            return _hourglassLow!!
        }
        _hourglassLow = Builder(name = "HourglassLow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 75.6f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                verticalLineTo(76.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 6.4f, 12.8f)
                lineTo(114.7f, 128.0f)
                lineTo(62.4f, 167.2f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -6.3f, 11.9f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.1f, 0.9f)
                verticalLineToRelative(36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(180.4f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.1f, -0.9f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -6.3f, -11.9f)
                lineTo(141.3f, 128.0f)
                lineToRelative(52.3f, -39.6f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 200.0f, 75.6f)
                close()
                moveTo(82.6f, 172.1f)
                lineTo(128.0f, 138.0f)
                lineToRelative(45.3f, 34.3f)
                close()
                moveTo(184.0f, 75.6f)
                lineTo(128.0f, 118.0f)
                lineTo(72.0f, 76.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(184.0f)
                close()
            }
        }
        .build()
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
