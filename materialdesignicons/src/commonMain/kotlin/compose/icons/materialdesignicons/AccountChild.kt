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

public val MaterialDesignIcons.AccountChild: ImageVector
    get() {
        if (_accountChild != null) {
            return _accountChild!!
        }
        _accountChild = Builder(name = "AccountChild", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 9.0f)
                curveTo(13.63f, 9.0f, 15.12f, 9.35f, 16.5f, 10.05f)
                curveTo(17.84f, 10.76f, 18.5f, 11.61f, 18.5f, 12.61f)
                verticalLineTo(18.38f)
                curveTo(18.5f, 19.5f, 17.64f, 20.44f, 15.89f, 21.19f)
                verticalLineTo(19.0f)
                curveTo(15.89f, 18.05f, 15.03f, 17.38f, 13.31f, 16.97f)
                curveTo(12.75f, 16.84f, 12.31f, 16.78f, 12.0f, 16.78f)
                curveTo(11.13f, 16.78f, 10.3f, 16.95f, 9.54f, 17.3f)
                curveTo(8.77f, 17.64f, 8.31f, 18.08f, 8.16f, 18.61f)
                curveTo(9.5f, 19.14f, 10.78f, 19.41f, 12.0f, 19.41f)
                lineTo(13.0f, 19.31f)
                verticalLineTo(21.94f)
                lineTo(12.0f, 22.0f)
                curveTo(10.63f, 22.0f, 9.33f, 21.72f, 8.11f, 21.19f)
                curveTo(6.36f, 20.44f, 5.5f, 19.5f, 5.5f, 18.38f)
                verticalLineTo(12.61f)
                curveTo(5.5f, 11.61f, 6.16f, 10.76f, 7.5f, 10.05f)
                curveTo(8.88f, 9.35f, 10.38f, 9.0f, 12.0f, 9.0f)
                moveTo(12.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _accountChild!!
    }

private var _accountChild: ImageVector? = null
