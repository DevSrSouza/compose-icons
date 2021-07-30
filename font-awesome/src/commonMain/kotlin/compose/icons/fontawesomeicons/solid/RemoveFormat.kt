package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RemoveFormat: ImageVector
    get() {
        if (_removeFormat != null) {
            return _removeFormat!!
        }
        _removeFormat = Builder(name = "RemoveFormat", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 416.0f)
                horizontalLineToRelative(-11.17f)
                lineToRelative(9.26f, -27.77f)
                lineTo(267.0f, 336.4f)
                lineTo(240.49f, 416.0f)
                lineTo(208.0f, 416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(633.82f, 458.1f)
                lineTo(377.0f, 259.59f)
                lineTo(426.17f, 112.0f)
                lineTo(544.0f, 112.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(608.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(176.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(43.9f)
                lineTo(45.46f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 2.81f, 22.45f)
                lineToRelative(588.36f, 454.72f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.82f, -22.45f)
                close()
                moveTo(309.91f, 207.76f)
                lineTo(224.0f, 141.36f)
                lineTo(224.0f, 112.0f)
                horizontalLineToRelative(117.83f)
                close()
            }
        }
        .build()
        return _removeFormat!!
    }

private var _removeFormat: ImageVector? = null
