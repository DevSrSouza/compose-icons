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

public val MaterialDesignIcons.HairDryerOutline: ImageVector
    get() {
        if (_hairDryerOutline != null) {
            return _hairDryerOutline!!
        }
        _hairDryerOutline = Builder(name = "HairDryerOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.73f)
                arcTo(70.39f, 70.39f, 0.0f, false, false, 17.0f, 11.0f)
                verticalLineTo(4.0f)
                reflectiveCurveTo(10.5f, 2.0f, 7.5f, 2.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.12f, 12.82f)
                lineTo(7.0f, 19.0f)
                horizontalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.46f, 21.33f)
                arcTo(3.15f, 3.15f, 0.0f, false, true, 11.0f, 24.0f)
                horizontalLineTo(12.0f)
                arcTo(4.12f, 4.12f, 0.0f, false, false, 10.09f, 20.55f)
                curveTo(9.39f, 20.0f, 9.0f, 19.63f, 9.0f, 19.0f)
                horizontalLineTo(10.0f)
                moveTo(4.0f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.5f, 4.0f)
                arcTo(37.08f, 37.08f, 0.0f, false, true, 15.0f, 5.5f)
                verticalLineTo(9.5f)
                arcTo(37.08f, 37.08f, 0.0f, false, true, 7.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 7.5f)
                moveTo(22.0f, 9.0f)
                arcTo(4.32f, 4.32f, 0.0f, false, true, 19.78f, 8.45f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 18.0f, 8.0f)
                verticalLineTo(7.0f)
                arcTo(4.32f, 4.32f, 0.0f, false, true, 20.22f, 7.55f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 22.0f, 8.0f)
                moveTo(22.0f, 6.0f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 20.22f, 5.55f)
                arcTo(4.32f, 4.32f, 0.0f, false, false, 18.0f, 5.0f)
                verticalLineTo(6.0f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 19.78f, 6.45f)
                arcTo(4.32f, 4.32f, 0.0f, false, false, 22.0f, 7.0f)
                moveTo(22.0f, 10.0f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 20.22f, 9.55f)
                arcTo(4.32f, 4.32f, 0.0f, false, false, 18.0f, 9.0f)
                verticalLineTo(10.0f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 19.78f, 10.45f)
                arcTo(4.32f, 4.32f, 0.0f, false, false, 22.0f, 11.0f)
                moveTo(9.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 7.5f)
                close()
            }
        }
        .build()
        return _hairDryerOutline!!
    }

private var _hairDryerOutline: ImageVector? = null
