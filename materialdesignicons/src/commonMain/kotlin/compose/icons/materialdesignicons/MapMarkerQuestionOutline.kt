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

public val MaterialDesignIcons.MapMarkerQuestionOutline: ImageVector
    get() {
        if (_mapMarkerQuestionOutline != null) {
            return _mapMarkerQuestionOutline!!
        }
        _mapMarkerQuestionOutline = Builder(name = "MapMarkerQuestionOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(7.59f, 1.0f, 4.0f, 4.59f, 4.0f, 9.0f)
                curveTo(4.0f, 14.57f, 10.96f, 22.34f, 11.26f, 22.67f)
                lineTo(12.0f, 23.5f)
                lineTo(12.74f, 22.67f)
                curveTo(13.04f, 22.34f, 20.0f, 14.57f, 20.0f, 9.0f)
                curveTo(20.0f, 4.59f, 16.41f, 1.0f, 12.0f, 1.0f)
                moveTo(12.0f, 20.47f)
                curveTo(9.82f, 17.86f, 6.0f, 12.54f, 6.0f, 9.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 3.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 9.0f)
                curveTo(18.0f, 12.83f, 13.75f, 18.36f, 12.0f, 20.47f)
                moveTo(11.13f, 14.0f)
                horizontalLineTo(12.88f)
                verticalLineTo(15.75f)
                horizontalLineTo(11.13f)
                moveTo(12.0f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 8.5f)
                horizontalLineTo(10.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.0f, 6.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.75f, 8.5f)
                curveTo(13.75f, 10.26f, 11.13f, 10.04f, 11.13f, 12.88f)
                horizontalLineTo(12.88f)
                curveTo(12.88f, 10.91f, 15.5f, 10.69f, 15.5f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _mapMarkerQuestionOutline!!
    }

private var _mapMarkerQuestionOutline: ImageVector? = null
