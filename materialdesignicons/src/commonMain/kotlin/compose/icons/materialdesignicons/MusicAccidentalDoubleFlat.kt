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

public val MaterialDesignIcons.MusicAccidentalDoubleFlat: ImageVector
    get() {
        if (_musicAccidentalDoubleFlat != null) {
            return _musicAccidentalDoubleFlat!!
        }
        _musicAccidentalDoubleFlat = Builder(name = "MusicAccidentalDoubleFlat", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 9.0f)
                curveTo(14.8f, 9.0f, 14.11f, 9.28f, 13.5f, 9.67f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(9.62f)
                curveTo(11.04f, 9.24f, 10.39f, 9.0f, 9.5f, 9.0f)
                curveTo(8.8f, 9.0f, 8.11f, 9.28f, 7.5f, 9.67f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(19.0f)
                curveTo(8.5f, 17.32f, 10.43f, 15.79f, 11.5f, 14.41f)
                verticalLineTo(19.0f)
                curveTo(16.36f, 16.26f, 18.5f, 13.91f, 18.5f, 12.0f)
                curveTo(18.5f, 10.59f, 17.79f, 9.0f, 15.5f, 9.0f)
                moveTo(7.5f, 15.38f)
                verticalLineTo(12.26f)
                curveTo(8.12f, 11.59f, 8.95f, 11.0f, 9.5f, 11.0f)
                curveTo(10.09f, 11.0f, 10.5f, 11.07f, 10.5f, 12.0f)
                curveTo(10.5f, 12.15f, 10.4f, 13.3f, 7.5f, 15.38f)
                moveTo(13.5f, 15.38f)
                verticalLineTo(12.26f)
                curveTo(14.12f, 11.59f, 14.95f, 11.0f, 15.5f, 11.0f)
                curveTo(16.09f, 11.0f, 16.5f, 11.07f, 16.5f, 12.0f)
                curveTo(16.5f, 12.15f, 16.4f, 13.3f, 13.5f, 15.38f)
                close()
            }
        }
        .build()
        return _musicAccidentalDoubleFlat!!
    }

private var _musicAccidentalDoubleFlat: ImageVector? = null
