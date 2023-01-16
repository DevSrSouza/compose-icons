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

public val MaterialDesignIcons.PhoneRotateLandscape: ImageVector
    get() {
        if (_phoneRotateLandscape != null) {
            return _phoneRotateLandscape!!
        }
        _phoneRotateLandscape = Builder(name = "PhoneRotateLandscape", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 3.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 18.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 16.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 1.0f)
                moveTo(9.0f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                moveTo(21.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 23.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 21.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 13.0f)
                moveTo(23.0f, 10.0f)
                lineTo(19.0f, 8.0f)
                lineTo(20.91f, 7.09f)
                curveTo(19.74f, 4.31f, 17.0f, 2.5f, 14.0f, 2.5f)
                verticalLineTo(1.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 23.0f, 10.0f)
                close()
            }
        }
        .build()
        return _phoneRotateLandscape!!
    }

private var _phoneRotateLandscape: ImageVector? = null
