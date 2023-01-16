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

public val MaterialDesignIcons.AccountHardHatOutline: ImageVector
    get() {
        if (_accountHardHatOutline != null) {
            return _accountHardHatOutline!!
        }
        _accountHardHatOutline = Builder(name = "AccountHardHatOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveTo(16.0f, 14.33f, 8.0f, 14.33f, 8.0f, 9.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 11.67f, 14.0f, 11.67f, 14.0f, 9.0f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 15.33f, 9.33f, 14.0f, 12.0f, 14.0f)
                curveTo(14.67f, 14.0f, 20.0f, 15.33f, 20.0f, 18.0f)
                moveTo(18.1f, 18.0f)
                curveTo(18.1f, 17.36f, 14.97f, 15.9f, 12.0f, 15.9f)
                curveTo(9.03f, 15.9f, 5.9f, 17.36f, 5.9f, 18.0f)
                verticalLineTo(19.1f)
                horizontalLineTo(18.1f)
                moveTo(12.5f, 2.0f)
                curveTo(12.78f, 2.0f, 13.0f, 2.22f, 13.0f, 2.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                curveTo(15.45f, 3.67f, 16.34f, 5.16f, 16.25f, 6.75f)
                curveTo(16.25f, 6.75f, 16.95f, 6.89f, 17.0f, 8.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 6.89f, 7.75f, 6.75f, 7.75f, 6.75f)
                curveTo(7.66f, 5.16f, 8.55f, 3.67f, 10.0f, 3.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.5f)
                curveTo(11.0f, 2.22f, 11.22f, 2.0f, 11.5f, 2.0f)
            }
        }
        .build()
        return _accountHardHatOutline!!
    }

private var _accountHardHatOutline: ImageVector? = null
