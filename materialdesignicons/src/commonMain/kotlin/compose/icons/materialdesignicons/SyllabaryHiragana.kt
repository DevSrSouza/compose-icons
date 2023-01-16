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

public val MaterialDesignIcons.SyllabaryHiragana: ImageVector
    get() {
        if (_syllabaryHiragana != null) {
            return _syllabaryHiragana!!
        }
        _syllabaryHiragana = Builder(name = "SyllabaryHiragana", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(6.25f, 10.0f, 4.0f, 12.27f, 4.0f, 15.03f)
                curveTo(4.0f, 17.8f, 6.26f, 20.06f, 9.03f, 20.06f)
                curveTo(9.89f, 20.06f, 10.72f, 19.77f, 11.4f, 19.26f)
                curveTo(11.63f, 19.54f, 11.88f, 19.82f, 12.15f, 20.09f)
                lineTo(13.56f, 18.67f)
                curveTo(13.3f, 18.42f, 13.07f, 18.15f, 12.86f, 17.89f)
                lineTo(13.86f, 16.89f)
                curveTo(14.93f, 15.82f, 15.78f, 14.23f, 16.42f, 12.59f)
                curveTo(17.31f, 13.11f, 18.0f, 13.9f, 18.0f, 15.0f)
                curveTo(18.0f, 16.32f, 17.47f, 17.6f, 16.54f, 18.54f)
                lineTo(17.95f, 19.95f)
                curveTo(19.26f, 18.64f, 20.0f, 16.86f, 20.0f, 15.0f)
                curveTo(20.0f, 13.04f, 18.82f, 11.36f, 17.15f, 10.55f)
                lineTo(17.5f, 9.29f)
                lineTo(15.55f, 8.78f)
                lineTo(15.21f, 10.05f)
                curveTo(15.13f, 10.05f, 15.06f, 10.0f, 14.97f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                moveTo(11.0f, 12.0f)
                horizontalLineTo(14.5f)
                curveTo(13.94f, 13.37f, 13.19f, 14.72f, 12.44f, 15.47f)
                lineTo(11.79f, 16.13f)
                curveTo(11.25f, 14.93f, 11.0f, 13.59f, 11.0f, 12.0f)
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 14.07f, 9.41f, 15.94f, 10.3f, 17.59f)
                curveTo(9.94f, 17.89f, 9.5f, 18.06f, 9.03f, 18.06f)
                curveTo(7.33f, 18.06f, 6.0f, 16.73f, 6.0f, 15.03f)
                curveTo(6.0f, 13.34f, 7.32f, 12.0f, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _syllabaryHiragana!!
    }

private var _syllabaryHiragana: ImageVector? = null
