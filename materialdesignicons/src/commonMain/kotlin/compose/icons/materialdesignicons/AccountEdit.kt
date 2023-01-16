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

public val MaterialDesignIcons.AccountEdit: ImageVector
    get() {
        if (_accountEdit != null) {
            return _accountEdit!!
        }
        _accountEdit = Builder(name = "AccountEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.3f)
                lineTo(19.65f, 11.3f)
                curveTo(19.86f, 11.09f, 20.21f, 11.09f, 20.42f, 11.3f)
                lineTo(21.7f, 12.58f)
                curveTo(21.91f, 12.79f, 21.91f, 13.14f, 21.7f, 13.35f)
                moveTo(12.0f, 18.94f)
                lineTo(18.06f, 12.88f)
                lineTo(20.11f, 14.93f)
                lineTo(14.06f, 21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.94f)
                moveTo(12.0f, 14.0f)
                curveTo(7.58f, 14.0f, 4.0f, 15.79f, 4.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.11f)
                lineTo(14.0f, 14.11f)
                curveTo(13.34f, 14.03f, 12.67f, 14.0f, 12.0f, 14.0f)
                moveTo(12.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accountEdit!!
    }

private var _accountEdit: ImageVector? = null
