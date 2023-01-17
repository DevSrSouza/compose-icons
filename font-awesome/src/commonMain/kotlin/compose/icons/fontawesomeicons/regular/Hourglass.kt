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

public val RegularGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 0.0f)
                curveTo(373.3f, 0.0f, 384.0f, 10.75f, 384.0f, 24.0f)
                curveTo(384.0f, 37.25f, 373.3f, 48.0f, 360.0f, 48.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(66.98f)
                curveTo(352.0f, 107.3f, 335.1f, 145.1f, 307.5f, 174.5f)
                lineTo(225.9f, 256.0f)
                lineTo(307.5f, 337.5f)
                curveTo(335.1f, 366.0f, 352.0f, 404.7f, 352.0f, 445.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(360.0f)
                curveTo(373.3f, 464.0f, 384.0f, 474.7f, 384.0f, 488.0f)
                curveTo(384.0f, 501.3f, 373.3f, 512.0f, 360.0f, 512.0f)
                horizontalLineTo(24.0f)
                curveTo(10.75f, 512.0f, 0.0f, 501.3f, 0.0f, 488.0f)
                curveTo(0.0f, 474.7f, 10.75f, 464.0f, 24.0f, 464.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(445.0f)
                curveTo(32.0f, 404.7f, 48.01f, 366.0f, 76.52f, 337.5f)
                lineTo(158.1f, 256.0f)
                lineTo(76.52f, 174.5f)
                curveTo(48.01f, 145.1f, 32.0f, 107.3f, 32.0f, 66.98f)
                verticalLineTo(48.0f)
                horizontalLineTo(24.0f)
                curveTo(10.75f, 48.0f, 0.0f, 37.25f, 0.0f, 24.0f)
                curveTo(0.0f, 10.75f, 10.75f, 0.0f, 24.0f, 0.0f)
                lineTo(360.0f, 0.0f)
                close()
                moveTo(192.0f, 289.9f)
                lineTo(110.5f, 371.5f)
                curveTo(90.96f, 390.1f, 80.0f, 417.4f, 80.0f, 445.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(304.0f)
                verticalLineTo(445.0f)
                curveTo(304.0f, 417.4f, 293.0f, 390.1f, 273.5f, 371.5f)
                lineTo(192.0f, 289.9f)
                close()
                moveTo(192.0f, 222.1f)
                lineTo(273.5f, 140.5f)
                curveTo(293.0f, 121.0f, 304.0f, 94.56f, 304.0f, 66.98f)
                verticalLineTo(47.1f)
                horizontalLineTo(80.0f)
                verticalLineTo(66.98f)
                curveTo(80.0f, 94.56f, 90.96f, 121.0f, 110.5f, 140.5f)
                lineTo(192.0f, 222.1f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
