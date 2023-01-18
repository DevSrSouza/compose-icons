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

public val IonIcons.ColorFilterOutline: ImageVector
    get() {
        if (_colorFilterOutline != null) {
            return _colorFilterOutline!!
        }
        _colorFilterOutline = Builder(name = "ColorFilterOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 184.0f)
                moveToRelative(-120.0f, 0.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 240.0f, 0.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, -240.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(344.0f, 328.0f)
                moveToRelative(-120.0f, 0.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 240.0f, 0.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, -240.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 328.0f)
                moveToRelative(-120.0f, 0.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 240.0f, 0.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, -240.0f, 0.0f)
            }
        }
        .build()
        return _colorFilterOutline!!
    }

private var _colorFilterOutline: ImageVector? = null
