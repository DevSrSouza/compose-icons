package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PricetagOutline: ImageVector
    get() {
        if (_pricetagOutline != null) {
            return _pricetagOutline!!
        }
        _pricetagOutline = Builder(name = "PricetagOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(435.25f, 48.0f)
                horizontalLineTo(312.35f)
                arcToRelative(14.46f, 14.46f, 0.0f, false, false, -10.2f, 4.2f)
                lineTo(56.45f, 297.9f)
                arcToRelative(28.85f, 28.85f, 0.0f, false, false, 0.0f, 40.7f)
                lineToRelative(117.0f, 117.0f)
                arcToRelative(28.85f, 28.85f, 0.0f, false, false, 40.7f, 0.0f)
                lineTo(459.75f, 210.0f)
                arcToRelative(14.46f, 14.46f, 0.0f, false, false, 4.2f, -10.2f)
                verticalLineTo(76.8f)
                arcTo(28.66f, 28.66f, 0.0f, false, false, 435.25f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 384.0f, 160.0f)
                close()
            }
        }
        .build()
        return _pricetagOutline!!
    }

private var _pricetagOutline: ImageVector? = null
