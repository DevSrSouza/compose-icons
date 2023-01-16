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

public val MaterialDesignIcons.EggEaster: ImageVector
    get() {
        if (_eggEaster != null) {
            return _eggEaster!!
        }
        _eggEaster = Builder(name = "EggEaster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.89f, 6.36f)
                curveTo(8.23f, 3.91f, 10.0f, 2.0f, 12.0f, 2.0f)
                curveTo(14.0f, 2.0f, 15.77f, 3.91f, 17.11f, 6.36f)
                curveTo(16.26f, 6.57f, 15.5f, 7.07f, 15.0f, 7.77f)
                curveTo(13.79f, 6.11f, 11.46f, 5.75f, 9.8f, 6.97f)
                curveTo(9.5f, 7.19f, 9.22f, 7.46f, 9.0f, 7.77f)
                curveTo(8.5f, 7.07f, 7.74f, 6.57f, 6.89f, 6.36f)
                moveTo(15.0f, 18.06f)
                lineTo(12.0f, 15.06f)
                lineTo(9.0f, 18.06f)
                lineTo(6.0f, 15.06f)
                lineTo(4.73f, 16.33f)
                curveTo(5.75f, 20.35f, 9.83f, 22.77f, 13.84f, 21.76f)
                curveTo(16.5f, 21.08f, 18.59f, 19.0f, 19.27f, 16.33f)
                lineTo(18.0f, 15.06f)
                lineTo(15.0f, 18.06f)
                moveTo(9.0f, 15.94f)
                lineTo(12.0f, 12.94f)
                lineTo(15.0f, 15.94f)
                lineTo(18.0f, 12.94f)
                lineTo(19.5f, 14.44f)
                curveTo(19.37f, 12.13f, 18.8f, 9.86f, 17.81f, 7.76f)
                curveTo(16.65f, 7.86f, 15.75f, 8.83f, 15.75f, 10.0f)
                horizontalLineTo(14.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 12.0f, 7.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 9.75f, 10.0f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 8.83f, 7.35f, 7.86f, 6.19f, 7.76f)
                curveTo(5.2f, 9.86f, 4.63f, 12.13f, 4.5f, 14.44f)
                lineTo(6.0f, 12.94f)
                lineTo(9.0f, 15.94f)
                close()
            }
        }
        .build()
        return _eggEaster!!
    }

private var _eggEaster: ImageVector? = null
