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

public val MaterialDesignIcons.SetCenterRight: ImageVector
    get() {
        if (_setCenterRight != null) {
            return _setCenterRight!!
        }
        _setCenterRight = Builder(name = "SetCenterRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 19.0f)
                curveTo(13.96f, 19.0f, 12.94f, 18.76f, 12.0f, 18.32f)
                curveTo(11.06f, 18.76f, 10.04f, 19.0f, 9.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 5.0f)
                curveTo(10.04f, 5.0f, 11.06f, 5.24f, 12.0f, 5.68f)
                curveTo(12.94f, 5.24f, 13.96f, 5.0f, 15.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 15.0f, 19.0f)
                moveTo(9.0f, 17.0f)
                lineTo(10.0f, 16.89f)
                curveTo(8.72f, 15.59f, 8.0f, 13.83f, 8.0f, 12.0f)
                curveTo(8.0f, 10.17f, 8.72f, 8.41f, 10.0f, 7.1f)
                lineTo(9.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.0f, 17.0f)
                moveTo(15.5f, 12.0f)
                curveTo(15.5f, 10.13f, 14.71f, 8.44f, 13.44f, 7.25f)
                lineTo(12.44f, 7.71f)
                curveTo(13.69f, 8.71f, 14.5f, 10.26f, 14.5f, 12.0f)
                curveTo(14.5f, 13.74f, 13.69f, 15.29f, 12.44f, 16.29f)
                lineTo(13.44f, 16.75f)
                curveTo(14.71f, 15.56f, 15.5f, 13.87f, 15.5f, 12.0f)
                close()
            }
        }
        .build()
        return _setCenterRight!!
    }

private var _setCenterRight: ImageVector? = null
