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

public val MaterialDesignIcons.TagPlus: ImageVector
    get() {
        if (_tagPlus != null) {
            return _tagPlus!!
        }
        _tagPlus = Builder(name = "TagPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.04f, 2.21f, 11.53f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.53f, 2.21f, 12.04f, 2.59f, 12.41f)
                lineTo(3.0f, 12.81f)
                curveTo(3.9f, 12.27f, 4.94f, 12.0f, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 18.0f)
                curveTo(12.0f, 19.06f, 11.72f, 20.09f, 11.18f, 21.0f)
                lineTo(11.58f, 21.4f)
                curveTo(11.95f, 21.78f, 12.47f, 22.0f, 13.0f, 22.0f)
                curveTo(13.53f, 22.0f, 14.04f, 21.79f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.79f, 14.04f, 22.0f, 13.53f, 22.0f, 13.0f)
                curveTo(22.0f, 12.47f, 21.79f, 11.96f, 21.41f, 11.58f)
                moveTo(5.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 7.0f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _tagPlus!!
    }

private var _tagPlus: ImageVector? = null
