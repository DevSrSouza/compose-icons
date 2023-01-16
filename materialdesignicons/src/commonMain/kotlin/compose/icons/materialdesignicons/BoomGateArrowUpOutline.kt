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

public val MaterialDesignIcons.BoomGateArrowUpOutline: ImageVector
    get() {
        if (_boomGateArrowUpOutline != null) {
            return _boomGateArrowUpOutline!!
        }
        _boomGateArrowUpOutline = Builder(name = "BoomGateArrowUpOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.86f, 3.0f)
                curveTo(20.41f, 3.96f, 20.08f, 5.18f, 19.12f, 5.73f)
                lineTo(9.0f, 11.58f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 8.0f)
                curveTo(6.31f, 8.0f, 6.62f, 8.06f, 6.92f, 8.16f)
                lineTo(17.12f, 2.27f)
                curveTo(18.09f, 1.71f, 19.31f, 2.04f, 19.86f, 3.0f)
                moveTo(7.5f, 20.0f)
                verticalLineTo(13.6f)
                curveTo(6.57f, 14.14f, 5.43f, 14.14f, 4.5f, 13.6f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.5f)
                moveTo(6.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 12.5f)
                moveTo(10.4f, 9.62f)
                lineTo(11.7f, 8.87f)
                lineTo(9.4f, 7.87f)
                lineTo(8.1f, 8.62f)
                lineTo(10.4f, 9.62f)
                moveTo(13.86f, 7.62f)
                lineTo(15.16f, 6.87f)
                lineTo(12.86f, 5.87f)
                lineTo(11.56f, 6.62f)
                lineTo(13.86f, 7.62f)
                moveTo(17.33f, 5.62f)
                lineTo(18.62f, 4.87f)
                lineTo(16.33f, 3.87f)
                lineTo(15.03f, 4.62f)
                lineTo(17.33f, 5.62f)
                moveTo(16.0f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                lineTo(17.0f, 11.16f)
                lineTo(21.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _boomGateArrowUpOutline!!
    }

private var _boomGateArrowUpOutline: ImageVector? = null
