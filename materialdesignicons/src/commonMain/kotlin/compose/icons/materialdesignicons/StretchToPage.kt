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

public val MaterialDesignIcons.StretchToPage: ImageVector
    get() {
        if (_stretchToPage != null) {
            return _stretchToPage!!
        }
        _stretchToPage = Builder(name = "StretchToPage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.89f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.11f, 2.0f, 20.0f, 2.0f)
                moveTo(9.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                lineTo(6.29f, 16.29f)
                lineTo(7.83f, 14.75f)
                lineTo(9.25f, 16.17f)
                lineTo(7.71f, 17.71f)
                moveTo(7.83f, 9.25f)
                lineTo(6.29f, 7.71f)
                lineTo(5.0f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                lineTo(7.71f, 6.29f)
                lineTo(9.25f, 7.83f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(15.0f)
                lineTo(16.29f, 17.71f)
                lineTo(14.75f, 16.17f)
                lineTo(16.17f, 14.75f)
                lineTo(17.71f, 16.29f)
                lineTo(19.0f, 15.0f)
                moveTo(19.0f, 9.0f)
                lineTo(17.71f, 7.71f)
                lineTo(16.17f, 9.25f)
                lineTo(14.75f, 7.83f)
                lineTo(16.29f, 6.29f)
                lineTo(15.0f, 5.0f)
                horizontalLineTo(19.0f)
            }
        }
        .build()
        return _stretchToPage!!
    }

private var _stretchToPage: ImageVector? = null
