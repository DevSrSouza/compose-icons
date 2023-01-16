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

public val MaterialDesignIcons.RenameOutline: ImageVector
    get() {
        if (_renameOutline != null) {
            return _renameOutline!!
        }
        _renameOutline = Builder(name = "RenameOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                lineTo(11.0f, 20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                moveTo(12.06f, 7.19f)
                lineTo(3.0f, 16.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.75f)
                lineTo(15.81f, 10.94f)
                lineTo(12.06f, 7.19f)
                moveTo(5.92f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.08f)
                lineTo(12.06f, 10.0f)
                lineTo(13.0f, 10.94f)
                lineTo(5.92f, 18.0f)
                moveTo(18.71f, 8.04f)
                curveTo(19.1f, 7.65f, 19.1f, 7.0f, 18.71f, 6.63f)
                lineTo(16.37f, 4.29f)
                curveTo(16.17f, 4.09f, 15.92f, 4.0f, 15.66f, 4.0f)
                curveTo(15.41f, 4.0f, 15.15f, 4.1f, 14.96f, 4.29f)
                lineTo(13.13f, 6.12f)
                lineTo(16.88f, 9.87f)
                lineTo(18.71f, 8.04f)
                close()
            }
        }
        .build()
        return _renameOutline!!
    }

private var _renameOutline: ImageVector? = null
