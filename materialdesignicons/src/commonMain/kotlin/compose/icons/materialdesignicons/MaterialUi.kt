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

public val MaterialDesignIcons.MaterialUi: ImageVector
    get() {
        if (_materialUi != null) {
            return _materialUi!!
        }
        _materialUi = Builder(name = "MaterialUi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.61f)
                verticalLineTo(15.37f)
                lineTo(14.0f, 11.91f)
                verticalLineTo(7.23f)
                lineTo(9.0f, 10.12f)
                lineTo(4.0f, 7.23f)
                verticalLineTo(13.0f)
                lineTo(3.0f, 13.58f)
                lineTo(2.0f, 13.0f)
                verticalLineTo(5.0f)
                lineTo(3.07f, 4.38f)
                lineTo(9.0f, 7.81f)
                lineTo(12.93f, 5.54f)
                lineTo(14.93f, 4.38f)
                lineTo(16.0f, 5.0f)
                verticalLineTo(13.06f)
                lineTo(10.92f, 16.0f)
                lineTo(14.97f, 18.33f)
                lineTo(20.0f, 15.43f)
                verticalLineTo(11.0f)
                lineTo(21.0f, 10.42f)
                lineTo(22.0f, 11.0f)
                verticalLineTo(16.58f)
                lineTo(14.97f, 20.64f)
                lineTo(8.0f, 16.61f)
                moveTo(22.0f, 9.75f)
                lineTo(21.0f, 10.33f)
                lineTo(20.0f, 9.75f)
                verticalLineTo(8.58f)
                lineTo(21.0f, 8.0f)
                lineTo(22.0f, 8.58f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _materialUi!!
    }

private var _materialUi: ImageVector? = null
