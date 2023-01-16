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

public val MaterialDesignIcons.ChurchOutline: ImageVector
    get() {
        if (_churchOutline != null) {
            return _churchOutline!!
        }
        _churchOutline = Builder(name = "ChurchOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.22f)
                verticalLineTo(9.0f)
                lineTo(13.0f, 6.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.5f)
                lineTo(6.0f, 9.0f)
                verticalLineTo(12.22f)
                lineTo(2.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 17.45f, 11.45f, 17.0f, 12.0f, 17.0f)
                curveTo(12.55f, 17.0f, 13.0f, 17.45f, 13.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                lineTo(18.0f, 12.22f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.96f)
                curveTo(15.0f, 16.27f, 13.65f, 14.9f, 12.0f, 14.9f)
                curveTo(10.35f, 14.9f, 9.0f, 16.27f, 9.0f, 17.96f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.21f)
                lineTo(8.0f, 13.4f)
                verticalLineTo(10.05f)
                lineTo(12.0f, 8.0f)
                lineTo(16.0f, 10.04f)
                verticalLineTo(13.39f)
                lineTo(20.0f, 15.2f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 10.5f)
                curveTo(12.83f, 10.5f, 13.5f, 11.17f, 13.5f, 12.0f)
                curveTo(13.5f, 12.83f, 12.83f, 13.5f, 12.0f, 13.5f)
                curveTo(11.17f, 13.5f, 10.5f, 12.83f, 10.5f, 12.0f)
                curveTo(10.5f, 11.17f, 11.17f, 10.5f, 12.0f, 10.5f)
                close()
            }
        }
        .build()
        return _churchOutline!!
    }

private var _churchOutline: ImageVector? = null
