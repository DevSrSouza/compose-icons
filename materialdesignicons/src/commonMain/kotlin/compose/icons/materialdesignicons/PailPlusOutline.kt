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

public val MaterialDesignIcons.PailPlusOutline: ImageVector
    get() {
        if (_pailPlusOutline != null) {
            return _pailPlusOutline!!
        }
        _pailPlusOutline = Builder(name = "PailPlusOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                lineTo(18.6f, 13.0f)
                curveTo(17.83f, 13.07f, 17.11f, 13.26f, 16.45f, 13.58f)
                lineTo(17.96f, 6.0f)
                horizontalLineTo(6.04f)
                lineTo(6.5f, 8.22f)
                lineTo(4.65f, 9.27f)
                lineTo(4.0f, 6.0f)
                moveTo(12.86f, 8.0f)
                curveTo(12.58f, 7.5f, 11.97f, 7.35f, 11.5f, 7.63f)
                lineTo(3.27f, 12.38f)
                curveTo(2.79f, 12.66f, 2.62f, 13.27f, 2.9f, 13.75f)
                curveTo(3.18f, 14.23f, 3.79f, 14.39f, 4.27f, 14.11f)
                lineTo(12.5f, 9.36f)
                curveTo(12.97f, 9.09f, 13.14f, 8.47f, 12.86f, 8.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(8.64f)
                lineTo(7.73f, 14.43f)
                lineTo(5.9f, 15.5f)
                lineTo(7.0f, 21.0f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13.0f, 19.7f, 13.0f, 19.0f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _pailPlusOutline!!
    }

private var _pailPlusOutline: ImageVector? = null
