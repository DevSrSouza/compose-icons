package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.MusicRestEighth: ImageVector
    get() {
        if (_musicRestEighth != null) {
            return _musicRestEighth!!
        }
        _musicRestEighth = Builder(name = "MusicRestEighth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                arcTo(5.56f, 5.56f, 0.0f, false, true, 10.95f, 7.86f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 9.5f, 9.0f)
                horizontalLineTo(9.74f)
                arcTo(6.32f, 6.32f, 0.0f, false, false, 13.25f, 7.93f)
                lineTo(10.0f, 18.0f)
                horizontalLineTo(12.0f)
                lineTo(16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _musicRestEighth!!
    }

private var _musicRestEighth: ImageVector? = null
