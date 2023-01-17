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

public val RegularGroup.TrashCan: ImageVector
    get() {
        if (_trashCan != null) {
            return _trashCan!!
        }
        _trashCan = Builder(name = "TrashCan", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 400.0f)
                curveTo(160.0f, 408.8f, 152.8f, 416.0f, 144.0f, 416.0f)
                curveTo(135.2f, 416.0f, 128.0f, 408.8f, 128.0f, 400.0f)
                verticalLineTo(192.0f)
                curveTo(128.0f, 183.2f, 135.2f, 176.0f, 144.0f, 176.0f)
                curveTo(152.8f, 176.0f, 160.0f, 183.2f, 160.0f, 192.0f)
                verticalLineTo(400.0f)
                close()
                moveTo(240.0f, 400.0f)
                curveTo(240.0f, 408.8f, 232.8f, 416.0f, 224.0f, 416.0f)
                curveTo(215.2f, 416.0f, 208.0f, 408.8f, 208.0f, 400.0f)
                verticalLineTo(192.0f)
                curveTo(208.0f, 183.2f, 215.2f, 176.0f, 224.0f, 176.0f)
                curveTo(232.8f, 176.0f, 240.0f, 183.2f, 240.0f, 192.0f)
                verticalLineTo(400.0f)
                close()
                moveTo(320.0f, 400.0f)
                curveTo(320.0f, 408.8f, 312.8f, 416.0f, 304.0f, 416.0f)
                curveTo(295.2f, 416.0f, 288.0f, 408.8f, 288.0f, 400.0f)
                verticalLineTo(192.0f)
                curveTo(288.0f, 183.2f, 295.2f, 176.0f, 304.0f, 176.0f)
                curveTo(312.8f, 176.0f, 320.0f, 183.2f, 320.0f, 192.0f)
                verticalLineTo(400.0f)
                close()
                moveTo(317.5f, 24.94f)
                lineTo(354.2f, 80.0f)
                horizontalLineTo(424.0f)
                curveTo(437.3f, 80.0f, 448.0f, 90.75f, 448.0f, 104.0f)
                curveTo(448.0f, 117.3f, 437.3f, 128.0f, 424.0f, 128.0f)
                horizontalLineTo(416.0f)
                verticalLineTo(432.0f)
                curveTo(416.0f, 476.2f, 380.2f, 512.0f, 336.0f, 512.0f)
                horizontalLineTo(112.0f)
                curveTo(67.82f, 512.0f, 32.0f, 476.2f, 32.0f, 432.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(24.0f)
                curveTo(10.75f, 128.0f, 0.0f, 117.3f, 0.0f, 104.0f)
                curveTo(0.0f, 90.75f, 10.75f, 80.0f, 24.0f, 80.0f)
                horizontalLineTo(93.82f)
                lineTo(130.5f, 24.94f)
                curveTo(140.9f, 9.357f, 158.4f, 0.0f, 177.1f, 0.0f)
                horizontalLineTo(270.9f)
                curveTo(289.6f, 0.0f, 307.1f, 9.358f, 317.5f, 24.94f)
                horizontalLineTo(317.5f)
                close()
                moveTo(151.5f, 80.0f)
                horizontalLineTo(296.5f)
                lineTo(277.5f, 51.56f)
                curveTo(276.0f, 49.34f, 273.5f, 48.0f, 270.9f, 48.0f)
                horizontalLineTo(177.1f)
                curveTo(174.5f, 48.0f, 171.1f, 49.34f, 170.5f, 51.56f)
                lineTo(151.5f, 80.0f)
                close()
                moveTo(80.0f, 432.0f)
                curveTo(80.0f, 449.7f, 94.33f, 464.0f, 112.0f, 464.0f)
                horizontalLineTo(336.0f)
                curveTo(353.7f, 464.0f, 368.0f, 449.7f, 368.0f, 432.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(432.0f)
                close()
            }
        }
        .build()
        return _trashCan!!
    }

private var _trashCan: ImageVector? = null
