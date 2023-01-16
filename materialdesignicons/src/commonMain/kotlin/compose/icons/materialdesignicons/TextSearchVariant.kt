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

public val MaterialDesignIcons.TextSearchVariant: ImageVector
    get() {
        if (_textSearchVariant != null) {
            return _textSearchVariant!!
        }
        _textSearchVariant = Builder(name = "TextSearchVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                moveTo(18.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                moveTo(19.31f, 11.5f)
                curveTo(19.75f, 10.82f, 20.0f, 10.0f, 20.0f, 9.11f)
                curveTo(20.0f, 6.61f, 18.0f, 4.61f, 15.5f, 4.61f)
                reflectiveCurveTo(11.0f, 6.61f, 11.0f, 9.11f)
                reflectiveCurveTo(13.0f, 13.61f, 15.5f, 13.61f)
                curveTo(16.37f, 13.61f, 17.19f, 13.36f, 17.88f, 12.93f)
                lineTo(21.0f, 16.0f)
                lineTo(22.39f, 14.61f)
                lineTo(19.31f, 11.5f)
                moveTo(15.5f, 11.61f)
                curveTo(14.12f, 11.61f, 13.0f, 10.5f, 13.0f, 9.11f)
                reflectiveCurveTo(14.12f, 6.61f, 15.5f, 6.61f)
                reflectiveCurveTo(18.0f, 7.73f, 18.0f, 9.11f)
                reflectiveCurveTo(16.88f, 11.61f, 15.5f, 11.61f)
                close()
            }
        }
        .build()
        return _textSearchVariant!!
    }

private var _textSearchVariant: ImageVector? = null
