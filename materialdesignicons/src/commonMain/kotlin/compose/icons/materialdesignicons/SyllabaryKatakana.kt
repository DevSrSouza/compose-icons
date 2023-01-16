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

public val MaterialDesignIcons.SyllabaryKatakana: ImageVector
    get() {
        if (_syllabaryKatakana != null) {
            return _syllabaryKatakana!!
        }
        _syllabaryKatakana = Builder(name = "SyllabaryKatakana", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.09f)
                lineTo(14.29f, 9.79f)
                lineTo(15.71f, 11.21f)
                lineTo(20.0f, 6.91f)
                verticalLineTo(4.0f)
                moveTo(11.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(11.0f, 15.78f, 10.25f, 16.89f, 8.36f, 18.46f)
                lineTo(9.64f, 20.0f)
                curveTo(11.75f, 18.24f, 13.0f, 16.22f, 13.0f, 13.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _syllabaryKatakana!!
    }

private var _syllabaryKatakana: ImageVector? = null
