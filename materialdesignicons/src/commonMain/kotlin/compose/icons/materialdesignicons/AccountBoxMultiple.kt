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

public val MaterialDesignIcons.AccountBoxMultiple: ImageVector
    get() {
        if (_accountBoxMultiple != null) {
            return _accountBoxMultiple!!
        }
        _accountBoxMultiple = Builder(name = "AccountBoxMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(20.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 16.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 2.0f)
                horizontalLineTo(20.0f)
                moveTo(17.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 7.0f)
                moveTo(8.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 13.0f, 16.0f, 11.9f, 14.0f, 11.9f)
                curveTo(12.0f, 11.9f, 8.0f, 13.0f, 8.0f, 15.0f)
                close()
            }
        }
        .build()
        return _accountBoxMultiple!!
    }

private var _accountBoxMultiple: ImageVector? = null
