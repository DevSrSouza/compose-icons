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

public val MaterialDesignIcons.FilterMenuOutline: ImageVector
    get() {
        if (_filterMenuOutline != null) {
            return _filterMenuOutline!!
        }
        _filterMenuOutline = Builder(name = "FilterMenuOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.71f, 19.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.3f, 19.71f)
                lineTo(6.3f, 15.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 14.87f)
                verticalLineTo(9.75f)
                lineTo(1.21f, 3.62f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.38f, 2.22f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.62f, 2.22f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.79f, 3.62f)
                lineTo(12.0f, 9.75f)
                verticalLineTo(18.88f)
                moveTo(4.0f, 4.0f)
                lineTo(8.0f, 9.06f)
                verticalLineTo(14.58f)
                lineTo(10.0f, 16.58f)
                verticalLineTo(9.05f)
                lineTo(14.0f, 4.0f)
                moveTo(13.0f, 16.0f)
                lineTo(18.0f, 21.0f)
                lineTo(23.0f, 16.0f)
                close()
            }
        }
        .build()
        return _filterMenuOutline!!
    }

private var _filterMenuOutline: ImageVector? = null
