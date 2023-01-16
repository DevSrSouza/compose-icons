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

public val MaterialDesignIcons.SynagogueOutline: ImageVector
    get() {
        if (_synagogueOutline != null) {
            return _synagogueOutline!!
        }
        _synagogueOutline = Builder(name = "SynagogueOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                curveTo(18.3f, 4.0f, 17.0f, 5.3f, 17.0f, 7.0f)
                verticalLineTo(7.3f)
                lineTo(12.0f, 3.0f)
                lineTo(7.0f, 7.3f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 5.3f, 5.7f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveTo(1.0f, 5.3f, 1.0f, 7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                curveTo(11.0f, 15.4f, 11.4f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(13.0f, 15.4f, 13.0f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                curveTo(23.0f, 5.3f, 21.7f, 4.0f, 20.0f, 4.0f)
                moveTo(20.0f, 6.0f)
                curveTo(20.5f, 6.0f, 21.0f, 6.4f, 21.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 6.4f, 19.5f, 6.0f, 20.0f, 6.0f)
                moveTo(4.0f, 6.0f)
                curveTo(4.6f, 6.0f, 5.0f, 6.4f, 5.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 6.4f, 3.5f, 6.0f, 4.0f, 6.0f)
                moveTo(3.0f, 19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                moveTo(17.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 14.4f, 13.6f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(9.0f, 14.4f, 9.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.9f)
                lineTo(12.0f, 5.6f)
                lineTo(17.0f, 9.9f)
                verticalLineTo(19.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 8.5f)
                curveTo(12.8f, 8.5f, 13.5f, 9.2f, 13.5f, 10.0f)
                reflectiveCurveTo(12.8f, 11.5f, 12.0f, 11.5f)
                reflectiveCurveTo(10.5f, 10.8f, 10.5f, 10.0f)
                reflectiveCurveTo(11.2f, 8.5f, 12.0f, 8.5f)
                close()
            }
        }
        .build()
        return _synagogueOutline!!
    }

private var _synagogueOutline: ImageVector? = null
