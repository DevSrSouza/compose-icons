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

public val MaterialDesignIcons.PostageStamp: ImageVector
    get() {
        if (_postageStamp != null) {
            return _postageStamp!!
        }
        _postageStamp = Builder(name = "PostageStamp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineTo(5.5f)
                curveTo(3.1f, 5.5f, 4.0f, 6.62f, 4.0f, 8.0f)
                curveTo(4.0f, 9.38f, 3.1f, 10.5f, 2.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(3.1f, 13.5f, 4.0f, 14.62f, 4.0f, 16.0f)
                curveTo(4.0f, 17.38f, 3.1f, 18.5f, 2.0f, 18.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.9f, 6.62f, 20.0f, 8.0f, 20.0f)
                curveTo(9.38f, 20.0f, 10.5f, 20.9f, 10.5f, 22.0f)
                horizontalLineTo(13.5f)
                curveTo(13.5f, 20.9f, 14.62f, 20.0f, 16.0f, 20.0f)
                curveTo(17.38f, 20.0f, 18.5f, 20.9f, 18.5f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.5f)
                curveTo(20.9f, 18.5f, 20.0f, 17.38f, 20.0f, 16.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 14.62f, 20.9f, 13.5f, 22.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(20.9f, 10.5f, 20.0f, 9.38f, 20.0f, 8.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 6.62f, 20.9f, 5.5f, 22.0f, 5.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.5f)
                curveTo(18.5f, 3.1f, 17.38f, 4.0f, 16.0f, 4.0f)
                curveTo(14.62f, 4.0f, 13.5f, 3.1f, 13.5f, 2.0f)
                horizontalLineTo(10.5f)
                curveTo(10.5f, 3.1f, 9.38f, 4.0f, 8.0f, 4.0f)
                curveTo(6.62f, 4.0f, 5.5f, 3.1f, 5.5f, 2.0f)
                horizontalLineTo(2.0f)
                moveTo(6.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                moveTo(9.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 7.0f)
                moveTo(17.0f, 10.0f)
                lineTo(14.0f, 13.0f)
                lineTo(12.0f, 12.0f)
                lineTo(7.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _postageStamp!!
    }

private var _postageStamp: ImageVector? = null
