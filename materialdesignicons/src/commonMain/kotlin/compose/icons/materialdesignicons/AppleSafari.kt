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

public val MaterialDesignIcons.AppleSafari: ImageVector
    get() {
        if (_appleSafari != null) {
            return _appleSafari!!
        }
        _appleSafari = Builder(name = "AppleSafari", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                curveTo(4.0f, 14.09f, 4.8f, 16.0f, 6.11f, 17.41f)
                lineTo(9.88f, 9.88f)
                lineTo(17.41f, 6.11f)
                curveTo(16.0f, 4.8f, 14.09f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                curveTo(20.0f, 9.91f, 19.2f, 8.0f, 17.89f, 6.59f)
                lineTo(14.12f, 14.12f)
                lineTo(6.59f, 17.89f)
                curveTo(8.0f, 19.2f, 9.91f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 12.0f)
                lineTo(11.23f, 11.23f)
                lineTo(9.7f, 14.3f)
                lineTo(12.77f, 12.77f)
                lineTo(12.0f, 12.0f)
                moveTo(12.0f, 17.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.5f)
                moveTo(15.88f, 15.89f)
                lineTo(16.59f, 15.18f)
                lineTo(17.65f, 16.24f)
                lineTo(16.94f, 16.95f)
                lineTo(15.88f, 15.89f)
                moveTo(17.5f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                moveTo(12.0f, 6.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.5f)
                moveTo(8.12f, 8.11f)
                lineTo(7.41f, 8.82f)
                lineTo(6.35f, 7.76f)
                lineTo(7.06f, 7.05f)
                lineTo(8.12f, 8.11f)
                moveTo(6.5f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _appleSafari!!
    }

private var _appleSafari: ImageVector? = null
