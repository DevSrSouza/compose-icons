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

public val MaterialDesignIcons.CrosshairsQuestion: ImageVector
    get() {
        if (_crosshairsQuestion != null) {
            return _crosshairsQuestion!!
        }
        _crosshairsQuestion = Builder(name = "CrosshairsQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.05f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.05f)
                curveTo(3.5f, 6.83f, 6.83f, 3.5f, 11.0f, 3.05f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.05f)
                curveTo(17.17f, 3.5f, 20.5f, 6.83f, 20.95f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.95f)
                curveTo(20.5f, 17.17f, 17.17f, 20.5f, 13.0f, 20.95f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.95f)
                curveTo(6.83f, 20.5f, 3.5f, 17.17f, 3.05f, 13.0f)
                moveTo(12.0f, 5.0f)
                curveTo(8.13f, 5.0f, 5.0f, 8.13f, 5.0f, 12.0f)
                reflectiveCurveTo(8.13f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(19.0f, 15.87f, 19.0f, 12.0f)
                reflectiveCurveTo(15.87f, 5.0f, 12.0f, 5.0f)
                moveTo(11.13f, 17.25f)
                horizontalLineTo(12.88f)
                verticalLineTo(15.5f)
                horizontalLineTo(11.13f)
                verticalLineTo(17.25f)
                moveTo(12.0f, 6.75f)
                curveTo(10.07f, 6.75f, 8.5f, 8.32f, 8.5f, 10.25f)
                horizontalLineTo(10.25f)
                curveTo(10.25f, 9.28f, 11.03f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveTo(13.75f, 9.28f, 13.75f, 10.25f)
                curveTo(13.75f, 12.0f, 11.13f, 11.78f, 11.13f, 14.63f)
                horizontalLineTo(12.88f)
                curveTo(12.88f, 12.66f, 15.5f, 12.44f, 15.5f, 10.25f)
                curveTo(15.5f, 8.32f, 13.93f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _crosshairsQuestion!!
    }

private var _crosshairsQuestion: ImageVector? = null
