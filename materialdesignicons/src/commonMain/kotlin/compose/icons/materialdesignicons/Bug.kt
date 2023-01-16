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

public val MaterialDesignIcons.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(17.19f)
                curveTo(16.74f, 7.22f, 16.12f, 6.55f, 15.37f, 6.04f)
                lineTo(17.0f, 4.41f)
                lineTo(15.59f, 3.0f)
                lineTo(13.42f, 5.17f)
                curveTo(12.96f, 5.06f, 12.5f, 5.0f, 12.0f, 5.0f)
                curveTo(11.5f, 5.0f, 11.04f, 5.06f, 10.59f, 5.17f)
                lineTo(8.41f, 3.0f)
                lineTo(7.0f, 4.41f)
                lineTo(8.62f, 6.04f)
                curveTo(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.09f)
                curveTo(6.04f, 10.33f, 6.0f, 10.66f, 6.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 15.34f, 6.04f, 15.67f, 6.09f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.81f)
                curveTo(7.85f, 19.79f, 9.78f, 21.0f, 12.0f, 21.0f)
                curveTo(14.22f, 21.0f, 16.15f, 19.79f, 17.19f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.91f)
                curveTo(17.96f, 15.67f, 18.0f, 15.34f, 18.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                curveTo(18.0f, 10.66f, 17.96f, 10.33f, 17.91f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
