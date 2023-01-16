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

public val MaterialDesignIcons.RedoVariant: ImageVector
    get() {
        if (_redoVariant != null) {
            return _redoVariant!!
        }
        _redoVariant = Builder(name = "RedoVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 4.0f, 13.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 10.5f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.5f)
                curveTo(8.0f, 18.0f, 6.0f, 16.0f, 6.0f, 13.5f)
                curveTo(6.0f, 11.0f, 8.0f, 9.0f, 10.5f, 9.0f)
                horizontalLineTo(16.17f)
                lineTo(13.09f, 12.09f)
                lineTo(14.5f, 13.5f)
                lineTo(20.0f, 8.0f)
                lineTo(14.5f, 2.5f)
                lineTo(13.08f, 3.91f)
                lineTo(16.17f, 7.0f)
                horizontalLineTo(10.5f)
                moveTo(18.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _redoVariant!!
    }

private var _redoVariant: ImageVector? = null
