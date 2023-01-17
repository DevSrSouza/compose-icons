package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                verticalLineTo(49.88f)
                curveTo(328.5f, 61.39f, 384.0f, 124.2f, 384.0f, 200.0f)
                verticalLineTo(233.4f)
                curveTo(384.0f, 278.8f, 399.5f, 322.9f, 427.8f, 358.4f)
                lineTo(442.7f, 377.0f)
                curveTo(448.5f, 384.2f, 449.6f, 394.1f, 445.6f, 402.4f)
                curveTo(441.6f, 410.7f, 433.2f, 416.0f, 424.0f, 416.0f)
                horizontalLineTo(24.0f)
                curveTo(14.77f, 416.0f, 6.365f, 410.7f, 2.369f, 402.4f)
                curveTo(-1.628f, 394.1f, -0.504f, 384.2f, 5.26f, 377.0f)
                lineTo(20.17f, 358.4f)
                curveTo(48.54f, 322.9f, 64.0f, 278.8f, 64.0f, 233.4f)
                verticalLineTo(200.0f)
                curveTo(64.0f, 124.2f, 119.5f, 61.39f, 192.0f, 49.88f)
                verticalLineTo(32.0f)
                curveTo(192.0f, 14.33f, 206.3f, 0.0f, 224.0f, 0.0f)
                curveTo(241.7f, 0.0f, 256.0f, 14.33f, 256.0f, 32.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(216.0f, 96.0f)
                curveTo(158.6f, 96.0f, 112.0f, 142.6f, 112.0f, 200.0f)
                verticalLineTo(233.4f)
                curveTo(112.0f, 281.3f, 98.12f, 328.0f, 72.31f, 368.0f)
                horizontalLineTo(375.7f)
                curveTo(349.9f, 328.0f, 336.0f, 281.3f, 336.0f, 233.4f)
                verticalLineTo(200.0f)
                curveTo(336.0f, 142.6f, 289.4f, 96.0f, 232.0f, 96.0f)
                horizontalLineTo(216.0f)
                close()
                moveTo(288.0f, 448.0f)
                curveTo(288.0f, 464.1f, 281.3f, 481.3f, 269.3f, 493.3f)
                curveTo(257.3f, 505.3f, 240.1f, 512.0f, 224.0f, 512.0f)
                curveTo(207.0f, 512.0f, 190.7f, 505.3f, 178.7f, 493.3f)
                curveTo(166.7f, 481.3f, 160.0f, 464.1f, 160.0f, 448.0f)
                horizontalLineTo(288.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
