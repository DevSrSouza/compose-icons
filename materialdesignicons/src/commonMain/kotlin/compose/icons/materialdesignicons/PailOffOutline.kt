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

public val MaterialDesignIcons.PailOffOutline: ImageVector
    get() {
        if (_pailOffOutline != null) {
            return _pailOffOutline!!
        }
        _pailOffOutline = Builder(name = "PailOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(17.35f, 19.24f)
                lineTo(17.0f, 21.0f)
                horizontalLineTo(7.0f)
                lineTo(5.9f, 15.5f)
                lineTo(7.73f, 14.43f)
                lineTo(8.64f, 19.0f)
                horizontalLineTo(15.36f)
                lineTo(15.65f, 17.54f)
                lineTo(9.31f, 11.2f)
                lineTo(4.27f, 14.11f)
                curveTo(3.79f, 14.39f, 3.18f, 14.23f, 2.9f, 13.75f)
                curveTo(2.62f, 13.27f, 2.79f, 12.66f, 3.27f, 12.38f)
                lineTo(7.85f, 9.74f)
                lineTo(6.38f, 8.27f)
                lineTo(4.65f, 9.27f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(17.96f, 6.0f)
                lineTo(16.5f, 13.3f)
                lineTo(18.2f, 15.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.2f)
                lineTo(9.2f, 6.0f)
                horizontalLineTo(17.96f)
                moveTo(11.5f, 7.63f)
                lineTo(11.08f, 7.88f)
                lineTo(12.53f, 9.33f)
                curveTo(12.97f, 9.05f, 13.13f, 8.46f, 12.86f, 8.0f)
                curveTo(12.58f, 7.5f, 11.97f, 7.35f, 11.5f, 7.63f)
                close()
            }
        }
        .build()
        return _pailOffOutline!!
    }

private var _pailOffOutline: ImageVector? = null
