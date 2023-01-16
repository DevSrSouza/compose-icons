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

public val MaterialDesignIcons.CodeNotEqualVariant: ImageVector
    get() {
        if (_codeNotEqualVariant != null) {
            return _codeNotEqualVariant!!
        }
        _codeNotEqualVariant = Builder(name = "CodeNotEqualVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.5f)
                verticalLineTo(9.33f)
                lineTo(8.33f, 12.0f)
                lineTo(11.0f, 14.67f)
                verticalLineTo(17.5f)
                lineTo(5.5f, 12.0f)
                moveTo(13.0f, 6.43f)
                lineTo(18.57f, 12.0f)
                lineTo(13.0f, 17.57f)
                verticalLineTo(14.74f)
                lineTo(15.74f, 12.0f)
                lineTo(13.0f, 9.26f)
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _codeNotEqualVariant!!
    }

private var _codeNotEqualVariant: ImageVector? = null
