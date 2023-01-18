package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CardOutline: ImageVector
    get() {
        if (_cardOutline != null) {
            return _cardOutline!!
        }
        _cardOutline = Builder(name = "CardOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(104.0f, 96.0f)
                lineTo(408.0f, 96.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 464.0f, 152.0f)
                lineTo(464.0f, 360.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 408.0f, 416.0f)
                lineTo(104.0f, 416.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 48.0f, 360.0f)
                lineTo(48.0f, 152.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 104.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 60.0f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 192.0f)
                lineTo(464.0f, 192.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 60.0f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 300.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-48.0f)
                close()
            }
        }
        .build()
        return _cardOutline!!
    }

private var _cardOutline: ImageVector? = null
