package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BreakfastDining: ImageVector
    get() {
        if (_breakfastDining != null) {
            return _breakfastDining!!
        }
        _breakfastDining = Builder(name = "BreakfastDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.85f, 3.0f)
                lineTo(6.14f, 3.0f)
                curveTo(4.15f, 3.0f, 2.36f, 4.39f, 2.05f, 6.36f)
                curveTo(1.78f, 8.11f, 2.64f, 9.65f, 4.0f, 10.45f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(10.45f)
                curveToRelative(1.36f, -0.79f, 2.23f, -2.36f, 1.95f, -4.11f)
                curveTo(21.63f, 4.38f, 19.83f, 3.0f, 17.85f, 3.0f)
                close()
                moveTo(16.41f, 13.0f)
                lineTo(12.0f, 17.42f)
                lineTo(7.59f, 13.0f)
                lineTo(12.0f, 8.59f)
                lineTo(16.41f, 13.0f)
                close()
            }
        }
        .build()
        return _breakfastDining!!
    }

private var _breakfastDining: ImageVector? = null
