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

public val MaterialDesignIcons.ProgressQuestion: ImageVector
    get() {
        if (_progressQuestion != null) {
            return _progressQuestion!!
        }
        _progressQuestion = Builder(name = "ProgressQuestion", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                moveTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 11.75f, 14.0f, 12.0f, 14.0f, 10.0f)
                curveTo(14.0f, 8.9f, 13.1f, 8.0f, 12.0f, 8.0f)
                curveTo(10.9f, 8.0f, 10.0f, 8.9f, 10.0f, 10.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 7.79f, 9.79f, 6.0f, 12.0f, 6.0f)
                curveTo(14.21f, 6.0f, 16.0f, 7.79f, 16.0f, 10.0f)
                curveTo(16.0f, 12.5f, 13.0f, 12.75f, 13.0f, 15.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.18f, 18.05f, 21.45f, 13.0f, 21.95f)
                verticalLineTo(19.94f)
                curveTo(16.95f, 19.45f, 20.0f, 16.08f, 20.0f, 12.0f)
                curveTo(20.0f, 7.92f, 16.95f, 4.55f, 13.0f, 4.06f)
                verticalLineTo(2.05f)
                curveTo(18.05f, 2.55f, 22.0f, 6.82f, 22.0f, 12.0f)
                moveTo(11.0f, 2.05f)
                verticalLineTo(4.06f)
                curveTo(9.54f, 4.24f, 8.2f, 4.82f, 7.09f, 5.68f)
                lineTo(5.67f, 4.26f)
                curveTo(7.15f, 3.05f, 9.0f, 2.25f, 11.0f, 2.05f)
                moveTo(4.06f, 11.0f)
                horizontalLineTo(2.05f)
                curveTo(2.25f, 9.0f, 3.05f, 7.15f, 4.26f, 5.67f)
                lineTo(5.68f, 7.1f)
                curveTo(4.82f, 8.2f, 4.24f, 9.54f, 4.06f, 11.0f)
                moveTo(11.0f, 19.94f)
                verticalLineTo(21.95f)
                curveTo(9.0f, 21.75f, 7.15f, 20.96f, 5.67f, 19.74f)
                lineTo(7.09f, 18.32f)
                curveTo(8.2f, 19.18f, 9.54f, 19.76f, 11.0f, 19.94f)
                moveTo(2.05f, 13.0f)
                horizontalLineTo(4.06f)
                curveTo(4.24f, 14.46f, 4.82f, 15.8f, 5.68f, 16.91f)
                lineTo(4.26f, 18.33f)
                curveTo(3.05f, 16.85f, 2.25f, 15.0f, 2.05f, 13.0f)
                close()
            }
        }
        .build()
        return _progressQuestion!!
    }

private var _progressQuestion: ImageVector? = null
