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

public val MaterialDesignIcons.AccountCancel: ImageVector
    get() {
        if (_accountCancel != null) {
            return _accountCancel!!
        }
        _accountCancel = Builder(name = "AccountCancel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 4.0f)
                moveTo(17.5f, 13.0f)
                curveTo(15.0f, 13.0f, 13.0f, 15.0f, 13.0f, 17.5f)
                curveTo(13.0f, 20.0f, 15.0f, 22.0f, 17.5f, 22.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 17.5f)
                curveTo(22.0f, 15.0f, 20.0f, 13.0f, 17.5f, 13.0f)
                moveTo(10.0f, 14.0f)
                curveTo(5.58f, 14.0f, 2.0f, 15.79f, 2.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 11.0f, 17.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 11.95f, 14.14f)
                curveTo(11.32f, 14.06f, 10.68f, 14.0f, 10.0f, 14.0f)
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
        return _accountCancel!!
    }

private var _accountCancel: ImageVector? = null
