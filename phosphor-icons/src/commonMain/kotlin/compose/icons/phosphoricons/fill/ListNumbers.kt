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

public val FillGroup.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) {
            return _listNumbers!!
        }
        _listNumbers = Builder(name = "ListNumbers", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 170.6f)
                lineTo(56.0f, 192.0f)
                lineTo(68.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(25.5f, -34.0f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 60.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -5.5f, 3.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.8f, -6.3f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 76.0f, 158.0f)
                arcToRelative(21.5f, 21.5f, 0.0f, false, true, -3.8f, 12.3f)
                close()
                moveTo(43.6f, 67.2f)
                lineTo(48.0f, 64.9f)
                lineTo(48.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(64.0f, 52.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.8f, -6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.8f, -0.4f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 7.2f, 14.4f)
                close()
                moveTo(104.0f, 72.0f)
                lineTo(216.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(104.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 184.0f)
                lineTo(104.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(216.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(216.0f, 120.0f)
                lineTo(104.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(216.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
