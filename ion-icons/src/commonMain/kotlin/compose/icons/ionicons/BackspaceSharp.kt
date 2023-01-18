package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BackspaceSharp: ImageVector
    get() {
        if (_backspaceSharp != null) {
            return _backspaceSharp!!
        }
        _backspaceSharp = Builder(name = "BackspaceSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 96.0f)
                lineTo(32.0f, 256.0f)
                lineTo(144.0f, 416.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(359.3f, 322.34f)
                lineTo(336.67f, 345.0f)
                lineToRelative(-65.0f, -65.0f)
                lineToRelative(-65.0f, 65.0f)
                lineTo(184.0f, 322.34f)
                lineToRelative(65.0f, -65.0f)
                lineToRelative(-65.0f, -65.0f)
                lineToRelative(22.63f, -22.63f)
                lineToRelative(65.0f, 65.0f)
                lineToRelative(65.0f, -65.0f)
                lineToRelative(22.63f, 22.63f)
                lineToRelative(-65.0f, 65.0f)
                close()
            }
        }
        .build()
        return _backspaceSharp!!
    }

private var _backspaceSharp: ImageVector? = null
