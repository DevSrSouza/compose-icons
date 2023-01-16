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

public val MaterialDesignIcons.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 17.0f)
                curveTo(19.37f, 17.0f, 19.24f, 17.0f, 19.11f, 17.04f)
                lineTo(17.5f, 13.79f)
                curveTo(17.95f, 13.34f, 18.25f, 12.71f, 18.25f, 12.0f)
                curveTo(18.25f, 10.62f, 17.13f, 9.5f, 15.75f, 9.5f)
                curveTo(15.62f, 9.5f, 15.5f, 9.5f, 15.36f, 9.54f)
                lineTo(13.73f, 6.29f)
                curveTo(14.21f, 5.84f, 14.5f, 5.21f, 14.5f, 4.5f)
                curveTo(14.5f, 3.12f, 13.38f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(9.5f, 3.12f, 9.5f, 4.5f)
                curveTo(9.5f, 5.21f, 9.79f, 5.84f, 10.26f, 6.29f)
                lineTo(8.64f, 9.54f)
                curveTo(8.5f, 9.5f, 8.38f, 9.5f, 8.25f, 9.5f)
                curveTo(6.87f, 9.5f, 5.75f, 10.62f, 5.75f, 12.0f)
                curveTo(5.75f, 12.71f, 6.05f, 13.34f, 6.5f, 13.79f)
                lineTo(4.89f, 17.04f)
                curveTo(4.76f, 17.0f, 4.63f, 17.0f, 4.5f, 17.0f)
                curveTo(3.12f, 17.0f, 2.0f, 18.12f, 2.0f, 19.5f)
                curveTo(2.0f, 20.88f, 3.12f, 22.0f, 4.5f, 22.0f)
                reflectiveCurveTo(7.0f, 20.88f, 7.0f, 19.5f)
                curveTo(7.0f, 18.8f, 6.71f, 18.16f, 6.24f, 17.71f)
                lineTo(7.86f, 14.46f)
                curveTo(8.0f, 14.5f, 8.12f, 14.5f, 8.25f, 14.5f)
                curveTo(8.38f, 14.5f, 8.5f, 14.5f, 8.64f, 14.46f)
                lineTo(10.27f, 17.71f)
                curveTo(9.8f, 18.16f, 9.5f, 18.8f, 9.5f, 19.5f)
                curveTo(9.5f, 20.88f, 10.62f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(14.5f, 20.88f, 14.5f, 19.5f)
                curveTo(14.5f, 18.12f, 13.38f, 17.0f, 12.0f, 17.0f)
                curveTo(11.87f, 17.0f, 11.74f, 17.0f, 11.61f, 17.04f)
                lineTo(10.0f, 13.79f)
                curveTo(10.46f, 13.34f, 10.75f, 12.71f, 10.75f, 12.0f)
                reflectiveCurveTo(10.46f, 10.66f, 10.0f, 10.21f)
                lineTo(11.61f, 6.96f)
                curveTo(11.74f, 7.0f, 11.87f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(12.26f, 7.0f, 12.39f, 6.96f)
                lineTo(14.0f, 10.21f)
                curveTo(13.55f, 10.66f, 13.25f, 11.3f, 13.25f, 12.0f)
                curveTo(13.25f, 13.38f, 14.37f, 14.5f, 15.75f, 14.5f)
                curveTo(15.88f, 14.5f, 16.0f, 14.5f, 16.14f, 14.46f)
                lineTo(17.77f, 17.71f)
                curveTo(17.3f, 18.16f, 17.0f, 18.8f, 17.0f, 19.5f)
                curveTo(17.0f, 20.88f, 18.12f, 22.0f, 19.5f, 22.0f)
                reflectiveCurveTo(22.0f, 20.88f, 22.0f, 19.5f)
                curveTo(22.0f, 18.12f, 20.88f, 17.0f, 19.5f, 17.0f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
