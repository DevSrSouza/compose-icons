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

public val MaterialDesignIcons.Smoking: ImageVector
    get() {
        if (_smoking != null) {
            return _smoking!!
        }
        _smoking = Builder(name = "Smoking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                moveTo(20.5f, 16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(16.0f)
                moveTo(18.0f, 16.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                moveTo(18.85f, 7.73f)
                curveTo(19.47f, 7.12f, 19.85f, 6.28f, 19.85f, 5.35f)
                curveTo(19.85f, 3.5f, 18.35f, 2.0f, 16.5f, 2.0f)
                verticalLineTo(3.5f)
                curveTo(17.5f, 3.5f, 18.35f, 4.33f, 18.35f, 5.35f)
                curveTo(18.35f, 6.37f, 17.5f, 7.2f, 16.5f, 7.2f)
                verticalLineTo(8.7f)
                curveTo(18.74f, 8.7f, 20.5f, 10.53f, 20.5f, 12.77f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.76f)
                curveTo(22.0f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f)
                moveTo(16.03f, 10.2f)
                horizontalLineTo(14.5f)
                curveTo(13.5f, 10.2f, 12.65f, 9.22f, 12.65f, 8.2f)
                curveTo(12.65f, 7.18f, 13.5f, 6.45f, 14.5f, 6.45f)
                verticalLineTo(4.95f)
                curveTo(12.65f, 4.95f, 11.15f, 6.45f, 11.15f, 8.3f)
                arcTo(3.35f, 3.35f, 0.0f, false, false, 14.5f, 11.65f)
                horizontalLineTo(16.03f)
                curveTo(17.08f, 11.65f, 18.0f, 12.39f, 18.0f, 13.7f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.36f)
                curveTo(19.5f, 11.55f, 17.9f, 10.2f, 16.03f, 10.2f)
                close()
            }
        }
        .build()
        return _smoking!!
    }

private var _smoking: ImageVector? = null
