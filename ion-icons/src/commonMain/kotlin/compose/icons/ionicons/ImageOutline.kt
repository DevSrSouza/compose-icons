package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ImageOutline: ImageVector
    get() {
        if (_imageOutline != null) {
            return _imageOutline!!
        }
        _imageOutline = Builder(name = "ImageOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 80.0f)
                lineTo(416.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 464.0f, 128.0f)
                lineTo(464.0f, 384.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 432.0f)
                lineTo(96.0f, 432.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 48.0f, 384.0f)
                lineTo(48.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 176.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 335.79f)
                lineTo(213.34f, 245.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 169.47f, 244.0f)
                lineTo(48.0f, 352.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 432.0f)
                lineTo(347.34f, 308.66f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 43.11f, -2.0f)
                lineTo(464.0f, 368.0f)
            }
        }
        .build()
        return _imageOutline!!
    }

private var _imageOutline: ImageVector? = null
