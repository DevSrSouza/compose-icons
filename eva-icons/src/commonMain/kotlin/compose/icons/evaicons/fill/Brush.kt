package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.12f, 12.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.07f, 3.86f)
                lineToRelative(0.0f, 3.11f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.48f, 0.48f)
                lineToRelative(3.24f, -0.06f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, false, 3.44f, -2.2f)
                arcTo(3.65f, 3.65f, 0.0f, false, false, 7.12f, 12.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.26f, 4.46f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -2.88f, 0.21f)
                lineTo(10.0f, 11.08f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.0f, 0.66f)
                lineTo(12.25f, 14.0f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.66f, 0.0f)
                lineTo(19.4f, 7.53f)
                arcTo(2.06f, 2.06f, 0.0f, false, false, 20.0f, 6.06f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.26f, 4.46f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
