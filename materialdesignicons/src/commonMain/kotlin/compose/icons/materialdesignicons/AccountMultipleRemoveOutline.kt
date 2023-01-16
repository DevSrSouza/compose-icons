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

public val MaterialDesignIcons.AccountMultipleRemoveOutline: ImageVector
    get() {
        if (_accountMultipleRemoveOutline != null) {
            return _accountMultipleRemoveOutline!!
        }
        _accountMultipleRemoveOutline = Builder(name = "AccountMultipleRemoveOutline", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 15.45f, 20.3f, 14.06f, 19.18f, 13.06f)
                curveTo(24.0f, 13.55f, 24.0f, 17.0f, 24.0f, 17.0f)
                moveTo(18.0f, 5.0f)
                curveTo(19.66f, 5.0f, 21.0f, 6.34f, 21.0f, 8.0f)
                curveTo(21.0f, 9.66f, 19.66f, 11.0f, 18.0f, 11.0f)
                curveTo(17.69f, 11.0f, 17.38f, 10.95f, 17.1f, 10.86f)
                curveTo(17.67f, 10.05f, 18.0f, 9.07f, 18.0f, 8.0f)
                curveTo(18.0f, 6.94f, 17.67f, 5.95f, 17.1f, 5.14f)
                curveTo(17.38f, 5.05f, 17.69f, 5.0f, 18.0f, 5.0f)
                moveTo(13.0f, 5.0f)
                curveTo(14.66f, 5.0f, 16.0f, 6.34f, 16.0f, 8.0f)
                curveTo(16.0f, 9.66f, 14.66f, 11.0f, 13.0f, 11.0f)
                curveTo(11.34f, 11.0f, 10.0f, 9.66f, 10.0f, 8.0f)
                curveTo(10.0f, 6.34f, 11.34f, 5.0f, 13.0f, 5.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 14.79f, 9.69f, 13.0f, 13.0f, 13.0f)
                curveTo(16.31f, 13.0f, 19.0f, 14.79f, 19.0f, 17.0f)
                moveTo(13.0f, 7.0f)
                curveTo(12.45f, 7.0f, 12.0f, 7.45f, 12.0f, 8.0f)
                curveTo(12.0f, 8.55f, 12.45f, 9.0f, 13.0f, 9.0f)
                curveTo(13.55f, 9.0f, 14.0f, 8.55f, 14.0f, 8.0f)
                curveTo(14.0f, 7.45f, 13.55f, 7.0f, 13.0f, 7.0f)
                moveTo(13.0f, 15.0f)
                curveTo(10.79f, 15.0f, 9.0f, 15.9f, 9.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 15.9f, 15.21f, 15.0f, 13.0f, 15.0f)
                moveTo(0.464f, 13.12f)
                lineTo(2.59f, 11.0f)
                lineTo(0.464f, 8.88f)
                lineTo(1.88f, 7.46f)
                lineTo(4.0f, 9.59f)
                lineTo(6.12f, 7.46f)
                lineTo(7.54f, 8.88f)
                lineTo(5.41f, 11.0f)
                lineTo(7.54f, 13.12f)
                lineTo(6.12f, 14.54f)
                lineTo(4.0f, 12.41f)
                lineTo(1.88f, 14.54f)
                close()
            }
        }
        .build()
        return _accountMultipleRemoveOutline!!
    }

private var _accountMultipleRemoveOutline: ImageVector? = null
