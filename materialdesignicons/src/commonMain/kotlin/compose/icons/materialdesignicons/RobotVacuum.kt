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

public val MaterialDesignIcons.RobotVacuum: ImageVector
    get() {
        if (_robotVacuum != null) {
            return _robotVacuum!!
        }
        _robotVacuum = Builder(name = "RobotVacuum", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(14.65f, 2.0f, 17.19f, 3.06f, 19.07f, 4.93f)
                lineTo(17.65f, 6.35f)
                curveTo(16.15f, 4.85f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveTo(9.88f, 4.0f, 7.84f, 4.84f, 6.35f, 6.35f)
                lineTo(4.93f, 4.93f)
                curveTo(6.81f, 3.06f, 9.35f, 2.0f, 12.0f, 2.0f)
                moveTo(3.66f, 6.5f)
                lineTo(5.11f, 7.94f)
                curveTo(4.39f, 9.17f, 4.0f, 10.57f, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                curveTo(20.0f, 10.57f, 19.61f, 9.17f, 18.88f, 7.94f)
                lineTo(20.34f, 6.5f)
                curveTo(21.42f, 8.12f, 22.0f, 10.04f, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 10.04f, 2.58f, 8.12f, 3.66f, 6.5f)
                moveTo(12.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 13.59f, 17.37f, 15.12f, 16.24f, 16.24f)
                lineTo(14.83f, 14.83f)
                curveTo(14.08f, 15.58f, 13.06f, 16.0f, 12.0f, 16.0f)
                curveTo(10.94f, 16.0f, 9.92f, 15.58f, 9.17f, 14.83f)
                lineTo(7.76f, 16.24f)
                curveTo(6.63f, 15.12f, 6.0f, 13.59f, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                moveTo(12.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _robotVacuum!!
    }

private var _robotVacuum: ImageVector? = null
