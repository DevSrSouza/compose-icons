package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.NuclearSharp: ImageVector
    get() {
        if (_nuclearSharp != null) {
            return _nuclearSharp!!
        }
        _nuclearSharp = Builder(name = "NuclearSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.08f, 108.92f)
                arcTo(208.0f, 208.0f, 0.0f, false, false, 108.92f, 403.08f)
                arcTo(208.0f, 208.0f, 0.0f, false, false, 403.08f, 108.92f)
                close()
                moveTo(342.0f, 256.0f)
                arcToRelative(86.13f, 86.13f, 0.0f, false, true, -53.47f, 79.59f)
                lineToRelative(51.71f, 68.0f)
                arcToRelative(169.73f, 169.73f, 0.0f, false, true, -168.48f, 0.0f)
                lineToRelative(51.71f, -68.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, -50.56f, -101.77f)
                lineToRelative(-85.48f, 0.09f)
                arcToRelative(170.21f, 170.21f, 0.0f, false, true, 73.83f, -119.0f)
                lineTo(199.2f, 191.5f)
                arcToRelative(85.78f, 85.78f, 0.0f, false, true, 113.6f, 0.0f)
                lineToRelative(37.94f, -76.59f)
                arcToRelative(170.21f, 170.21f, 0.0f, false, true, 73.83f, 119.0f)
                lineToRelative(-85.48f, -0.09f)
                arcTo(85.87f, 85.87f, 0.0f, false, true, 342.0f, 256.0f)
                close()
            }
        }
        .build()
        return _nuclearSharp!!
    }

private var _nuclearSharp: ImageVector? = null
