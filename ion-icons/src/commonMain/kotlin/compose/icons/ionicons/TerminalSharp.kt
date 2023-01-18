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

public val IonIcons.TerminalSharp: ImageVector
    get() {
        if (_terminalSharp != null) {
            return _terminalSharp!!
        }
        _terminalSharp = Builder(name = "TerminalSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 44.0f)
                verticalLineTo(468.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(484.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 16.0f, 44.0f)
                close()
                moveTo(73.51f, 237.5f)
                lineTo(150.39f, 176.0f)
                lineTo(73.51f, 114.5f)
                lineToRelative(20.0f, -25.0f)
                lineTo(201.61f, 176.0f)
                lineTo(93.5f, 262.49f)
                close()
                moveTo(272.0f, 256.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _terminalSharp!!
    }

private var _terminalSharp: ImageVector? = null
