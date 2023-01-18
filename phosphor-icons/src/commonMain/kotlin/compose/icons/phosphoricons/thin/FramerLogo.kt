package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 240.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.7f, -1.1f)
                lineToRelative(-72.0f, -68.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 52.0f, 168.0f)
                verticalLineTo(100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(61.9f)
                lineTo(53.3f, 34.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 28.0f)
                horizontalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(138.1f)
                lineToRelative(64.6f, 61.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 172.0f)
                horizontalLineTo(132.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, 3.7f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 128.0f, 240.0f)
                close()
                moveTo(60.0f, 166.3f)
                lineToRelative(64.0f, 60.4f)
                verticalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(61.9f)
                lineToRelative(-63.5f, -60.0f)
                horizontalLineTo(60.0f)
                close()
                moveTo(129.6f, 96.0f)
                horizontalLineTo(196.0f)
                verticalLineTo(36.0f)
                horizontalLineTo(66.1f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
