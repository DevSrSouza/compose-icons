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

public val MaterialDesignIcons.MusicRestSixteenth: ImageVector
    get() {
        if (_musicRestSixteenth != null) {
            return _musicRestSixteenth!!
        }
        _musicRestSixteenth = Builder(name = "MusicRestSixteenth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                arcTo(5.56f, 5.56f, 0.0f, false, true, 11.95f, 4.86f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 10.5f, 6.0f)
                horizontalLineTo(10.74f)
                arcTo(6.32f, 6.32f, 0.0f, false, false, 14.25f, 4.93f)
                lineTo(12.9f, 9.1f)
                arcTo(5.56f, 5.56f, 0.0f, false, true, 9.95f, 10.86f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.5f, 12.0f)
                horizontalLineTo(8.74f)
                arcTo(6.32f, 6.32f, 0.0f, false, false, 12.25f, 10.93f)
                lineTo(9.0f, 21.0f)
                horizontalLineTo(11.0f)
                lineTo(17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _musicRestSixteenth!!
    }

private var _musicRestSixteenth: ImageVector? = null
