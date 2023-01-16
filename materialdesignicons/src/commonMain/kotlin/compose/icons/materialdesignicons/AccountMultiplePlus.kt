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

public val MaterialDesignIcons.AccountMultiplePlus: ImageVector
    get() {
        if (_accountMultiplePlus != null) {
            return _accountMultiplePlus!!
        }
        _accountMultiplePlus = Builder(name = "AccountMultiplePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                reflectiveCurveTo(7.0f, 13.0f, 13.0f, 13.0f)
                reflectiveCurveTo(19.0f, 17.0f, 19.0f, 17.0f)
                moveTo(16.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 13.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 8.0f)
                moveTo(19.2f, 13.06f)
                arcTo(5.6f, 5.6f, 0.0f, false, true, 21.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(17.0f)
                reflectiveCurveTo(24.0f, 13.55f, 19.2f, 13.06f)
                moveTo(18.0f, 5.0f)
                arcTo(2.91f, 2.91f, 0.0f, false, false, 17.11f, 5.14f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.11f, 10.86f)
                arcTo(2.91f, 2.91f, 0.0f, false, false, 18.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 5.0f)
                moveTo(8.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _accountMultiplePlus!!
    }

private var _accountMultiplePlus: ImageVector? = null
