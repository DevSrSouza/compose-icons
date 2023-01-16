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

public val MaterialDesignIcons.PailRemove: ImageVector
    get() {
        if (_pailRemove != null) {
            return _pailRemove!!
        }
        _pailRemove = Builder(name = "PailRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 9.36f)
                lineTo(4.27f, 14.11f)
                curveTo(3.79f, 14.39f, 3.18f, 14.23f, 2.9f, 13.75f)
                curveTo(2.62f, 13.27f, 2.79f, 12.66f, 3.27f, 12.38f)
                lineTo(11.5f, 7.63f)
                curveTo(11.97f, 7.35f, 12.58f, 7.5f, 12.86f, 8.0f)
                curveTo(13.14f, 8.47f, 12.97f, 9.09f, 12.5f, 9.36f)
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 15.82f, 15.47f, 13.23f, 18.6f, 13.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                lineTo(4.76f, 9.79f)
                lineTo(10.71f, 6.36f)
                curveTo(11.09f, 6.13f, 11.53f, 6.0f, 12.0f, 6.0f)
                curveTo(13.38f, 6.0f, 14.5f, 7.12f, 14.5f, 8.5f)
                curveTo(14.5f, 9.44f, 14.0f, 10.26f, 13.21f, 10.69f)
                lineTo(5.79f, 14.97f)
                lineTo(7.0f, 21.0f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13.0f, 19.7f, 13.0f, 19.0f)
                moveTo(21.12f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.46f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }
        .build()
        return _pailRemove!!
    }

private var _pailRemove: ImageVector? = null
