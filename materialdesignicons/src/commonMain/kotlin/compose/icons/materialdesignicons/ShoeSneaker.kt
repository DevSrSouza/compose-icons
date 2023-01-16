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

public val MaterialDesignIcons.ShoeSneaker: ImageVector
    get() {
        if (_shoeSneaker != null) {
            return _shoeSneaker!!
        }
        _shoeSneaker = Builder(name = "ShoeSneaker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 15.0f, 2.0f, 12.0f, 4.0f, 12.0f)
                curveTo(4.68f, 12.0f, 5.46f, 11.95f, 6.28f, 11.82f)
                curveTo(7.2f, 12.54f, 8.5f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(10.25f)
                lineTo(8.56f, 11.29f)
                curveTo(8.91f, 11.18f, 9.25f, 11.05f, 9.59f, 10.91f)
                lineTo(11.5f, 12.82f)
                curveTo(11.89f, 12.74f, 12.25f, 12.63f, 12.58f, 12.5f)
                lineTo(10.55f, 10.45f)
                curveTo(10.85f, 10.28f, 11.14f, 10.11f, 11.43f, 9.91f)
                lineTo(13.5f, 12.0f)
                curveTo(13.8f, 11.79f, 14.04f, 11.56f, 14.25f, 11.32f)
                lineTo(12.22f, 9.29f)
                curveTo(12.46f, 9.07f, 12.7f, 8.83f, 12.92f, 8.58f)
                lineTo(14.79f, 10.45f)
                curveTo(14.91f, 10.14f, 15.0f, 9.83f, 15.0f, 9.5f)
                curveTo(15.0f, 8.65f, 14.55f, 7.89f, 13.84f, 7.28f)
                curveTo(13.89f, 7.19f, 13.95f, 7.1f, 14.0f, 7.0f)
                lineTo(15.53f, 6.23f)
                curveTo(16.38f, 7.17f, 18.14f, 7.84f, 20.25f, 7.97f)
                lineTo(20.3f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 8.0f, 22.0f, 9.0f, 22.0f, 12.5f)
                curveTo(22.0f, 13.07f, 22.0f, 13.57f, 21.96f, 14.0f)
                horizontalLineTo(19.0f)
                curveTo(17.9f, 14.0f, 16.58f, 14.26f, 15.3f, 14.5f)
                curveTo(14.12f, 14.76f, 12.9f, 15.0f, 12.0f, 15.0f)
                horizontalLineTo(2.0f)
                moveTo(21.0f, 17.0f)
                curveTo(21.0f, 17.0f, 21.58f, 17.0f, 21.86f, 15.0f)
                horizontalLineTo(19.0f)
                curveTo(17.0f, 15.0f, 14.0f, 16.0f, 12.0f, 16.0f)
                horizontalLineTo(2.28f)
                curveTo(2.62f, 16.6f, 3.26f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _shoeSneaker!!
    }

private var _shoeSneaker: ImageVector? = null
