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

public val MaterialDesignIcons.MusicAccidentalFlat: ImageVector
    get() {
        if (_musicAccidentalFlat != null) {
            return _musicAccidentalFlat!!
        }
        _musicAccidentalFlat = Builder(name = "MusicAccidentalFlat", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 19.0f)
                curveTo(13.36f, 16.26f, 15.5f, 13.91f, 15.5f, 12.0f)
                curveTo(15.5f, 10.59f, 14.79f, 9.0f, 12.5f, 9.0f)
                curveTo(11.8f, 9.0f, 11.11f, 9.28f, 10.5f, 9.67f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.5f)
                moveTo(10.5f, 15.38f)
                verticalLineTo(12.26f)
                curveTo(11.12f, 11.59f, 11.95f, 11.0f, 12.5f, 11.0f)
                curveTo(13.09f, 11.0f, 13.5f, 11.07f, 13.5f, 12.0f)
                curveTo(13.5f, 12.15f, 13.4f, 13.3f, 10.5f, 15.38f)
                close()
            }
        }
        .build()
        return _musicAccidentalFlat!!
    }

private var _musicAccidentalFlat: ImageVector? = null
