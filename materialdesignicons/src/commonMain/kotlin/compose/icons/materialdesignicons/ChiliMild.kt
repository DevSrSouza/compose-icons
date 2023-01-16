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

public val MaterialDesignIcons.ChiliMild: ImageVector
    get() {
        if (_chiliMild != null) {
            return _chiliMild!!
        }
        _chiliMild = Builder(name = "ChiliMild", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                verticalLineTo(22.0f)
                curveTo(16.0f, 22.0f, 8.0f, 20.0f, 8.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(8.0f, 9.27f, 8.4f, 8.63f, 9.0f, 8.28f)
                lineTo(10.25f, 9.0f)
                lineTo(12.0f, 8.0f)
                lineTo(13.75f, 9.0f)
                lineTo(15.0f, 8.28f)
                curveTo(15.6f, 8.63f, 16.0f, 9.27f, 16.0f, 10.0f)
                moveTo(12.0f, 6.5f)
                lineTo(13.75f, 7.5f)
                lineTo(15.27f, 6.63f)
                curveTo(14.72f, 5.66f, 13.91f, 4.94f, 12.97f, 4.65f)
                curveTo(12.79f, 3.16f, 11.54f, 2.0f, 10.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(10.44f, 4.0f, 10.8f, 4.29f, 10.94f, 4.69f)
                curveTo(10.03f, 5.0f, 9.26f, 5.7f, 8.73f, 6.63f)
                lineTo(10.25f, 7.5f)
                lineTo(12.0f, 6.5f)
                close()
            }
        }
        .build()
        return _chiliMild!!
    }

private var _chiliMild: ImageVector? = null
