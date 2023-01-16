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

public val MaterialDesignIcons.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 13.0f, 2.0f)
                moveTo(19.32f, 15.89f)
                curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f)
                horizontalLineTo(6.44f)
                lineTo(5.5f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.22f)
                curveTo(4.22f, 11.0f, 6.11f, 15.07f, 6.34f, 15.42f)
                curveTo(5.24f, 16.0f, 4.5f, 17.17f, 4.5f, 18.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 22.0f)
                curveTo(9.76f, 22.0f, 11.22f, 20.7f, 11.46f, 19.0f)
                horizontalLineTo(13.54f)
                curveTo(13.78f, 20.7f, 15.24f, 22.0f, 17.0f, 22.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 18.5f)
                curveTo(20.5f, 17.46f, 20.04f, 16.53f, 19.32f, 15.89f)
                moveTo(8.0f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 20.0f)
                moveTo(17.0f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
