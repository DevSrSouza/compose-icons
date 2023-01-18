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

public val BoldGroup.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(name = "TestTube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.5f, 83.5f)
                lineToRelative(-60.0f, -60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-130.0f, 130.0f)
                arcToRelative(48.8f, 48.8f, 0.0f, true, false, 69.0f, 69.0f)
                lineToRelative(112.0f, -112.0f)
                lineToRelative(21.3f, -7.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.9f, -8.6f)
                arcTo(12.4f, 12.4f, 0.0f, false, false, 240.5f, 83.5f)
                close()
                moveTo(85.5f, 205.5f)
                arcToRelative(24.7f, 24.7f, 0.0f, false, true, -35.0f, -35.0f)
                lineToRelative(25.3f, -25.3f)
                curveToRelative(2.6f, -1.7f, 16.6f, -9.6f, 38.8f, 1.5f)
                arcToRelative(81.9f, 81.9f, 0.0f, false, false, 22.2f, 7.5f)
                close()
                moveTo(204.2f, 88.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.7f, 2.9f)
                lineToRelative(-35.3f, 35.3f)
                curveToRelative(-2.6f, 1.7f, -16.6f, 9.6f, -38.8f, -1.5f)
                arcToRelative(81.9f, 81.9f, 0.0f, false, false, -22.2f, -7.5f)
                lineTo(172.0f, 49.0f)
                lineToRelative(37.8f, 37.8f)
                close()
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
