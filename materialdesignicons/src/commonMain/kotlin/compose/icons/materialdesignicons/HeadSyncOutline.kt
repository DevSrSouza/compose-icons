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

public val MaterialDesignIcons.HeadSyncOutline: ImageVector
    get() {
        if (_headSyncOutline != null) {
            return _headSyncOutline!!
        }
        _headSyncOutline = Builder(name = "HeadSyncOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(16.88f, 3.0f, 20.0f, 6.14f, 20.0f, 10.0f)
                curveTo(20.0f, 12.8f, 18.37f, 15.19f, 16.0f, 16.31f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 18.0f, 6.0f, 17.11f, 6.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13.0f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6.0f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3.0f, 13.0f, 3.0f)
                moveTo(13.0f, 1.0f)
                curveTo(8.41f, 1.0f, 4.61f, 4.42f, 4.06f, 8.9f)
                lineTo(2.5f, 11.0f)
                lineTo(2.47f, 11.0f)
                lineTo(2.45f, 11.03f)
                curveTo(1.9f, 11.79f, 1.83f, 12.79f, 2.26f, 13.62f)
                curveTo(2.62f, 14.31f, 3.26f, 14.79f, 4.0f, 14.94f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.85f, 5.28f, 19.42f, 7.0f, 19.87f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.83f, 22.0f, 13.06f, 22.0f, 10.0f)
                curveTo(22.0f, 5.03f, 17.96f, 1.0f, 13.0f, 1.0f)
                moveTo(14.0f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(11.79f, 13.5f, 10.0f, 11.71f, 10.0f, 9.5f)
                curveTo(10.0f, 8.68f, 10.25f, 7.92f, 10.67f, 7.29f)
                lineTo(11.76f, 8.38f)
                curveTo(11.59f, 8.72f, 11.5f, 9.1f, 11.5f, 9.5f)
                curveTo(11.5f, 10.88f, 12.62f, 12.0f, 14.0f, 12.0f)
                verticalLineTo(10.5f)
                lineTo(16.25f, 12.75f)
                lineTo(14.0f, 15.0f)
                moveTo(17.33f, 11.71f)
                lineTo(16.24f, 10.62f)
                curveTo(16.41f, 10.28f, 16.5f, 9.9f, 16.5f, 9.5f)
                curveTo(16.5f, 8.12f, 15.38f, 7.0f, 14.0f, 7.0f)
                verticalLineTo(8.5f)
                lineTo(11.75f, 6.25f)
                lineTo(14.0f, 4.0f)
                verticalLineTo(5.5f)
                curveTo(16.21f, 5.5f, 18.0f, 7.29f, 18.0f, 9.5f)
                curveTo(18.0f, 10.32f, 17.75f, 11.08f, 17.33f, 11.71f)
                close()
            }
        }
        .build()
        return _headSyncOutline!!
    }

private var _headSyncOutline: ImageVector? = null
