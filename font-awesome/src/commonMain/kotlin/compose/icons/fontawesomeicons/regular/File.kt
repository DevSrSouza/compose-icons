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

public val RegularGroup.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.65f, 28.65f, 0.0f, 64.0f, 0.0f)
                horizontalLineTo(229.5f)
                curveTo(246.5f, 0.0f, 262.7f, 6.743f, 274.7f, 18.75f)
                lineTo(365.3f, 109.3f)
                curveTo(377.3f, 121.3f, 384.0f, 137.5f, 384.0f, 154.5f)
                verticalLineTo(448.0f)
                curveTo(384.0f, 483.3f, 355.3f, 512.0f, 320.0f, 512.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 512.0f, 0.0f, 483.3f, 0.0f, 448.0f)
                verticalLineTo(64.0f)
                close()
                moveTo(336.0f, 448.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(256.0f)
                curveTo(238.3f, 160.0f, 224.0f, 145.7f, 224.0f, 128.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(64.0f)
                curveTo(55.16f, 48.0f, 48.0f, 55.16f, 48.0f, 64.0f)
                verticalLineTo(448.0f)
                curveTo(48.0f, 456.8f, 55.16f, 464.0f, 64.0f, 464.0f)
                horizontalLineTo(320.0f)
                curveTo(328.8f, 464.0f, 336.0f, 456.8f, 336.0f, 448.0f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
