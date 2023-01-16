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

public val MaterialDesignIcons.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                moveTo(17.16f, 8.26f)
                curveTo(18.22f, 9.63f, 18.86f, 11.28f, 19.0f, 13.0f)
                curveTo(19.0f, 15.76f, 15.87f, 18.0f, 12.0f, 18.0f)
                curveTo(8.13f, 18.0f, 5.0f, 15.76f, 5.0f, 13.0f)
                curveTo(5.0f, 10.62f, 7.33f, 6.39f, 10.46f, 5.27f)
                curveTo(10.16f, 4.91f, 10.0f, 4.46f, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
                curveTo(14.0f, 4.46f, 13.84f, 4.91f, 13.54f, 5.27f)
                curveTo(14.4f, 5.6f, 15.18f, 6.1f, 15.84f, 6.74f)
                lineTo(11.29f, 11.29f)
                lineTo(12.71f, 12.71f)
                lineTo(17.16f, 8.26f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
