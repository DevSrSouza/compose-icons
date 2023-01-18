package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MoonOutline: ImageVector
    get() {
        if (_moonOutline != null) {
            return _moonOutline!!
        }
        _moonOutline = Builder(name = "MoonOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 136.0f)
                curveToRelative(0.0f, -30.62f, 4.51f, -61.61f, 16.0f, -88.0f)
                curveTo(99.57f, 81.27f, 48.0f, 159.32f, 48.0f, 248.0f)
                curveToRelative(0.0f, 119.29f, 96.71f, 216.0f, 216.0f, 216.0f)
                curveToRelative(88.68f, 0.0f, 166.73f, -51.57f, 200.0f, -128.0f)
                curveToRelative(-26.39f, 11.49f, -57.38f, 16.0f, -88.0f, 16.0f)
                curveTo(256.71f, 352.0f, 160.0f, 255.29f, 160.0f, 136.0f)
                close()
            }
        }
        .build()
        return _moonOutline!!
    }

private var _moonOutline: ImageVector? = null
