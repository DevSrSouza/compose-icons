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

public val MaterialDesignIcons.SyllabaryKatakanaHalfwidth: ImageVector
    get() {
        if (_syllabaryKatakanaHalfwidth != null) {
            return _syllabaryKatakanaHalfwidth!!
        }
        _syllabaryKatakanaHalfwidth = Builder(name = "SyllabaryKatakanaHalfwidth", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                lineTo(13.0f, 10.81f)
                lineTo(15.0f, 11.2f)
                lineTo(16.0f, 6.1f)
                verticalLineTo(4.0f)
                moveTo(10.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(10.0f, 14.86f, 9.34f, 17.29f, 8.08f, 18.61f)
                lineTo(9.5f, 20.0f)
                curveTo(11.35f, 18.08f, 12.0f, 15.15f, 12.0f, 12.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _syllabaryKatakanaHalfwidth!!
    }

private var _syllabaryKatakanaHalfwidth: ImageVector? = null
