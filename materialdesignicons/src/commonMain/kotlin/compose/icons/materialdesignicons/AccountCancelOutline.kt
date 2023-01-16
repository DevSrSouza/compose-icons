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

public val MaterialDesignIcons.AccountCancelOutline: ImageVector
    get() {
        if (_accountCancelOutline != null) {
            return _accountCancelOutline!!
        }
        _accountCancelOutline = Builder(name = "AccountCancelOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 4.0f)
                moveTo(10.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 6.0f)
                moveTo(10.0f, 13.0f)
                curveTo(7.33f, 13.0f, 2.0f, 14.33f, 2.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 11.03f, 18.1f)
                horizontalLineTo(3.9f)
                verticalLineTo(17.0f)
                curveTo(3.9f, 16.36f, 7.03f, 14.9f, 10.0f, 14.9f)
                curveTo(10.5f, 14.9f, 11.0f, 14.95f, 11.5f, 15.03f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.55f, 13.29f)
                curveTo(11.61f, 13.1f, 10.71f, 13.0f, 10.0f, 13.0f)
                moveTo(17.5f, 13.0f)
                curveTo(15.0f, 13.0f, 13.0f, 15.0f, 13.0f, 17.5f)
                curveTo(13.0f, 20.0f, 15.0f, 22.0f, 17.5f, 22.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 17.5f)
                curveTo(22.0f, 15.0f, 20.0f, 13.0f, 17.5f, 13.0f)
                moveTo(17.5f, 14.5f)
                curveTo(19.16f, 14.5f, 20.5f, 15.84f, 20.5f, 17.5f)
                curveTo(20.5f, 18.06f, 20.35f, 18.58f, 20.08f, 19.0f)
                lineTo(16.0f, 14.92f)
                curveTo(16.42f, 14.65f, 16.94f, 14.5f, 17.5f, 14.5f)
                moveTo(14.92f, 16.0f)
                lineTo(19.0f, 20.08f)
                curveTo(18.58f, 20.35f, 18.06f, 20.5f, 17.5f, 20.5f)
                curveTo(15.84f, 20.5f, 14.5f, 19.16f, 14.5f, 17.5f)
                curveTo(14.5f, 16.94f, 14.65f, 16.42f, 14.92f, 16.0f)
                close()
            }
        }
        .build()
        return _accountCancelOutline!!
    }

private var _accountCancelOutline: ImageVector? = null
