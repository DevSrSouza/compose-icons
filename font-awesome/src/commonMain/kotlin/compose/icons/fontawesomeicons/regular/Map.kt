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

public val RegularGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(565.6f, 36.24f)
                curveTo(572.1f, 40.72f, 576.0f, 48.11f, 576.0f, 56.0f)
                verticalLineTo(392.0f)
                curveTo(576.0f, 401.1f, 569.8f, 410.9f, 560.5f, 414.4f)
                lineTo(392.5f, 478.4f)
                curveTo(387.4f, 480.4f, 381.7f, 480.5f, 376.4f, 478.8f)
                lineTo(192.5f, 417.5f)
                lineTo(32.54f, 478.4f)
                curveTo(25.17f, 481.2f, 16.88f, 480.2f, 10.38f, 475.8f)
                curveTo(3.882f, 471.3f, 0.0f, 463.9f, 0.0f, 456.0f)
                verticalLineTo(120.0f)
                curveTo(0.0f, 110.0f, 6.15f, 101.1f, 15.46f, 97.57f)
                lineTo(183.5f, 33.57f)
                curveTo(188.6f, 31.6f, 194.3f, 31.48f, 199.6f, 33.23f)
                lineTo(383.5f, 94.52f)
                lineTo(543.5f, 33.57f)
                curveTo(550.8f, 30.76f, 559.1f, 31.76f, 565.6f, 36.24f)
                horizontalLineTo(565.6f)
                close()
                moveTo(48.0f, 421.2f)
                lineTo(168.0f, 375.5f)
                verticalLineTo(90.83f)
                lineTo(48.0f, 136.5f)
                verticalLineTo(421.2f)
                close()
                moveTo(360.0f, 137.3f)
                lineTo(216.0f, 89.3f)
                verticalLineTo(374.7f)
                lineTo(360.0f, 422.7f)
                verticalLineTo(137.3f)
                close()
                moveTo(408.0f, 421.2f)
                lineTo(528.0f, 375.5f)
                verticalLineTo(90.83f)
                lineTo(408.0f, 136.5f)
                verticalLineTo(421.2f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
