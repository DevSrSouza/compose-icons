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

public val FillGroup.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) {
            return _cellSignalX!!
        }
        _cellSignalX = Builder(name = "CellSignalX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.7f, 146.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(200.0f, 139.3f)
                lineToRelative(-18.3f, 18.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(188.7f, 128.0f)
                lineToRelative(-18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(200.0f, 116.7f)
                lineToRelative(18.3f, -18.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(211.3f, 128.0f)
                close()
                moveTo(202.8f, 164.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineTo(193.0f, 169.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -17.0f, 7.0f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, true, -17.2f, -7.3f)
                curveToRelative(-9.2f, -9.5f, -8.7f, -24.7f, 0.6f, -34.1f)
                lineToRelative(6.7f, -6.6f)
                lineToRelative(-6.7f, -6.6f)
                curveToRelative(-9.5f, -9.6f, -9.7f, -25.4f, 0.0f, -34.7f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 193.0f, 87.0f)
                lineToRelative(4.2f, 4.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(207.0f, 87.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 1.0f, -2.3f)
                lineTo(208.0f, 43.8f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, -9.2f, -15.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 180.7f, 32.0f)
                lineTo(16.3f, 196.4f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -4.0f, 17.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.0f, 10.6f)
                lineTo(192.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 171.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.0f, -2.2f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
