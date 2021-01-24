package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(546.2f, 9.7f)
                curveToRelative(-5.6f, -12.5f, -21.6f, -13.0f, -28.3f, -1.2f)
                curveTo(486.9f, 62.4f, 431.4f, 96.0f, 368.0f, 96.0f)
                horizontalLineToRelative(-80.0f)
                curveTo(182.0f, 96.0f, 96.0f, 182.0f, 96.0f, 288.0f)
                curveToRelative(0.0f, 7.0f, 0.8f, 13.7f, 1.5f, 20.5f)
                curveTo(161.3f, 262.8f, 253.4f, 224.0f, 384.0f, 224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                curveTo(132.6f, 256.0f, 26.0f, 410.1f, 2.4f, 468.0f)
                curveToRelative(-6.6f, 16.3f, 1.2f, 34.9f, 17.5f, 41.6f)
                curveToRelative(16.4f, 6.8f, 35.0f, -1.1f, 41.8f, -17.3f)
                curveToRelative(1.5f, -3.6f, 20.9f, -47.9f, 71.9f, -90.6f)
                curveToRelative(32.4f, 43.9f, 94.0f, 85.8f, 174.9f, 77.2f)
                curveTo(465.5f, 467.5f, 576.0f, 326.7f, 576.0f, 154.3f)
                curveToRelative(0.0f, -50.2f, -10.8f, -102.2f, -29.8f, -144.6f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
