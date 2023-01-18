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

public val IonIcons.ReaderSharp: ImageVector
    get() {
        if (_readerSharp != null) {
            return _readerSharp!!
        }
        _readerSharp = Builder(name = "ReaderSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 44.0f)
                lineTo(80.0f, 468.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(420.0f, 480.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(432.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(92.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 44.0f)
                close()
                moveTo(272.0f, 304.0f)
                lineTo(160.0f, 304.0f)
                lineTo(160.0f, 272.0f)
                lineTo(272.0f, 272.0f)
                close()
                moveTo(352.0f, 224.0f)
                lineTo(160.0f, 224.0f)
                lineTo(160.0f, 192.0f)
                lineTo(352.0f, 192.0f)
                close()
                moveTo(352.0f, 144.0f)
                lineTo(160.0f, 144.0f)
                lineTo(160.0f, 112.0f)
                lineTo(352.0f, 112.0f)
                close()
            }
        }
        .build()
        return _readerSharp!!
    }

private var _readerSharp: ImageVector? = null
