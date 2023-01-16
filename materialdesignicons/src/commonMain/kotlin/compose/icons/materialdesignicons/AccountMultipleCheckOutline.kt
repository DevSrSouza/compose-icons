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

public val MaterialDesignIcons.AccountMultipleCheckOutline: ImageVector
    get() {
        if (_accountMultipleCheckOutline != null) {
            return _accountMultipleCheckOutline!!
        }
        _accountMultipleCheckOutline = Builder(name = "AccountMultipleCheckOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 10.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 11.0f)
                moveTo(13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 12.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 7.0f)
                moveTo(17.11f, 10.86f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.11f, 5.14f)
                arcTo(2.91f, 2.91f, 0.0f, false, true, 18.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 11.0f)
                arcTo(2.91f, 2.91f, 0.0f, false, true, 17.11f, 10.86f)
                moveTo(13.0f, 13.0f)
                curveTo(7.0f, 13.0f, 7.0f, 17.0f, 7.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                reflectiveCurveTo(19.0f, 13.0f, 13.0f, 13.0f)
                moveTo(9.0f, 17.0f)
                curveTo(9.0f, 16.71f, 9.32f, 15.0f, 13.0f, 15.0f)
                curveTo(16.5f, 15.0f, 16.94f, 16.56f, 17.0f, 17.0f)
                moveTo(24.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 19.2f, 13.06f)
                curveTo(24.0f, 13.55f, 24.0f, 17.0f, 24.0f, 17.0f)
                moveTo(7.34f, 8.92f)
                lineTo(8.5f, 10.33f)
                lineTo(3.75f, 15.08f)
                lineTo(1.0f, 12.08f)
                lineTo(2.16f, 10.92f)
                lineTo(3.75f, 12.5f)
                lineTo(7.34f, 8.92f)
            }
        }
        .build()
        return _accountMultipleCheckOutline!!
    }

private var _accountMultipleCheckOutline: ImageVector? = null
