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

public val MaterialDesignIcons.CellphoneLinkOff: ImageVector
    get() {
        if (_cellphoneLinkOff != null) {
            return _cellphoneLinkOff!!
        }
        _cellphoneLinkOff = Builder(name = "CellphoneLinkOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 9.0f)
                verticalLineTo(13.18f)
                lineTo(18.0f, 15.18f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.82f)
                lineTo(22.82f, 20.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 19.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 8.0f)
                moveTo(4.0f, 6.27f)
                lineTo(14.73f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.27f)
                moveTo(1.92f, 1.65f)
                lineTo(0.65f, 2.92f)
                lineTo(2.47f, 4.74f)
                curveTo(2.18f, 5.08f, 2.0f, 5.5f, 2.0f, 6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.73f)
                lineTo(20.08f, 22.35f)
                lineTo(21.35f, 21.08f)
                lineTo(3.89f, 3.62f)
                lineTo(1.92f, 1.65f)
                moveTo(22.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.82f)
                lineTo(8.82f, 6.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _cellphoneLinkOff!!
    }

private var _cellphoneLinkOff: ImageVector? = null
