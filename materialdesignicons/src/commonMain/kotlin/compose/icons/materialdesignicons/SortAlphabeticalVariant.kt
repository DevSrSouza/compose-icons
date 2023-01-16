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

public val MaterialDesignIcons.SortAlphabeticalVariant: ImageVector
    get() {
        if (_sortAlphabeticalVariant != null) {
            return _sortAlphabeticalVariant!!
        }
        _sortAlphabeticalVariant = Builder(name = "SortAlphabeticalVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 5.0f)
                lineTo(12.5f, 1.75f)
                lineTo(15.75f, 5.0f)
                horizontalLineTo(9.25f)
                moveTo(15.75f, 19.0f)
                lineTo(12.5f, 22.25f)
                lineTo(9.25f, 19.0f)
                horizontalLineTo(15.75f)
                moveTo(8.89f, 14.3f)
                horizontalLineTo(6.0f)
                lineTo(5.28f, 17.0f)
                horizontalLineTo(2.91f)
                lineTo(6.0f, 7.0f)
                horizontalLineTo(9.0f)
                lineTo(12.13f, 17.0f)
                horizontalLineTo(9.67f)
                lineTo(8.89f, 14.3f)
                moveTo(6.33f, 12.68f)
                horizontalLineTo(8.56f)
                lineTo(7.93f, 10.56f)
                lineTo(7.67f, 9.59f)
                lineTo(7.42f, 8.63f)
                horizontalLineTo(7.39f)
                lineTo(7.17f, 9.6f)
                lineTo(6.93f, 10.58f)
                lineTo(6.33f, 12.68f)
                moveTo(13.05f, 17.0f)
                verticalLineTo(15.74f)
                lineTo(17.8f, 8.97f)
                verticalLineTo(8.91f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.73f)
                verticalLineTo(8.34f)
                lineTo(16.09f, 15.0f)
                verticalLineTo(15.08f)
                horizontalLineTo(20.8f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.05f)
                close()
            }
        }
        .build()
        return _sortAlphabeticalVariant!!
    }

private var _sortAlphabeticalVariant: ImageVector? = null
