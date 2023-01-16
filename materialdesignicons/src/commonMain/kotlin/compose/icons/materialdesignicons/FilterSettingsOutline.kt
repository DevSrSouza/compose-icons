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

public val MaterialDesignIcons.FilterSettingsOutline: ImageVector
    get() {
        if (_filterSettingsOutline != null) {
            return _filterSettingsOutline!!
        }
        _filterSettingsOutline = Builder(name = "FilterSettingsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                moveTo(15.0f, 19.88f)
                curveTo(15.04f, 20.18f, 14.94f, 20.5f, 14.71f, 20.71f)
                curveTo(14.32f, 21.1f, 13.69f, 21.1f, 13.3f, 20.71f)
                lineTo(9.29f, 16.7f)
                curveTo(9.06f, 16.47f, 8.96f, 16.16f, 9.0f, 15.87f)
                verticalLineTo(10.75f)
                lineTo(4.21f, 4.62f)
                curveTo(3.87f, 4.19f, 3.95f, 3.56f, 4.38f, 3.22f)
                curveTo(4.57f, 3.08f, 4.78f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.22f, 3.0f, 19.43f, 3.08f, 19.62f, 3.22f)
                curveTo(20.05f, 3.56f, 20.13f, 4.19f, 19.79f, 4.62f)
                lineTo(15.0f, 10.75f)
                verticalLineTo(19.88f)
                moveTo(7.04f, 5.0f)
                lineTo(11.0f, 10.06f)
                verticalLineTo(15.58f)
                lineTo(13.0f, 17.58f)
                verticalLineTo(10.05f)
                lineTo(16.96f, 5.0f)
                close()
            }
        }
        .build()
        return _filterSettingsOutline!!
    }

private var _filterSettingsOutline: ImageVector? = null
