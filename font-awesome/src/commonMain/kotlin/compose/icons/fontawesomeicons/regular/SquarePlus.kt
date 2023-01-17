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

public val RegularGroup.SquarePlus: ImageVector
    get() {
        if (_squarePlus != null) {
            return _squarePlus!!
        }
        _squarePlus = Builder(name = "SquarePlus", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 344.0f)
                verticalLineTo(280.0f)
                horizontalLineTo(136.0f)
                curveTo(122.7f, 280.0f, 112.0f, 269.3f, 112.0f, 256.0f)
                curveTo(112.0f, 242.7f, 122.7f, 232.0f, 136.0f, 232.0f)
                horizontalLineTo(200.0f)
                verticalLineTo(168.0f)
                curveTo(200.0f, 154.7f, 210.7f, 144.0f, 224.0f, 144.0f)
                curveTo(237.3f, 144.0f, 248.0f, 154.7f, 248.0f, 168.0f)
                verticalLineTo(232.0f)
                horizontalLineTo(312.0f)
                curveTo(325.3f, 232.0f, 336.0f, 242.7f, 336.0f, 256.0f)
                curveTo(336.0f, 269.3f, 325.3f, 280.0f, 312.0f, 280.0f)
                horizontalLineTo(248.0f)
                verticalLineTo(344.0f)
                curveTo(248.0f, 357.3f, 237.3f, 368.0f, 224.0f, 368.0f)
                curveTo(210.7f, 368.0f, 200.0f, 357.3f, 200.0f, 344.0f)
                close()
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.65f, 28.65f, 32.0f, 64.0f, 32.0f)
                horizontalLineTo(384.0f)
                curveTo(419.3f, 32.0f, 448.0f, 60.65f, 448.0f, 96.0f)
                verticalLineTo(416.0f)
                curveTo(448.0f, 451.3f, 419.3f, 480.0f, 384.0f, 480.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 480.0f, 0.0f, 451.3f, 0.0f, 416.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(48.0f, 96.0f)
                verticalLineTo(416.0f)
                curveTo(48.0f, 424.8f, 55.16f, 432.0f, 64.0f, 432.0f)
                horizontalLineTo(384.0f)
                curveTo(392.8f, 432.0f, 400.0f, 424.8f, 400.0f, 416.0f)
                verticalLineTo(96.0f)
                curveTo(400.0f, 87.16f, 392.8f, 80.0f, 384.0f, 80.0f)
                horizontalLineTo(64.0f)
                curveTo(55.16f, 80.0f, 48.0f, 87.16f, 48.0f, 96.0f)
                close()
            }
        }
        .build()
        return _squarePlus!!
    }

private var _squarePlus: ImageVector? = null
