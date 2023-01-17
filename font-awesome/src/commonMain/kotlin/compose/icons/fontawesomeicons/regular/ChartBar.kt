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

public val RegularGroup.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 32.0f)
                curveTo(37.25f, 32.0f, 48.0f, 42.75f, 48.0f, 56.0f)
                verticalLineTo(408.0f)
                curveTo(48.0f, 421.3f, 58.75f, 432.0f, 72.0f, 432.0f)
                horizontalLineTo(488.0f)
                curveTo(501.3f, 432.0f, 512.0f, 442.7f, 512.0f, 456.0f)
                curveTo(512.0f, 469.3f, 501.3f, 480.0f, 488.0f, 480.0f)
                horizontalLineTo(72.0f)
                curveTo(32.24f, 480.0f, 0.0f, 447.8f, 0.0f, 408.0f)
                verticalLineTo(56.0f)
                curveTo(0.0f, 42.75f, 10.75f, 32.0f, 24.0f, 32.0f)
                close()
                moveTo(128.0f, 136.0f)
                curveTo(128.0f, 122.7f, 138.7f, 112.0f, 152.0f, 112.0f)
                horizontalLineTo(360.0f)
                curveTo(373.3f, 112.0f, 384.0f, 122.7f, 384.0f, 136.0f)
                curveTo(384.0f, 149.3f, 373.3f, 160.0f, 360.0f, 160.0f)
                horizontalLineTo(152.0f)
                curveTo(138.7f, 160.0f, 128.0f, 149.3f, 128.0f, 136.0f)
                close()
                moveTo(296.0f, 208.0f)
                curveTo(309.3f, 208.0f, 320.0f, 218.7f, 320.0f, 232.0f)
                curveTo(320.0f, 245.3f, 309.3f, 256.0f, 296.0f, 256.0f)
                horizontalLineTo(152.0f)
                curveTo(138.7f, 256.0f, 128.0f, 245.3f, 128.0f, 232.0f)
                curveTo(128.0f, 218.7f, 138.7f, 208.0f, 152.0f, 208.0f)
                horizontalLineTo(296.0f)
                close()
                moveTo(424.0f, 304.0f)
                curveTo(437.3f, 304.0f, 448.0f, 314.7f, 448.0f, 328.0f)
                curveTo(448.0f, 341.3f, 437.3f, 352.0f, 424.0f, 352.0f)
                horizontalLineTo(152.0f)
                curveTo(138.7f, 352.0f, 128.0f, 341.3f, 128.0f, 328.0f)
                curveTo(128.0f, 314.7f, 138.7f, 304.0f, 152.0f, 304.0f)
                horizontalLineTo(424.0f)
                close()
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
