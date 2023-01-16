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

public val MaterialDesignIcons.LockPattern: ImageVector
    get() {
        if (_lockPattern != null) {
            return _lockPattern!!
        }
        _lockPattern = Builder(name = "LockPattern", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 7.0f)
                curveTo(11.0f, 8.86f, 9.73f, 10.43f, 8.0f, 10.87f)
                verticalLineTo(13.13f)
                curveTo(8.37f, 13.22f, 8.72f, 13.37f, 9.04f, 13.56f)
                lineTo(13.56f, 9.04f)
                curveTo(13.2f, 8.44f, 13.0f, 7.75f, 13.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 11.0f)
                curveTo(16.26f, 11.0f, 15.57f, 10.8f, 15.0f, 10.45f)
                lineTo(10.45f, 15.0f)
                curveTo(10.8f, 15.57f, 11.0f, 16.26f, 11.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 3.0f, 17.0f)
                curveTo(3.0f, 15.14f, 4.27f, 13.57f, 6.0f, 13.13f)
                verticalLineTo(10.87f)
                curveTo(4.27f, 10.43f, 3.0f, 8.86f, 3.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 3.0f)
                moveTo(17.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 13.0f)
                moveTo(17.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 15.0f)
                close()
            }
        }
        .build()
        return _lockPattern!!
    }

private var _lockPattern: ImageVector? = null
