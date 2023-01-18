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

public val IonIcons.PlaySkipForwardOutline: ImageVector
    get() {
        if (_playSkipForwardOutline != null) {
            return _playSkipForwardOutline!!
        }
        _playSkipForwardOutline = Builder(name = "PlaySkipForwardOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 111.0f)
                verticalLineTo(401.0f)
                curveToRelative(0.0f, 17.44f, 17.0f, 28.52f, 31.0f, 20.16f)
                lineToRelative(247.9f, -148.37f)
                curveToRelative(12.12f, -7.25f, 12.12f, -26.33f, 0.0f, -33.58f)
                lineTo(143.0f, 90.84f)
                curveTo(129.0f, 82.48f, 112.0f, 93.56f, 112.0f, 111.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 80.0f)
                lineTo(400.0f, 432.0f)
            }
        }
        .build()
        return _playSkipForwardOutline!!
    }

private var _playSkipForwardOutline: ImageVector? = null
