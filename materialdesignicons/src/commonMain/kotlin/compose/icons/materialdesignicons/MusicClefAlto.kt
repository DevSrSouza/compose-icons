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

public val MaterialDesignIcons.MusicClefAlto: ImageVector
    get() {
        if (_musicClefAlto != null) {
            return _musicClefAlto!!
        }
        _musicClefAlto = Builder(name = "MusicClefAlto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                moveTo(15.46f, 13.0f)
                horizontalLineTo(14.83f)
                lineTo(13.83f, 12.0f)
                lineTo(14.83f, 11.0f)
                horizontalLineTo(15.46f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 11.96f, 7.5f)
                horizontalLineTo(13.96f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.46f, 9.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                lineTo(14.0f, 15.0f)
                horizontalLineTo(15.46f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 13.96f, 16.5f)
                horizontalLineTo(11.96f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 15.46f, 13.0f)
                close()
            }
        }
        .build()
        return _musicClefAlto!!
    }

private var _musicClefAlto: ImageVector? = null
