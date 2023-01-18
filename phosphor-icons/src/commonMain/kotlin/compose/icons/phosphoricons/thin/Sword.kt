package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.8f, 37.2f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 216.0f, 36.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-63.8f, 0.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.1f, 1.5f)
                lineTo(75.9f, 126.3f)
                lineTo(64.5f, 114.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(34.8f, 127.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(20.9f, 20.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineTo(25.8f, 201.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 0.0f, 16.9f)
                lineToRelative(12.3f, 12.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, 0.0f)
                lineToRelative(30.0f, -29.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(20.9f, 20.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(12.7f, -12.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-11.5f, -11.4f)
                lineToRelative(88.6f, -73.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.5f, -3.1f)
                lineTo(220.0f, 40.0f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 218.8f, 37.2f)
                close()
                moveTo(136.7f, 200.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -1.2f, 2.8f)
                lineToRelative(-12.7f, 12.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(96.3f, 194.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-29.9f, 30.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -2.9f, 1.1f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.8f, -1.1f)
                lineTo(31.4f, 212.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, -5.7f)
                lineToRelative(30.0f, -29.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(40.5f, 138.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(12.7f, -12.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(76.7f, 76.7f)
                arcTo(3.6f, 3.6f, 0.0f, false, true, 136.7f, 200.0f)
                close()
                moveTo(211.8f, 101.9f)
                lineTo(124.1f, 174.4f)
                lineTo(105.7f, 156.0f)
                lineToRelative(57.1f, -57.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, -5.6f)
                lineTo(100.0f, 150.3f)
                lineTo(81.6f, 131.9f)
                lineToRelative(72.5f, -87.7f)
                lineTo(212.0f, 44.0f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
