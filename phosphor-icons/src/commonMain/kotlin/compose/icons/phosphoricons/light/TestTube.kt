package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(name = "TestTube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 87.8f)
                lineToRelative(-60.0f, -60.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineTo(63.8f, 131.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-26.0f, 26.1f)
                arcToRelative(42.7f, 42.7f, 0.0f, true, false, 60.4f, 60.4f)
                lineToRelative(78.0f, -77.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(35.0f, -35.1f)
                lineToRelative(22.7f, -7.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.3f, -9.9f)
                close()
                moveTo(89.8f, 209.8f)
                arcToRelative(30.8f, 30.8f, 0.0f, false, true, -43.6f, -43.6f)
                lineToRelative(25.7f, -25.7f)
                curveToRelative(2.2f, -1.5f, 18.9f, -12.4f, 45.4f, 0.9f)
                curveToRelative(11.6f, 5.8f, 21.9f, 7.7f, 30.4f, 7.7f)
                horizontalLineToRelative(2.8f)
                close()
                moveTo(206.1f, 94.3f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, -2.3f, 1.5f)
                lineToRelative(-35.7f, 35.7f)
                curveToRelative(-2.2f, 1.5f, -18.9f, 12.4f, -45.4f, -0.9f)
                curveToRelative(-12.9f, -6.4f, -24.1f, -8.1f, -33.1f, -7.7f)
                lineTo(172.0f, 40.5f)
                lineToRelative(48.9f, 48.9f)
                close()
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
