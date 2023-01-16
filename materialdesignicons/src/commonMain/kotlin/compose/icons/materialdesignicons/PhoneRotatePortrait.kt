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

public val MaterialDesignIcons.PhoneRotatePortrait: ImageVector
    get() {
        if (_phoneRotatePortrait != null) {
            return _phoneRotatePortrait!!
        }
        _phoneRotatePortrait = Builder(name = "PhoneRotatePortrait", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 3.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 1.0f)
                moveTo(23.0f, 21.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 13.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 15.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 23.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 21.0f)
                moveTo(9.0f, 21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                moveTo(23.0f, 10.0f)
                horizontalLineTo(21.5f)
                curveTo(21.5f, 7.0f, 19.69f, 4.27f, 16.92f, 3.09f)
                lineTo(16.0f, 5.0f)
                lineTo(14.0f, 1.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 23.0f, 10.0f)
                close()
            }
        }
        .build()
        return _phoneRotatePortrait!!
    }

private var _phoneRotatePortrait: ImageVector? = null
