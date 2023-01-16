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

public val MaterialDesignIcons.TooltipQuestionOutline: ImageVector
    get() {
        if (_tooltipQuestionOutline != null) {
            return _tooltipQuestionOutline!!
        }
        _tooltipQuestionOutline = Builder(name = "TooltipQuestionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(3.47f, 2.0f, 2.96f, 2.21f, 2.59f, 2.59f)
                curveTo(2.21f, 2.96f, 2.0f, 3.47f, 2.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 16.53f, 2.21f, 17.04f, 2.59f, 17.41f)
                curveTo(2.96f, 17.79f, 3.47f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 22.0f)
                lineTo(16.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(20.53f, 18.0f, 21.04f, 17.79f, 21.41f, 17.41f)
                reflectiveCurveTo(22.0f, 16.53f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.47f, 21.79f, 2.96f, 21.41f, 2.59f)
                curveTo(21.04f, 2.21f, 20.53f, 2.0f, 20.0f, 2.0f)
                moveTo(4.0f, 16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.17f)
                lineTo(12.0f, 19.17f)
                lineTo(8.83f, 16.0f)
                moveTo(10.05f, 6.04f)
                curveTo(10.59f, 5.68f, 11.3f, 5.5f, 12.19f, 5.5f)
                curveTo(13.13f, 5.5f, 13.88f, 5.71f, 14.42f, 6.12f)
                curveTo(14.96f, 6.54f, 15.23f, 7.1f, 15.23f, 7.8f)
                curveTo(15.23f, 8.24f, 15.08f, 8.63f, 14.79f, 9.0f)
                curveTo(14.5f, 9.36f, 14.12f, 9.64f, 13.66f, 9.85f)
                curveTo(13.4f, 10.0f, 13.23f, 10.15f, 13.14f, 10.32f)
                curveTo(13.05f, 10.5f, 13.0f, 10.72f, 13.0f, 11.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 10.5f, 11.1f, 10.16f, 11.29f, 9.92f)
                curveTo(11.5f, 9.68f, 11.84f, 9.4f, 12.36f, 9.08f)
                curveTo(12.62f, 8.94f, 12.83f, 8.76f, 13.0f, 8.54f)
                curveTo(13.14f, 8.33f, 13.22f, 8.08f, 13.22f, 7.8f)
                curveTo(13.22f, 7.5f, 13.13f, 7.28f, 12.95f, 7.11f)
                curveTo(12.77f, 6.93f, 12.5f, 6.85f, 12.19f, 6.85f)
                curveTo(11.92f, 6.85f, 11.7f, 6.92f, 11.5f, 7.06f)
                curveTo(11.34f, 7.2f, 11.24f, 7.41f, 11.24f, 7.69f)
                horizontalLineTo(9.27f)
                curveTo(9.22f, 7.0f, 9.5f, 6.4f, 10.05f, 6.04f)
                moveTo(11.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _tooltipQuestionOutline!!
    }

private var _tooltipQuestionOutline: ImageVector? = null
