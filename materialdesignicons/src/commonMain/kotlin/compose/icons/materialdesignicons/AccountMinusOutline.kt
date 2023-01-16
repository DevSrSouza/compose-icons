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

public val MaterialDesignIcons.AccountMinusOutline: ImageVector
    get() {
        if (_accountMinusOutline != null) {
            return _accountMinusOutline!!
        }
        _accountMinusOutline = Builder(name = "AccountMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 4.0f)
                moveTo(15.0f, 5.9f)
                curveTo(16.16f, 5.9f, 17.1f, 6.84f, 17.1f, 8.0f)
                curveTo(17.1f, 9.16f, 16.16f, 10.1f, 15.0f, 10.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 12.9f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 15.0f, 5.9f)
                moveTo(1.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.0f)
                moveTo(15.0f, 13.0f)
                curveTo(12.33f, 13.0f, 7.0f, 14.33f, 7.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                curveTo(23.0f, 14.33f, 17.67f, 13.0f, 15.0f, 13.0f)
                moveTo(15.0f, 14.9f)
                curveTo(17.97f, 14.9f, 21.1f, 16.36f, 21.1f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(8.9f)
                verticalLineTo(17.0f)
                curveTo(8.9f, 16.36f, 12.0f, 14.9f, 15.0f, 14.9f)
                close()
            }
        }
        .build()
        return _accountMinusOutline!!
    }

private var _accountMinusOutline: ImageVector? = null
