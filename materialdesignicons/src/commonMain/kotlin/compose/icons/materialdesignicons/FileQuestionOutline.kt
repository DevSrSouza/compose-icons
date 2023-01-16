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

public val MaterialDesignIcons.FileQuestionOutline: ImageVector
    get() {
        if (_fileQuestionOutline != null) {
            return _fileQuestionOutline!!
        }
        _fileQuestionOutline = Builder(name = "FileQuestionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                moveTo(15.0f, 13.0f)
                curveTo(15.0f, 14.89f, 12.75f, 15.07f, 12.75f, 16.76f)
                horizontalLineTo(11.25f)
                curveTo(11.25f, 14.32f, 13.5f, 14.5f, 13.5f, 13.0f)
                curveTo(13.5f, 12.18f, 12.83f, 11.5f, 12.0f, 11.5f)
                reflectiveCurveTo(10.5f, 12.18f, 10.5f, 13.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 11.35f, 10.34f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(15.0f, 11.35f, 15.0f, 13.0f)
                moveTo(12.75f, 17.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _fileQuestionOutline!!
    }

private var _fileQuestionOutline: ImageVector? = null
