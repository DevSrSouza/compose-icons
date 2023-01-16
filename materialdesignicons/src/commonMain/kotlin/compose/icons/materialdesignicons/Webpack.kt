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

public val MaterialDesignIcons.Webpack: ImageVector
    get() {
        if (_webpack != null) {
            return _webpack!!
        }
        _webpack = Builder(name = "Webpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.45f, 17.39f)
                lineTo(12.36f, 21.97f)
                verticalLineTo(18.4f)
                lineTo(17.4f, 15.63f)
                lineTo(20.45f, 17.39f)
                moveTo(21.0f, 16.89f)
                verticalLineTo(7.31f)
                lineTo(18.04f, 9.0f)
                verticalLineTo(15.18f)
                lineTo(21.0f, 16.89f)
                moveTo(3.55f, 17.39f)
                lineTo(11.64f, 21.96f)
                verticalLineTo(18.4f)
                lineTo(6.6f, 15.63f)
                lineTo(3.55f, 17.39f)
                moveTo(3.0f, 16.89f)
                verticalLineTo(7.31f)
                lineTo(5.96f, 9.0f)
                verticalLineTo(15.18f)
                lineTo(3.0f, 16.89f)
                moveTo(3.35f, 6.69f)
                lineTo(11.64f, 2.0f)
                verticalLineTo(5.45f)
                lineTo(6.33f, 8.37f)
                lineTo(6.28f, 8.39f)
                lineTo(3.35f, 6.69f)
                moveTo(20.65f, 6.69f)
                lineTo(12.36f, 2.0f)
                verticalLineTo(5.45f)
                lineTo(17.67f, 8.38f)
                lineTo(17.71f, 8.4f)
                lineTo(20.65f, 6.69f)
                moveTo(11.64f, 17.59f)
                lineTo(6.67f, 14.85f)
                verticalLineTo(9.44f)
                lineTo(11.64f, 12.31f)
                verticalLineTo(17.59f)
                moveTo(12.36f, 17.59f)
                lineTo(17.33f, 14.86f)
                verticalLineTo(9.44f)
                lineTo(12.36f, 12.31f)
                verticalLineTo(17.59f)
                moveTo(7.0f, 8.81f)
                lineTo(12.0f, 6.06f)
                lineTo(17.0f, 8.81f)
                lineTo(12.0f, 11.69f)
                lineTo(7.0f, 8.81f)
                close()
            }
        }
        .build()
        return _webpack!!
    }

private var _webpack: ImageVector? = null
