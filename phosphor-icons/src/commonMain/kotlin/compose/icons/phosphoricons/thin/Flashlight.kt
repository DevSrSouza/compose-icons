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

public val ThinGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 20.0f)
                horizontalLineTo(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 32.0f)
                verticalLineTo(77.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 2.4f, 7.2f)
                lineToRelative(20.8f, 27.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.8f, 2.4f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(114.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.8f, -2.4f)
                lineToRelative(20.8f, -27.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 2.4f, -7.2f)
                verticalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 20.0f)
                close()
                moveTo(72.0f, 28.0f)
                horizontalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 28.0f)
                close()
                moveTo(187.2f, 79.7f)
                lineToRelative(-20.8f, 27.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -2.4f, 7.2f)
                verticalLineTo(224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(114.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -2.4f, -7.2f)
                lineTo(68.8f, 79.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.8f, -2.4f)
                verticalLineTo(68.0f)
                horizontalLineTo(188.0f)
                verticalLineToRelative(9.3f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 187.2f, 79.7f)
                close()
                moveTo(132.0f, 120.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
