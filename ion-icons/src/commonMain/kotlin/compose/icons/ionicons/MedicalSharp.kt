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

public val IonIcons.MedicalSharp: ImageVector
    get() {
        if (_medicalSharp != null) {
            return _medicalSharp!!
        }
        _medicalSharp = Builder(name = "MedicalSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(351.9f, 256.0f)
                lineToRelative(108.1f, -62.4f)
                lineToRelative(-48.0f, -83.2f)
                lineToRelative(-108.0f, 62.4f)
                lineToRelative(0.0f, -124.8f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, 124.8f)
                lineToRelative(-108.0f, -62.4f)
                lineToRelative(-48.0f, 83.2f)
                lineToRelative(108.1f, 62.4f)
                lineToRelative(-108.1f, 62.4f)
                lineToRelative(48.0f, 83.2f)
                lineToRelative(108.0f, -62.4f)
                lineToRelative(0.0f, 124.8f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, -124.8f)
                lineToRelative(108.0f, 62.4f)
                lineToRelative(48.0f, -83.2f)
                lineToRelative(-108.1f, -62.4f)
                close()
            }
        }
        .build()
        return _medicalSharp!!
    }

private var _medicalSharp: ImageVector? = null
