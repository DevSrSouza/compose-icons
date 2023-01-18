package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 248.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -8.2f, -3.3f)
                lineToRelative(-72.0f, -68.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 44.0f, 168.0f)
                verticalLineTo(100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 88.0f)
                horizontalLineTo(97.8f)
                lineToRelative(-50.0f, -47.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.0f, -13.1f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 56.0f, 20.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(158.2f)
                lineToRelative(50.0f, 47.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.0f, 13.1f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 200.0f, 180.0f)
                horizontalLineTo(140.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -7.2f, 11.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, true, 128.0f, 248.0f)
                close()
                moveTo(68.0f, 162.8f)
                lineToRelative(48.0f, 45.4f)
                verticalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(41.8f)
                lineToRelative(-46.6f, -44.0f)
                horizontalLineTo(68.0f)
                close()
                moveTo(132.8f, 88.0f)
                horizontalLineTo(188.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(86.2f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
