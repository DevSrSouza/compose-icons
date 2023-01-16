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

public val MaterialDesignIcons.HumanBabyChangingTable: ImageVector
    get() {
        if (_humanBabyChangingTable != null) {
            return _humanBabyChangingTable!!
        }
        _humanBabyChangingTable = Builder(name = "HumanBabyChangingTable", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 6.08f)
                curveTo(5.72f, 6.12f, 5.0f, 6.62f, 4.72f, 7.4f)
                lineTo(3.0f, 12.13f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.84f)
                lineTo(8.42f, 8.94f)
                lineTo(10.7f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.15f)
                lineTo(7.29f, 6.2f)
                curveTo(7.03f, 6.11f, 6.76f, 6.07f, 6.5f, 6.08f)
                moveTo(9.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                moveTo(10.0f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 5.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 1.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 3.5f)
                moveTo(21.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 14.5f)
                moveTo(9.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                curveTo(11.0f, 15.11f, 11.89f, 16.0f, 13.0f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(16.11f, 16.0f, 17.0f, 15.11f, 17.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _humanBabyChangingTable!!
    }

private var _humanBabyChangingTable: ImageVector? = null
