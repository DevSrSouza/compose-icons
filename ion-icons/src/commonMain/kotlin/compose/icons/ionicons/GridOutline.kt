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

public val IonIcons.GridOutline: ImageVector
    get() {
        if (_gridOutline != null) {
            return _gridOutline!!
        }
        _gridOutline = Builder(name = "GridOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(68.0f, 48.0f)
                lineTo(204.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 224.0f, 68.0f)
                lineTo(224.0f, 204.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 204.0f, 224.0f)
                lineTo(68.0f, 224.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 204.0f)
                lineTo(48.0f, 68.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 68.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(308.0f, 48.0f)
                lineTo(444.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 464.0f, 68.0f)
                lineTo(464.0f, 204.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 444.0f, 224.0f)
                lineTo(308.0f, 224.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 288.0f, 204.0f)
                lineTo(288.0f, 68.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 308.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(68.0f, 288.0f)
                lineTo(204.0f, 288.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 224.0f, 308.0f)
                lineTo(224.0f, 444.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 204.0f, 464.0f)
                lineTo(68.0f, 464.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 444.0f)
                lineTo(48.0f, 308.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 68.0f, 288.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(308.0f, 288.0f)
                lineTo(444.0f, 288.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 464.0f, 308.0f)
                lineTo(464.0f, 444.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 444.0f, 464.0f)
                lineTo(308.0f, 464.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 288.0f, 444.0f)
                lineTo(288.0f, 308.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 308.0f, 288.0f)
                close()
            }
        }
        .build()
        return _gridOutline!!
    }

private var _gridOutline: ImageVector? = null
