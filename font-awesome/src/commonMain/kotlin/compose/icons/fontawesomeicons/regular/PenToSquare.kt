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

public val RegularGroup.PenToSquare: ImageVector
    get() {
        if (_penToSquare != null) {
            return _penToSquare!!
        }
        _penToSquare = Builder(name = "PenToSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(373.1f, 24.97f)
                curveTo(401.2f, -3.147f, 446.8f, -3.147f, 474.9f, 24.97f)
                lineTo(487.0f, 37.09f)
                curveTo(515.1f, 65.21f, 515.1f, 110.8f, 487.0f, 138.9f)
                lineTo(289.8f, 336.2f)
                curveTo(281.1f, 344.8f, 270.4f, 351.1f, 258.6f, 354.5f)
                lineTo(158.6f, 383.1f)
                curveTo(150.2f, 385.5f, 141.2f, 383.1f, 135.0f, 376.1f)
                curveTo(128.9f, 370.8f, 126.5f, 361.8f, 128.9f, 353.4f)
                lineTo(157.5f, 253.4f)
                curveTo(160.9f, 241.6f, 167.2f, 230.9f, 175.8f, 222.2f)
                lineTo(373.1f, 24.97f)
                close()
                moveTo(440.1f, 58.91f)
                curveTo(431.6f, 49.54f, 416.4f, 49.54f, 407.0f, 58.91f)
                lineTo(377.9f, 88.0f)
                lineTo(424.0f, 134.1f)
                lineTo(453.1f, 104.1f)
                curveTo(462.5f, 95.6f, 462.5f, 80.4f, 453.1f, 71.03f)
                lineTo(440.1f, 58.91f)
                close()
                moveTo(203.7f, 266.6f)
                lineTo(186.9f, 325.1f)
                lineTo(245.4f, 308.3f)
                curveTo(249.4f, 307.2f, 252.9f, 305.1f, 255.8f, 302.2f)
                lineTo(390.1f, 168.0f)
                lineTo(344.0f, 121.9f)
                lineTo(209.8f, 256.2f)
                curveTo(206.9f, 259.1f, 204.8f, 262.6f, 203.7f, 266.6f)
                close()
                moveTo(200.0f, 64.0f)
                curveTo(213.3f, 64.0f, 224.0f, 74.75f, 224.0f, 88.0f)
                curveTo(224.0f, 101.3f, 213.3f, 112.0f, 200.0f, 112.0f)
                horizontalLineTo(88.0f)
                curveTo(65.91f, 112.0f, 48.0f, 129.9f, 48.0f, 152.0f)
                verticalLineTo(424.0f)
                curveTo(48.0f, 446.1f, 65.91f, 464.0f, 88.0f, 464.0f)
                horizontalLineTo(360.0f)
                curveTo(382.1f, 464.0f, 400.0f, 446.1f, 400.0f, 424.0f)
                verticalLineTo(312.0f)
                curveTo(400.0f, 298.7f, 410.7f, 288.0f, 424.0f, 288.0f)
                curveTo(437.3f, 288.0f, 448.0f, 298.7f, 448.0f, 312.0f)
                verticalLineTo(424.0f)
                curveTo(448.0f, 472.6f, 408.6f, 512.0f, 360.0f, 512.0f)
                horizontalLineTo(88.0f)
                curveTo(39.4f, 512.0f, 0.0f, 472.6f, 0.0f, 424.0f)
                verticalLineTo(152.0f)
                curveTo(0.0f, 103.4f, 39.4f, 64.0f, 88.0f, 64.0f)
                horizontalLineTo(200.0f)
                close()
            }
        }
        .build()
        return _penToSquare!!
    }

private var _penToSquare: ImageVector? = null
