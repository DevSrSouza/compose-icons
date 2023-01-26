package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Vrpano: ImageVector
    get() {
        if (_vrpano != null) {
            return _vrpano!!
        }
        _vrpano = Builder(name = "Vrpano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.01f, 4.0f)
                curveTo(20.45f, 4.0f, 17.4f, 5.5f, 12.0f, 5.5f)
                curveToRelative(-5.31f, 0.0f, -8.49f, -1.49f, -9.01f, -1.49f)
                curveTo(2.46f, 4.01f, 2.0f, 4.45f, 2.0f, 5.02f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.57f, 0.46f, 1.0f, 0.99f, 1.0f)
                curveToRelative(0.57f, 0.0f, 3.55f, -1.5f, 9.01f, -1.5f)
                curveToRelative(5.42f, 0.0f, 8.44f, 1.5f, 9.01f, 1.5f)
                curveToRelative(0.53f, 0.0f, 0.99f, -0.43f, 0.99f, -1.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 4.43f, 21.54f, 4.0f, 21.01f, 4.0f)
                close()
                moveTo(20.0f, 17.63f)
                curveToRelative(-2.01f, -0.59f, -4.62f, -1.13f, -8.0f, -1.13f)
                curveToRelative(-3.39f, 0.0f, -5.99f, 0.54f, -8.0f, 1.13f)
                verticalLineTo(6.38f)
                curveTo(6.58f, 7.11f, 9.32f, 7.5f, 12.0f, 7.5f)
                curveToRelative(3.38f, 0.0f, 5.99f, -0.54f, 8.0f, -1.13f)
                verticalLineTo(17.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.17f, 10.99f)
                lineToRelative(-3.69f, 4.42f)
                curveTo(7.48f, 15.15f, 9.66f, 15.0f, 12.0f, 15.0f)
                curveToRelative(2.3f, 0.0f, 4.52f, 0.15f, 6.51f, 0.4f)
                lineTo(14.0f, 10.0f)
                lineToRelative(-2.83f, 3.39f)
                lineTo(9.17f, 10.99f)
                close()
            }
        }
        .build()
        return _vrpano!!
    }

private var _vrpano: ImageVector? = null
