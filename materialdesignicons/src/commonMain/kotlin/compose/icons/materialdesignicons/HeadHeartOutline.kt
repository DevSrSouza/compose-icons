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

public val MaterialDesignIcons.HeadHeartOutline: ImageVector
    get() {
        if (_headHeartOutline != null) {
            return _headHeartOutline!!
        }
        _headHeartOutline = Builder(name = "HeadHeartOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.0f, 8.83f)
                curveTo(17.0f, 10.37f, 15.64f, 11.6f, 13.58f, 13.47f)
                lineTo(13.0f, 14.0f)
                lineTo(12.42f, 13.47f)
                curveTo(10.36f, 11.6f, 9.0f, 10.37f, 9.0f, 8.83f)
                curveTo(9.0f, 7.63f, 9.96f, 6.64f, 11.16f, 6.63f)
                horizontalLineTo(11.2f)
                curveTo(11.89f, 6.63f, 12.55f, 6.94f, 13.0f, 7.46f)
                curveTo(13.45f, 6.94f, 14.11f, 6.63f, 14.8f, 6.63f)
                curveTo(16.0f, 6.62f, 17.0f, 7.59f, 17.0f, 8.79f)
                verticalLineTo(8.83f)
                close()
            }
        }
        .build()
        return _headHeartOutline!!
    }

private var _headHeartOutline: ImageVector? = null
