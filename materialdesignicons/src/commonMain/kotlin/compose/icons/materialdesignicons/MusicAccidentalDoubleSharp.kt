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

public val MaterialDesignIcons.MusicAccidentalDoubleSharp: ImageVector
    get() {
        if (_musicAccidentalDoubleSharp != null) {
            return _musicAccidentalDoubleSharp!!
        }
        _musicAccidentalDoubleSharp = Builder(name = "MusicAccidentalDoubleSharp", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.41f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.59f)
                lineTo(12.0f, 10.59f)
                lineTo(10.0f, 8.59f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.59f)
                lineTo(10.59f, 12.0f)
                lineTo(8.59f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.41f)
                lineTo(12.0f, 13.41f)
                lineTo(14.0f, 15.41f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.41f)
                lineTo(13.41f, 12.0f)
                lineTo(15.41f, 10.0f)
                close()
            }
        }
        .build()
        return _musicAccidentalDoubleSharp!!
    }

private var _musicAccidentalDoubleSharp: ImageVector? = null
