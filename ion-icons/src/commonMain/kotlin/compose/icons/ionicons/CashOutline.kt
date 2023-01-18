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

public val IonIcons.CashOutline: ImageVector
    get() {
        if (_cashOutline != null) {
            return _cashOutline!!
        }
        _cashOutline = Builder(name = "CashOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 336.0f)
                lineTo(48.0f, 336.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 320.0f)
                lineTo(32.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 80.0f)
                lineTo(464.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 480.0f, 96.0f)
                lineTo(480.0f, 320.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 464.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 384.0f)
                lineTo(448.0f, 384.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 432.0f)
                lineTo(416.0f, 432.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 208.0f)
                moveToRelative(-80.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -160.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(480.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, -80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 80.0f, -80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(480.0f, 256.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -80.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 256.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 80.0f, 80.0f)
            }
        }
        .build()
        return _cashOutline!!
    }

private var _cashOutline: ImageVector? = null
