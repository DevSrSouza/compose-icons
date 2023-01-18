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

public val IonIcons.BrushOutline: ImageVector
    get() {
        if (_brushOutline != null) {
            return _brushOutline!!
        }
        _brushOutline = Builder(name = "BrushOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(452.37f, 59.63f)
                horizontalLineToRelative(0.0f)
                arcToRelative(40.49f, 40.49f, 0.0f, false, false, -57.26f, 0.0f)
                lineTo(184.0f, 294.74f)
                curveToRelative(23.08f, 4.7f, 46.12f, 27.29f, 49.26f, 49.26f)
                lineTo(452.37f, 116.89f)
                arcTo(40.49f, 40.49f, 0.0f, false, false, 452.37f, 59.63f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(138.0f, 336.0f)
                curveToRelative(-29.88f, 0.0f, -54.0f, 24.5f, -54.0f, 54.86f)
                curveToRelative(0.0f, 23.95f, -20.88f, 36.57f, -36.0f, 36.57f)
                curveTo(64.56f, 449.74f, 92.82f, 464.0f, 120.0f, 464.0f)
                curveToRelative(39.78f, 0.0f, 72.0f, -32.73f, 72.0f, -73.14f)
                curveTo(192.0f, 360.5f, 167.88f, 336.0f, 138.0f, 336.0f)
                close()
            }
        }
        .build()
        return _brushOutline!!
    }

private var _brushOutline: ImageVector? = null
