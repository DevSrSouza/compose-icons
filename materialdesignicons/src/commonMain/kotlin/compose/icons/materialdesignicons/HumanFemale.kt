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

public val MaterialDesignIcons.HumanFemale: ImageVector
    get() {
        if (_humanFemale != null) {
            return _humanFemale!!
        }
        _humanFemale = Builder(name = "HumanFemale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(10.5f, 22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.5f)
                lineTo(10.09f, 8.41f)
                curveTo(10.34f, 7.59f, 11.1f, 7.0f, 12.0f, 7.0f)
                curveTo(12.9f, 7.0f, 13.66f, 7.59f, 13.91f, 8.41f)
                lineTo(16.5f, 16.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _humanFemale!!
    }

private var _humanFemale: ImageVector? = null
