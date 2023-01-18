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

public val LightGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 18.0f)
                horizontalLineTo(72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 32.0f)
                verticalLineTo(77.3f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 2.8f, 8.4f)
                lineToRelative(20.8f, 27.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 0.4f, 1.2f)
                verticalLineTo(224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(114.7f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 0.4f, -1.2f)
                lineToRelative(20.8f, -27.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 2.8f, -8.4f)
                verticalLineTo(32.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 184.0f, 18.0f)
                close()
                moveTo(72.0f, 30.0f)
                horizontalLineTo(184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(58.0f)
                horizontalLineTo(70.0f)
                verticalLineTo(32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 72.0f, 30.0f)
                close()
                moveTo(185.6f, 78.5f)
                lineToRelative(-20.8f, 27.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -2.8f, 8.4f)
                verticalLineTo(224.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(114.7f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -2.8f, -8.4f)
                lineTo(70.4f, 78.5f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -0.4f, -1.2f)
                verticalLineTo(70.0f)
                horizontalLineTo(186.0f)
                verticalLineToRelative(7.3f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 185.6f, 78.5f)
                close()
                moveTo(134.0f, 120.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
