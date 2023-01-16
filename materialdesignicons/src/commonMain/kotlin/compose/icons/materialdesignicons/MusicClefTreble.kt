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

public val MaterialDesignIcons.MusicClefTreble: ImageVector
    get() {
        if (_musicClefTreble != null) {
            return _musicClefTreble!!
        }
        _musicClefTreble = Builder(name = "MusicClefTreble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                verticalLineTo(7.5f)
                lineTo(15.2f, 5.29f)
                curveTo(16.0f, 4.5f, 16.15f, 3.24f, 15.59f, 2.26f)
                curveTo(15.14f, 1.47f, 14.32f, 1.0f, 13.45f, 1.0f)
                curveTo(13.24f, 1.0f, 13.0f, 1.03f, 12.81f, 1.09f)
                curveTo(11.73f, 1.38f, 11.0f, 2.38f, 11.0f, 3.5f)
                verticalLineTo(6.74f)
                lineTo(7.86f, 9.91f)
                curveTo(6.2f, 11.6f, 5.7f, 14.13f, 6.61f, 16.34f)
                curveTo(7.38f, 18.24f, 9.06f, 19.55f, 11.0f, 19.89f)
                verticalLineTo(20.5f)
                curveTo(11.0f, 20.76f, 10.77f, 21.0f, 10.5f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(10.5f)
                curveTo(11.85f, 23.0f, 13.0f, 21.89f, 13.0f, 20.5f)
                verticalLineTo(20.0f)
                curveTo(15.03f, 20.0f, 17.16f, 18.08f, 17.16f, 15.25f)
                curveTo(17.16f, 12.95f, 15.24f, 11.0f, 13.0f, 11.0f)
                moveTo(13.0f, 3.5f)
                curveTo(13.0f, 3.27f, 13.11f, 3.09f, 13.32f, 3.03f)
                curveTo(13.54f, 2.97f, 13.77f, 3.06f, 13.88f, 3.26f)
                curveTo(14.0f, 3.46f, 13.96f, 3.71f, 13.8f, 3.87f)
                lineTo(13.0f, 4.73f)
                verticalLineTo(3.5f)
                moveTo(11.0f, 11.5f)
                curveTo(10.03f, 12.14f, 9.3f, 13.24f, 9.04f, 14.26f)
                lineTo(11.0f, 14.78f)
                verticalLineTo(17.83f)
                curveTo(9.87f, 17.53f, 8.9f, 16.71f, 8.43f, 15.57f)
                curveTo(7.84f, 14.11f, 8.16f, 12.45f, 9.26f, 11.33f)
                lineTo(11.0f, 9.5f)
                verticalLineTo(11.5f)
                moveTo(13.0f, 18.0f)
                verticalLineTo(12.94f)
                curveTo(14.17f, 12.94f, 15.18f, 14.04f, 15.18f, 15.25f)
                curveTo(15.18f, 17.0f, 13.91f, 18.0f, 13.0f, 18.0f)
                close()
            }
        }
        .build()
        return _musicClefTreble!!
    }

private var _musicClefTreble: ImageVector? = null
