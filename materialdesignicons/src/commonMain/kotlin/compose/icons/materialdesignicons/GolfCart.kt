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

public val MaterialDesignIcons.GolfCart: ImageVector
    get() {
        if (_golfCart != null) {
            return _golfCart!!
        }
        _golfCart = Builder(name = "GolfCart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.89f, 12.37f)
                lineTo(18.25f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.54f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 1.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 19.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.89f, 12.37f)
                moveTo(6.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 20.5f)
                moveTo(15.53f, 12.0f)
                lineTo(14.38f, 10.28f)
                lineTo(15.8f, 9.33f)
                lineTo(14.7f, 7.67f)
                lineTo(10.2f, 10.67f)
                lineTo(11.3f, 12.33f)
                lineTo(12.73f, 11.38f)
                lineTo(13.88f, 13.12f)
                lineTo(13.0f, 14.0f)
                horizontalLineTo(10.2f)
                lineTo(5.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.2f)
                lineTo(17.75f, 12.0f)
                moveTo(18.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 19.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 20.5f)
                close()
            }
        }
        .build()
        return _golfCart!!
    }

private var _golfCart: ImageVector? = null
