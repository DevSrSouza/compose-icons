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

public val IonIcons.LogoDropbox: ImageVector
    get() {
        if (_logoDropbox != null) {
            return _logoDropbox!!
        }
        _logoDropbox = Builder(name = "LogoDropbox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.32f, 126.24f)
                lineTo(136.16f, 204.49f)
                lineToRelative(120.16f, 78.24f)
                lineTo(136.16f, 361.0f)
                lineTo(16.0f, 282.08f)
                lineToRelative(120.16f, -78.24f)
                lineTo(16.0f, 126.24f)
                lineTo(136.16f, 48.0f)
                close()
                moveTo(135.52f, 385.76f)
                lineToRelative(120.16f, -78.25f)
                lineToRelative(120.16f, 78.25f)
                lineTo(255.68f, 464.0f)
                close()
                moveTo(256.32f, 282.08f)
                lineTo(376.48f, 203.84f)
                lineTo(256.32f, 126.24f)
                lineTo(375.84f, 48.0f)
                lineTo(496.0f, 126.24f)
                lineTo(375.84f, 204.49f)
                lineTo(496.0f, 282.73f)
                lineTo(375.84f, 361.0f)
                close()
            }
        }
        .build()
        return _logoDropbox!!
    }

private var _logoDropbox: ImageVector? = null
