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

public val MaterialDesignIcons.SearchWeb: ImageVector
    get() {
        if (_searchWeb != null) {
            return _searchWeb!!
        }
        _searchWeb = Builder(name = "SearchWeb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.0f)
                lineTo(20.5f, 19.0f)
                lineTo(19.0f, 20.5f)
                lineTo(14.0f, 15.5f)
                verticalLineTo(14.71f)
                lineTo(13.73f, 14.43f)
                curveTo(12.59f, 15.41f, 11.11f, 16.0f, 9.5f, 16.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 3.0f, 9.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 9.5f, 3.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 16.0f, 9.5f)
                curveTo(16.0f, 11.11f, 15.41f, 12.59f, 14.43f, 13.73f)
                lineTo(14.71f, 14.0f)
                horizontalLineTo(15.5f)
                moveTo(9.5f, 4.5f)
                lineTo(8.95f, 4.53f)
                curveTo(8.71f, 5.05f, 8.34f, 5.93f, 8.07f, 7.0f)
                horizontalLineTo(10.93f)
                curveTo(10.66f, 5.93f, 10.29f, 5.05f, 10.05f, 4.53f)
                curveTo(9.87f, 4.5f, 9.69f, 4.5f, 9.5f, 4.5f)
                moveTo(13.83f, 7.0f)
                curveTo(13.24f, 5.97f, 12.29f, 5.17f, 11.15f, 4.78f)
                curveTo(11.39f, 5.31f, 11.7f, 6.08f, 11.93f, 7.0f)
                horizontalLineTo(13.83f)
                moveTo(5.17f, 7.0f)
                horizontalLineTo(7.07f)
                curveTo(7.3f, 6.08f, 7.61f, 5.31f, 7.85f, 4.78f)
                curveTo(6.71f, 5.17f, 5.76f, 5.97f, 5.17f, 7.0f)
                moveTo(4.5f, 9.5f)
                curveTo(4.5f, 10.0f, 4.58f, 10.53f, 4.73f, 11.0f)
                horizontalLineTo(6.87f)
                lineTo(6.75f, 9.5f)
                lineTo(6.87f, 8.0f)
                horizontalLineTo(4.73f)
                curveTo(4.58f, 8.47f, 4.5f, 9.0f, 4.5f, 9.5f)
                moveTo(14.27f, 11.0f)
                curveTo(14.42f, 10.53f, 14.5f, 10.0f, 14.5f, 9.5f)
                curveTo(14.5f, 9.0f, 14.42f, 8.47f, 14.27f, 8.0f)
                horizontalLineTo(12.13f)
                curveTo(12.21f, 8.5f, 12.25f, 9.0f, 12.25f, 9.5f)
                curveTo(12.25f, 10.0f, 12.21f, 10.5f, 12.13f, 11.0f)
                horizontalLineTo(14.27f)
                moveTo(7.87f, 8.0f)
                lineTo(7.75f, 9.5f)
                lineTo(7.87f, 11.0f)
                horizontalLineTo(11.13f)
                curveTo(11.21f, 10.5f, 11.25f, 10.0f, 11.25f, 9.5f)
                curveTo(11.25f, 9.0f, 11.21f, 8.5f, 11.13f, 8.0f)
                horizontalLineTo(7.87f)
                moveTo(9.5f, 14.5f)
                curveTo(9.68f, 14.5f, 9.86f, 14.5f, 10.03f, 14.47f)
                curveTo(10.28f, 13.95f, 10.66f, 13.07f, 10.93f, 12.0f)
                horizontalLineTo(8.07f)
                curveTo(8.34f, 13.07f, 8.72f, 13.95f, 8.97f, 14.47f)
                lineTo(9.5f, 14.5f)
                moveTo(13.83f, 12.0f)
                horizontalLineTo(11.93f)
                curveTo(11.7f, 12.92f, 11.39f, 13.69f, 11.15f, 14.22f)
                curveTo(12.29f, 13.83f, 13.24f, 13.03f, 13.83f, 12.0f)
                moveTo(5.17f, 12.0f)
                curveTo(5.76f, 13.03f, 6.71f, 13.83f, 7.85f, 14.22f)
                curveTo(7.61f, 13.69f, 7.3f, 12.92f, 7.07f, 12.0f)
                horizontalLineTo(5.17f)
                close()
            }
        }
        .build()
        return _searchWeb!!
    }

private var _searchWeb: ImageVector? = null
