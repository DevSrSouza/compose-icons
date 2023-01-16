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

public val MaterialDesignIcons.GoogleTranslate: ImageVector
    get() {
        if (_googleTranslate != null) {
            return _googleTranslate!!
        }
        _googleTranslate = Builder(name = "GoogleTranslate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineTo(10.88f)
                lineTo(10.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(11.0f)
                lineTo(12.0f, 22.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 20.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                moveTo(7.17f, 14.59f)
                arcTo(4.09f, 4.09f, 0.0f, false, true, 3.08f, 10.5f)
                arcTo(4.09f, 4.09f, 0.0f, false, true, 7.17f, 6.41f)
                curveTo(8.21f, 6.41f, 9.16f, 6.78f, 9.91f, 7.5f)
                lineTo(10.0f, 7.54f)
                lineTo(8.75f, 8.72f)
                lineTo(8.69f, 8.67f)
                curveTo(8.4f, 8.4f, 7.91f, 8.08f, 7.17f, 8.08f)
                curveTo(5.86f, 8.08f, 4.79f, 9.17f, 4.79f, 10.5f)
                curveTo(4.79f, 11.83f, 5.86f, 12.92f, 7.17f, 12.92f)
                curveTo(8.54f, 12.92f, 9.13f, 12.05f, 9.29f, 11.46f)
                horizontalLineTo(7.08f)
                verticalLineTo(9.91f)
                horizontalLineTo(11.03f)
                lineTo(11.04f, 10.0f)
                curveTo(11.08f, 10.19f, 11.09f, 10.38f, 11.09f, 10.59f)
                curveTo(11.09f, 12.94f, 9.5f, 14.59f, 7.17f, 14.59f)
                moveTo(13.2f, 12.88f)
                curveTo(13.53f, 13.5f, 13.94f, 14.06f, 14.39f, 14.58f)
                lineTo(13.85f, 15.11f)
                lineTo(13.2f, 12.88f)
                moveTo(13.97f, 12.12f)
                horizontalLineTo(13.0f)
                lineTo(12.67f, 11.08f)
                horizontalLineTo(16.66f)
                curveTo(16.66f, 11.08f, 16.32f, 12.39f, 15.1f, 13.82f)
                curveTo(14.58f, 13.2f, 14.21f, 12.59f, 13.97f, 12.12f)
                moveTo(21.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(13.0f)
                lineTo(15.0f, 19.0f)
                lineTo(14.19f, 16.23f)
                lineTo(15.11f, 15.31f)
                lineTo(17.79f, 18.0f)
                lineTo(18.5f, 17.27f)
                lineTo(15.81f, 14.59f)
                curveTo(16.71f, 13.56f, 17.41f, 12.34f, 17.73f, 11.08f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.04f)
                horizontalLineTo(15.36f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.32f)
                verticalLineTo(10.04f)
                horizontalLineTo(12.36f)
                lineTo(11.18f, 6.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 7.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _googleTranslate!!
    }

private var _googleTranslate: ImageVector? = null
