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

public val MaterialDesignIcons.CrownCircleOutline: ImageVector
    get() {
        if (_crownCircleOutline != null) {
            return _crownCircleOutline!!
        }
        _crownCircleOutline = Builder(name = "CrownCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                curveTo(4.0f, 7.58f, 7.58f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.0f, 7.58f, 20.0f, 12.0f)
                curveTo(20.0f, 16.42f, 16.42f, 20.0f, 12.0f, 20.0f)
                moveTo(8.0f, 14.0f)
                lineTo(7.0f, 8.0f)
                lineTo(10.0f, 10.0f)
                lineTo(12.0f, 7.0f)
                lineTo(14.0f, 10.0f)
                lineTo(17.0f, 8.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineTo(8.0f)
                moveTo(8.56f, 16.0f)
                curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.44f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.44f)
                curveTo(16.0f, 15.78f, 15.78f, 16.0f, 15.44f, 16.0f)
                horizontalLineTo(8.56f)
                close()
            }
        }
        .build()
        return _crownCircleOutline!!
    }

private var _crownCircleOutline: ImageVector? = null
