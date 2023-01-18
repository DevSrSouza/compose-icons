package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 242.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.1f, -1.6f)
                lineToRelative(-72.0f, -68.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 50.0f, 168.0f)
                verticalLineTo(100.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(56.9f)
                lineToRelative(-61.0f, -57.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.5f, -6.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 56.0f, 26.0f)
                horizontalLineTo(200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(143.1f)
                lineToRelative(61.0f, 57.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.5f, 6.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 200.0f, 174.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.6f, 5.5f)
                arcTo(6.9f, 6.9f, 0.0f, false, true, 128.0f, 242.0f)
                close()
                moveTo(62.0f, 165.4f)
                lineToRelative(60.0f, 56.7f)
                verticalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(56.9f)
                lineToRelative(-59.3f, -56.0f)
                horizontalLineTo(62.0f)
                close()
                moveTo(130.4f, 94.0f)
                horizontalLineTo(194.0f)
                verticalLineTo(38.0f)
                horizontalLineTo(71.1f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
