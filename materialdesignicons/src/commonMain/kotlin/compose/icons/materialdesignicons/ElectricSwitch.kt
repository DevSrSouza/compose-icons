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

public val MaterialDesignIcons.ElectricSwitch: ImageVector
    get() {
        if (_electricSwitch != null) {
            return _electricSwitch!!
        }
        _electricSwitch = Builder(name = "ElectricSwitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.0f)
                horizontalLineTo(3.17f)
                curveTo(3.58f, 9.83f, 4.69f, 9.0f, 6.0f, 9.0f)
                curveTo(6.65f, 9.0f, 7.25f, 9.21f, 7.74f, 9.56f)
                lineTo(14.44f, 4.87f)
                lineTo(15.58f, 6.5f)
                lineTo(8.89f, 11.2f)
                curveTo(8.96f, 11.45f, 9.0f, 11.72f, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 15.0f)
                curveTo(4.69f, 15.0f, 3.58f, 14.17f, 3.17f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                moveTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.83f)
                curveTo(20.42f, 14.17f, 19.31f, 15.0f, 18.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 9.0f)
                curveTo(19.31f, 9.0f, 20.42f, 9.83f, 20.83f, 11.0f)
                horizontalLineTo(23.0f)
                moveTo(6.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 11.0f)
                moveTo(18.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 11.0f)
                close()
            }
        }
        .build()
        return _electricSwitch!!
    }

private var _electricSwitch: ImageVector? = null
