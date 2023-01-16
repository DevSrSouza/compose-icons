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

public val MaterialDesignIcons.AccountSearchOutline: ImageVector
    get() {
        if (_accountSearchOutline != null) {
            return _accountSearchOutline!!
        }
        _accountSearchOutline = Builder(name = "AccountSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                curveTo(9.65f, 13.59f, 9.36f, 14.24f, 9.19f, 14.93f)
                curveTo(6.5f, 15.16f, 3.9f, 16.42f, 3.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(9.2f)
                curveTo(9.37f, 18.78f, 9.65f, 19.42f, 10.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.34f, 7.33f, 13.0f, 10.0f, 13.0f)
                moveTo(10.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 8.0f)
                curveTo(14.0f, 8.91f, 13.69f, 9.75f, 13.18f, 10.43f)
                curveTo(12.32f, 10.75f, 11.55f, 11.26f, 10.91f, 11.9f)
                lineTo(10.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 4.0f)
                moveTo(10.0f, 5.9f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 7.9f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 10.0f, 10.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 12.1f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 10.0f, 5.9f)
                moveTo(15.5f, 12.0f)
                curveTo(18.0f, 12.0f, 20.0f, 14.0f, 20.0f, 16.5f)
                curveTo(20.0f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22.0f)
                lineTo(21.0f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21.0f, 15.5f, 21.0f)
                curveTo(13.0f, 21.0f, 11.0f, 19.0f, 11.0f, 16.5f)
                curveTo(11.0f, 14.0f, 13.0f, 12.0f, 15.5f, 12.0f)
                moveTo(15.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 14.0f)
                close()
            }
        }
        .build()
        return _accountSearchOutline!!
    }

private var _accountSearchOutline: ImageVector? = null
