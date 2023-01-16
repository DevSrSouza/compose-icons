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

public val MaterialDesignIcons.DominoMask: ImageVector
    get() {
        if (_dominoMask != null) {
            return _dominoMask!!
        }
        _dominoMask = Builder(name = "DominoMask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.83f, 9.81f)
                curveTo(14.7f, 9.7f, 13.69f, 10.38f, 13.46f, 11.5f)
                curveTo(13.46f, 11.84f, 14.81f, 12.29f, 16.05f, 12.29f)
                curveTo(17.29f, 12.29f, 18.41f, 11.5f, 18.41f, 11.28f)
                curveTo(18.41f, 11.05f, 17.63f, 9.93f, 15.83f, 9.81f)
                moveTo(8.18f, 9.81f)
                curveTo(6.38f, 9.93f, 5.59f, 10.94f, 5.59f, 11.27f)
                curveTo(5.59f, 11.5f, 6.82f, 12.29f, 7.95f, 12.29f)
                reflectiveCurveTo(10.54f, 11.84f, 10.54f, 11.5f)
                curveTo(10.31f, 10.38f, 9.19f, 9.7f, 8.18f, 9.81f)
                moveTo(16.95f, 16.0f)
                curveTo(15.04f, 16.0f, 13.8f, 13.75f, 12.0f, 13.75f)
                reflectiveCurveTo(8.85f, 16.0f, 7.05f, 16.0f)
                curveTo(4.69f, 16.0f, 3.0f, 13.86f, 3.0f, 10.04f)
                curveTo(3.0f, 7.68f, 3.68f, 7.0f, 6.71f, 7.0f)
                reflectiveCurveTo(10.54f, 8.24f, 12.0f, 8.24f)
                reflectiveCurveTo(14.36f, 7.0f, 17.29f, 7.0f)
                reflectiveCurveTo(21.0f, 7.79f, 21.0f, 10.04f)
                curveTo(21.0f, 13.86f, 19.31f, 16.0f, 16.95f, 16.0f)
                close()
            }
        }
        .build()
        return _dominoMask!!
    }

private var _dominoMask: ImageVector? = null
