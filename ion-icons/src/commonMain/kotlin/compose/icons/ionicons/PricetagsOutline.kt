package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PricetagsOutline: ImageVector
    get() {
        if (_pricetagsOutline != null) {
            return _pricetagsOutline!!
        }
        _pricetagsOutline = Builder(name = "PricetagsOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(403.29f, 32.0f)
                horizontalLineTo(280.36f)
                arcToRelative(14.46f, 14.46f, 0.0f, false, false, -10.2f, 4.2f)
                lineTo(24.4f, 281.9f)
                arcToRelative(28.85f, 28.85f, 0.0f, false, false, 0.0f, 40.7f)
                lineToRelative(117.0f, 117.0f)
                arcToRelative(28.86f, 28.86f, 0.0f, false, false, 40.71f, 0.0f)
                lineTo(427.8f, 194.0f)
                arcToRelative(14.46f, 14.46f, 0.0f, false, false, 4.2f, -10.2f)
                verticalLineTo(60.8f)
                arcTo(28.66f, 28.66f, 0.0f, false, false, 403.29f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(230.0f, 480.0f)
                lineTo(492.0f, 218.0f)
                arcToRelative(13.81f, 13.81f, 0.0f, false, false, 4.0f, -10.0f)
                verticalLineTo(80.0f)
            }
        }
        .build()
        return _pricetagsOutline!!
    }

private var _pricetagsOutline: ImageVector? = null
