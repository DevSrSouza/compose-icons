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

public val MaterialDesignIcons.SyllabaryHangul: ImageVector
    get() {
        if (_syllabaryHangul != null) {
            return _syllabaryHangul!!
        }
        _syllabaryHangul = Builder(name = "SyllabaryHangul", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.39f)
                curveTo(5.55f, 8.74f, 5.0f, 9.8f, 5.0f, 11.0f)
                curveTo(5.0f, 13.2f, 6.8f, 15.0f, 9.0f, 15.0f)
                curveTo(11.2f, 15.0f, 13.0f, 13.2f, 13.0f, 11.0f)
                curveTo(13.0f, 9.8f, 12.45f, 8.74f, 11.61f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                moveTo(15.0f, 4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                moveTo(9.0f, 9.0f)
                curveTo(10.12f, 9.0f, 11.0f, 9.88f, 11.0f, 11.0f)
                curveTo(11.0f, 12.12f, 10.12f, 13.0f, 9.0f, 13.0f)
                curveTo(7.88f, 13.0f, 7.0f, 12.12f, 7.0f, 11.0f)
                curveTo(7.0f, 9.88f, 7.88f, 9.0f, 9.0f, 9.0f)
                moveTo(7.0f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _syllabaryHangul!!
    }

private var _syllabaryHangul: ImageVector? = null
