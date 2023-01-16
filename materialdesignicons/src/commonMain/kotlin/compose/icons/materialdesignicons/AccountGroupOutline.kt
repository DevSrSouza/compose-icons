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

public val MaterialDesignIcons.AccountGroupOutline: ImageVector
    get() {
        if (_accountGroupOutline != null) {
            return _accountGroupOutline!!
        }
        _accountGroupOutline = Builder(name = "AccountGroupOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 5.0f)
                moveTo(12.0f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 7.0f)
                moveTo(5.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 10.5f)
                curveTo(3.0f, 11.44f, 3.53f, 12.25f, 4.29f, 12.68f)
                curveTo(4.65f, 12.88f, 5.06f, 13.0f, 5.5f, 13.0f)
                curveTo(5.94f, 13.0f, 6.35f, 12.88f, 6.71f, 12.68f)
                curveTo(7.08f, 12.47f, 7.39f, 12.17f, 7.62f, 11.81f)
                curveTo(6.89f, 10.86f, 6.5f, 9.7f, 6.5f, 8.5f)
                curveTo(6.5f, 8.41f, 6.5f, 8.31f, 6.5f, 8.22f)
                curveTo(6.2f, 8.08f, 5.86f, 8.0f, 5.5f, 8.0f)
                moveTo(18.5f, 8.0f)
                curveTo(18.14f, 8.0f, 17.8f, 8.08f, 17.5f, 8.22f)
                curveTo(17.5f, 8.31f, 17.5f, 8.41f, 17.5f, 8.5f)
                curveTo(17.5f, 9.7f, 17.11f, 10.86f, 16.38f, 11.81f)
                curveTo(16.5f, 12.0f, 16.63f, 12.15f, 16.78f, 12.3f)
                curveTo(16.94f, 12.45f, 17.1f, 12.58f, 17.29f, 12.68f)
                curveTo(17.65f, 12.88f, 18.06f, 13.0f, 18.5f, 13.0f)
                curveTo(18.94f, 13.0f, 19.35f, 12.88f, 19.71f, 12.68f)
                curveTo(20.47f, 12.25f, 21.0f, 11.44f, 21.0f, 10.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 8.0f)
                moveTo(12.0f, 14.0f)
                curveTo(9.66f, 14.0f, 5.0f, 15.17f, 5.0f, 17.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 15.17f, 14.34f, 14.0f, 12.0f, 14.0f)
                moveTo(4.71f, 14.55f)
                curveTo(2.78f, 14.78f, 0.0f, 15.76f, 0.0f, 17.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.07f)
                curveTo(3.0f, 16.06f, 3.69f, 15.22f, 4.71f, 14.55f)
                moveTo(19.29f, 14.55f)
                curveTo(20.31f, 15.22f, 21.0f, 16.06f, 21.0f, 17.07f)
                verticalLineTo(19.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(17.5f)
                curveTo(24.0f, 15.76f, 21.22f, 14.78f, 19.29f, 14.55f)
                moveTo(12.0f, 16.0f)
                curveTo(13.53f, 16.0f, 15.24f, 16.5f, 16.23f, 17.0f)
                horizontalLineTo(7.77f)
                curveTo(8.76f, 16.5f, 10.47f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _accountGroupOutline!!
    }

private var _accountGroupOutline: ImageVector? = null
