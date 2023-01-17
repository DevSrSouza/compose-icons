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

public val RegularGroup.SquareCheck: ImageVector
    get() {
        if (_squareCheck != null) {
            return _squareCheck!!
        }
        _squareCheck = Builder(name = "SquareCheck", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.8f, 339.8f)
                curveTo(200.9f, 350.7f, 183.1f, 350.7f, 172.2f, 339.8f)
                lineTo(108.2f, 275.8f)
                curveTo(97.27f, 264.9f, 97.27f, 247.1f, 108.2f, 236.2f)
                curveTo(119.1f, 225.3f, 136.9f, 225.3f, 147.8f, 236.2f)
                lineTo(192.0f, 280.4f)
                lineTo(300.2f, 172.2f)
                curveTo(311.1f, 161.3f, 328.9f, 161.3f, 339.8f, 172.2f)
                curveTo(350.7f, 183.1f, 350.7f, 200.9f, 339.8f, 211.8f)
                lineTo(211.8f, 339.8f)
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
        return _squareCheck!!
    }

private var _squareCheck: ImageVector? = null
