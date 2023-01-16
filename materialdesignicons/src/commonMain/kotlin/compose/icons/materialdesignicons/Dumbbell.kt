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

public val MaterialDesignIcons.Dumbbell: ImageVector
    get() {
        if (_dumbbell != null) {
            return _dumbbell!!
        }
        _dumbbell = Builder(name = "Dumbbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.57f, 14.86f)
                lineTo(22.0f, 13.43f)
                lineTo(20.57f, 12.0f)
                lineTo(17.0f, 15.57f)
                lineTo(8.43f, 7.0f)
                lineTo(12.0f, 3.43f)
                lineTo(10.57f, 2.0f)
                lineTo(9.14f, 3.43f)
                lineTo(7.71f, 2.0f)
                lineTo(5.57f, 4.14f)
                lineTo(4.14f, 2.71f)
                lineTo(2.71f, 4.14f)
                lineTo(4.14f, 5.57f)
                lineTo(2.0f, 7.71f)
                lineTo(3.43f, 9.14f)
                lineTo(2.0f, 10.57f)
                lineTo(3.43f, 12.0f)
                lineTo(7.0f, 8.43f)
                lineTo(15.57f, 17.0f)
                lineTo(12.0f, 20.57f)
                lineTo(13.43f, 22.0f)
                lineTo(14.86f, 20.57f)
                lineTo(16.29f, 22.0f)
                lineTo(18.43f, 19.86f)
                lineTo(19.86f, 21.29f)
                lineTo(21.29f, 19.86f)
                lineTo(19.86f, 18.43f)
                lineTo(22.0f, 16.29f)
                lineTo(20.57f, 14.86f)
                close()
            }
        }
        .build()
        return _dumbbell!!
    }

private var _dumbbell: ImageVector? = null
