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

public val RegularGroup.WindowRestore: ImageVector
    get() {
        if (_windowRestore != null) {
            return _windowRestore!!
        }
        _windowRestore = Builder(name = "WindowRestore", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 48.0f)
                horizontalLineTo(208.0f)
                curveTo(190.3f, 48.0f, 176.0f, 62.33f, 176.0f, 80.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(80.0f)
                curveTo(128.0f, 35.82f, 163.8f, 0.0f, 208.0f, 0.0f)
                horizontalLineTo(432.0f)
                curveTo(476.2f, 0.0f, 512.0f, 35.82f, 512.0f, 80.0f)
                verticalLineTo(304.0f)
                curveTo(512.0f, 348.2f, 476.2f, 384.0f, 432.0f, 384.0f)
                horizontalLineTo(416.0f)
                verticalLineTo(336.0f)
                horizontalLineTo(432.0f)
                curveTo(449.7f, 336.0f, 464.0f, 321.7f, 464.0f, 304.0f)
                verticalLineTo(80.0f)
                curveTo(464.0f, 62.33f, 449.7f, 48.0f, 432.0f, 48.0f)
                close()
                moveTo(320.0f, 128.0f)
                curveTo(355.3f, 128.0f, 384.0f, 156.7f, 384.0f, 192.0f)
                verticalLineTo(448.0f)
                curveTo(384.0f, 483.3f, 355.3f, 512.0f, 320.0f, 512.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 512.0f, 0.0f, 483.3f, 0.0f, 448.0f)
                verticalLineTo(192.0f)
                curveTo(0.0f, 156.7f, 28.65f, 128.0f, 64.0f, 128.0f)
                horizontalLineTo(320.0f)
                close()
                moveTo(64.0f, 464.0f)
                horizontalLineTo(320.0f)
                curveTo(328.8f, 464.0f, 336.0f, 456.8f, 336.0f, 448.0f)
                verticalLineTo(256.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(448.0f)
                curveTo(48.0f, 456.8f, 55.16f, 464.0f, 64.0f, 464.0f)
                close()
            }
        }
        .build()
        return _windowRestore!!
    }

private var _windowRestore: ImageVector? = null
