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

public val FillGroup.HourglassMedium: ImageVector
    get() {
        if (_hourglassMedium != null) {
            return _hourglassMedium!!
        }
        _hourglassMedium = Builder(name = "HourglassMedium", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.6f, 88.4f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 200.0f, 75.6f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                verticalLineTo(76.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 6.4f, 12.8f)
                lineToRelative(18.1f, 13.6f)
                horizontalLineToRelative(0.0f)
                lineTo(114.7f, 128.0f)
                lineTo(62.4f, 167.2f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 56.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(180.4f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -6.4f, -12.8f)
                lineTo(141.3f, 128.0f)
                lineTo(164.0f, 110.8f)
                close()
                moveTo(72.0f, 40.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(75.6f)
                lineTo(178.2f, 80.0f)
                horizontalLineTo(77.3f)
                lineTo(72.0f, 76.0f)
                close()
                moveTo(184.0f, 180.4f)
                verticalLineTo(216.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(180.0f)
                lineToRelative(48.0f, -36.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(144.1f)
                close()
            }
        }
        .build()
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null
