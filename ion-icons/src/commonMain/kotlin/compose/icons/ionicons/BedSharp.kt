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

public val IonIcons.BedSharp: ImageVector
    get() {
        if (_bedSharp != null) {
            return _bedSharp!!
        }
        _bedSharp = Builder(name = "BedSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 224.0f)
                lineTo(432.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(96.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 96.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, 48.0f)
                lineTo(32.0f, 432.0f)
                lineTo(68.0f, 432.0f)
                lineTo(68.0f, 400.0f)
                lineTo(444.0f, 400.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(36.0f)
                lineTo(480.0f, 272.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 432.0f, 224.0f)
                close()
                moveTo(240.0f, 224.0f)
                lineTo(120.0f, 224.0f)
                lineTo(120.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(272.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                lineTo(272.0f, 224.0f)
                close()
            }
        }
        .build()
        return _bedSharp!!
    }

private var _bedSharp: ImageVector? = null
