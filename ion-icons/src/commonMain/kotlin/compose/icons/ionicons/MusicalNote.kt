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

public val IonIcons.MusicalNote: ImageVector
    get() {
        if (_musicalNote != null) {
            return _musicalNote!!
        }
        _musicalNote = Builder(name = "MusicalNote", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.83f, 480.0f)
                arcToRelative(55.2f, 55.2f, 0.0f, false, true, -32.36f, -10.55f)
                arcTo(56.64f, 56.64f, 0.0f, false, true, 128.0f, 423.58f)
                arcToRelative(50.26f, 50.26f, 0.0f, false, true, 34.14f, -47.73f)
                lineTo(213.0f, 358.73f)
                arcToRelative(16.25f, 16.25f, 0.0f, false, false, 11.0f, -15.49f)
                verticalLineTo(92.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 24.09f, -31.15f)
                lineTo(356.48f, 32.71f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 384.0f, 54.0f)
                verticalLineToRelative(57.75f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, -24.2f, 31.19f)
                lineToRelative(-91.65f, 23.13f)
                arcTo(16.24f, 16.24f, 0.0f, false, false, 256.0f, 181.91f)
                verticalLineTo(424.0f)
                arcToRelative(48.22f, 48.22f, 0.0f, false, true, -32.78f, 45.81f)
                lineToRelative(-21.47f, 7.23f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 183.83f, 480.0f)
                close()
            }
        }
        .build()
        return _musicalNote!!
    }

private var _musicalNote: ImageVector? = null
