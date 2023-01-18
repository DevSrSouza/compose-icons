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

public val IonIcons.ArrowUndoOutline: ImageVector
    get() {
        if (_arrowUndoOutline != null) {
            return _arrowUndoOutline!!
        }
        _arrowUndoOutline = Builder(name = "ArrowUndoOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 424.0f)
                verticalLineTo(328.0f)
                curveToRelative(116.4f, 0.0f, 159.39f, 33.76f, 208.0f, 96.0f)
                curveToRelative(0.0f, -119.23f, -39.57f, -240.0f, -208.0f, -240.0f)
                verticalLineTo(88.0f)
                lineTo(64.0f, 256.0f)
                close()
            }
        }
        .build()
        return _arrowUndoOutline!!
    }

private var _arrowUndoOutline: ImageVector? = null
