package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PrismOutline: ImageVector
    get() {
        if (_prismOutline != null) {
            return _prismOutline!!
        }
        _prismOutline = Builder(name = "PrismOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(229.73f, 45.88f)
                lineTo(37.53f, 327.79f)
                arcToRelative(31.79f, 31.79f, 0.0f, false, false, 11.31f, 46.0f)
                lineTo(241.0f, 476.26f)
                arcToRelative(31.77f, 31.77f, 0.0f, false, false, 29.92f, 0.0f)
                lineToRelative(192.2f, -102.51f)
                arcToRelative(31.79f, 31.79f, 0.0f, false, false, 11.31f, -46.0f)
                lineTo(282.27f, 45.88f)
                arcTo(31.8f, 31.8f, 0.0f, false, false, 229.73f, 45.88f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                lineTo(256.0f, 480.0f)
            }
        }
        .build()
        return _prismOutline!!
    }

private var _prismOutline: ImageVector? = null
