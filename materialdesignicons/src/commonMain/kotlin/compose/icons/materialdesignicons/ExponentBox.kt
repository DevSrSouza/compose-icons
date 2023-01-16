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

public val MaterialDesignIcons.ExponentBox: ImageVector
    get() {
        if (_exponentBox != null) {
            return _exponentBox!!
        }
        _exponentBox = Builder(name = "ExponentBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(13.76f, 6.0f)
                horizontalLineTo(15.39f)
                lineTo(16.5f, 8.6f)
                lineTo(17.59f, 6.0f)
                horizontalLineTo(19.24f)
                curveTo(19.24f, 6.0f, 17.5f, 10.57f, 16.46f, 12.32f)
                curveTo(16.08f, 12.89f, 15.35f, 13.27f, 14.5f, 13.25f)
                verticalLineTo(11.75f)
                curveTo(14.96f, 11.76f, 15.25f, 11.5f, 15.5f, 11.13f)
                curveTo(15.61f, 11.0f, 15.68f, 10.8f, 15.74f, 10.64f)
                lineTo(13.76f, 6.0f)
                moveTo(6.41f, 9.59f)
                lineTo(9.21f, 12.38f)
                lineTo(12.0f, 9.59f)
                lineTo(13.41f, 11.0f)
                lineTo(10.62f, 13.79f)
                lineTo(13.41f, 16.59f)
                lineTo(12.0f, 18.0f)
                lineTo(9.21f, 15.21f)
                lineTo(6.41f, 18.0f)
                lineTo(5.0f, 16.59f)
                lineTo(7.79f, 13.79f)
                lineTo(5.0f, 11.0f)
                lineTo(6.41f, 9.59f)
                close()
            }
        }
        .build()
        return _exponentBox!!
    }

private var _exponentBox: ImageVector? = null
