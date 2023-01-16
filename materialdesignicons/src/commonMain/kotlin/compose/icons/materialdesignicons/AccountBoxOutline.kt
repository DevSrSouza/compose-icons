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

public val MaterialDesignIcons.AccountBoxOutline: ImageVector
    get() {
        if (_accountBoxOutline != null) {
            return _accountBoxOutline!!
        }
        _accountBoxOutline = Builder(name = "AccountBoxOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(16.5f, 16.25f)
                curveTo(16.5f, 14.75f, 13.5f, 14.0f, 12.0f, 14.0f)
                curveTo(10.5f, 14.0f, 7.5f, 14.75f, 7.5f, 16.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.5f)
                moveTo(12.0f, 12.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 14.25f, 10.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 12.0f, 7.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 9.75f, 10.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 12.0f, 12.25f)
                close()
            }
        }
        .build()
        return _accountBoxOutline!!
    }

private var _accountBoxOutline: ImageVector? = null
