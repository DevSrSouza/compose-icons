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

public val MaterialDesignIcons.ChiliMediumOutline: ImageVector
    get() {
        if (_chiliMediumOutline != null) {
            return _chiliMediumOutline!!
        }
        _chiliMediumOutline = Builder(name = "ChiliMediumOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.43f, 7.32f)
                lineTo(6.86f, 6.42f)
                curveTo(7.38f, 5.6f, 8.11f, 5.0f, 8.94f, 4.7f)
                curveTo(8.81f, 4.3f, 8.45f, 4.0f, 8.0f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(8.77f, 2.0f, 9.47f, 2.29f, 10.0f, 2.77f)
                verticalLineTo(4.0f)
                curveTo(10.45f, 4.0f, 10.81f, 4.3f, 10.94f, 4.7f)
                curveTo(9.83f, 5.08f, 8.93f, 6.05f, 8.43f, 7.32f)
                moveTo(8.0f, 11.0f)
                curveTo(8.0f, 10.23f, 8.23f, 9.5f, 8.6f, 8.91f)
                lineTo(7.26f, 8.15f)
                curveTo(6.5f, 8.44f, 6.0f, 9.16f, 6.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 18.05f, 10.9f, 20.8f, 13.03f, 21.66f)
                curveTo(10.41f, 19.62f, 8.0f, 16.2f, 8.0f, 11.0f)
                moveTo(18.0f, 10.0f)
                verticalLineTo(22.0f)
                curveTo(18.0f, 22.0f, 10.0f, 20.0f, 10.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(10.0f, 9.27f, 10.4f, 8.63f, 11.0f, 8.28f)
                lineTo(12.25f, 9.0f)
                lineTo(14.0f, 8.0f)
                lineTo(15.75f, 9.0f)
                lineTo(17.0f, 8.28f)
                curveTo(17.6f, 8.63f, 18.0f, 9.27f, 18.0f, 10.0f)
                moveTo(16.0f, 18.87f)
                verticalLineTo(11.45f)
                lineTo(14.0f, 10.3f)
                lineTo(12.0f, 11.43f)
                curveTo(12.17f, 15.44f, 14.23f, 17.69f, 16.0f, 18.87f)
                moveTo(10.73f, 6.63f)
                lineTo(12.25f, 7.5f)
                lineTo(14.0f, 6.5f)
                lineTo(15.75f, 7.5f)
                lineTo(17.27f, 6.63f)
                curveTo(16.72f, 5.66f, 15.91f, 4.94f, 14.97f, 4.65f)
                curveTo(14.79f, 3.16f, 13.54f, 2.0f, 12.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(12.44f, 4.0f, 12.8f, 4.29f, 12.94f, 4.69f)
                curveTo(12.03f, 5.0f, 11.26f, 5.7f, 10.73f, 6.63f)
                close()
            }
        }
        .build()
        return _chiliMediumOutline!!
    }

private var _chiliMediumOutline: ImageVector? = null
