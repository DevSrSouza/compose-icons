package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Calculator: ImageVector
    get() {
        if (_calculator != null) {
            return _calculator!!
        }
        _calculator = Builder(name = "Calculator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.25f)
                curveTo(4.0f, 3.4551f, 5.4551f, 2.0f, 7.25f, 2.0f)
                horizontalLineTo(16.75f)
                curveTo(18.5449f, 2.0f, 20.0f, 3.4551f, 20.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(20.0f, 20.5449f, 18.5449f, 22.0f, 16.75f, 22.0f)
                horizontalLineTo(7.25f)
                curveTo(5.4551f, 22.0f, 4.0f, 20.5449f, 4.0f, 18.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(9.0f, 5.0f)
                curveTo(7.8954f, 5.0f, 7.0f, 5.8954f, 7.0f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(7.0f, 9.1046f, 7.8954f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 10.0f, 17.0f, 9.1046f, 17.0f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 5.8954f, 16.1046f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.5f, 13.25f)
                curveTo(9.5f, 12.5596f, 8.9404f, 12.0f, 8.25f, 12.0f)
                curveTo(7.5596f, 12.0f, 7.0f, 12.5596f, 7.0f, 13.25f)
                curveTo(7.0f, 13.9404f, 7.5596f, 14.5f, 8.25f, 14.5f)
                curveTo(8.9404f, 14.5f, 9.5f, 13.9404f, 9.5f, 13.25f)
                close()
                moveTo(8.25f, 18.5f)
                curveTo(8.9404f, 18.5f, 9.5f, 17.9404f, 9.5f, 17.25f)
                curveTo(9.5f, 16.5596f, 8.9404f, 16.0f, 8.25f, 16.0f)
                curveTo(7.5596f, 16.0f, 7.0f, 16.5596f, 7.0f, 17.25f)
                curveTo(7.0f, 17.9404f, 7.5596f, 18.5f, 8.25f, 18.5f)
                close()
                moveTo(17.0f, 13.25f)
                curveTo(17.0f, 12.5596f, 16.4404f, 12.0f, 15.75f, 12.0f)
                curveTo(15.0596f, 12.0f, 14.5f, 12.5596f, 14.5f, 13.25f)
                curveTo(14.5f, 13.9404f, 15.0596f, 14.5f, 15.75f, 14.5f)
                curveTo(16.4404f, 14.5f, 17.0f, 13.9404f, 17.0f, 13.25f)
                close()
                moveTo(15.75f, 18.5f)
                curveTo(16.4404f, 18.5f, 17.0f, 17.9404f, 17.0f, 17.25f)
                curveTo(17.0f, 16.5596f, 16.4404f, 16.0f, 15.75f, 16.0f)
                curveTo(15.0596f, 16.0f, 14.5f, 16.5596f, 14.5f, 17.25f)
                curveTo(14.5f, 17.9404f, 15.0596f, 18.5f, 15.75f, 18.5f)
                close()
                moveTo(13.25f, 13.25f)
                curveTo(13.25f, 12.5596f, 12.6904f, 12.0f, 12.0f, 12.0f)
                curveTo(11.3096f, 12.0f, 10.75f, 12.5596f, 10.75f, 13.25f)
                curveTo(10.75f, 13.9404f, 11.3096f, 14.5f, 12.0f, 14.5f)
                curveTo(12.6904f, 14.5f, 13.25f, 13.9404f, 13.25f, 13.25f)
                close()
                moveTo(12.0f, 18.5f)
                curveTo(12.6904f, 18.5f, 13.25f, 17.9404f, 13.25f, 17.25f)
                curveTo(13.25f, 16.5596f, 12.6904f, 16.0f, 12.0f, 16.0f)
                curveTo(11.3096f, 16.0f, 10.75f, 16.5596f, 10.75f, 17.25f)
                curveTo(10.75f, 17.9404f, 11.3096f, 18.5f, 12.0f, 18.5f)
                close()
            }
        }
        .build()
        return _calculator!!
    }

private var _calculator: ImageVector? = null
