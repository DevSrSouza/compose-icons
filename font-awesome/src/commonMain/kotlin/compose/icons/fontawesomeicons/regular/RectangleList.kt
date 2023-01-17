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

public val RegularGroup.RectangleList: ImageVector
    get() {
        if (_rectangleList != null) {
            return _rectangleList!!
        }
        _rectangleList = Builder(name = "RectangleList", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 192.0f)
                curveTo(110.3f, 192.0f, 96.0f, 177.7f, 96.0f, 160.0f)
                curveTo(96.0f, 142.3f, 110.3f, 128.0f, 128.0f, 128.0f)
                curveTo(145.7f, 128.0f, 160.0f, 142.3f, 160.0f, 160.0f)
                curveTo(160.0f, 177.7f, 145.7f, 192.0f, 128.0f, 192.0f)
                close()
                moveTo(200.0f, 160.0f)
                curveTo(200.0f, 146.7f, 210.7f, 136.0f, 224.0f, 136.0f)
                horizontalLineTo(448.0f)
                curveTo(461.3f, 136.0f, 472.0f, 146.7f, 472.0f, 160.0f)
                curveTo(472.0f, 173.3f, 461.3f, 184.0f, 448.0f, 184.0f)
                horizontalLineTo(224.0f)
                curveTo(210.7f, 184.0f, 200.0f, 173.3f, 200.0f, 160.0f)
                close()
                moveTo(200.0f, 256.0f)
                curveTo(200.0f, 242.7f, 210.7f, 232.0f, 224.0f, 232.0f)
                horizontalLineTo(448.0f)
                curveTo(461.3f, 232.0f, 472.0f, 242.7f, 472.0f, 256.0f)
                curveTo(472.0f, 269.3f, 461.3f, 280.0f, 448.0f, 280.0f)
                horizontalLineTo(224.0f)
                curveTo(210.7f, 280.0f, 200.0f, 269.3f, 200.0f, 256.0f)
                close()
                moveTo(200.0f, 352.0f)
                curveTo(200.0f, 338.7f, 210.7f, 328.0f, 224.0f, 328.0f)
                horizontalLineTo(448.0f)
                curveTo(461.3f, 328.0f, 472.0f, 338.7f, 472.0f, 352.0f)
                curveTo(472.0f, 365.3f, 461.3f, 376.0f, 448.0f, 376.0f)
                horizontalLineTo(224.0f)
                curveTo(210.7f, 376.0f, 200.0f, 365.3f, 200.0f, 352.0f)
                close()
                moveTo(128.0f, 224.0f)
                curveTo(145.7f, 224.0f, 160.0f, 238.3f, 160.0f, 256.0f)
                curveTo(160.0f, 273.7f, 145.7f, 288.0f, 128.0f, 288.0f)
                curveTo(110.3f, 288.0f, 96.0f, 273.7f, 96.0f, 256.0f)
                curveTo(96.0f, 238.3f, 110.3f, 224.0f, 128.0f, 224.0f)
                close()
                moveTo(128.0f, 384.0f)
                curveTo(110.3f, 384.0f, 96.0f, 369.7f, 96.0f, 352.0f)
                curveTo(96.0f, 334.3f, 110.3f, 320.0f, 128.0f, 320.0f)
                curveTo(145.7f, 320.0f, 160.0f, 334.3f, 160.0f, 352.0f)
                curveTo(160.0f, 369.7f, 145.7f, 384.0f, 128.0f, 384.0f)
                close()
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.65f, 28.65f, 32.0f, 64.0f, 32.0f)
                horizontalLineTo(512.0f)
                curveTo(547.3f, 32.0f, 576.0f, 60.65f, 576.0f, 96.0f)
                verticalLineTo(416.0f)
                curveTo(576.0f, 451.3f, 547.3f, 480.0f, 512.0f, 480.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 480.0f, 0.0f, 451.3f, 0.0f, 416.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(48.0f, 96.0f)
                verticalLineTo(416.0f)
                curveTo(48.0f, 424.8f, 55.16f, 432.0f, 64.0f, 432.0f)
                horizontalLineTo(512.0f)
                curveTo(520.8f, 432.0f, 528.0f, 424.8f, 528.0f, 416.0f)
                verticalLineTo(96.0f)
                curveTo(528.0f, 87.16f, 520.8f, 80.0f, 512.0f, 80.0f)
                horizontalLineTo(64.0f)
                curveTo(55.16f, 80.0f, 48.0f, 87.16f, 48.0f, 96.0f)
                close()
            }
        }
        .build()
        return _rectangleList!!
    }

private var _rectangleList: ImageVector? = null
