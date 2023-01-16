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

public val MaterialDesignIcons.CircleEditOutline: ImageVector
    get() {
        if (_circleEditOutline != null) {
            return _circleEditOutline!!
        }
        _circleEditOutline = Builder(name = "CircleEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                verticalLineTo(2.0f)
                moveTo(18.78f, 3.0f)
                curveTo(18.61f, 3.0f, 18.43f, 3.07f, 18.3f, 3.2f)
                lineTo(17.08f, 4.41f)
                lineTo(19.58f, 6.91f)
                lineTo(20.8f, 5.7f)
                curveTo(21.06f, 5.44f, 21.06f, 5.0f, 20.8f, 4.75f)
                lineTo(19.25f, 3.2f)
                curveTo(19.12f, 3.07f, 18.95f, 3.0f, 18.78f, 3.0f)
                moveTo(16.37f, 5.12f)
                lineTo(9.0f, 12.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.5f)
                lineTo(18.87f, 7.62f)
                lineTo(16.37f, 5.12f)
                close()
            }
        }
        .build()
        return _circleEditOutline!!
    }

private var _circleEditOutline: ImageVector? = null
