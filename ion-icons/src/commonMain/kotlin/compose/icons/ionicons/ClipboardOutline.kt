package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ClipboardOutline: ImageVector
    get() {
        if (_clipboardOutline != null) {
            return _clipboardOutline!!
        }
        _clipboardOutline = Builder(name = "ClipboardOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineTo(432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                horizontalLineTo(144.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f)
                horizontalLineToRelative(32.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(202.13f, 32.0f)
                lineTo(309.87f, 32.0f)
                arcTo(26.13f, 26.13f, 0.0f, false, true, 336.0f, 58.13f)
                lineTo(336.0f, 69.87f)
                arcTo(26.13f, 26.13f, 0.0f, false, true, 309.87f, 96.0f)
                lineTo(202.13f, 96.0f)
                arcTo(26.13f, 26.13f, 0.0f, false, true, 176.0f, 69.87f)
                lineTo(176.0f, 58.13f)
                arcTo(26.13f, 26.13f, 0.0f, false, true, 202.13f, 32.0f)
                close()
            }
        }
        .build()
        return _clipboardOutline!!
    }

private var _clipboardOutline: ImageVector? = null
