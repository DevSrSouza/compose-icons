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

public val MaterialDesignIcons.MusicAccidentalSharp: ImageVector
    get() {
        if (_musicAccidentalSharp != null) {
            return _musicAccidentalSharp!!
        }
        _musicAccidentalSharp = Builder(name = "MusicAccidentalSharp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.5f)
                verticalLineTo(7.5f)
                lineTo(15.0f, 8.1f)
                verticalLineTo(5.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.7f)
                lineTo(11.0f, 9.3f)
                verticalLineTo(6.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.9f)
                lineTo(7.0f, 10.5f)
                verticalLineTo(12.5f)
                lineTo(9.0f, 11.9f)
                verticalLineTo(13.9f)
                lineTo(7.0f, 14.5f)
                verticalLineTo(16.5f)
                lineTo(9.0f, 15.9f)
                verticalLineTo(18.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.3f)
                lineTo(13.0f, 14.7f)
                verticalLineTo(17.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.1f)
                lineTo(17.0f, 13.5f)
                verticalLineTo(11.5f)
                lineTo(15.0f, 12.1f)
                verticalLineTo(10.1f)
                lineTo(17.0f, 9.5f)
                moveTo(13.0f, 12.7f)
                lineTo(11.0f, 13.3f)
                verticalLineTo(11.3f)
                lineTo(13.0f, 10.7f)
                verticalLineTo(12.7f)
                close()
            }
        }
        .build()
        return _musicAccidentalSharp!!
    }

private var _musicAccidentalSharp: ImageVector? = null
