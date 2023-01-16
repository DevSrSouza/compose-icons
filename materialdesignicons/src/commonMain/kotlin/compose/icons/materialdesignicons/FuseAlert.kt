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

public val MaterialDesignIcons.FuseAlert: ImageVector
    get() {
        if (_fuseAlert != null) {
            return _fuseAlert!!
        }
        _fuseAlert = Builder(name = "FuseAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                moveTo(9.16f, 16.0f)
                verticalLineTo(12.87f)
                horizontalLineTo(7.41f)
                lineTo(9.91f, 8.0f)
                verticalLineTo(11.14f)
                horizontalLineTo(11.59f)
                lineTo(9.16f, 16.0f)
                moveTo(14.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                curveTo(5.0f, 1.45f, 5.45f, 1.0f, 6.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(13.55f, 1.0f, 14.0f, 1.45f, 14.0f, 2.0f)
                moveTo(14.0f, 18.0f)
                verticalLineTo(22.0f)
                curveTo(14.0f, 22.55f, 13.55f, 23.0f, 13.0f, 23.0f)
                horizontalLineTo(6.0f)
                curveTo(5.45f, 23.0f, 5.0f, 22.55f, 5.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                moveTo(19.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _fuseAlert!!
    }

private var _fuseAlert: ImageVector? = null
