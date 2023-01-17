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

public val RegularGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.6f, 118.6f)
                curveTo(206.5f, 82.58f, 244.1f, 56.84f, 288.0f, 49.88f)
                verticalLineTo(32.0f)
                curveTo(288.0f, 14.33f, 302.3f, 0.0f, 320.0f, 0.0f)
                curveTo(337.7f, 0.0f, 352.0f, 14.33f, 352.0f, 32.0f)
                verticalLineTo(49.88f)
                curveTo(424.5f, 61.39f, 480.0f, 124.2f, 480.0f, 200.0f)
                verticalLineTo(233.4f)
                curveTo(480.0f, 278.8f, 495.5f, 322.9f, 523.8f, 358.4f)
                lineTo(538.7f, 377.0f)
                curveTo(543.1f, 383.5f, 545.4f, 392.2f, 542.6f, 400.0f)
                lineTo(630.8f, 469.1f)
                curveTo(641.2f, 477.3f, 643.1f, 492.4f, 634.9f, 502.8f)
                curveTo(626.7f, 513.2f, 611.6f, 515.1f, 601.2f, 506.9f)
                lineTo(9.196f, 42.89f)
                curveTo(-1.236f, 34.71f, -3.065f, 19.63f, 5.112f, 9.196f)
                curveTo(13.29f, -1.236f, 28.37f, -3.065f, 38.81f, 5.112f)
                lineTo(183.6f, 118.6f)
                close()
                moveTo(221.7f, 148.4f)
                lineTo(450.7f, 327.1f)
                curveTo(438.4f, 298.2f, 432.0f, 266.1f, 432.0f, 233.4f)
                verticalLineTo(200.0f)
                curveTo(432.0f, 142.6f, 385.4f, 96.0f, 328.0f, 96.0f)
                horizontalLineTo(312.0f)
                curveTo(273.3f, 96.0f, 239.6f, 117.1f, 221.7f, 148.4f)
                verticalLineTo(148.4f)
                close()
                moveTo(160.0f, 233.4f)
                verticalLineTo(222.1f)
                lineTo(206.7f, 258.9f)
                curveTo(202.7f, 297.7f, 189.5f, 335.2f, 168.3f, 368.0f)
                horizontalLineTo(345.2f)
                lineTo(406.2f, 416.0f)
                horizontalLineTo(120.0f)
                curveTo(110.8f, 416.0f, 102.4f, 410.7f, 98.37f, 402.4f)
                curveTo(94.37f, 394.1f, 95.5f, 384.2f, 101.3f, 377.0f)
                lineTo(116.2f, 358.4f)
                curveTo(144.5f, 322.9f, 160.0f, 278.8f, 160.0f, 233.4f)
                verticalLineTo(233.4f)
                close()
                moveTo(384.0f, 448.0f)
                curveTo(384.0f, 464.1f, 377.3f, 481.3f, 365.3f, 493.3f)
                curveTo(353.3f, 505.3f, 336.1f, 512.0f, 320.0f, 512.0f)
                curveTo(303.0f, 512.0f, 286.7f, 505.3f, 274.7f, 493.3f)
                curveTo(262.7f, 481.3f, 256.0f, 464.1f, 256.0f, 448.0f)
                horizontalLineTo(384.0f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
