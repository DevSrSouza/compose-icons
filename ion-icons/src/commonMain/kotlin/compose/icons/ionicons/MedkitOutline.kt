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

public val IonIcons.MedkitOutline: ImageVector
    get() {
        if (_medkitOutline != null) {
            return _medkitOutline!!
        }
        _medkitOutline = Builder(name = "MedkitOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 112.0f)
                lineTo(432.0f, 112.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 480.0f, 160.0f)
                lineTo(480.0f, 416.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 432.0f, 464.0f)
                lineTo(80.0f, 464.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 32.0f, 416.0f)
                lineTo(32.0f, 160.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 112.0f)
                verticalLineTo(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineTo(336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                verticalLineToRelative(32.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 208.0f)
                lineTo(256.0f, 368.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 288.0f)
                lineTo(176.0f, 288.0f)
            }
        }
        .build()
        return _medkitOutline!!
    }

private var _medkitOutline: ImageVector? = null
