package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ArrowRedoOutline: ImageVector
    get() {
        if (_arrowRedoOutline != null) {
            return _arrowRedoOutline!!
        }
        _arrowRedoOutline = Builder(name = "ArrowRedoOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                lineTo(272.0f, 88.0f)
                verticalLineToRelative(96.0f)
                curveTo(103.57f, 184.0f, 64.0f, 304.77f, 64.0f, 424.0f)
                curveToRelative(48.61f, -62.24f, 91.6f, -96.0f, 208.0f, -96.0f)
                verticalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _arrowRedoOutline!!
    }

private var _arrowRedoOutline: ImageVector? = null
