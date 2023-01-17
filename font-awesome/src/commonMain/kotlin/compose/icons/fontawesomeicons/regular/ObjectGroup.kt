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

public val RegularGroup.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 160.0f)
                curveTo(128.0f, 142.3f, 142.3f, 128.0f, 160.0f, 128.0f)
                horizontalLineTo(288.0f)
                curveTo(305.7f, 128.0f, 320.0f, 142.3f, 320.0f, 160.0f)
                verticalLineTo(256.0f)
                curveTo(320.0f, 273.7f, 305.7f, 288.0f, 288.0f, 288.0f)
                horizontalLineTo(160.0f)
                curveTo(142.3f, 288.0f, 128.0f, 273.7f, 128.0f, 256.0f)
                verticalLineTo(160.0f)
                close()
                moveTo(288.0f, 320.0f)
                curveTo(323.3f, 320.0f, 352.0f, 291.3f, 352.0f, 256.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(416.0f)
                curveTo(433.7f, 224.0f, 448.0f, 238.3f, 448.0f, 256.0f)
                verticalLineTo(352.0f)
                curveTo(448.0f, 369.7f, 433.7f, 384.0f, 416.0f, 384.0f)
                horizontalLineTo(288.0f)
                curveTo(270.3f, 384.0f, 256.0f, 369.7f, 256.0f, 352.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(288.0f)
                close()
                moveTo(48.0f, 115.8f)
                curveTo(38.18f, 106.1f, 32.0f, 94.22f, 32.0f, 80.0f)
                curveTo(32.0f, 53.49f, 53.49f, 32.0f, 80.0f, 32.0f)
                curveTo(94.22f, 32.0f, 106.1f, 38.18f, 115.8f, 48.0f)
                horizontalLineTo(460.2f)
                curveTo(469.0f, 38.18f, 481.8f, 32.0f, 496.0f, 32.0f)
                curveTo(522.5f, 32.0f, 544.0f, 53.49f, 544.0f, 80.0f)
                curveTo(544.0f, 94.22f, 537.8f, 106.1f, 528.0f, 115.8f)
                verticalLineTo(396.2f)
                curveTo(537.8f, 405.0f, 544.0f, 417.8f, 544.0f, 432.0f)
                curveTo(544.0f, 458.5f, 522.5f, 480.0f, 496.0f, 480.0f)
                curveTo(481.8f, 480.0f, 469.0f, 473.8f, 460.2f, 464.0f)
                horizontalLineTo(115.8f)
                curveTo(106.1f, 473.8f, 94.22f, 480.0f, 80.0f, 480.0f)
                curveTo(53.49f, 480.0f, 32.0f, 458.5f, 32.0f, 432.0f)
                curveTo(32.0f, 417.8f, 38.18f, 405.0f, 48.0f, 396.2f)
                verticalLineTo(115.8f)
                close()
                moveTo(96.0f, 125.3f)
                verticalLineTo(386.7f)
                curveTo(109.6f, 391.6f, 120.4f, 402.4f, 125.3f, 416.0f)
                horizontalLineTo(450.7f)
                curveTo(455.6f, 402.4f, 466.4f, 391.6f, 480.0f, 386.7f)
                verticalLineTo(125.3f)
                curveTo(466.4f, 120.4f, 455.6f, 109.6f, 450.7f, 96.0f)
                horizontalLineTo(125.3f)
                curveTo(120.4f, 109.6f, 109.6f, 120.4f, 96.0f, 125.3f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null
