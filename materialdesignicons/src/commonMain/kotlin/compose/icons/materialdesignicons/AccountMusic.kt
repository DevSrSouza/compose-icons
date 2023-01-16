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

public val MaterialDesignIcons.AccountMusic: ImageVector
    get() {
        if (_accountMusic != null) {
            return _accountMusic!!
        }
        _accountMusic = Builder(name = "AccountMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                curveTo(12.0f, 14.0f, 13.05f, 14.16f, 14.2f, 14.44f)
                curveTo(13.39f, 15.31f, 13.0f, 16.33f, 13.0f, 17.5f)
                curveTo(13.0f, 18.39f, 13.25f, 19.23f, 13.78f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 16.81f, 3.91f, 15.85f, 5.74f, 15.12f)
                curveTo(7.57f, 14.38f, 9.33f, 14.0f, 11.0f, 14.0f)
                moveTo(11.0f, 12.0f)
                curveTo(9.92f, 12.0f, 9.0f, 11.61f, 8.18f, 10.83f)
                curveTo(7.38f, 10.05f, 7.0f, 9.11f, 7.0f, 8.0f)
                curveTo(7.0f, 6.92f, 7.38f, 6.0f, 8.18f, 5.18f)
                curveTo(9.0f, 4.38f, 9.92f, 4.0f, 11.0f, 4.0f)
                curveTo(12.11f, 4.0f, 13.05f, 4.38f, 13.83f, 5.18f)
                curveTo(14.61f, 6.0f, 15.0f, 6.92f, 15.0f, 8.0f)
                curveTo(15.0f, 9.11f, 14.61f, 10.05f, 13.83f, 10.83f)
                curveTo(13.05f, 11.61f, 12.11f, 12.0f, 11.0f, 12.0f)
                moveTo(18.5f, 10.0f)
                horizontalLineTo(20.0f)
                lineTo(22.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 15.0f)
                curveTo(17.86f, 15.0f, 18.19f, 15.07f, 18.5f, 15.21f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _accountMusic!!
    }

private var _accountMusic: ImageVector? = null
