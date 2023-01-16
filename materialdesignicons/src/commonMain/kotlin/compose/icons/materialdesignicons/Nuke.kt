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

public val MaterialDesignIcons.Nuke: ImageVector
    get() {
        if (_nuke != null) {
            return _nuke!!
        }
        _nuke = Builder(name = "Nuke", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.04f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.0f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 4.0f)
                curveTo(6.53f, 4.0f, 7.45f, 4.44f, 8.09f, 5.15f)
                curveTo(8.5f, 3.35f, 10.08f, 2.0f, 12.0f, 2.0f)
                curveTo(13.92f, 2.0f, 15.5f, 3.35f, 15.91f, 5.15f)
                curveTo(16.55f, 4.44f, 17.47f, 4.0f, 18.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.0f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 11.0f)
                horizontalLineTo(14.04f)
                verticalLineTo(12.0f)
                moveTo(10.0f, 16.9f)
                verticalLineTo(15.76f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.76f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.76f)
                horizontalLineTo(14.04f)
                verticalLineTo(16.92f)
                lineTo(20.0f, 19.08f)
                curveTo(20.58f, 19.29f, 21.0f, 19.84f, 21.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 22.0f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 20.5f)
                curveTo(3.0f, 19.84f, 3.42f, 19.29f, 4.0f, 19.08f)
                lineTo(10.0f, 16.9f)
                close()
            }
        }
        .build()
        return _nuke!!
    }

private var _nuke: ImageVector? = null
