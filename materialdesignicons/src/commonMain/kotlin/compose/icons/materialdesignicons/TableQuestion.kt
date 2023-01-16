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

public val MaterialDesignIcons.TableQuestion: ImageVector
    get() {
        if (_tableQuestion != null) {
            return _tableQuestion!!
        }
        _tableQuestion = Builder(name = "TableQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 20.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(19.5f)
                moveTo(17.5f, 15.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 13.34f, 17.34f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(22.0f, 13.34f, 22.0f, 15.0f)
                curveTo(22.0f, 15.97f, 21.5f, 16.88f, 20.71f, 17.41f)
                lineTo(20.41f, 17.6f)
                curveTo(19.84f, 18.0f, 19.5f, 18.61f, 19.5f, 19.3f)
                verticalLineTo(19.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.3f)
                curveTo(18.0f, 18.11f, 18.6f, 17.0f, 19.59f, 16.35f)
                lineTo(19.88f, 16.16f)
                curveTo(20.27f, 15.9f, 20.5f, 15.47f, 20.5f, 15.0f)
                curveTo(20.5f, 14.17f, 19.83f, 13.5f, 19.0f, 13.5f)
                reflectiveCurveTo(17.5f, 14.17f, 17.5f, 15.0f)
                verticalLineTo(15.5f)
                moveTo(18.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.1f, 2.9f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.42f)
                curveTo(14.78f, 12.2f, 15.34f, 11.5f, 16.03f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.1f)
                curveTo(18.32f, 10.04f, 18.66f, 10.0f, 19.0f, 10.0f)
                reflectiveCurveTo(19.68f, 10.04f, 20.0f, 10.1f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 3.9f, 19.11f, 3.0f, 18.0f, 3.0f)
                moveTo(10.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                moveTo(10.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _tableQuestion!!
    }

private var _tableQuestion: ImageVector? = null
