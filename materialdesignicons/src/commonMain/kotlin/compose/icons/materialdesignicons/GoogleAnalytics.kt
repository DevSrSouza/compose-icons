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

public val MaterialDesignIcons.GoogleAnalytics: ImageVector
    get() {
        if (_googleAnalytics != null) {
            return _googleAnalytics!!
        }
        _googleAnalytics = Builder(name = "GoogleAnalytics", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.86f, 4.39f)
                verticalLineTo(19.39f)
                curveTo(15.86f, 21.06f, 17.0f, 22.0f, 18.25f, 22.0f)
                curveTo(19.39f, 22.0f, 20.64f, 21.21f, 20.64f, 19.39f)
                verticalLineTo(4.5f)
                curveTo(20.64f, 2.96f, 19.5f, 2.0f, 18.25f, 2.0f)
                reflectiveCurveTo(15.86f, 3.06f, 15.86f, 4.39f)
                moveTo(9.61f, 12.0f)
                verticalLineTo(19.39f)
                curveTo(9.61f, 21.07f, 10.77f, 22.0f, 12.0f, 22.0f)
                curveTo(13.14f, 22.0f, 14.39f, 21.21f, 14.39f, 19.39f)
                verticalLineTo(12.11f)
                curveTo(14.39f, 10.57f, 13.25f, 9.61f, 12.0f, 9.61f)
                reflectiveCurveTo(9.61f, 10.67f, 9.61f, 12.0f)
                moveTo(5.75f, 17.23f)
                curveTo(7.07f, 17.23f, 8.14f, 18.3f, 8.14f, 19.61f)
                curveTo(8.14f, 20.93f, 7.07f, 22.0f, 5.75f, 22.0f)
                reflectiveCurveTo(3.36f, 20.93f, 3.36f, 19.61f)
                curveTo(3.36f, 18.3f, 4.43f, 17.23f, 5.75f, 17.23f)
                close()
            }
        }
        .build()
        return _googleAnalytics!!
    }

private var _googleAnalytics: ImageVector? = null
