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
                moveTo(369.9f, 97.9f)
                lineTo(286.0f, 14.0f)
                curveTo(277.0f, 5.0f, 264.8f, -0.1f, 252.1f, -0.1f)
                horizontalLineTo(48.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(131.9f)
                curveToRelative(0.0f, -12.7f, -5.1f, -25.0f, -14.1f, -34.0f)
                close()
                moveTo(332.1f, 128.0f)
                horizontalLineTo(256.0f)
                verticalLineTo(51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48.0f, 464.0f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(288.0f)
                horizontalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
