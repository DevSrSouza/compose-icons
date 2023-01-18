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

public val IonIcons.TrashBinOutline: ImageVector
    get() {
        if (_trashBinOutline != null) {
            return _trashBinOutline!!
        }
        _trashBinOutline = Builder(name = "TrashBinOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(432.0f, 144.0f)
                lineTo(403.33f, 419.74f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 371.55f, 448.0f)
                horizontalLineTo(140.46f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -31.78f, -28.26f)
                lineTo(80.0f, 144.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 64.0f)
                lineTo(464.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 480.0f, 80.0f)
                lineTo(480.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 464.0f, 144.0f)
                lineTo(48.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 128.0f)
                lineTo(32.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(312.0f, 240.0f)
                lineTo(200.0f, 352.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(312.0f, 352.0f)
                lineTo(200.0f, 240.0f)
            }
        }
        .build()
        return _trashBinOutline!!
    }

private var _trashBinOutline: ImageVector? = null
