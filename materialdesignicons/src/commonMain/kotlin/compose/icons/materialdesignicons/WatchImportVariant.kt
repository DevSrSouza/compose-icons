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

public val MaterialDesignIcons.WatchImportVariant: ImageVector
    get() {
        if (_watchImportVariant != null) {
            return _watchImportVariant!!
        }
        _watchImportVariant = Builder(name = "WatchImportVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.0f)
                horizontalLineTo(6.0f)
                lineTo(3.5f, 8.5f)
                lineTo(4.92f, 7.08f)
                lineTo(9.84f, 12.0f)
                lineTo(4.92f, 16.92f)
                lineTo(3.5f, 15.5f)
                lineTo(6.0f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                moveTo(8.0f, 0.0f)
                horizontalLineTo(16.0f)
                lineTo(16.83f, 5.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.11f, 18.1f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(16.83f)
                lineTo(16.0f, 24.0f)
                horizontalLineTo(8.0f)
                lineTo(7.17f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(6.46f, 19.0f, 6.0f, 18.79f, 5.62f, 18.44f)
                lineTo(7.06f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.06f)
                lineTo(5.62f, 5.56f)
                curveTo(6.0f, 5.21f, 6.46f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(7.17f)
                lineTo(8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _watchImportVariant!!
    }

private var _watchImportVariant: ImageVector? = null
