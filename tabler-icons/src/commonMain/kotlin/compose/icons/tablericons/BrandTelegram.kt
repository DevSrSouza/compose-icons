package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandTelegram: ImageVector
    get() {
        if (_brandTelegram != null) {
            return _brandTelegram!!
        }
        _brandTelegram = Builder(name = "BrandTelegram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(4.0f, -16.0f)
                lineToRelative(-18.0f, 7.0f)
                lineToRelative(4.0f, 2.0f)
                lineToRelative(2.0f, 6.0f)
                lineToRelative(3.0f, -4.0f)
            }
        }
        .build()
        return _brandTelegram!!
    }

private var _brandTelegram: ImageVector? = null
