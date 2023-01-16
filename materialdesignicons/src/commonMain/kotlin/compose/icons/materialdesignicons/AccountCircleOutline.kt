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

public val MaterialDesignIcons.AccountCircleOutline: ImageVector
    get() {
        if (_accountCircleOutline != null) {
            return _accountCircleOutline!!
        }
        _accountCircleOutline = Builder(name = "AccountCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(7.07f, 18.28f)
                curveTo(7.5f, 17.38f, 10.12f, 16.5f, 12.0f, 16.5f)
                curveTo(13.88f, 16.5f, 16.5f, 17.38f, 16.93f, 18.28f)
                curveTo(15.57f, 19.36f, 13.86f, 20.0f, 12.0f, 20.0f)
                curveTo(10.14f, 20.0f, 8.43f, 19.36f, 7.07f, 18.28f)
                moveTo(18.36f, 16.83f)
                curveTo(16.93f, 15.09f, 13.46f, 14.5f, 12.0f, 14.5f)
                curveTo(10.54f, 14.5f, 7.07f, 15.09f, 5.64f, 16.83f)
                curveTo(4.62f, 15.5f, 4.0f, 13.82f, 4.0f, 12.0f)
                curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f)
                curveTo(16.41f, 4.0f, 20.0f, 7.59f, 20.0f, 12.0f)
                curveTo(20.0f, 13.82f, 19.38f, 15.5f, 18.36f, 16.83f)
                moveTo(12.0f, 6.0f)
                curveTo(10.06f, 6.0f, 8.5f, 7.56f, 8.5f, 9.5f)
                curveTo(8.5f, 11.44f, 10.06f, 13.0f, 12.0f, 13.0f)
                curveTo(13.94f, 13.0f, 15.5f, 11.44f, 15.5f, 9.5f)
                curveTo(15.5f, 7.56f, 13.94f, 6.0f, 12.0f, 6.0f)
                moveTo(12.0f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _accountCircleOutline!!
    }

private var _accountCircleOutline: ImageVector? = null
