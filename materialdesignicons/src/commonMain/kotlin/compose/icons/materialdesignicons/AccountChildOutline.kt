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

public val MaterialDesignIcons.AccountChildOutline: ImageVector
    get() {
        if (_accountChildOutline != null) {
            return _accountChildOutline!!
        }
        _accountChildOutline = Builder(name = "AccountChildOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(10.9f, 17.0f, 10.0f, 16.1f, 10.0f, 15.0f)
                curveTo(10.0f, 13.9f, 10.9f, 13.0f, 12.0f, 13.0f)
                curveTo(13.1f, 13.0f, 14.0f, 13.9f, 14.0f, 15.0f)
                curveTo(14.0f, 16.1f, 13.1f, 17.0f, 12.0f, 17.0f)
                moveTo(12.0f, 10.0f)
                curveTo(14.34f, 10.0f, 19.0f, 11.16f, 19.0f, 13.5f)
                verticalLineTo(18.63f)
                curveTo(19.0f, 19.5f, 18.31f, 20.24f, 17.34f, 20.79f)
                verticalLineTo(13.38f)
                curveTo(17.34f, 12.82f, 14.6f, 11.54f, 12.0f, 11.54f)
                curveTo(9.4f, 11.54f, 6.66f, 12.82f, 6.66f, 13.38f)
                verticalLineTo(18.75f)
                curveTo(6.66f, 19.0f, 7.31f, 19.46f, 8.28f, 19.85f)
                curveTo(9.0f, 19.0f, 10.93f, 18.56f, 12.0f, 18.56f)
                curveTo(13.33f, 18.56f, 16.0f, 19.22f, 16.0f, 20.56f)
                verticalLineTo(21.39f)
                curveTo(14.63f, 21.88f, 13.07f, 22.13f, 12.0f, 22.13f)
                curveTo(10.93f, 22.13f, 9.38f, 21.88f, 8.0f, 21.39f)
                horizontalLineTo(8.0f)
                curveTo(6.37f, 20.81f, 5.0f, 19.89f, 5.0f, 18.63f)
                verticalLineTo(13.5f)
                curveTo(5.0f, 11.16f, 9.66f, 10.0f, 12.0f, 10.0f)
                moveTo(12.0f, 3.75f)
                curveTo(11.03f, 3.75f, 10.25f, 4.53f, 10.25f, 5.5f)
                curveTo(10.25f, 6.47f, 11.03f, 7.25f, 12.0f, 7.25f)
                curveTo(12.97f, 7.25f, 13.75f, 6.47f, 13.75f, 5.5f)
                curveTo(13.75f, 4.53f, 12.97f, 3.75f, 12.0f, 3.75f)
                moveTo(12.0f, 9.0f)
                curveTo(10.07f, 9.0f, 8.5f, 7.43f, 8.5f, 5.5f)
                curveTo(8.5f, 3.57f, 10.07f, 2.0f, 12.0f, 2.0f)
                curveTo(13.93f, 2.0f, 15.5f, 3.57f, 15.5f, 5.5f)
                curveTo(15.5f, 7.43f, 13.93f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _accountChildOutline!!
    }

private var _accountChildOutline: ImageVector? = null
