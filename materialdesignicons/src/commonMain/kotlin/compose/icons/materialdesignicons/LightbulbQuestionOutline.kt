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

public val MaterialDesignIcons.LightbulbQuestionOutline: ImageVector
    get() {
        if (_lightbulbQuestionOutline != null) {
            return _lightbulbQuestionOutline!!
        }
        _lightbulbQuestionOutline = Builder(name = "LightbulbQuestionOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                curveTo(11.9f, 2.0f, 15.0f, 5.1f, 15.0f, 9.0f)
                curveTo(15.0f, 11.4f, 13.8f, 13.5f, 12.0f, 14.7f)
                verticalLineTo(17.0f)
                curveTo(12.0f, 17.6f, 11.6f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4f, 18.0f, 4.0f, 17.6f, 4.0f, 17.0f)
                verticalLineTo(14.7f)
                curveTo(2.2f, 13.5f, 1.0f, 11.4f, 1.0f, 9.0f)
                curveTo(1.0f, 5.1f, 4.1f, 2.0f, 8.0f, 2.0f)
                moveTo(5.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                curveTo(11.0f, 21.6f, 10.6f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4f, 22.0f, 5.0f, 21.6f, 5.0f, 21.0f)
                moveTo(8.0f, 4.0f)
                curveTo(5.2f, 4.0f, 3.0f, 6.2f, 3.0f, 9.0f)
                curveTo(3.0f, 11.1f, 4.2f, 12.8f, 6.0f, 13.6f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.6f)
                curveTo(11.8f, 12.8f, 13.0f, 11.1f, 13.0f, 9.0f)
                curveTo(13.0f, 6.2f, 10.8f, 4.0f, 8.0f, 4.0f)
                moveTo(20.5f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.5f)
                moveTo(18.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                curveTo(17.0f, 7.3f, 18.3f, 6.0f, 20.0f, 6.0f)
                reflectiveCurveTo(23.0f, 7.3f, 23.0f, 9.0f)
                curveTo(23.0f, 10.0f, 22.5f, 10.9f, 21.7f, 11.4f)
                lineTo(21.4f, 11.6f)
                curveTo(20.8f, 12.0f, 20.5f, 12.6f, 20.5f, 13.3f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.3f)
                curveTo(19.0f, 12.1f, 19.6f, 11.0f, 20.6f, 10.4f)
                lineTo(20.9f, 10.2f)
                curveTo(21.3f, 9.9f, 21.5f, 9.5f, 21.5f, 9.0f)
                curveTo(21.5f, 8.2f, 20.8f, 7.5f, 20.0f, 7.5f)
                reflectiveCurveTo(18.5f, 8.2f, 18.5f, 9.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _lightbulbQuestionOutline!!
    }

private var _lightbulbQuestionOutline: ImageVector? = null
