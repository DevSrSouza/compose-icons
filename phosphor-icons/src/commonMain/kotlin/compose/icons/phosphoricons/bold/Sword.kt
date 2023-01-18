package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.5f, 31.5f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 216.0f, 28.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-63.8f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.9f, 3.9f)
                lineTo(71.8f, 110.8f)
                lineToRelative(-1.7f, -1.6f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -28.2f, 0.0f)
                lineTo(25.2f, 125.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, 28.2f)
                lineToRelative(14.0f, 14.1f)
                lineTo(20.1f, 187.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.3f)
                lineToRelative(20.3f, 20.3f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 28.3f, 0.0f)
                lineToRelative(19.1f, -19.1f)
                lineToRelative(14.1f, 14.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 28.2f, 0.0f)
                lineToRelative(16.7f, -16.7f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                lineToRelative(-1.6f, -1.7f)
                lineToRelative(78.7f, -71.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.9f, -8.9f)
                lineTo(228.0f, 40.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 224.5f, 31.5f)
                close()
                moveTo(116.0f, 211.0f)
                lineToRelative(-14.1f, -14.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                lineTo(54.5f, 216.1f)
                lineTo(39.9f, 201.5f)
                lineTo(59.0f, 182.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 0.0f, -28.2f)
                lineTo(45.0f, 140.0f)
                lineToRelative(11.0f, -11.0f)
                lineToRelative(35.5f, 35.5f)
                horizontalLineToRelative(0.0f)
                lineTo(127.0f, 200.0f)
                close()
                moveTo(203.8f, 98.5f)
                lineToRelative(-75.6f, 68.7f)
                lineTo(117.0f, 156.0f)
                lineToRelative(51.5f, -51.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(100.0f, 139.0f)
                lineTo(88.8f, 127.8f)
                lineToRelative(68.7f, -75.6f)
                lineTo(204.0f, 52.0f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
