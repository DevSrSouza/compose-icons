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

public val MaterialDesignIcons.PlaySpeed: ImageVector
    get() {
        if (_playSpeed != null) {
            return _playSpeed!!
        }
        _playSpeed = Builder(name = "PlaySpeed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.05f)
                verticalLineTo(4.05f)
                curveTo(17.39f, 4.59f, 20.5f, 8.58f, 19.96f, 12.97f)
                curveTo(19.5f, 16.61f, 16.64f, 19.5f, 13.0f, 19.93f)
                verticalLineTo(21.93f)
                curveTo(18.5f, 21.38f, 22.5f, 16.5f, 21.95f, 11.0f)
                curveTo(21.5f, 6.25f, 17.73f, 2.5f, 13.0f, 2.03f)
                verticalLineTo(2.05f)
                moveTo(5.67f, 19.74f)
                curveTo(7.18f, 21.0f, 9.04f, 21.79f, 11.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(9.58f, 19.82f, 8.23f, 19.25f, 7.1f, 18.37f)
                lineTo(5.67f, 19.74f)
                moveTo(7.1f, 5.74f)
                curveTo(8.22f, 4.84f, 9.57f, 4.26f, 11.0f, 4.06f)
                verticalLineTo(2.06f)
                curveTo(9.05f, 2.25f, 7.19f, 3.0f, 5.67f, 4.26f)
                lineTo(7.1f, 5.74f)
                moveTo(5.69f, 7.1f)
                lineTo(4.26f, 5.67f)
                curveTo(3.0f, 7.19f, 2.25f, 9.04f, 2.05f, 11.0f)
                horizontalLineTo(4.05f)
                curveTo(4.24f, 9.58f, 4.8f, 8.23f, 5.69f, 7.1f)
                moveTo(4.06f, 13.0f)
                horizontalLineTo(2.06f)
                curveTo(2.26f, 14.96f, 3.03f, 16.81f, 4.27f, 18.33f)
                lineTo(5.69f, 16.9f)
                curveTo(4.81f, 15.77f, 4.24f, 14.42f, 4.06f, 13.0f)
                moveTo(10.0f, 16.5f)
                lineTo(16.0f, 12.0f)
                lineTo(10.0f, 7.5f)
                verticalLineTo(16.5f)
                close()
            }
        }
        .build()
        return _playSpeed!!
    }

private var _playSpeed: ImageVector? = null
