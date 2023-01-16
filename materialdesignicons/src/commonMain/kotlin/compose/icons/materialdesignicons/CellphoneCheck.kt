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

public val MaterialDesignIcons.CellphoneCheck: ImageVector
    get() {
        if (_cellphoneCheck != null) {
            return _cellphoneCheck!!
        }
        _cellphoneCheck = Builder(name = "CellphoneCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.54f, 23.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 23.0f, 5.0f, 22.11f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 1.89f, 5.89f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 1.0f, 19.0f, 1.89f, 19.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(18.3f, 13.0f, 17.63f, 13.13f, 17.0f, 13.35f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 20.54f, 13.58f, 21.94f, 14.54f, 23.0f)
                moveTo(17.75f, 22.16f)
                lineTo(15.0f, 19.16f)
                lineTo(16.16f, 18.0f)
                lineTo(17.75f, 19.59f)
                lineTo(21.34f, 16.0f)
                lineTo(22.5f, 17.41f)
                lineTo(17.75f, 22.16f)
            }
        }
        .build()
        return _cellphoneCheck!!
    }

private var _cellphoneCheck: ImageVector? = null
