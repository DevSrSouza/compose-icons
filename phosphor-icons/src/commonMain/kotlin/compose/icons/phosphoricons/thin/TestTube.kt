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

public val ThinGroup.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(name = "TestTube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 89.2f)
                lineToRelative(-60.0f, -60.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-130.0f, 130.0f)
                arcToRelative(40.7f, 40.7f, 0.0f, true, false, 57.6f, 57.6f)
                lineTo(210.2f, 103.5f)
                lineToRelative(23.1f, -7.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.6f, -2.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.8f, 89.2f)
                close()
                moveTo(91.2f, 211.2f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, true, -46.4f, 0.0f)
                arcToRelative(32.8f, 32.8f, 0.0f, false, true, 0.0f, -46.4f)
                lineTo(70.6f, 139.0f)
                curveToRelative(2.0f, -1.4f, 19.5f, -13.5f, 47.6f, 0.6f)
                curveToRelative(11.3f, 5.6f, 21.3f, 7.6f, 29.6f, 7.6f)
                arcToRelative(48.6f, 48.6f, 0.0f, false, false, 8.0f, -0.7f)
                close()
                moveTo(206.7f, 96.2f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -1.5f, 1.0f)
                lineTo(169.4f, 133.0f)
                curveToRelative(-2.0f, 1.4f, -19.6f, 13.5f, -47.6f, -0.6f)
                curveToRelative(-15.3f, -7.6f, -28.1f, -8.4f, -37.6f, -6.9f)
                lineTo(172.0f, 37.7f)
                lineToRelative(52.6f, 52.6f)
                close()
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
