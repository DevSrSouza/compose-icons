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

public val MaterialDesignIcons.LockQuestion: ImageVector
    get() {
        if (_lockQuestion != null) {
            return _lockQuestion!!
        }
        _lockQuestion = Builder(name = "LockQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 10.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 1.0f)
                moveTo(12.0f, 2.9f)
                curveTo(13.71f, 2.9f, 15.1f, 4.29f, 15.1f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.9f)
                verticalLineTo(6.0f)
                curveTo(8.9f, 4.29f, 10.29f, 2.9f, 12.0f, 2.9f)
                moveTo(12.19f, 10.5f)
                curveTo(13.13f, 10.5f, 13.88f, 10.71f, 14.42f, 11.12f)
                curveTo(14.96f, 11.54f, 15.23f, 12.1f, 15.23f, 12.8f)
                curveTo(15.23f, 13.24f, 15.08f, 13.63f, 14.79f, 14.0f)
                curveTo(14.5f, 14.36f, 14.12f, 14.64f, 13.66f, 14.85f)
                curveTo(13.4f, 15.0f, 13.23f, 15.15f, 13.14f, 15.32f)
                curveTo(13.05f, 15.5f, 13.0f, 15.72f, 13.0f, 16.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 15.5f, 11.1f, 15.16f, 11.29f, 14.92f)
                curveTo(11.5f, 14.68f, 11.84f, 14.4f, 12.36f, 14.08f)
                curveTo(12.62f, 13.94f, 12.83f, 13.76f, 13.0f, 13.54f)
                curveTo(13.14f, 13.33f, 13.22f, 13.08f, 13.22f, 12.8f)
                curveTo(13.22f, 12.5f, 13.13f, 12.28f, 12.95f, 12.11f)
                curveTo(12.77f, 11.93f, 12.5f, 11.85f, 12.19f, 11.85f)
                curveTo(11.92f, 11.85f, 11.7f, 11.92f, 11.5f, 12.06f)
                curveTo(11.34f, 12.2f, 11.24f, 12.41f, 11.24f, 12.69f)
                horizontalLineTo(9.27f)
                curveTo(9.22f, 12.0f, 9.5f, 11.4f, 10.05f, 11.04f)
                curveTo(10.59f, 10.68f, 11.3f, 10.5f, 12.19f, 10.5f)
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _lockQuestion!!
    }

private var _lockQuestion: ImageVector? = null
