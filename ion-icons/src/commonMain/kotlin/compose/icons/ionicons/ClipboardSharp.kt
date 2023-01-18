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

public val IonIcons.ClipboardSharp: ImageVector
    get() {
        if (_clipboardSharp != null) {
            return _clipboardSharp!!
        }
        _clipboardSharp = Builder(name = "ClipboardSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(420.0f, 48.0f)
                lineTo(352.0f, 48.0f)
                lineTo(352.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(172.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(160.0f, 48.0f)
                lineTo(92.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 60.0f)
                lineTo(80.0f, 484.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(420.0f, 496.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(432.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 420.0f, 48.0f)
                close()
                moveTo(335.87f, 112.0f)
                lineTo(176.13f, 112.0f)
                lineTo(176.13f, 80.0f)
                lineTo(335.87f, 80.0f)
                close()
            }
        }
        .build()
        return _clipboardSharp!!
    }

private var _clipboardSharp: ImageVector? = null
